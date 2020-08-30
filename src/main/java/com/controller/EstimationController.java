package com.controller;

import com.dateutil.EncodeUtil;
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
@RequestMapping("estimation")
public class EstimationController {
    @Autowired
    private EstimationService estimationService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private GuidanceService guidanceService;

    @Autowired
    private CostLayerService costLayerService;

    @RequestMapping("toEstimation")
    public String toEstimation(HttpServletRequest request, HttpServletResponse response) {
        return "estimation/estimation";
    }

    @RequestMapping("insertEstimationBody")
    public @ResponseBody LayuiData insertEstimationBody(Estimation estimation) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        String enName = estimation.getEnName();
        int code = 0;
        if(enName != null && enName.length() > 0) {
            List list = estimationService.getEstimationByCondition("en_name", enName);

            if (list.size() == 0) {
                Estimation _estimation = estimationService.getEstimationByMaxId();
                Integer enId = 0;
                if (_estimation != null) {
                    enId = _estimation.getEnId() + 1;
                } else {
                    enId = 1;
                }

                estimation.setEnId(enId);
                code = estimationService.insertEstimation(estimation);
            }
        }
        return new LayuiData(code, estimation, 1);
    }

    @RequestMapping("modifyEstimationBody")
    public @ResponseBody LayuiData modifyEstimationBody(Estimation estimation) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Estimation _estimation = estimationService.getEstimationById(estimation.getEnId());
        return new LayuiData(estimationService.setEstimationById(estimation), _estimation, 1);
    }

    @RequestMapping("deleteEstimationBody")
    public @ResponseBody LayuiData deleteEstimationBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(estimationService.delEstimationById(id),null,0);
    }

    @RequestMapping("searchEstimation")
    public ModelAndView searchEstimation(HttpServletRequest request, HttpServletResponse response) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        map.put("lstContract", contractService.getAllContract());
        map.put("lstGuidance", guidanceService.getAllGuidance());
        map.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(field != null) {
            List listEstimation = estimationService.getEstimationByCondition(field, value);
            if(value.equals("*")) {
                listEstimation = estimationService.getAllEstimation();
            }

            if (listEstimation.size() == 0) {
                map.put("lstEstimation", listEstimation);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("lstEstimation", listEstimation);
                map.put("msg", "系统提示：已经找到满足条件的 "+listEstimation.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("estimation/estimation_search", "message", map);
    }

    @RequestMapping("searchEstimationBody")
    public @ResponseBody LayuiData searchEstimationBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = estimationService.queryEstimationByCondition(field, value, page, limit);
        long count = estimationService.countEstimationByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("analysisEstimation")
    public ModelAndView analysisEstimation(HttpServletRequest request, HttpServletResponse response) {
        long count = estimationService.countEstimationByQueryCtId(null);
        return new ModelAndView("estimation/estimation_analysis", "count",count);
    }

    @RequestMapping("analysisEstimationBody")
    public @ResponseBody LayuiData analysisEstimationBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Map> list = estimationService.queryEstimationByCtId(id, page, limit);
        long count = estimationService.countEstimationByQueryCtId(id);
        int ctSize = contractService.getAllContract().size()+1;

        List<Map> _list = new ArrayList<>();
        for(Map x: list) {
            String enClCode = x.get("enClCode").toString();
            String enGdCode = x.get("enGdCode").toString();

            if((!enClCode.equals("invalid") && !enClCode.equals("level")) || (!enGdCode.equals("invalid") && !enGdCode.equals("level"))) {
                x.put("ctPid",x.get("ctId"));
                x.put("ctId", ctSize++);
            }

            _list.add(x);

            if(x.containsKey("clType")) {
                String clType = x.get("clType").toString();
                if(clType != null && clType.length() > 0) {
                    _list.remove(x);
                    EstimationService.getTypeList(clType);
                    x.put("clType",EstimationService.getTypeList(clType).toString());
                    _list.add(x);
                }
            }

            if(enClCode.equals("invalid") && enGdCode.equals("invalid")) {
                _list.remove(x);
            }
        }

        return new LayuiData(0, _list, count);
    }

    @RequestMapping("compareEstimation")
    public ModelAndView compareEstimation(HttpServletRequest request, HttpServletResponse response) {
        long count = estimationService.countEstimationByQueryCtId(null);
        return new ModelAndView("estimation/estimation_compare", "count",count);
    }

    @RequestMapping("compareEstimationBody")
    public @ResponseBody LayuiData compareEstimationBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Map> list = estimationService.queryEstimationByCtId(id, page, limit);
        long count = estimationService.countEstimationBySelectCtId(id);
        int ctSize = contractService.getAllContract().size()+1;

        List<Map> _list = new ArrayList<>();
        for(Map x: list) {
            String enClCode = x.get("enClCode").toString();
            String enGdCode = x.get("enGdCode").toString();

            if((!enClCode.equals("invalid") && !enClCode.equals("level")) || (!enGdCode.equals("invalid") && !enGdCode.equals("level"))) {
                x.put("ctPid",x.get("ctId"));
                x.put("ctId", ctSize++);
            }

            _list.add(x);

            if(x.containsKey("clType")) {
                String clType = x.get("clType").toString();
                if(clType != null && clType.length() > 0) {
                    _list.remove(x);
                    EstimationService.getTypeList(clType);
                    x.put("clType",EstimationService.getTypeList(clType).toString());
                    _list.add(x);
                }
            }

            if(enClCode.equals("invalid") && enGdCode.equals("invalid")) {
                _list.remove(x);
            }
        }

        return new LayuiData(0, _list, count);
    }

    @RequestMapping("labourEstimation")
    public ModelAndView labourEstimation(HttpServletRequest request, HttpServletResponse response) {
        long count = estimationService.countEstimationByQueryCtId(null);
        return new ModelAndView("estimation/estimation_labour", "count",count);
    }

    @RequestMapping("labourEstimationBody")
    public @ResponseBody LayuiData labourEstimationBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Map> list = estimationService.queryEstimationByCtId(id, page, limit);
        long count = estimationService.countEstimationByQueryCtId(id);
        int ctSize = contractService.getAllContract().size()+1;

        List<Map> _list = new ArrayList<>();
        for(Map x: list) {
            String enClCode = x.get("enClCode").toString();
            String enGdCode = x.get("enGdCode").toString();

            if((!enClCode.equals("invalid") && !enClCode.equals("level")) || (!enGdCode.equals("invalid") && !enGdCode.equals("level"))) {
                x.put("ctPid",x.get("ctId"));
                x.put("ctId", ctSize++);
            }

            _list.add(x);

            if(x.containsKey("clType")) {
                String clType = x.get("clType").toString();
                if(clType != null && clType.length() > 0) {
                    _list.remove(x);
                    if(EstimationService.hasType(clType, "劳务层")) {
                        x.put("clType","[劳务层]");
                        _list.add(x);
                    }
                }
            }

            if(enClCode.equals("invalid") && enGdCode.equals("invalid")) {
                _list.remove(x);
            }
        }

        return new LayuiData(0, _list, count);
    }

    @RequestMapping("materialEstimation")
    public ModelAndView materialEstimation(HttpServletRequest request, HttpServletResponse response) {
        long count = estimationService.countEstimationByQueryCtId(null);
        return new ModelAndView("estimation/estimation_material", "count",count);
    }

    @RequestMapping("materialEstimationBody")
    public @ResponseBody LayuiData materialEstimationBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Map> list = estimationService.queryEstimationByCtId(id, page, limit);
        long count = estimationService.countEstimationByQueryCtId(id);
        int ctSize = contractService.getAllContract().size()+1;

        List<Map> _list = new ArrayList<>();
        for(Map x: list) {
            String enClCode = x.get("enClCode").toString();
            String enGdCode = x.get("enGdCode").toString();

            if((!enClCode.equals("invalid") && !enClCode.equals("level")) || (!enGdCode.equals("invalid") && !enGdCode.equals("level"))) {
                x.put("ctPid",x.get("ctId"));
                x.put("ctId", ctSize++);
            }

            _list.add(x);

            if(x.containsKey("clType")) {
                String clType = x.get("clType").toString();
                if(clType != null && clType.length() > 0) {
                    _list.remove(x);
                    if(EstimationService.hasType(clType, "物资层")) {
                        x.put("clType","[物资层]");
                        _list.add(x);
                    }
                }
            }

            if(enClCode.equals("invalid") && enGdCode.equals("invalid")) {
                _list.remove(x);
            }
        }

        return new LayuiData(0, _list, count);
    }
}