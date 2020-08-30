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
@RequestMapping("costlayer")
public class CostLayerController {
    @Autowired
    private CostLayerService costLayerService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private EstimationService estimationService;

    @RequestMapping("toCostLayer")
    public ModelAndView toCostLayer(HttpServletRequest request, HttpServletResponse response) {
        long count = estimationService.countEstimationByQueryCondition("ct_id", null);
        return new ModelAndView("costlayer/costlayer", "count",count);
    }

    @RequestMapping("toCostLayerBody")
    public @ResponseBody LayuiData toCostLayerBody(Integer id, String type, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Estimation> listEstimation = estimationService.queryEstimationByCondition("ct_id", id, page, limit);
        int ctSize = contractService.getAllContract().size()+1;

        List<Map> list = new ArrayList<>();
        for(Estimation x: listEstimation) {
            Contract ct = x.getContract();
            if(ct != null && ct.getCtLevel() > level) {
                ct.setCtFold(false);
            }

            if(x.getEnName() == null && ct != null) {
                x.setEnName(ct.getCtName());
            }

            if(x.getCostLayer() != null && ct != null) {
                ct.setCtPid(x.getCtId());
                ct.setCtId(ctSize++);
            }

            if(x.getClCode() != null && x.getClCode().equals("level")) {
                x.setClCode("");
            }

            Map _x = x.toCostLayerMap();
            list.add(_x);

            if(_x.containsKey("clType")) {
                String clType = _x.get("clType").toString();
                if(clType != null && clType.length() > 0) {
                    list.remove(_x);
                    _x.put("clType",EstimationService.getTypeList(clType).toString());
                    list.add(_x);
                }
            }

            if(x.getClCode() != null && x.getClCode().equals("invalid")) {
                list.remove(_x);
            }

            if(x.getCostLayer() != null && type != null && type.length() > 0 && !x.getCostLayer().hasType(type)) {
                list.remove(_x);
            }
        }

        long count = list.size();
        return new LayuiData(0, list, count);
    }

    @RequestMapping("toCostLayerTreeBody")
    public @ResponseBody LayuiData toCostLayerTreeBody(Integer id, String type, Integer level) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Estimation> listEstimation = estimationService.queryEstimationByJoinCtId(id);
        int ctSize = contractService.getAllContract().size()+1;

        List<Map> list = new ArrayList<>();
        for(Estimation x: listEstimation) {
            Contract ct = x.getContract();
            if(ct != null && ct.getCtLevel() > level) {
                ct.setCtFold(false);
            }

            if(x.getEnName() == null && ct != null) {
                x.setEnName(ct.getCtName());
            }

            if(x.getCostLayer() != null && ct != null) {
                ct.setCtPid(x.getCtId());
                ct.setCtId(ctSize++);
            }

            if(x.getClCode() != null && x.getClCode().equals("level")) {
                x.setClCode("");
            }

            Map _x = x.toCostLayerMap();
            list.add(_x);

            if(_x.containsKey("clType")) {
                String clType = _x.get("clType").toString();
                if(clType != null && clType.length() > 0) {
                    list.remove(_x);
                    _x.put("clType",EstimationService.getTypeList(clType).toString());
                    list.add(_x);
                }
            }

            if(x.getClCode() != null && x.getClCode().equals("invalid")) {
                list.remove(_x);
            }

            if(x.getCostLayer() != null && type != null && type.length() > 0 && !x.getCostLayer().hasType(type)) {
                list.remove(_x);
            }
        }

        long count = list.size();
        return new LayuiData(0, list, count);
    }

    @RequestMapping("costLayerIframe")
    public ModelAndView costLayerIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("costlayer/costlayer_iframe", "message",null);
    }

    @RequestMapping("insertCostLayer")
    public ModelAndView insertCostLayer(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String clName = request.getParameter("clName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        mapMsg.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(clName != null && clName.length() > 0) {
            List list = costLayerService.getCostLayerByCondition("cl_name", clName);

            if (list.size() == 0) {
                CostLayer costLayer = costLayerService.getCostLayerByMaxId();
                Integer clId = 0;
                if (costLayer != null) {
                    clId = costLayer.getClId() + 1;
                } else {
                    clId = 1;
                }

                costLayer.setJson(json);
                costLayer.setClId(clId);
                costLayerService.insertCostLayer(costLayer);

                mapMsg.put("costlayer", costLayer);
                mapMsg.put("msg", "成本层 "+clName+" 基本信息数据录入成功!");
                return new ModelAndView("quantity/quantity_insert", "message", mapMsg);
            } else {
                mapMsg.put("costlayer", list.get(0));
                mapMsg.put("msg", "成本层 "+clName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("costlayer/costlayer_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "项目名称不能为空，请重新输入!");
        return new ModelAndView("costlayer/costlayer_insert", "message", mapMsg);
    }

    @RequestMapping("insertCostLayerBody")
    public @ResponseBody LayuiData insertCostLayerBody(CostLayer costLayer) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String clName = costLayer.getClName();
        if(clName != null && clName.length() > 0) {
            List list = costLayerService.getCostLayerByCondition("cl_name", clName);

            if (list.size() == 0) {
                CostLayer _costLayer = costLayerService.getCostLayerByMaxId();
                Integer clId = 0;
                if (_costLayer != null) {
                    clId = _costLayer.getClId() + 1;
                } else {
                    clId = 1;
                }

                costLayer.setClId(clId);
                code = costLayerService.insertCostLayer(costLayer);
            }
        }
        return new LayuiData(code, costLayer, 1);
    }

    @RequestMapping("modifyCostLayerBody")
    public @ResponseBody LayuiData modifyCostLayerBody(CostLayer costLayer) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        CostLayer _costLayer = costLayerService.getCostLayerById(costLayer.getClId());
        return new LayuiData(costLayerService.setCostLayerById(costLayer), _costLayer, 1);
    }

    @RequestMapping("deleteCostLayerBody")
    public @ResponseBody LayuiData deleteCostLayerBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(costLayerService.delCostLayerById(id),null,0);
    }

    @RequestMapping("searchCostLayer")
    public ModelAndView searchCostLayer(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listCostLayer = costLayerService.getCostLayerByCondition(field, value);
            if(value.equals("*")) {
                listCostLayer = costLayerService.getAllCostLayer();
            }

            if (listCostLayer.size() == 0) {
                map.put("CostLayerList", listCostLayer);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("CostLayerList", listCostLayer);
                map.put("msg", "系统提示：已经找到满足条件的 "+listCostLayer.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("costlayer/costlayer_search", "message", map);
    }

    @RequestMapping("searchCostLayerBody")
    public @ResponseBody LayuiData searchCostLayerBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = costLayerService.queryCostLayerByCondition(field, value, page, limit);
        long count = costLayerService.countCostLayerByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCostLayer")
    public ModelAndView mountCostLayer(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listCostLayer = costLayerService.getCostLayerByCondition(field, value);
            if(value.equals("*")) {
                listCostLayer = costLayerService.getAllCostLayer();
            }

            if (listCostLayer.size() == 0) {
                map.put("CostLayerList", listCostLayer);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("CostLayerList", listCostLayer);
                map.put("msg", "系统提示：已经找到满足条件的 "+listCostLayer.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("costlayer/costlayer_mount", "message", map);
    }

    @RequestMapping("mountCostLayerBody")
    public @ResponseBody LayuiData mountCostLayerBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Estimation> listEstimation = estimationService.getEstimationByCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = estimationService.countEstimationBySelectCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value);
        List list = new ArrayList();
        for(Estimation x: listEstimation) {
            if(x.getCostLayer() != null){
                list.add(x.getCostLayer());
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountEstimationBody")
    public @ResponseBody LayuiData mountEstimationBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = estimationService.getEstimationByCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = estimationService.countEstimationBySelectCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountQuantityBody")
    public @ResponseBody LayuiData mountQuantityBody(Integer ctId, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = costLayerService.getQuantityByCtId(ctId==null?-1:ctId, page, limit);
        long count = costLayerService.countQuantityBySelectCtId(ctId==null?-1:ctId);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("downloadCostLayer")
    public ModelAndView downloadCostLayer(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("costlayer/costlayer_download", "message",null);
    }
}
