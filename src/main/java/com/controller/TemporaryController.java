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
@RequestMapping("temporary")
public class TemporaryController {
    @Autowired
    private TemporaryService temporaryService;

    @Autowired
    private PartItemService partItemService;

    @Autowired
    private CostLayerService costLayerService;

    @RequestMapping("toTemporary")
    public ModelAndView toTemporary(HttpServletRequest request, HttpServletResponse response) {
        long count = temporaryService.countTemporaryByQueryCondition("pi_id", null);
        return new ModelAndView("temporary/temporary", "count",count);
    }

    @RequestMapping("toTemporaryBody")
    public @ResponseBody LayuiData toTemporaryBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Temporary> listTemporary = temporaryService.queryTemporaryByJoinPiId(id, page, limit);
        long count = temporaryService.countTemporaryByQueryJoinPiId(id);

        List<Map> list = new ArrayList<>();
        for(Temporary x:listTemporary) {
            PartItem pi = x.getPartItem();
            if(pi != null && pi.getPiLevel() > level) {
                pi.setPiFold(false);
            }

            list.add(x.toMap());
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("temporaryIframe")
    public ModelAndView temporaryIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("temporary/temporary_iframe", "message",null);
    }

    @RequestMapping("insertTemporary")
    public ModelAndView insertTemporary(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String tyName = request.getParameter("tyName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        mapMsg.put("lstPartItem", partItemService.getAllPartItem());
        mapMsg.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(tyName != null && tyName.length() > 0) {
            List list = temporaryService.getTemporaryByCondition("ty_name", tyName);

            if (list.size() == 0) {
                Temporary temporary = temporaryService.getTemporaryByMaxId();
                Integer tyId = 0;
                if (temporary != null) {
                    tyId = temporary.getTyId() + 1;
                } else {
                    tyId = 1;
                }

                temporary.setJson(json);
                temporary.setTyId(tyId);
                temporaryService.insertTemporary(temporary);

                mapMsg.put("temporary", temporary);
                mapMsg.put("msg", "工程数量 "+tyName+" 基本信息数据录入成功!");
                return new ModelAndView("temporary/temporary_insert", "message", mapMsg);
            } else {
                mapMsg.put("temporary", list.get(0));
                mapMsg.put("msg", "项目名称 "+tyName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("temporary/temporary_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "项目名称不能为空，请重新输入!");
        return new ModelAndView("temporary/temporary_insert", "message", mapMsg);
    }

    @RequestMapping("insertTemporaryBody")
    public @ResponseBody LayuiData insertTemporaryBody(Temporary temporary) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String tyName = temporary.getTyName();
        if(tyName != null && tyName.length() > 0) {
            List list = temporaryService.getTemporaryByCondition("ty_name", tyName);

            if (list.size() == 0) {
                Temporary _temporary = temporaryService.getTemporaryByMaxId();
                Integer tyId = 0;
                if (_temporary != null) {
                    tyId = _temporary.getTyId() + 1;
                } else {
                    tyId = 1;
                }

                temporary.setTyId(tyId);
                code = temporaryService.insertTemporary(temporary);
            }
        }
        return new LayuiData(code, temporary, 1);
    }

    @RequestMapping("modifyTemporaryBody")
    public @ResponseBody LayuiData modifyTemporaryBody(Temporary temporary) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Temporary _temporary = temporaryService.getTemporaryById(temporary.getTyId());
        return new LayuiData(temporaryService.setTemporaryById(temporary), _temporary, 1);
    }

    @RequestMapping("deleteTemporaryBody")
    public @ResponseBody LayuiData deleteTemporaryBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        return new LayuiData(temporaryService.delTemporaryById(id),null,0);
    }

    @RequestMapping("searchTemporary")
    public ModelAndView searchTemporary(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        map.put("lstPartItem", partItemService.getAllPartItem());
        map.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(field != null) {
            List listTemporary = temporaryService.getTemporaryByCondition(field, value);
            if(value.equals("*")) {
                listTemporary = temporaryService.getAllTemporary();
            }

            if (listTemporary.size() == 0) {
                map.put("TemporaryList", listTemporary);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("TemporaryList", listTemporary);
                map.put("msg", "系统提示：已经找到满足条件的 "+listTemporary.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("temporary/temporary_search", "message", map);
    }

    @RequestMapping("searchTemporaryBody")
    public @ResponseBody LayuiData searchTemporaryBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = temporaryService.queryTemporaryByCondition(field, value, page, limit);
        long count = temporaryService.countTemporaryByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountTemporary")
    public ModelAndView mountTemporary(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listTemporary = temporaryService.getTemporaryByCondition(field, value);
            if(value.equals("*")) {
                listTemporary = temporaryService.getAllTemporary();
            }

            if (listTemporary.size() == 0) {
                map.put("TemporaryList", listTemporary);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("TemporaryList", listTemporary);
                map.put("msg", "系统提示：已经找到满足条件的 "+listTemporary.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("temporary/temporary_mount", "message", map);
    }

    @RequestMapping("mountTemporaryBody")
    public @ResponseBody LayuiData mountTemporaryBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = temporaryService.getTemporaryByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = temporaryService.countTemporaryBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCostLayerBody")
    public @ResponseBody LayuiData mountCostLayerBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Temporary> listTemporary = temporaryService.getTemporaryByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = temporaryService.countTemporaryBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);

        List list = new ArrayList();
        for(Temporary x: listTemporary) {
            if(x.getCostLayer() != null) {
                list.add(x.getCostLayer());
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("uploadTemporary")
    public ModelAndView uploadTemporary(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("temporary/temporary_upload", "message",null);
    }

    @RequestMapping("downloadTemporary")
    public ModelAndView downloadTemporary(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("temporary/temporary_download", "message",null);
    }

    @RequestMapping("restoreTemporary")
    public ModelAndView restoreTemporary(HttpServletRequest request, HttpServletResponse response) {
        long count = temporaryService.countTemporaryByQueryCondition("pi_id", null);
        return new ModelAndView("temporary/temporary_restore", "count",count);
    }

    @RequestMapping("restoreTemporaryBody")
    public @ResponseBody LayuiData restoreTemporaryBody(Integer id, String type, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<CostLayer> list = temporaryService.getCostLayerByClId(id, page, limit);
        long count = temporaryService.countCostLayerBySelectClId(id);

        for(CostLayer x:list) {
            costLayerService.setCostLayerById(x);
        }
        return new LayuiData(0, list, count);
    }
}
