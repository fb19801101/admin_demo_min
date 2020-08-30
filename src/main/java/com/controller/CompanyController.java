package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.dateutil.EncodeUtil;
import com.dateutil.JsonUtil;
import com.model.Company;
import com.model.LayuiData;
import com.model.NetPlan;
import com.model.PartItem;
import com.service.CompanyService;
import com.service.NetPlanService;
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
@RequestMapping("company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @Autowired
    private NetPlanService netPlanService;

    @RequestMapping("toCompany")
    public ModelAndView toCompany(HttpServletRequest request, HttpServletResponse response) {
        long count = netPlanService.countNetPlanByQueryCondition("pi_id",null);
        return new ModelAndView("company/company", "count",count);
    }

    @RequestMapping("toCompanyBody")
    public @ResponseBody LayuiData toCompanyBody(Integer id, Integer level, Integer page, Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<NetPlan> listNetPlan = netPlanService.queryNetPlanByCondition("pi_id", id, page, limit);
        long count = netPlanService.countNetPlanByQueryCondition("pi_id", id);

        List<Map> list = new ArrayList<>();
        for(NetPlan x:listNetPlan) {
            PartItem pi = x.getPartItem();
            if(pi != null && pi.getPiLevel() > level) {
                pi.setPiFold(false);
            }

            list.add(x.toMap());
        }
        return new LayuiData(0, list, count);
    }

    @RequestMapping("companyIframe")
    public ModelAndView companyIframe(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("company/company_iframe", "message",null);
    }

    @RequestMapping("insertCompany")
    public ModelAndView insertCompany(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String cyName = request.getParameter("cyName");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        if(cyName != null && cyName.length() > 0) {
            List list = companyService.getCompanyByCondition("cy_name", cyName);

            if (list.size() == 0) {
                Company company = companyService.getCompanyByMaxId();
                Integer lbId = 0;
                if (company != null) {
                    lbId = company.getCyId() + 1;
                } else {
                    lbId = 1;
                }

                company.setJson(json);
                company.setCyId(lbId);
                companyService.insertCompany(company);

                mapMsg.put("company", company);
                mapMsg.put("msg", "施工队伍 "+cyName+" 基本信息数据录入成功!");
                return new ModelAndView("company/company_insert", "message", mapMsg);
            } else {
                mapMsg.put("company", list.get(0));
                mapMsg.put("msg", "队伍名称 "+cyName+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("company/company_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "施工队伍名称不能为空，请重新输入!");
        return new ModelAndView("company/company_insert", "message", mapMsg);
    }

    @RequestMapping("insertCompanyBody")
    public @ResponseBody LayuiData insertCompanyBody(Company company) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        String cyName = company.getCyName();
        int code = 0;
        if(cyName != null && cyName.length() > 0) {
            List list = companyService.getCompanyByCondition("cy_name", cyName);

            if (list.size() == 0) {
                Company _company = companyService.getCompanyByMaxId();
                Integer lbId = 0;
                if (_company != null) {
                    lbId = _company.getCyId() + 1;
                } else {
                    lbId = 1;
                }

                company.setCyId(lbId);
                code = companyService.insertCompany(company);;
            }
        }
        return new LayuiData(code, company, 1);
    }

    @RequestMapping("modifyCompanyBody")
    public @ResponseBody LayuiData modifyCompanyBody(Company company) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        Company _company = companyService.getCompanyById(company.getCyId());
        return new LayuiData(companyService.setCompanyById(company), _company, 1);
    }

    @RequestMapping("deleteCompanyBody")
    public @ResponseBody LayuiData deleteCompanyBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        //装填回调参数

        return new LayuiData(companyService.delCompanyById(id),null,0);
    }

    @RequestMapping("searchCompany")
    public ModelAndView searchCompany(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map mapMsg = new HashMap();
        if(field != null) {
            List listCompany = companyService.getCompanyByCondition(field, value);
            if(value.equals("*")) {
                listCompany = companyService.getAllCompany();
            }

            if (listCompany.size() == 0) {
                mapMsg.put("CompanyList", listCompany);
                mapMsg.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                mapMsg.put("CompanyList", listCompany);
                mapMsg.put("msg", "系统提示：已经找到满足条件的 "+listCompany.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("company/company_search", "message", mapMsg);
    }

    @RequestMapping("searchCompanyBody")
    public @ResponseBody LayuiData searchCompanyBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = companyService.queryCompanyByCondition(field, value, page, limit);
        long count = companyService.countCompanyByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountCompany")
    public ModelAndView mountCompany(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("company/company_mount", "message",null);
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
}