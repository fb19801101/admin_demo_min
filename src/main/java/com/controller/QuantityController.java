package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.dateutil.EncodeUtil;

import com.dateutil.JsonUtil;
import com.model.*;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-04-01 15:50
 */
@Controller
@RequestMapping("quantity")
public class QuantityController {
    @Autowired
    private QuantityService quantityService;

    @Autowired
    private PartItemService partItemService;

    @Autowired
    private CostLayerService costLayerService;

    @RequestMapping("toQuantity")
    public ModelAndView toQuantity(HttpServletRequest request, HttpServletResponse response) {
        long count = quantityService.countQuantityByQueryCondition("pi_id", null);
        return new ModelAndView("quantity/quantity", "count",count);
    }

    @RequestMapping("toQuantityBody")
    public @ResponseBody
    LayuiData toQuantityBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Quantity> listQuantity = quantityService.queryQuantityByJoinPiId(id, page, limit);
        long count = quantityService.countQuantityByQueryJoinPiId(id);

        List<Map> list = new ArrayList<>();
        for(Quantity x: listQuantity) {
            PartItem pi = x.getPartItem();
            if(pi != null && pi.getPiLevel() > level) {
                pi.setPiFold(false);
            }

            list.add(x.toMap());
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("quantityIframe")
    public ModelAndView quantityIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("quantity/quantity_iframe", "message",null);
    }

    @RequestMapping("insertQuantity")
    public ModelAndView insertQuantity(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String qyName = request.getParameter("qyName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        mapMsg.put("lstPartItem", partItemService.getAllPartItem());
        mapMsg.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(qyName != null && qyName.length() > 0) {
            List list = quantityService.getQuantityByCondition("qy_name", qyName);

            if (list.size() == 0) {
                Quantity quantity = quantityService.getQuantityByMaxId();
                Integer qyId = 0;
                if (quantity != null) {
                    qyId = quantity.getQyId() + 1;
                } else {
                    qyId = 1;
                }

                quantity.setJson(json);
                quantity.setQyId(qyId);
                quantityService.insertQuantity(quantity);

                mapMsg.put("quantity", quantity);
                mapMsg.put("msg", "工程数量 "+qyName+" 基本信息数据录入成功!");
                return new ModelAndView("quantity/quantity_insert", "message", mapMsg);
            } else {
                mapMsg.put("quantity", list.get(0));
                mapMsg.put("msg", "项目名称 "+qyName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("quantity/quantity_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "项目名称不能为空，请重新输入!");
        return new ModelAndView("quantity/quantity_insert", "message", mapMsg);
    }

    @RequestMapping("insertQuantityBody")
    public @ResponseBody LayuiData insertQuantityBody(Quantity quantity) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String qyName = quantity.getQyName();
        if(qyName != null && qyName.length() > 0) {
            List list = quantityService.getQuantityByCondition("qy_name", qyName);

            if (list.size() == 0) {
                Quantity _quantity = quantityService.getQuantityByMaxId();
                Integer qyId = 0;
                if (_quantity != null) {
                    qyId = _quantity.getQyId() + 1;
                } else {
                    qyId = 1;
                }

                quantity.setQyId(qyId);
                code = quantityService.insertQuantity(quantity);
            }
        }
        return new LayuiData(code, quantity, 1);
    }

    @RequestMapping("modifyQuantityBody")
    public @ResponseBody LayuiData modifyQuantityBody(Quantity quantity) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Quantity _quantity = quantityService.getQuantityById(quantity.getQyId());
        return new LayuiData(quantityService.setQuantityById(quantity), _quantity, 1);
    }

    @RequestMapping("deleteQuantityBody")
    public @ResponseBody LayuiData deleteQuantityBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(quantityService.delQuantityById(id),null,0);
    }

    @RequestMapping("searchQuantity")
    public ModelAndView searchQuantity(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        map.put("lstPartItem", partItemService.getAllPartItem());
        map.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(field != null) {
            List listQuantity = quantityService.getQuantityByCondition(field, value);
            if(value.equals("*")) {
                listQuantity = quantityService.getAllQuantity();
            }

            if (listQuantity.size() == 0) {
                map.put("QuantityList", listQuantity);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("QuantityList", listQuantity);
                map.put("msg", "系统提示：已经找到满足条件的 "+listQuantity.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("quantity/quantity_search", "message", map);
    }

    @RequestMapping("searchQuantityBody")
    public @ResponseBody LayuiData searchQuantityBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = quantityService.queryQuantityByCondition(field, value, page, limit);
        long count = quantityService.countQuantityByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountQuantity")
    public ModelAndView mountQuantity(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listQuantity = quantityService.getQuantityByCondition(field, value);
            if(value.equals("*")) {
                listQuantity = quantityService.getAllQuantity();
            }

            if (listQuantity.size() == 0) {
                map.put("QuantityList", listQuantity);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("QuantityList", listQuantity);
                map.put("msg", "系统提示：已经找到满足条件的 "+listQuantity.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("quantity/quantity_mount", "message", map);
    }

    @RequestMapping("mountQuantityBody")
    public @ResponseBody LayuiData mountQuantityBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = quantityService.getQuantityByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = quantityService.countQuantityBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCostLayerBody")
    public @ResponseBody LayuiData mountCostLayerBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Quantity> listQuantity = quantityService.getQuantityByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = quantityService.countQuantityBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);

        List list = new ArrayList();
        for(Quantity x: listQuantity) {
            if(x.getCostLayer() != null) {
                list.add(x.getCostLayer());
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("uploadQuantity")
    public ModelAndView uploadQuantity(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("quantity/quantity_upload", "message",null);
    }

    @RequestMapping("downloadQuantity")
    public ModelAndView downloadQuantity(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("quantity/quantity_download", "message",null);
    }

    @RequestMapping("downloadQuantityBody")
    public @ResponseBody LayuiData downloadQuantityBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Quantity> listQuantity = quantityService.queryQuantityByJoinPiId(id,null,null);
        long count = listQuantity.size();

        List<Map> list = new ArrayList<>();
        for(Quantity x:listQuantity) {
            list.add(x.toMap());
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("restoreQuantity")
    public ModelAndView restoreQuantity(HttpServletRequest request, HttpServletResponse response) {
        long count = quantityService.countQuantityByQueryCondition("pi_id", null);
        return new ModelAndView("quantity/quantity_restore", "count",count);
    }

    @RequestMapping("restoreQuantityBody")
    public @ResponseBody LayuiData restoreQuantityBody(Integer id, String type, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<CostLayer> list = quantityService.getCostLayerByClId(id, page, limit);
        long count = quantityService.countCostLayerBySelectClId(id);

        for(CostLayer x:list) {
            costLayerService.setCostLayerById(x);
        }
        return new LayuiData(0, list, count);
    }
}