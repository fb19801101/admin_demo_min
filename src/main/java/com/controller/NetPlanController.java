package com.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.daoutil.MyDaoUtil;
import com.dateutil.DateConverter;
import com.dateutil.EncodeUtil;
import com.dateutil.JsonUtil;
import com.exceltest.entity.DynamicPlan;
import com.exceltest.options.TypeOptions;
import com.model.LayuiData;
import com.model.NetPlan;
import com.model.PartItem;
import com.service.CompanyService;
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
import java.util.*;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-04-01 15:50
 */
@Controller
@RequestMapping("netplan")
public class NetPlanController {
    @Autowired
    private NetPlanService netPlanService;

    @Autowired
    private PartItemService partItemService;

    @Autowired
    private CompanyService companyService;

    @RequestMapping("toNetPlan")
    public ModelAndView toNetPlan(HttpServletRequest request, HttpServletResponse response) {
        List list = netPlanService.getAllNetPlan();
        JSONObject json = new JSONObject();
        JSONObject _json = new JSONObject();
        _json.put("code", "200");
        _json.put("message", "操作成功");
        json.put("status", _json);
        JSONArray jsons = new JSONArray();
        for(int i=0; i<list.size(); i++) {
            NetPlan np = (NetPlan)list.get(i);
            JSONObject json1 = np.toJson();
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
        mapMsg.put("count", netPlanService.countNetPlanByQueryCondition("pi_id", null));

        return new ModelAndView("netplan/netplan", "message", mapMsg);
    }

    @RequestMapping("toNetPlanBody")
    public @ResponseBody LayuiData toNetPlanBody(Integer id, Integer level, Integer page, Integer limit) {
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

    @RequestMapping("netPlanIframe")
    public ModelAndView netPlanIframe(HttpServletRequest request, HttpServletResponse response) {
        List<NetPlan> list = netPlanService.getAllNetPlan();
        HashMap mapMsg = new HashMap();
        mapMsg.put("lstNetPlan", list);
        return new ModelAndView("netplan/netplan_iframe", "message", mapMsg);
    }

    @RequestMapping("insertNetPlan")
    public ModelAndView insertNetPlan(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String npWork = request.getParameter("npWork");
        JSONObject json = JsonUtil.readRequestParameters(request);

        HashMap mapMsg = new HashMap();
        mapMsg.put("lstPartItem", partItemService.getAllPartItem());
        mapMsg.put("lstCompany", companyService.getAllCompany());

        if(npWork != null && npWork.length() > 0) {
            List list = netPlanService.getNetPlanByCondition("np_work", npWork);

            if (list.size() == 0) {
                NetPlan netPlan = netPlanService.getNetPlanByMaxId();
                Integer npId = 0;
                if (netPlan != null) {
                    npId = netPlan.getNpId() + 1;
                } else {
                    npId = 1;
                }

                netPlan.setJson(json);
                netPlan.setNpId(npId);
                netPlanService.insertNetPlan(netPlan);

                mapMsg.put("netplan", netPlan);
                mapMsg.put("msg", "分部分项 "+npWork+" 基本信息数据录入成功!");
                return new ModelAndView("netplan/netplan_insert", "message", mapMsg);
            } else {
                mapMsg.put("netplan", list.get(0));
                mapMsg.put("msg", "分项名称 "+npWork+" 基本信息数据已经录入，请重新输入!");
                return new ModelAndView("netplan/netplan_insert", "message", mapMsg);
            }
        }

        mapMsg.put("msg", "分项名称不能为空，请重新输入!");
        return new ModelAndView("netplan/netplan_insert", "message", mapMsg);
    }

    @RequestMapping("insertNetPlanBody")
    public @ResponseBody LayuiData insertNetPlanBody(NetPlan netPlan) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        int code = 0;
        String npWork = netPlan.getNpWork();
        if(npWork != null && npWork.length() > 0) {
            List list = netPlanService.getNetPlanByCondition("np_work", npWork);

            if (list.size() == 0) {
                NetPlan _netPlan = netPlanService.getNetPlanByMaxId();
                Integer npId = 0;
                if (_netPlan != null) {
                    npId = _netPlan.getNpId() + 1;
                } else {
                    npId = 1;
                }

                netPlan.setNpId(npId);
                code = netPlanService.insertNetPlan(netPlan);
            }
        }
        return new LayuiData(code, netPlan, 1);
    }

    @RequestMapping("modifyNetPlanBody")
    public @ResponseBody LayuiData modifyNetPlanBody(NetPlan netPlan) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        NetPlan _netPlan = netPlanService.getNetPlanById(netPlan.getNpId());
        return new LayuiData(netPlanService.setNetPlanById(netPlan), _netPlan, 1);
    }

    @RequestMapping("deleteNetPlanBody")
    public @ResponseBody LayuiData deleteNetPlanBody(Integer id) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        return new LayuiData(netPlanService.delNetPlanById(id),null,0);
    }

    @RequestMapping("searchNetPlan")
    public ModelAndView searchNetPlan(HttpServletRequest request, HttpServletResponse response) {
        EncodeUtil.setEncoderUTF(request, response);
        String field = request.getParameter("conditionField");
        String value = request.getParameter("conditionValue");

        Map map = new HashMap();
        map.put("lstPartItem", partItemService.getAllPartItem());
        map.put("lstCompany", companyService.getAllCompany());

        if(field != null) {
            List listNetPlan = netPlanService.getNetPlanByCondition(field, value);
            if(value.equals("*")) {
                listNetPlan = netPlanService.getAllNetPlan();
            }

            if (listNetPlan.size() == 0) {
                map.put("NetPlanList", listNetPlan);
                map.put("msg", "系统提示：没有找到满足条件的数据! Field= " + field + ", Value= " + value);
            } else {
                map.put("NetPlanList", listNetPlan);
                map.put("msg", "系统提示：已经找到满足条件的 "+listNetPlan.size()+" 数据! Field= " + field + ", Value= " + value);
            }
        }

        return new ModelAndView("netplan/netplan_search", "message", map);
    }

    @RequestMapping("searchNetPlanBody")
    public @ResponseBody LayuiData searchNetPlanBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = netPlanService.queryNetPlanByCondition(field, value, page, limit);
        long count = netPlanService.countNetPlanByQueryCondition(field, value);
        return new LayuiData(0, list, count);
    }

    @RequestMapping("mountNetPlan")
    public ModelAndView mountNetPlan(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("netplan/netplan_mount", "message",null);
    }

    @RequestMapping("mountNetPlanBody")
    public @ResponseBody LayuiData mountNetPlanBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List list = netPlanService.getNetPlanByCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value, page, limit);
        long count = netPlanService.countNetPlanBySelectCondition(field.isEmpty()?"pi_id":field, value.isEmpty()?"-1":value);
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

    @RequestMapping("warnNetPlan")
    public ModelAndView warnNetPlan(HttpServletRequest request, HttpServletResponse response) {
        long count = netPlanService.countNetPlanByQueryCondition("pi_id", null);

        return new ModelAndView("netplan/netplan_warn", "count", count);
    }

    @RequestMapping("warnNetPlanBody")
    public @ResponseBody LayuiData warnNetPlanBody(Integer id, Integer level) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<NetPlan> listNetPlan = netPlanService.queryNetPlanByPiId(id);
        long count = listNetPlan.size();

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

    @RequestMapping("chartNetPlan")
    public ModelAndView chartNetPlan(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("netplan/netplan_chart", "message",null);
    }

    @RequestMapping("chartNetPlanBody")
    public @ResponseBody Map chartNetPlanBody(Integer page, Integer limit, Integer level) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        List<NetPlan> list = netPlanService.getAllNetPlan(page,limit);

        List<Map> lstMap = new ArrayList<>();
        for(NetPlan x:list) {
            Map map = new HashMap();
            map.put("id",x.getPiId());
            map.put("name",x.getNpWork());
            map.put("progress",0);
            map.put("progressByWorklog",false);
            map.put("relevance",0);
            map.put("type","");
            map.put("typeId","");
            map.put("description","");
            map.put("code","");
            map.put("level",0);
            map.put("status","STATUS_ACTIVE");
            map.put("canWrite",true);
            map.put("start",x.getNpEs());
            map.put("duration",((x.getNpEf().getTime()-x.getNpEs().getTime())/(1000*60*60*24)));
            map.put("end",x.getNpEf());
            map.put("startIsMilestone",false);
            map.put("endIsMilestone",false);
            map.put("collapsed",false);
            map.put("assigs",new ArrayList<>());
            Integer size = x.getTfSize();
            String depends = "";
            for(int i=0; i<size; i++) {
                Object id = x.getTfValue(i,"id");
                String sid = id.toString().equals("-1") ? "":id.toString();
                if(i < size-1) {
                    depends = depends + sid + ":";
                } else {
                    depends = depends + sid;
                }
            }
            map.put("depends",depends);
            map.put("hasChild",false);

            PartItem pi = x.getPartItem();
            if(pi != null) {
                map.put("level",pi.getPiLevel()-1);
                if(pi.getPiLevel() < level) {
                    map.put("hasChild",true);
                    map.put("startIsMilestone",false);
                } else {
                    map.put("status","STATUS_SUSPENDED");
                }
            }
            lstMap.add(map);
        }

        Map map = new HashMap();
        map.put("tasks", lstMap);
        map.put("selectedRow", 2);
        map.put("deletedTaskIds", new ArrayList<>());

        List<Map> _list = new ArrayList();
        for(Integer i=1; i<=4; i++) {
            Map _map = new HashMap();
            _map.put("id", "tmp_"+i.toString());
            _map.put("name", "Resource "+i.toString());
            _list.add(_map);
        }
        map.put("resources", _list);
        _list.get(0).put("name","Project Manager");
        _list.get(1).put("name","Worker");
        _list.get(2).put("name","Stakeholder");
        _list.get(3).put("name","Customer");
        map.put("roles", _list);
        map.put("canWrite", true);
        map.put("canDelete", true);
        map.put("canWriteOnParent", true);
        map.put("canAdd", true);

        return map;
    }

    @RequestMapping("timelineNetPlan")
    public String timelineNetPlan() {
        return "netplan/netplan_timeline";
    }

    @RequestMapping("timelineNetPlanBody")
    public @ResponseBody JSONArray timelineNetPlanBody() {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        JSONArray jsons = new JSONArray();
        JSONObject json = new JSONObject();
        json.put("id",0);
        json.put("axis",1);
        json.put("date", DateConverter.strToDate("2020-7-2"));
        json.put("title","2020年7月2日");
        JSONArray jsons1 = new JSONArray();
        jsons1.add("小横溪双线大桥正式开工了，现场1个土方队进行场地平整，现场配置2台360旋挖钻进行桩基施工。");
        jsons1.add("<br>桩基施工准备条件今天务必全部具备！");
        json.put("contents",jsons1);
        JSONArray jsons2 = new JSONArray();
        json.put("items",jsons2);
        json.put("block","");
        json.put("submit",false);
        JSONArray jsons3 = new JSONArray();
        jsons3.add("#id0");
        jsons3.add("name");
        jsons3.add("menu");
        jsons3.add("quantity");
        jsons3.add("info");
        json.put("tag",jsons3);
        jsons.add(json);

        json.put("id",1);
        json.put("axis",0);
        json.put("date", DateConverter.strToDate("2020-7-3"));
        json.put("title","2020年7月3日");
        jsons1.clear();
        jsons1.add("正式开工第二天<em>桩基施工</em>，2020-7-3 8:00 该桥0#台0#-1桩开始施工");
        json.put("contents",jsons1);
        jsons2.clear();
        jsons2.add("1、泥浆池就绪");
        jsons2.add("2、钢护筒到位");
        jsons2.add("3、桩位放样完毕");
        json.put("items",jsons2);
        json.put("block","");
        json.put("submit",false);
        jsons3.clear();
        jsons3.add("#id1");
        jsons3.add("name");
        jsons3.add("menu");
        jsons3.add("quantity");
        jsons3.add("info");
        json.put("tag",jsons3);
        jsons.add(json);

        json.put("id",2);
        json.put("axis",-1);
        json.put("date", DateConverter.strToDate("2020-7-4"));
        json.put("title","2020年7月4日");
        jsons1.clear();
        jsons1.add("旋挖钻经过1天的试桩磨合，验证了该桥地质参数和桩机选型，并在试桩过程确定了不同地质钻进参数");
        json.put("contents",jsons1);
        jsons2.clear();
        json.put("items",jsons2);
        json.put("block","粉土、砂岩、泥岩钻进参数：20m桩基岩层比例60%，整体进度4h。");
        json.put("submit",false);
        jsons3.clear();
        jsons3.add("#id2");
        jsons3.add("name");
        jsons3.add("menu");
        jsons3.add("quantity");
        jsons3.add("info");
        json.put("tag",jsons3);
        jsons.add(json);

        json.put("id",3);
        json.put("axis",-1);
        json.put("date", DateConverter.strToDate("2020-7-5"));
        json.put("title","2020年7月5日");
        jsons1.clear();
        jsons1.add("桩基施工各工序功效参数，待续......");
        json.put("contents",jsons1);
        jsons2.clear();
        json.put("items",jsons2);
        json.put("block","");
        json.put("submit",true);
        jsons3.clear();
        jsons3.add("#id3");
        jsons3.add("name");
        jsons3.add("menu");
        jsons3.add("quantity");
        jsons3.add("info");
        json.put("tag",jsons3);
        jsons.add(json);

        json.put("id",4);
        json.put("axis",-1);
        json.put("date", DateConverter.strToDate("2020-7-6"));
        json.put("title","2020年7月6日");
        jsons1.clear();
        jsons1.add("正式开工第二天<em>桩基施工</em>，2020-7-3 8:00 该桥0#台0#-1桩开始施工");
        jsons1.add("<br>承台施工准备条件今天务必全部具备！");
        jsons1.add("承台施工准备条件已经全部具备，可以进行基坑开挖！");
        json.put("contents",jsons1);
        jsons2.clear();
        jsons2.add("1、测量放样");
        jsons2.add("2、周边维护");
        jsons2.add("3、基坑开挖");
        jsons2.add("4、垫层施工");
        jsons2.add("5、桩基检测");
        jsons2.add("6、钢筋绑扎");
        jsons2.add("7、支立模板");
        jsons2.add("8、浇筑混凝土");
        json.put("items",jsons2);
        json.put("block","承台施工参数：循环周期4天，不含检桩时间。");
        json.put("submit",true);
        jsons3.clear();
        jsons3.add("#id4");
        jsons3.add("name");
        jsons3.add("menu");
        jsons3.add("quantity");
        jsons3.add("info");
        json.put("tag",jsons3);
        jsons.add(json);

        json.put("id",5);
        json.put("axis",-1);
        json.put("date", DateConverter.strToDate("2020-7-7"));
        json.put("title","2020年7月7日");
        jsons1.clear();
        jsons1.add("桥墩施工各工序功效参数，待续......");
        json.put("contents",jsons1);
        jsons2.clear();
        json.put("items",jsons2);
        json.put("block","");
        json.put("submit",false);
        jsons3.clear();
        jsons3.add("#id5");
        jsons3.add("name");
        jsons3.add("menu");
        jsons3.add("quantity");
        jsons3.add("info");
        json.put("tag",jsons3);
        jsons.add(json);

        return jsons;
    }

    @RequestMapping("dynamicNetPlan")
    public ModelAndView dynamicNetPlan(HttpServletRequest request, HttpServletResponse response) {
        HashMap mapMsg = new HashMap();
        mapMsg.put("options", new TypeOptions().get());

        return new ModelAndView("netplan/netplan_dynamic", "message",mapMsg);
    }

    @RequestMapping("dynamicNetPlanBody")
    public @ResponseBody LayuiData dynamicNetPlanBody(String field, String value, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
//        JOptionPane.showMessageDialog(null, field+"\n"+value, "标题", JOptionPane.PLAIN_MESSAGE);

        MyDaoUtil daoUtil = new MyDaoUtil();

        long count = daoUtil.getResultCount("tb_dynamicplan");
        String sql = String.format("call DynamicNetPlan(4,8,4,%d,%d)",page,limit );
        List<Map> list = daoUtil.getResultSetList(sql);
        List<DynamicPlan> planList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            DynamicPlan plan = new DynamicPlan();
            plan.setMap(list.get(i));
            planList.add(plan);
        }
        daoUtil.close();

        LayuiData data = new LayuiData(0, planList, count);
        return data;
    }

    @RequestMapping("timeConvertBody")
    public @ResponseBody LayuiData timeConvertBody(Integer index, String date, String data) {
//        JOptionPane.showMessageDialog(null, date, "标题", JOptionPane.PLAIN_MESSAGE);
        JSONObject json = JSON.parseObject(date);
        Date time = DateConverter.jsonToDate(json);
        json = JSON.parseObject(data);
//        DynamicPlan dp = JSON.parseObject(data, DynamicPlan.class);
        DynamicPlan dp = new DynamicPlan();
        dp.setJSON(json);
        dp.updateTime(index-1, time);

        return new LayuiData(0,dp.getItems(),dp.itemsSize());
    }
}
