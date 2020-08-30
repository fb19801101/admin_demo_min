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
@RequestMapping("equipment")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    @Autowired
    private PartItemService partItemService;

    @Autowired
    private CostLayerService costLayerService;

    @RequestMapping("toEquipment")
    public ModelAndView toEquipment(HttpServletRequest request, HttpServletResponse response) {
        long count = equipmentService.countEquipmentByQueryCondition("pi_id", null);
        return new ModelAndView("equipment/equipment", "count",count);
    }

    @RequestMapping("toEquipmentBody")
    public @ResponseBody LayuiData toEquipmentBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Equipment> listEquipment = equipmentService.queryEquipmentByJoinPiId(id, page, limit);
        long count = equipmentService.countEquipmentByQueryJoinPiId(id);

        List<Map> list = new ArrayList<>();
        for(Equipment x:listEquipment) {
            PartItem pi = x.getPartItem();
            if(pi != null && pi.getPiLevel() > level) {
                pi.setPiFold(false);
            }

            list.add(x.toMap());
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("equipmentIframe")
    public ModelAndView equipmentIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("equipment/equipment_iframe", "message",null);
    }

    @RequestMapping("insertEquipment")
    public ModelAndView insertEquipment(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String etName = request.getParameter("etName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        mapMsg.put("lstPartItem", partItemService.getAllPartItem());
        mapMsg.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(etName != null && etName.length() > 0) {
            List list = equipmentService.getEquipmentByCondition("et_name", etName);

            if (list.size() == 0) {
                Equipment equipment = equipmentService.getEquipmentByMaxId();
                Integer etId = 0;
                if (equipment != null) {
                    etId = equipment.getEtId() + 1;
                } else {
                    etId = 1;
                }

                equipment.setJson(json);
                equipment.setEtId(etId);
                equipmentService.insertEquipment(equipment);

                mapMsg.put("equipment", equipment);
                mapMsg.put("msg", "工程数量 "+etName+" 基本信息数据录入成功!");
                return new ModelAndView("equipment/equipment_insert", "message", mapMsg);
            } else {
                mapMsg.put("equipment", list.get(0));
                mapMsg.put("msg", "项目名称 "+etName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("equipment/equipment_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "项目名称不能为空，请重新输入!");
        return new ModelAndView("equipment/equipment_insert", "message", mapMsg);
    }

    @RequestMapping("insertEquipmentBody")
    public @ResponseBody LayuiData insertEquipmentBody(Equipment equipment) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String etName =equipment.getEtName();
        if(etName != null && etName.length() > 0) {
            List list = equipmentService.getEquipmentByCondition("et_name", etName);

            if (list.size() == 0) {
                Equipment _equipment = equipmentService.getEquipmentByMaxId();
                Integer etId = 0;
                if (_equipment != null) {
                    etId = _equipment.getEtId() + 1;
                } else {
                    etId = 1;
                }

                equipment.setEtId(etId);
                code = equipmentService.insertEquipment(equipment);

            }
        }
        return new LayuiData(code, equipment, 1);
    }

    @RequestMapping("modifyEquipmentBody")
    public @ResponseBody LayuiData modifyEquipmentBody(Equipment equipment) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Equipment _equipment = equipmentService.getEquipmentById(equipment.getEtId());
        return new LayuiData(equipmentService.setEquipmentById(equipment), _equipment, 1);
    }

    @RequestMapping("deleteEquipmentBody")
    public @ResponseBody LayuiData deleteEquipmentBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(equipmentService.delEquipmentById(id),null,0);
    }

    @RequestMapping("searchEquipment")
    public ModelAndView searchEquipment(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        map.put("lstPartItem", partItemService.getAllPartItem());
        map.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(field != null) {
            List listEquipment = equipmentService.getEquipmentByCondition(field, value);
            if(value.equals("*")) {
                listEquipment = equipmentService.getAllEquipment();
            }

            if (listEquipment.size() == 0) {
                map.put("EquipmentList", listEquipment);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("EquipmentList", listEquipment);
                map.put("msg", "系统提示：已经找到满足条件的 "+listEquipment.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("equipment/equipment_search", "message", map);
    }

    @RequestMapping("searchEquipmentBody")
    public @ResponseBody LayuiData searchEquipmentBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = equipmentService.queryEquipmentByCondition(field, value, page, limit);
        long count = equipmentService.countEquipmentByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountEquipment")
    public ModelAndView mountEquipment(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listEquipment = equipmentService.getEquipmentByCondition(field, value);
            if(value.equals("*")) {
                listEquipment = equipmentService.getAllEquipment();
            }

            if (listEquipment.size() == 0) {
                map.put("EquipmentList", listEquipment);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("EquipmentList", listEquipment);
                map.put("msg", "系统提示：已经找到满足条件的 "+listEquipment.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("equipment/equipment_mount", "message", map);
    }

    @RequestMapping("mountEquipmentBody")
    public @ResponseBody LayuiData mountEquipmentBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = equipmentService.getEquipmentByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = equipmentService.countEquipmentBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCostLayerBody")
    public @ResponseBody LayuiData mountCostLayerBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Equipment> listEquipment = equipmentService.getEquipmentByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = equipmentService.countEquipmentBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);

        List list = new ArrayList();
        for(Equipment x: listEquipment) {
            if(x.getCostLayer() != null) {
                list.add(x.getCostLayer());
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("uploadEquipment")
    public ModelAndView uploadEquipment(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("equipment/equipment_upload", "message",null);
    }

    @RequestMapping("downloadEquipment")
    public ModelAndView downloadEquipment(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("equipment/equipment_download", "message",null);
    }

    @RequestMapping("restoreEquipment")
    public ModelAndView restoreEquipment(HttpServletRequest request, HttpServletResponse response) {
        long count = equipmentService.countEquipmentByQueryCondition("pi_id", null);
        return new ModelAndView("equipment/equipment_restore", "count",count);
    }

    @RequestMapping("restoreEquipmentBody")
    public @ResponseBody LayuiData restoreEquipmentBody(Integer id, String type, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<CostLayer> list = equipmentService.getCostLayerByClId(id, page, limit);
        long count = equipmentService.countCostLayerBySelectClId(id);

        for(CostLayer x:list) {
            costLayerService.setCostLayerById(x);
        }
        return new LayuiData(0, list, count);
    }
}
