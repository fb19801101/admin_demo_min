package com.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dateutil.EncodeUtil;
import com.dateutil.JsonUtil;
import com.model.LayuiData;
import com.model.NetPlan;
import com.model.PartItem;
import com.service.NetPlanService;
import com.service.PartItemService;
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
@RequestMapping("partitem")
public class PartItemController {
    @Autowired
    private PartItemService partItemService;

    @Autowired
    private NetPlanService netPlanService;

    @RequestMapping("toPartItem")
    public ModelAndView toPartItem(HttpServletRequest request, HttpServletResponse response) {
        long count = partItemService.countPartItemByQueryCondition("pi_id", null);
        return new ModelAndView("partitem/partitem", "count",count);
    }

    @RequestMapping("toPartItemBody")
    public @ResponseBody LayuiData toPartItemBody(String field, String value, Integer level, Integer page, Integer limit) {
        //        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<PartItem> list = partItemService.queryPartItemByCondition(field, value, page, limit);
        long count = partItemService.countPartItemByQueryCondition(field, value);

        for(PartItem x:list) {
            if(x.getPiLevel() > level) {
                x.setPiFold(false);
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("toPartItemTree")
    public ModelAndView toPartItemTree(HttpServletRequest request, HttpServletResponse response) {
        List list = partItemService.getAllPartItem();
        JSONObject json = new JSONObject();
        JSONObject _json = new JSONObject();
        _json.put("code", "200");
        _json.put("message", "操作成功");
        json.put("status", _json);
        JSONArray jsons = new JSONArray();
        for(int i=0; i<list.size(); i++) {
            PartItem pi = (PartItem)list.get(i);
            JSONObject json1 = pi.toJson();
            jsons.add(json1);
        }
        json.put("data", jsons);

//        BufferedWriter write = null;
//        try {
//            String path = request.getServletContext().getRealPath("/demo.json");
//            write = new BufferedWriter(new OutputStreamWriter(
//                    new FileOutputStream(path), "UTF-8"));
//
//            write.append(json.toString());
//            write.append("/n/n/n");
//            write.append(jsons.toString());
//            write.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                write.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        HashMap mapMsg = new HashMap();
        mapMsg.put("list", list);
        mapMsg.put("data", jsons.toString());
        mapMsg.put("json", json.toString());
        return new ModelAndView("partitem/partitem_tree", "message", mapMsg);
    }

    @RequestMapping("toPartItemTreeBody")
    public @ResponseBody LayuiData toPartItemTreeBody(String field, String value, Integer level) {
        //        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<PartItem> list = partItemService.queryPartItemByCondition(field, value);
        long count = partItemService.countPartItemByQueryCondition(field, value);

        for(PartItem x:list) {
            if(x.getPiLevel() > level) {
                x.setPiFold(false);
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("partItemIframe")
    public ModelAndView partItemIframe(HttpServletRequest request, HttpServletResponse response) {
        List<PartItem> list = partItemService.getAllPartItem();
        HashMap mapMsg = new HashMap();
        mapMsg.put("lstPartItem", list);
        return new ModelAndView("partitem/partitem_iframe", "message", mapMsg);
    }

    @RequestMapping("insertPartItem")
    public ModelAndView insertPartItem(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String piNode = request.getParameter("piNode");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();

        if(piNode != null && piNode.length() > 0) {
            List list = partItemService.getPartItemByCondition("pi_name", piNode);

            if (list.size() == 0) {
                PartItem partItem = partItemService.getPartItemByMaxId();
                Integer piId = 0;
                if (partItem != null) {
                    piId = partItem.getPiId() + 1;
                } else {
                    piId = 1;
                }

                partItem.setJson(json);
                partItem.setPiId(piId);
                partItemService.insertPartItem(partItem);

                mapMsg.put("partitem", partItem);
                mapMsg.put("msg", "分部分项 "+piNode+" 基本信息数据录入成功!");
                return new ModelAndView("partitem/partitem_insert", "message", mapMsg);
            } else {
                mapMsg.put("partitem", list.get(0));
                mapMsg.put("msg", "分项名称 "+piNode+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("partitem/partitem_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "分项名称不能为空，请重新输入!");
        return new ModelAndView("partitem/partitem_insert", "message", mapMsg);
    }

    @RequestMapping("insertPartItemBody")
    public @ResponseBody LayuiData insertPartItemBody(PartItem partItem) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String piNode = partItem.getPiName();
        if(piNode != null && piNode.length() > 0) {
            List list = partItemService.getPartItemByCondition("pi_name", piNode);

            if (list.size() == 0) {
                PartItem _partItem = partItemService.getPartItemByMaxId();
                Integer piId = 0;
                if (_partItem != null) {
                    piId = _partItem.getPiId() + 1;
                } else {
                    piId = 1;
                }

                partItem.setPiId(piId);
                code = partItemService.insertPartItem(partItem);
            }
        }
        return new LayuiData(code, partItem, 1);
    }

    @RequestMapping("modifyPartItemBody")
    public @ResponseBody LayuiData modifyPartItemBody(PartItem partItem) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        PartItem _partItem = partItemService.getPartItemById(partItem.getPiId());
        return new LayuiData(partItemService.setPartItemById(partItem), _partItem, 1);
    }

    @RequestMapping("deletePartItemBody")
    public @ResponseBody LayuiData deletePartItemBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        return new LayuiData(partItemService.delPartItemById(id),null,0);
    }

    @RequestMapping("searchPartItem")
    public ModelAndView searchPartItem(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listPartItem = partItemService.getPartItemByCondition(field, value);
            if(value.equals("*")) {
                listPartItem = partItemService.getAllPartItem();
            }

            if (listPartItem.size() == 0) {
                map.put("PartItemList", listPartItem);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("PartItemList", listPartItem);
                map.put("msg", "系统提示：已经找到满足条件的 "+listPartItem.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("partitem/partitem_search", "message", map);
    }

    @RequestMapping("searchPartItemBody")
    public @ResponseBody LayuiData searchPartItemBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = partItemService.queryPartItemByCondition(field, value, page, limit);
        long count = partItemService.countPartItemByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountPartItem")
    public ModelAndView mountPartItem(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("partitem/partitem_mount", "message",null);
    }

    @RequestMapping("mountPartItemBody")
    public @ResponseBody LayuiData mountPartItemBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = partItemService.getPartItemByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = partItemService.countPartItemBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountQuantityBody")
    public @ResponseBody LayuiData mountQuantityBody(Integer piId, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = partItemService.getQuantityByPiId(piId==null?-1:piId, page, limit);
        long count = partItemService.countQuantityBySelectPiId(piId==null?-1:piId);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountNetPlanBody")
    public @ResponseBody LayuiData mountNetPlanBody(Integer piId, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = partItemService.getNetPlanByPiId(piId==null?-1:piId, page, limit);
        long count = partItemService.countNetPlanBySelectPiId(piId==null?-1:piId);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCompanyBody")
    public @ResponseBody LayuiData mountCompanyBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<NetPlan> listNetPlan = netPlanService.getNetPlanByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = netPlanService.countNetPlanBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);

        List list = new ArrayList();
        for(NetPlan x: listNetPlan) {
            if(x.getCompany() != null) {
                list.add(x.getCompany());
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCostLayerBody")
    public @ResponseBody LayuiData mountCostLayerBody(Integer piId, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = partItemService.getCostLayerByPiId(piId==null?-1:piId, page, limit);
        long count = partItemService.countCostLayerBySelectPiId(piId==null?-1:piId);
        return new LayuiData(0, list, count);
    }
}
