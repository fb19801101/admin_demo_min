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
@RequestMapping("budget")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private GuidanceService guidanceService;

    @Autowired
    private CostLayerService costLayerService;

    @RequestMapping("toBudget")
    public ModelAndView toBudget(HttpServletRequest request, HttpServletResponse response) {
        long count = budgetService.countBudgetByQueryCondition("ct_id",null);
        return new ModelAndView("budget/budget", "count",count);
    }

    @RequestMapping("toBudgetBody")
    public @ResponseBody LayuiData toBudgetBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Budget> listBudget = budgetService.queryBudgetByCondition("ct_id", id, page, limit);
        long count = budgetService.countBudgetByQueryCondition("ct_id", id);

        List<Map> list = new ArrayList<>();
        for(Budget x:listBudget) {
            Contract ct = x.getContract();
            if(ct != null && ct.getCtLevel() > level) {
                ct.setCtFold(false);
            }

            list.add(x.toMap());
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("budgetIframe")
    public ModelAndView budgetIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("budget/budget_iframe", "message",null);
    }

    @RequestMapping("insertBudget")
    public ModelAndView insertBudget(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String bgName = request.getParameter("bgName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        mapMsg.put("lstContract", contractService.getAllContract());

        if(bgName != null && bgName.length() > 0) {
            List list = budgetService.getBudgetByCondition("bg_name", bgName);

            if (list.size() == 0) {
                Budget budget = budgetService.getBudgetByMaxId();
                Integer bgId = 0;
                if (budget != null) {
                    bgId = budget.getBgId() + 1;
                } else {
                    bgId = 1;
                }

                budget.setJson(json);
                budget.setBgId(bgId);
                budgetService.insertBudget(budget);

                mapMsg.put("budget", budget);
                mapMsg.put("msg", "概算 "+bgName+" 基本信息数据录入成功!");
                return new ModelAndView("budget/budget_insert", "message", mapMsg);
            } else {
                mapMsg.put("budget", list.get(0));
                mapMsg.put("msg", "细目名称 "+bgName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("budget/budget_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "细目名称不能为空，请重新输入!");
        return new ModelAndView("budget/budget_insert", "message", mapMsg);
    }

    @RequestMapping("insertBudgetBody")
    public @ResponseBody LayuiData insertBudgetBody(Budget budget) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        String bgName = budget.getBgName();
        int code = 0;
        if(bgName != null && bgName.length() > 0) {
            List list = budgetService.getBudgetByCondition("bg_name", bgName);

            if (list.size() == 0) {
                Budget _budget = budgetService.getBudgetByMaxId();
                Integer bgId = 0;
                if (_budget != null) {
                    bgId = _budget.getBgId() + 1;
                } else {
                    bgId = 1;
                }

                budget.setBgId(bgId);
                code = budgetService.insertBudget(budget);
            }
        }
        return new LayuiData(code, budget, 1);
    }

    @RequestMapping("modifyBudgetBody")
    public @ResponseBody LayuiData modifyBudgetBody(Budget budget) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Budget _budget = budgetService.getBudgetById(budget.getBgId());
        return new LayuiData(budgetService.setBudgetById(budget), _budget, 1);
    }

    @RequestMapping("deleteBudgetBody")
    public @ResponseBody LayuiData deleteBudgetBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(budgetService.delBudgetById(id),null,0);
    }

    @RequestMapping("searchBudget")
    public ModelAndView searchBudget(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        map.put("lstContract", contractService.getAllContract());

        if(field != null) {
            List listBudget = budgetService.getBudgetByCondition(field, value);
            if(value.equals("*")) {
                listBudget = budgetService.getAllBudget();
            }

            if (listBudget.size() == 0) {
                map.put("BudgetList", listBudget);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("BudgetList", listBudget);
                map.put("msg", "系统提示：已经找到满足条件的 "+listBudget.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("budget/budget_search", "message", map);
    }

    @RequestMapping("searchBudgetBody")
    public @ResponseBody LayuiData searchBudgetBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = budgetService.queryBudgetByCondition(field, value, page, limit);
        long count = budgetService.countBudgetByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountBudget")
    public ModelAndView mountBudget(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("budget/budget_mount", "message",null);
    }

    @RequestMapping("mountBudgetBody")
    public @ResponseBody LayuiData mountBudgetBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = budgetService.getBudgetByCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = budgetService.countBudgetBySelectCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountContractBody")
    public @ResponseBody LayuiData mountContractBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<Budget> listBudget = budgetService.getBudgetByCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = budgetService.countBudgetBySelectCondition(field.isEmpty()?"ct_id":field, value.isEmpty()?"-1":value);

        List list = new ArrayList();
        for(Budget x: listBudget) {
            if(x.getContract() != null) {
                list.add(x.getContract());
            }
        }
        return new LayuiData(0, list, count);
    }
}
