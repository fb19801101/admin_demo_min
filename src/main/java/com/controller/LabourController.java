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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-04-01 15:50
 */
@Controller
@RequestMapping("labour")
public class LabourController {
    @Autowired
    private LabourService labourService;

    @Autowired
    private PartItemService partItemService;

    @Autowired
    private CostLayerService costLayerService;

    @RequestMapping("toLabour")
    public ModelAndView toLabour(HttpServletRequest request, HttpServletResponse response) {
        long count = labourService.countLabourByQueryCondition("pi_id", null);
        return new ModelAndView("labour/labour", "count",count);
    }

    @RequestMapping("toLabourBody")
    public @ResponseBody LayuiData toLabourBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Labour> listLabour = labourService.queryLabourByJoinPiId(id, page, limit);
        long count = labourService.countLabourByQueryJoinPiId(id);

        List<Map> list = new ArrayList<>();
        for(Labour x:listLabour) {
            PartItem pi = x.getPartItem();
            if(pi != null && pi.getPiLevel() > level) {
                pi.setPiFold(false);
            }

            list.add(x.toMap());
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("labourIframe")
    public ModelAndView labourIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("labour/labour_iframe", "message",null);
    }

    @RequestMapping("insertLabour")
    public ModelAndView insertLabour(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String lbName = request.getParameter("lbName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        mapMsg.put("lstPartItem", partItemService.getAllPartItem());
        mapMsg.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(lbName != null && lbName.length() > 0) {
            List list = labourService.getLabourByCondition("lb_name", lbName);

            if (list.size() == 0) {
                Labour labour = labourService.getLabourByMaxId();
                Integer lbId = 0;
                if (labour != null) {
                    lbId = labour.getLbId() + 1;
                } else {
                    lbId = 1;
                }

                labour.setJson(json);
                labour.setLbId(lbId);
                labourService.insertLabour(labour);

                mapMsg.put("labour", labour);
                mapMsg.put("msg", "工程数量 "+lbName+" 基本信息数据录入成功!");
                return new ModelAndView("labour/labour_insert", "message", mapMsg);
            } else {
                mapMsg.put("labour", list.get(0));
                mapMsg.put("msg", "项目名称 "+lbName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("labour/labour_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "项目名称不能为空，请重新输入!");
        return new ModelAndView("labour/labour_insert", "message", mapMsg);
    }

    @RequestMapping("insertLabourBody")
    public @ResponseBody LayuiData insertLabourBody(Labour labour) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String lbName = labour.getLbName();
        if(lbName != null && lbName.length() > 0) {
            List list = labourService.getLabourByCondition("lb_name", lbName);

            if (list.size() == 0) {
                Labour _labour = labourService.getLabourByMaxId();
                Integer lbId = 0;
                if (_labour != null) {
                    lbId = _labour.getLbId() + 1;
                } else {
                    lbId = 1;
                }

                labour.setLbId(lbId);
                code = labourService.insertLabour(labour);
            }
        }
        return new LayuiData(code, labour, 1);
    }

    @RequestMapping("modifyLabourBody")
    public @ResponseBody LayuiData modifyLabourBody(Labour labour) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Labour _labour = labourService.getLabourById(labour.getLbId());
        return new LayuiData(labourService.setLabourById(labour), _labour, 1);
    }

    @RequestMapping("deleteLabourBody")
    public @ResponseBody LayuiData deleteLabourBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(labourService.delLabourById(id),null,0);
    }

    @RequestMapping("searchLabour")
    public ModelAndView searchLabour(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        map.put("lstPartItem", partItemService.getAllPartItem());
        map.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(field != null) {
            List listLabour = labourService.getLabourByCondition(field, value);
            if(value.equals("*")) {
                listLabour = labourService.getAllLabour();
            }

            if (listLabour.size() == 0) {
                map.put("LabourList", listLabour);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("LabourList", listLabour);
                map.put("msg", "系统提示：已经找到满足条件的 "+listLabour.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("labour/labour_search", "message", map);
    }

    @RequestMapping("searchLabourBody")
    public @ResponseBody LayuiData searchLabourBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = labourService.queryLabourByCondition(field, value, page, limit);
        long count = labourService.countLabourByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountLabour")
    public ModelAndView mountLabour(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listLabour = labourService.getLabourByCondition(field, value);
            if(value.equals("*")) {
                listLabour = labourService.getAllLabour();
            }

            if (listLabour.size() == 0) {
                map.put("LabourList", listLabour);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("LabourList", listLabour);
                map.put("msg", "系统提示：已经找到满足条件的 "+listLabour.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("labour/labour_mount", "message", map);
    }

    @RequestMapping("mountLabourBody")
    public @ResponseBody LayuiData mountLabourBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = labourService.getLabourByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = labourService.countLabourBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCostLayerBody")
    public @ResponseBody LayuiData mountCostLayerBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Labour> listLabour = labourService.getLabourByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = labourService.countLabourBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);

        List list = new ArrayList();
        for(Labour x: listLabour) {
            if(x.getCostLayer() != null) {
                list.add(x.getCostLayer());
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("uploadLabour")
    public ModelAndView uploadLabour(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("labour/labour_upload", "message",null);
    }

    @RequestMapping("downloadLabour")
    public ModelAndView downloadLabour(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("labour/labour_download", "message",null);
    }

    @RequestMapping("restoreLabour")
    public ModelAndView restoreLabour(HttpServletRequest request, HttpServletResponse response) {
        long count = labourService.countLabourByQueryCondition("pi_id", null);
        return new ModelAndView("labour/labour_restore", "count",count);
    }

    @RequestMapping("restoreLabourBody")
    public @ResponseBody LayuiData restoreLabourBody(Integer id, String type, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<CostLayer> list = labourService.getCostLayerByClId(id, page, limit);
        long count = labourService.countCostLayerBySelectClId(id);

        for(CostLayer x:list) {
            costLayerService.setCostLayerById(x);
        }
        return new LayuiData(0, list, count);
    }

}
