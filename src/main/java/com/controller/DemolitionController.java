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
@RequestMapping("demolition")
public class DemolitionController {
    @Autowired
    private DemolitionService demolitionService;

    @Autowired
    private PartItemService partItemService;

    @Autowired
    private CostLayerService costLayerService;

    @RequestMapping("toDemolition")
    public ModelAndView toDemolition(HttpServletRequest request, HttpServletResponse response) {
        long count = demolitionService.countDemolitionByQueryCondition("pi_id", null);
        return new ModelAndView("demolition/demolition", "count",count);
    }

    @RequestMapping("toDemolitionBody")
    public @ResponseBody LayuiData toDemolitionBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Demolition> listDemolition = demolitionService.queryDemolitionByJoinPiId(id, page, limit);
        long count = demolitionService.countDemolitionByQueryJoinPiId(id);

        List<Map> list = new ArrayList<>();
        for(Demolition x:listDemolition) {
            PartItem pi = x.getPartItem();
            if(pi != null && pi.getPiLevel() > level) {
                pi.setPiFold(false);
            }

            list.add(x.toMap());
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("demolitionIframe")
    public ModelAndView demolitionIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("demolition/demolition_iframe", "message",null);
    }

    @RequestMapping("insertDemolition")
    public ModelAndView insertDemolition(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String dnName = request.getParameter("dnName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        mapMsg.put("lstPartItem", partItemService.getAllPartItem());
        mapMsg.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(dnName != null && dnName.length() > 0) {
            List list = demolitionService.getDemolitionByCondition("dn_name", dnName);

            if (list.size() == 0) {
                Demolition demolition = demolitionService.getDemolitionByMaxId();
                Integer dnId = 0;
                if (demolition != null) {
                    dnId = demolition.getDnId() + 1;
                } else {
                    dnId = 1;
                }

                demolition.setJson(json);
                demolition.setDnId(dnId);
                demolitionService.insertDemolition(demolition);

                mapMsg.put("demolition", demolition);
                mapMsg.put("msg", "工程数量 "+dnName+" 基本信息数据录入成功!");
                return new ModelAndView("demolition/demolition_insert", "message", mapMsg);
            } else {
                mapMsg.put("demolition", list.get(0));
                mapMsg.put("msg", "项目名称 "+dnName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("demolition/demolition_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "项目名称不能为空，请重新输入!");
        return new ModelAndView("demolition/demolition_insert", "message", mapMsg);
    }

    @RequestMapping("insertDemolitionBody")
    public @ResponseBody LayuiData insertDemolitionBody(Demolition demolition) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String dnName = demolition.getDnName();
        if(dnName != null && dnName.length() > 0) {
            List list = demolitionService.getDemolitionByCondition("dn_name", dnName);

            if (list.size() == 0) {
                Demolition _demolition = demolitionService.getDemolitionByMaxId();
                Integer dnId = 0;
                if (_demolition != null) {
                    dnId = _demolition.getDnId() + 1;
                } else {
                    dnId = 1;
                }

                demolition.setDnId(dnId);
                code = demolitionService.insertDemolition(demolition);
            }
        }
        return new LayuiData(code, demolition, 1);
    }

    @RequestMapping("modifyDemolitionBody")
    public @ResponseBody LayuiData modifyDemolitionBody(Demolition demolition) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Demolition _demolition = demolitionService.getDemolitionById(demolition.getDnId());
        return new LayuiData(demolitionService.setDemolitionById(demolition), _demolition, 1);
    }

    @RequestMapping("deleteDemolitionBody")
    public @ResponseBody LayuiData deleteDemolitionBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(demolitionService.delDemolitionById(id),null,0);
    }

    @RequestMapping("searchDemolition")
    public ModelAndView searchDemolition(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        map.put("lstPartItem", partItemService.getAllPartItem());
        map.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(field != null) {
            List listDemolition = demolitionService.getDemolitionByCondition(field, value);
            if(value.equals("*")) {
                listDemolition = demolitionService.getAllDemolition();
            }

            if (listDemolition.size() == 0) {
                map.put("DemolitionList", listDemolition);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("DemolitionList", listDemolition);
                map.put("msg", "系统提示：已经找到满足条件的 "+listDemolition.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("demolition/demolition_search", "message", map);
    }

    @RequestMapping("searchDemolitionBody")
    public @ResponseBody LayuiData searchDemolitionBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = demolitionService.queryDemolitionByCondition(field, value, page, limit);
        long count = demolitionService.countDemolitionByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountDemolition")
    public ModelAndView mountDemolition(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listDemolition = demolitionService.getDemolitionByCondition(field, value);
            if(value.equals("*")) {
                listDemolition = demolitionService.getAllDemolition();
            }

            if (listDemolition.size() == 0) {
                map.put("DemolitionList", listDemolition);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("DemolitionList", listDemolition);
                map.put("msg", "系统提示：已经找到满足条件的 "+listDemolition.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("demolition/demolition_mount", "message", map);
    }

    @RequestMapping("mountDemolitionBody")
    public @ResponseBody LayuiData mountDemolitionBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = demolitionService.getDemolitionByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = demolitionService.countDemolitionBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCostLayerBody")
    public @ResponseBody LayuiData mountCostLayerBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Demolition> listDemolition = demolitionService.getDemolitionByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = demolitionService.countDemolitionBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);

        List list = new ArrayList();
        for(Demolition x: listDemolition) {
            if(x.getCostLayer() != null) {
                list.add(x.getCostLayer());
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("uploadDemolition")
    public ModelAndView uploadDemolition(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("demolition/demolition_upload", "message",null);
    }

    @RequestMapping("downloadDemolition")
    public ModelAndView downloadDemolition(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("demolition/demolition_download", "message",null);
    }

    @RequestMapping("restoreDemolition")
    public ModelAndView restoreDemolition(HttpServletRequest request, HttpServletResponse response) {
        long count = demolitionService.countDemolitionByQueryCondition("pi_id", null);
        return new ModelAndView("demolition/demolition_restore", "count",count);
    }

    @RequestMapping("restoreDemolitionBody")
    public @ResponseBody LayuiData restoreDemolitionBody(Integer id, String type, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<CostLayer> list = demolitionService.getCostLayerByClId(id, page, limit);
        long count = demolitionService.countCostLayerBySelectClId(id);

        for(CostLayer x:list) {
            costLayerService.setCostLayerById(x);
        }
        return new LayuiData(0, list, count);
    }
}
