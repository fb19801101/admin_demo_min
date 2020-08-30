package com.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dateutil.EncodeUtil;
import com.dateutil.JsonUtil;
import com.model.*;
import com.service.EstimationService;
import com.service.ContractService;
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
@RequestMapping("contract")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @Autowired
    private EstimationService estimationService;

    @RequestMapping("toContract")
    public ModelAndView toContract(HttpServletRequest request, HttpServletResponse response) {
        long count = contractService.countContractByQueryCondition("ct_id", null);
        return new ModelAndView("contract/contract", "count",count);
    }

    @RequestMapping("toContractBody")
    public @ResponseBody LayuiData toContractBody(String field, String value, Integer level, Integer page, Integer limit) {
        //        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Contract> list = contractService.queryContractByCondition(field, value, page, limit);
        long count = contractService.countContractByQueryCondition(field, value);

        for(Contract x:list) {
            if(x.getCtLevel() > level) {
                x.setCtFold(false);
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("toContractTree")
    public ModelAndView toContractTree(HttpServletRequest request, HttpServletResponse response) {
        List list = contractService.getAllContract();
        JSONObject json = new JSONObject();
        JSONObject _json = new JSONObject();
        _json.put("code", "200");
        _json.put("message", "操作成功");
        json.put("status", _json);
        JSONArray jsons = new JSONArray();
        for(int i=0; i<list.size(); i++) {
            Contract ct = (Contract)list.get(i);
            JSONObject json1 = ct.toJson();
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
        return new ModelAndView("contract/contract_tree", "message", mapMsg);
    }

    @RequestMapping("toContractTreeBody")
    public @ResponseBody LayuiData toContractTreeBody(String field, String value, Integer level) {
        //        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Contract> list = contractService.queryContractByCondition(field, value);
        long count = contractService.countContractByQueryCondition(field, value);

        for(Contract x:list) {
            if(x.getCtLevel() > level) {
                x.setCtFold(false);
            }
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("contractIframe")
    public ModelAndView contractIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("contract/contract_iframe", "message",null);
    }

    @RequestMapping("insertContract")
    public ModelAndView insertContract(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String ctName = request.getParameter("ctName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        if(ctName != null && ctName.length() > 0) {
            List list = contractService.getContractByCondition("ct_name", ctName);

            if (list.size() == 0) {
                Contract contract = contractService.getContractByMaxId();
                Integer ctId = 0;
                if (contract != null) {
                    ctId = contract.getCtId() + 1;
                } else {
                    ctId = 1;
                }

                contract.setJson(json);
                contract.setCtId(ctId);
                contractService.insertContract(contract);

                mapMsg.put("contract", contract);
                mapMsg.put("msg", "清单 "+ctName+" 基本信息数据录入成功!");
                return new ModelAndView("contract/contract_insert", "message", mapMsg);
            } else {
                mapMsg.put("contract", list.get(0));
                mapMsg.put("msg", "细目名称 "+ctName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("contract/contract_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "细目名称不能为空，请重新输入!");
        return new ModelAndView("contract/contract_insert", "message", mapMsg);
    }

    @RequestMapping("insertContractBody")
    public @ResponseBody LayuiData insertContractBody(Contract contract) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String ctName = contract.getCtName();
        if(ctName != null && ctName.length() > 0) {
            List list = contractService.getContractByCondition("ct_name", ctName);

            if (list.size() == 0) {
                Contract _contract = contractService.getContractByMaxId();
                Integer ctId = 0;
                if (_contract != null) {
                    ctId = _contract.getCtId() + 1;
                } else {
                    ctId = 1;
                }

                contract.setCtId(ctId);
                code = contractService.insertContract(contract);
            }
        }
        return new LayuiData(code, contract, 1);
    }

    @RequestMapping("modifyContractBody")
    public @ResponseBody LayuiData modifyContractBody(Contract contract) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Contract _contract = contractService.getContractById(contract.getCtId());
        return new LayuiData(contractService.setContractById(contract), _contract, 1);
    }

    @RequestMapping("deleteContractBody")
    public @ResponseBody LayuiData deleteContractBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(contractService.delContractById(id),null,0);
    }

    @RequestMapping("searchContract")
    public ModelAndView searchContract(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        if(field != null) {
            List listContract = contractService.getContractByCondition(field, value);
            if(value.equals("*")) {
                listContract = contractService.getAllContract();
            }

            if (listContract.size() == 0) {
                map.put("ContractList", listContract);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("ContractList", listContract);
                map.put("msg", "系统提示：已经找到满足条件的 "+listContract.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("contract/contract_search", "message", map);
    }

    @RequestMapping("searchContractBody")
    public @ResponseBody LayuiData searchContractBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = contractService.queryContractByCondition(field, value, page, limit);
        long count = contractService.countContractByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountContract")
    public ModelAndView mountContract(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("contract/contract_mount", "message",null);
    }

    @RequestMapping("mountContractBody")
    public @ResponseBody LayuiData mountContractBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = contractService.getContractByCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = contractService.countContractBySelectCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountEstimationBody")
    public @ResponseBody LayuiData mountEstimationBody(Integer ciId, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = contractService.getEstimationByCtId(ciId==null?-1:ciId, page, limit);
        long count = contractService.countEstimationBySelectCtId(ciId==null?-1:ciId);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountGuidanceBody")
    public @ResponseBody LayuiData mountGuidanceBody(Integer ciId, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = contractService.getGuidanceByCtId(ciId==null?-1:ciId, page, limit);
        long count = contractService.countGuidanceBySelectCtId(ciId==null?-1:ciId);
        return new LayuiData(0, list, count);
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
}
