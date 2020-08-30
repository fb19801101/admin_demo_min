package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.dateutil.EncodeUtil;
import com.dateutil.JsonUtil;
import com.model.*;
import com.service.EstimationService;
import com.service.ContractService;
import com.service.GuidanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-04-01 15:50
 */
@Controller
@RequestMapping("guidance")
public class GuidanceController {
    @Autowired
    private GuidanceService guidanceService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private EstimationService estimationService;

    @InitBinder
    public void intDate(WebDataBinder dataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping("toGuidance")
    public ModelAndView toGuidance(HttpServletRequest request, HttpServletResponse response) {
        long count = estimationService.countEstimationByQueryCondition("ct_id", null);
        return new ModelAndView("guidance/guidance", "count",count);
    }

    @RequestMapping("toGuidanceBody")
    public @ResponseBody LayuiData toGuidanceBody(Integer id, Integer level, Integer page, Integer limit) {
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

            if(x.getGuidance() != null && ct != null) {
                ct.setCtPid(x.getCtId());
                ct.setCtId(ctSize++);
            }

            if(x.getGdCode() != null && x.getGdCode().equals("level")) {
                x.setGdCode("");
            }

            list.add(x.toGuidanceMap());

            if(x.getGdCode() != null && x.getGdCode().equals("invalid")) {
                list.remove(x.toGuidanceMap());
            }
        }

        long count = list.size();
        return new LayuiData(0, list, count);
    }

    @RequestMapping("toGuidanceTreeBody")
    public @ResponseBody LayuiData toGuidanceTreeBody(Integer id, Integer level) {
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

            if(x.getGuidance() != null && ct != null) {
                ct.setCtPid(x.getCtId());
                ct.setCtId(ctSize++);
            }

            if(x.getGdCode() != null && x.getGdCode().equals("level")) {
                x.setGdCode("");
            }

            list.add(x.toGuidanceMap());

            if(x.getGdCode() != null && x.getGdCode().equals("invalid")) {
                list.remove(x.toGuidanceMap());
            }
        }

        long count = list.size();
        return new LayuiData(0, list, count);
    }

    @RequestMapping("guidanceIframe")
    public ModelAndView guidanceIframe(HttpServletRequest request, HttpServletResponse response) {
        Map map = new HashMap();
        map.put("msg", "系统提示：录入数据不满足规定条件!  guidanceTemplate");
        return new ModelAndView("guidance/guidance_iframe", "message", map);
    }

    @RequestMapping("insertGuidance")
    public ModelAndView insertGuidance(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String gdName = request.getParameter("gdName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();

        if(gdName != null && gdName.length() > 0) {
            List list = guidanceService.getGuidanceByCondition("gd_name", gdName);

            if (list.size() == 0) {
                Guidance guidance = guidanceService.getGuidanceByMaxId();
                Integer gdId = 0;
                if (guidance != null) {
                    gdId = guidance.getGdId() + 1;
                } else {
                    gdId = 1;
                }

                guidance.setJson(json);
                guidance.setGdId(gdId);
                guidanceService.insertGuidance(guidance);

                mapMsg.put("guidance", guidance);
                mapMsg.put("msg", "指导价 "+gdName+" 基本信息数据录入成功!");
                return new ModelAndView("guidance/guidance_insert", "message", mapMsg);
            } else {
                mapMsg.put("labour", list.get(0));
                mapMsg.put("msg", "细目名称 "+gdName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("guidance/guidance_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "细目名称不能为空，请重新输入!");
        return new ModelAndView("guidance/guidance_insert", "message", mapMsg);
    }

    @RequestMapping("insertGuidanceBody")
    public @ResponseBody LayuiData insertGuidanceBody(Guidance guidance) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String gdName = guidance.getGdName();
        if(gdName != null && gdName.length() > 0) {
            List list = guidanceService.getGuidanceByCondition("gd_name", gdName);

            if (list.size() == 0) {
                Guidance _guidance = guidanceService.getGuidanceByMaxId();
                Integer gdId = 0;
                if (_guidance != null) {
                    gdId = _guidance.getGdId() + 1;
                } else {
                    gdId = 1;
                }

                guidance.setGdId(gdId);
                code = guidanceService.insertGuidance(guidance);
            }
        }
        return new LayuiData(code, guidance, 1);
    }

    @RequestMapping("modifyGuidanceBody")
    public @ResponseBody LayuiData modifyGuidanceBody(Guidance guidance) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Guidance _guidance = guidanceService.getGuidanceById(guidance.getGdId());
        return new LayuiData(guidanceService.setGuidanceById(guidance), _guidance, 1);
    }

    @RequestMapping("deleteGuidanceBody")
    public @ResponseBody LayuiData deleteGuidanceBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(guidanceService.delGuidanceById(id),null,0);
    }

    @RequestMapping("searchGuidance")
    public ModelAndView searchGuidance(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listGuidance = guidanceService.getGuidanceByCondition(field, value);
            if(value.equals("*")) {
                listGuidance = guidanceService.getAllGuidance();
            }

            if (listGuidance.size() == 0) {
                map.put("GuidanceList", listGuidance);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("GuidanceList", listGuidance);
                map.put("msg", "系统提示：已经找到满足条件的 "+listGuidance.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("guidance/guidance_search", "message", map);
    }

    @RequestMapping("searchGuidanceBody")
    public @ResponseBody LayuiData searchGuidanceBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = guidanceService.queryGuidanceByCondition(field, value, page, limit);
        long count = guidanceService.countGuidanceByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountGuidance")
    public ModelAndView mountGuidance(HttpServletRequest request, HttpServletResponse response) {
        Map map = new HashMap();
        map.put("msg", "系统提示：录入数据不满足规定条件!  mountGuidance");
        return new ModelAndView("guidance/guidance_mount", "message", map);
    }

    @RequestMapping("mountGuidanceBody")
    public @ResponseBody LayuiData mountGuidanceBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Estimation> listEstimation = estimationService.getEstimationByCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = estimationService.countEstimationBySelectCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value);

        List list = new ArrayList();
        for(Estimation x: listEstimation) {
            if(x.getGuidance() != null) {
                list.add(x.getGuidance());
            }
        }
        return new LayuiData(0, list, count);
    }
}
