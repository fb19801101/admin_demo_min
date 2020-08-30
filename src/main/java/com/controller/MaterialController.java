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
@RequestMapping("material")
public class MaterialController {
    @Autowired
    private MaterialService materialService;

    @Autowired
    private PartItemService partItemService;

    @Autowired
    private CostLayerService costLayerService;

    @RequestMapping("toMaterial")
    public ModelAndView toMaterial(HttpServletRequest request, HttpServletResponse response) {
        long count = materialService.countMaterialByQueryCondition("pi_id", null);
        return new ModelAndView("material/material", "count",count);
    }

    @RequestMapping("toMaterialBody")
    public @ResponseBody LayuiData toMaterialBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Material> listMaterial = materialService.queryMaterialByJoinPiId(id, page, limit);
        long count = materialService.countMaterialByQueryJoinPiId(id);

        List<Map> list = new ArrayList<>();
        for(Material x:listMaterial) {
            PartItem pi = x.getPartItem();
            if(pi != null && pi.getPiLevel() > level) {
                pi.setPiFold(false);
            }

            list.add(x.toMap());
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("materialIframe")
    public ModelAndView materialIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("material/material_iframe", "message",null);
    }

    @RequestMapping("insertMaterial")
    public ModelAndView insertMaterial(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String mlName = request.getParameter("mlName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        mapMsg.put("lstPartItem", partItemService.getAllPartItem());
        mapMsg.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(mlName != null && mlName.length() > 0) {
            List list = materialService.getMaterialByCondition("ml_name", mlName);

            if (list.size() == 0) {
                Material material = materialService.getMaterialByMaxId();
                Integer mlId = 0;
                if (material != null) {
                    mlId = material.getMlId() + 1;
                } else {
                    mlId = 1;
                }

                material.setJson(json);
                material.setMlId(mlId);
                materialService.insertMaterial(material);

                mapMsg.put("material", material);
                mapMsg.put("msg", "工程数量 "+mlName+" 基本信息数据录入成功!");
                return new ModelAndView("material/material_insert", "message", mapMsg);
            } else {
                mapMsg.put("material", list.get(0));
                mapMsg.put("msg", "项目名称 "+mlName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("material/material_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "项目名称不能为空，请重新输入!");
        return new ModelAndView("material/material_insert", "message", mapMsg);
    }

    @RequestMapping("insertMaterialBody")
    public @ResponseBody LayuiData insertMaterialBody(Material material) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String mlName = material.getMlName();
        if(mlName != null && mlName.length() > 0) {
            List list = materialService.getMaterialByCondition("ml_name", mlName);

            if (list.size() == 0) {
                Material _material = materialService.getMaterialByMaxId();
                Integer mlId = 0;
                if (_material != null) {
                    mlId = _material.getMlId() + 1;
                } else {
                    mlId = 1;
                }

                material.setMlId(mlId);
                code = materialService.insertMaterial(material);
            }
        }
        return new LayuiData(code, material, 1);
    }

    @RequestMapping("modifyMaterialBody")
    public @ResponseBody LayuiData modifyMaterialBody(Material material) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Material _material = materialService.getMaterialById(material.getMlId());
        return new LayuiData(materialService.setMaterialById(material), _material, 1);
    }

    @RequestMapping("deleteMaterialBody")
    public @ResponseBody LayuiData deleteMaterialBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(materialService.delMaterialById(id),null,0);
    }

    @RequestMapping("searchMaterial")
    public ModelAndView searchMaterial(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        map.put("lstPartItem", partItemService.getAllPartItem());
        map.put("lstCostLayer", costLayerService.getAllCostLayer());

        if(field != null) {
            List listMaterial = materialService.getMaterialByCondition(field, value);
            if(value.equals("*")) {
                listMaterial = materialService.getAllMaterial();
            }

            if (listMaterial.size() == 0) {
                map.put("MaterialList", listMaterial);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("MaterialList", listMaterial);
                map.put("msg", "系统提示：已经找到满足条件的 "+listMaterial.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("material/material_search", "message", map);
    }

    @RequestMapping("searchMaterialBody")
    public @ResponseBody LayuiData searchMaterialBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = materialService.queryMaterialByCondition(field, value, page, limit);
        long count = materialService.countMaterialByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountMaterial")
    public ModelAndView mountMaterial(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listMaterial = materialService.getMaterialByCondition(field, value);
            if(value.equals("*")) {
                listMaterial = materialService.getAllMaterial();
            }

            if (listMaterial.size() == 0) {
                map.put("MaterialList", listMaterial);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("MaterialList", listMaterial);
                map.put("msg", "系统提示：已经找到满足条件的 "+listMaterial.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("material/material_mount", "message", map);
    }

    @RequestMapping("mountMaterialBody")
    public @ResponseBody LayuiData mountMaterialBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = materialService.getMaterialByCondition(field, value, page, limit);
        long count = materialService.countMaterialBySelectCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCostLayerBody")
    public @ResponseBody LayuiData mountCostLayerBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Material> listMaterial = materialService.getMaterialByCondition(field, value, page, limit);
        long count = materialService.countMaterialBySelectCondition(field, value);

        List list = new ArrayList();
        for(Material x: listMaterial) {
            if(x.getCostLayer() != null) {
                list.add(x.getCostLayer());
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("uploadMaterial")
    public ModelAndView uploadMaterial(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("material/material_upload", "message",null);
    }

    @RequestMapping("downloadMaterial")
    public ModelAndView downloadMaterial(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("material/material_download", "message",null);
    }

    @RequestMapping("restoreMaterial")
    public ModelAndView restoreMaterial(HttpServletRequest request, HttpServletResponse response) {
        long count = materialService.countMaterialByQueryCondition("pi_id", null);
        return new ModelAndView("material/material_restore", "count",count);
    }

    @RequestMapping("restoreMaterialBody")
    public @ResponseBody LayuiData restoreaterialBody(Integer id, String type, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<CostLayer> list = materialService.getCostLayerByClId(id, page, limit);
        long count = materialService.countCostLayerBySelectClId(id);

        for(CostLayer x:list) {
            costLayerService.setCostLayerById(x);
        }
        return new LayuiData(0, list, count);
    }
}
