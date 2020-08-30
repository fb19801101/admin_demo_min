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
@RequestMapping("indirect")
public class IndirectController {
    @Autowired
    private IndirectService indirectService;

    @Autowired
    private PartItemService partItemService;

    @Autowired
    private CostLayerService costLayerService;

    @RequestMapping("toIndirect")
    public ModelAndView toIndirect(HttpServletRequest request, HttpServletResponse response) {
        long count = indirectService.countIndirectByQueryCondition("pi_id", null);
        return new ModelAndView("indirect/indirect", "count",count);
    }

    @RequestMapping("toIndirectBody")
    public @ResponseBody LayuiData toIndirectBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Indirect> listIndirect = indirectService.queryIndirectByJoinPiId(id, page, limit);
        long count = indirectService.countIndirectByQueryJoinPiId(id);

        List<Map> list = new ArrayList<>();
        for(Indirect x:listIndirect) {
            PartItem pi = x.getPartItem();
            if(pi != null && pi.getPiLevel() > level) {
                pi.setPiFold(false);
            }

            list.add(x.toMap());
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("indirectIframe")
    public ModelAndView indirectIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("indirect/indirect_iframe", "message",null);
    }

    @RequestMapping("insertIndirect")
    public ModelAndView insertIndirect(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String itName = request.getParameter("itName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        mapMsg.put("lstPartItem", partItemService.getAllPartItem());
        mapMsg.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(itName != null && itName.length() > 0) {
            List list = indirectService.getIndirectByCondition("it_name", itName);

            if (list.size() == 0) {
                Indirect indirect = indirectService.getIndirectByMaxId();
                Integer itId = 0;
                if (indirect != null) {
                    itId = indirect.getItId() + 1;
                } else {
                    itId = 1;
                }

                indirect.setJson(json);
                indirect.setItId(itId);
                indirectService.insertIndirect(indirect);

                mapMsg.put("indirect", indirect);
                mapMsg.put("msg", "工程数量 "+itName+" 基本信息数据录入成功!");
                return new ModelAndView("indirect/indirect_insert", "message", mapMsg);
            } else {
                mapMsg.put("indirect", list.get(0));
                mapMsg.put("msg", "项目名称 "+itName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("indirect/indirect_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "项目名称不能为空，请重新输入!");
        return new ModelAndView("indirect/indirect_insert", "message", mapMsg);
    }

    @RequestMapping("insertIndirectBody")
    public @ResponseBody LayuiData insertIndirectBody(Indirect indirect) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String itName = indirect.getItName();
        if(itName != null && itName.length() > 0) {
            List list = indirectService.getIndirectByCondition("it_name", itName);

            if (list.size() == 0) {
                Indirect _indirect = indirectService.getIndirectByMaxId();
                Integer itId = 0;
                if (_indirect != null) {
                    itId = _indirect.getItId() + 1;
                } else {
                    itId = 1;
                }

                indirect.setItId(itId);
                code = indirectService.insertIndirect(indirect);
            }
        }
        return new LayuiData(code, indirect, 1);
    }

    @RequestMapping("modifyIndirectBody")
    public @ResponseBody LayuiData modifyIndirectBody(Indirect indirect) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Indirect _indirect = indirectService.getIndirectById(indirect.getItId());
        return new LayuiData(indirectService.setIndirectById(indirect), _indirect, 1);
    }

    @RequestMapping("deleteIndirectBody")
    public @ResponseBody LayuiData deleteIndirectBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(indirectService.delIndirectById(id),null,0);
    }

    @RequestMapping("searchIndirect")
    public ModelAndView searchIndirect(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        map.put("lstPartItem", partItemService.getAllPartItem());
        map.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(field != null) {
            List listIndirect = indirectService.getIndirectByCondition(field, value);
            if(value.equals("*")) {
                listIndirect = indirectService.getAllIndirect();
            }

            if (listIndirect.size() == 0) {
                map.put("IndirectList", listIndirect);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("IndirectList", listIndirect);
                map.put("msg", "系统提示：已经找到满足条件的 "+listIndirect.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("indirect/indirect_search", "message", map);
    }

    @RequestMapping("searchIndirectBody")
    public @ResponseBody LayuiData searchIndirectBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = indirectService.queryIndirectByCondition(field, value, page, limit);
        long count = indirectService.countIndirectByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountIndirect")
    public ModelAndView mountIndirect(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listIndirect = indirectService.getIndirectByCondition(field, value);
            if(value.equals("*")) {
                listIndirect = indirectService.getAllIndirect();
            }

            if (listIndirect.size() == 0) {
                map.put("IndirectList", listIndirect);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("IndirectList", listIndirect);
                map.put("msg", "系统提示：已经找到满足条件的 "+listIndirect.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("indirect/indirect_mount", "message", map);
    }

    @RequestMapping("mountIndirectBody")
    public @ResponseBody LayuiData mountIndirectBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = indirectService.getIndirectByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = indirectService.countIndirectBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCostLayerBody")
    public @ResponseBody LayuiData mountCostLayerBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Indirect> listIndirect = indirectService.getIndirectByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = indirectService.countIndirectBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);

        List list = new ArrayList();
        for(Indirect x: listIndirect) {
            if(x.getCostLayer() != null) {
                list.add(x.getCostLayer());
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("uploadIndirect")
    public ModelAndView uploadIndirect(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("indirect/indirect_upload", "message",null);
    }

    @RequestMapping("downloadIndirect")
    public ModelAndView downloadIndirect(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("indirect/indirect_download", "message",null);
    }

    @RequestMapping("restoreIndirect")
    public ModelAndView restoreIndirect(HttpServletRequest request, HttpServletResponse response) {
        long count = indirectService.countIndirectByQueryCondition("pi_id", null);
        return new ModelAndView("indirect/indirect_restore", "count",count);
    }

    @RequestMapping("restoreIndirectBody")
    public @ResponseBody LayuiData restoreIndirectBody(Integer id, String type, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<CostLayer> list = indirectService.getCostLayerByClId(id, page, limit);
        long count = indirectService.countCostLayerBySelectClId(id);

        for(CostLayer x:list) {
            costLayerService.setCostLayerById(x);
        }
        return new LayuiData(0, list, count);
    }
}
