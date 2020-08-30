package com.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.dateutil.DateConverter;
import com.dateutil.RegexUtil;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 
 * 
 */
public class NetPlan implements Serializable {
    /**
     * 工作ID
     */
    private Integer npId;

    /**
     * 分项ID
     */
    private Integer piId;

    /**
     * 分项名称
     */
    private String piName;

    /**
     * 分部分项
     */
    private PartItem partItem;

    /**
     * 队伍ID
     */
    private Integer cyId;

    /**
     * 队伍名称
     */
    private String cyName;

    /**
     * 队伍信息
     */
    private Company company;

    /**
     * 工作内容
     */
    private String npWork;

    /**
     * 最早开始
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date npEs;

    /**
     * 最早完成
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date npEf;

    /**
     * 最迟开始
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date npLs;

    /**
     * 最迟完成
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date npLf;

    /**
     * 实际开始
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date npRs;

    /**
     * 实际完成
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date npRf;

    /**
     * 紧前工作
     */
    private String npTf;

    /**
     * 紧后工作
     */
    private String npTb;

    /**
     * 计划备注
     */
    private String npInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public NetPlan() {
    }

    /**
     * 部分构造方法
     */
    public NetPlan(Integer npId, Company company) {
        this.npId = npId;
        this.company = company;
        this.cyId = company.getCyId();
        this.cyName = company.getCyName();
    }

    public NetPlan(Integer npId, PartItem partItem) {
        this.npId = npId;
        this.partItem = partItem;
        this.piId = partItem.getPiId();
        this.piName = partItem.getPiName();
    }

    /**
     * 完整构造方法
     */
    public NetPlan(Integer npId, Integer piId, String piName, Integer cyId, String cyName, String npWork, Date npEs,
                   Date npEf, Date npLs, Date npLf, Date npRs, Date npRf, String npTf, String npTb, String npInfo) {
        this.npId = npId;
        this.piId = piId;
        this.piName = piName;
        this.cyId = cyId;
        this.cyName = cyName;
        this.npWork = npWork;
        this.npEs = npEs;
        this.npEf = npEf;
        this.npLs = npLs;
        this.npLf = npLf;
        this.npRs = npRs;
        this.npRf = npRf;
        this.npTf = npTf;
        this.npTb = npTb;
        this.npInfo = npInfo;
    }

//    @JsonCreator
//    public NetPlan(@JsonProperty("npId") Integer npId, @JsonProperty("piId") Integer piId, @JsonProperty("piName") String piName,
//                   @JsonProperty("cyId") Integer cyId, @JsonProperty("cyName") String cyName, @JsonProperty("npWork") String npWork,
//                   @JsonProperty("npEs") Date npEs, @JsonProperty("npEf") Date npEf, @JsonProperty("npLs") Date npLs, @JsonProperty("npLf") Date npLf,
//                   @JsonProperty("npRs") Date npRs, @JsonProperty("npRf") Date npRf, @JsonProperty("npTf") String npTf, @JsonProperty("npTb") String npTb,
//                   @JsonProperty("npInfo") String npInfo) {
//        this.npId = npId;
//        this.piId = piId;
//        this.piName = piName;
//        this.cyId = cyId;
//        this.cyName = cyName;
//        this.npWork = npWork;
//        this.npEs = npEs;
//        this.npEf = npEf;
//        this.npLs = npLs;
//        this.npLf = npLf;
//        this.npRs = npRs;
//        this.npRf = npRf;
//        this.npTf = npTf;
//        this.npTb = npTb;
//        this.npInfo = npInfo;
//    }

    public Integer getNpId() {
        return npId;
    }

    public PartItem getPartItem() {
        return partItem;
    }

    public void setPartItem(PartItem partItem) {
        this.npId = partItem.getPiId();
        this.partItem = partItem;
    }

    public void setNpId(Integer npId) {
        this.npId = npId;
    }

    public Integer getPiId() {
        return piId;
    }

    public void setPiId(Integer piId) {
        this.piId = piId;
    }

    public String getPiName() {
        return piName;
    }

    public void setPiName(String piName) {
        this.piName = piName;
    }

    public Integer getCyId() {
        return cyId;
    }

    public void setCyId(Integer cyId) {
        this.cyId = cyId;
    }

    public String getCyName() {
        return cyName;
    }

    public void setCyName(String cyName) {
        this.cyName = cyName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
        this.cyId = company.getCyId();
        this.cyName = company.getCyName();
    }

    public String getNpWork() {
        return npWork;
    }

    public void setNpWork(String npWork) {
        this.npWork = npWork;
    }

    public Date getNpEs() {
        return npEs;
    }

    public void setNpEs(Date npEs) {
        this.npEs = npEs;
    }

    public Date getNpEf() {
        return npEf;
    }

    public void setNpEf(Date npEf) {
        this.npEf = npEf;
    }

    public Date getNpLs() {
        return npLs;
    }

    public void setNpLs(Date npLs) {
        this.npLs = npLs;
    }

    public Date getNpLf() {
        return npLf;
    }

    public void setNpLf(Date npLf) {
        this.npLf = npLf;
    }

    public Date getNpRs() {
        return npRs;
    }

    public void setNpRs(Date npRs) {
        this.npRs = npRs;
    }

    public Date getNpRf() {
        return npRf;
    }

    public void setNpRf(Date npRf) {
        this.npRf = npRf;
    }

    public String getNpTf() {
        return npTf;
    }

    public void setNpTf(String npTf) {
        this.npTf = npTf;
    }

    public String getNpTb() {
        return npTb;
    }

    public void setNpTb(String npTb) {
        this.npTb = npTb;
    }

    public String getNpInfo() {
        return npInfo;
    }

    public void setNpInfo(String npInfo) {
        this.npInfo = npInfo;
    }

    public Integer getTfSize() {
        JSONArray jsons = JSON.parseObject(npTf, JSONArray.class);
        if(jsons != null) {
            return jsons.size();
        }

        return 0;
    }

    public Object getTfValue(Integer index, String key) {
        JSONArray jsons = JSON.parseObject(npTf, JSONArray.class);
        if(jsons != null) {
            JSONObject json = (JSONObject)jsons.get(index);
            if(json != null) {
                return json.get(key);
            }
        }

        return null;
    }

    public Integer getTbSize() {
        JSONArray jsons = JSON.parseObject(npTb, JSONArray.class);
        if(jsons != null) {
            return jsons.size();
        }

        return 0;
    }

    public Object getTbValue(Integer index, String key) {
        JSONArray jsons = JSON.parseObject(npTb, JSONArray.class);
        if(jsons != null) {
            JSONObject json = (JSONObject)jsons.get(index);
            if(json != null) {
                return json.get(key);
            }
        }

        return null;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("npId")) {
            if(RegexUtil.isNumber(_value)) {
                npId = Integer.parseInt(_value);
            }
        }
        if (field.equals("piId")) {
            if(RegexUtil.isNumber(_value)) {
                piId = Integer.parseInt(_value);
            }
        }
        if (field.equals("piName")) {
            piName = _value;
        }
        if (field.equals("partItem")) {
            partItem = (PartItem) value;
        }
        if (field.equals("cyId")) {
            if(RegexUtil.isNumber(_value)) {
                cyId = Integer.parseInt(_value);
            }
        }
        if (field.equals("cyName")) {
            cyName = _value;
        }
        if (field.equals("company")) {
            company = (Company) value;
        }
        if (field.equals("npWork")) {
            npWork = _value;
        }
        if (field.equals("npEs")) {
            npEs = DateConverter.strToDate(_value);
        }
        if (field.equals("npEf")) {
            npEf = DateConverter.strToDate(_value);
        }
        if (field.equals("npLs")) {
            npLs = DateConverter.strToDate(_value);
        }
        if (field.equals("npLf")) {
            npLf = DateConverter.strToDate(_value);
        }
        if (field.equals("npRs")) {
            npRs = DateConverter.strToDate(_value);
        }
        if (field.equals("npRf")) {
            npRf = DateConverter.strToDate(_value);
        }
        if (field.equals("npTf")) {
            npTf = _value;
        }
        if (field.equals("npTb")) {
            npTb = _value;
        }
        if (field.equals("npInfo")) {
            npInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("npId")) {
            String value = map.get("npId").toString();
            if(RegexUtil.isNumber(value)) {
                npId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("piId")) {
            String value = map.get("piId").toString();
            if(RegexUtil.isNumber(value)) {
                piId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("piName")) {
            piName = map.get("piName").toString();
        }
        if (map.containsKey("partItem")) {
            partItem = (PartItem) map.get("partItem");
        }
        if (map.containsKey("cyId")) {
            String value = map.get("cyId").toString();
            if(RegexUtil.isNumber(value)) {
                cyId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("cyName")) {
            cyName = map.get("cyName").toString();
        }
        if (map.containsKey("company")) {
            company = (Company) map.get("company");
        }
        if (map.containsKey("npWork")) {
            npWork = map.get("npWork").toString();
        }
        if (map.containsKey("npEs")) {
            npEs = DateConverter.strToDate(map.get("npEs").toString());
        }
        if (map.containsKey("npEf")) {
            npEf = DateConverter.strToDate(map.get("npEf").toString());
        }
        if (map.containsKey("npLs")) {
            npLs = DateConverter.strToDate(map.get("npLs").toString());
        }
        if (map.containsKey("npLf")) {
            npLf = DateConverter.strToDate(map.get("npLf").toString());
        }
        if (map.containsKey("npRs")) {
            npRs = DateConverter.strToDate(map.get("npRs").toString());
        }
        if (map.containsKey("npRf")) {
            npRf = DateConverter.strToDate(map.get("npRf").toString());
        }
        if (map.containsKey("npTf")) {
            npTf = map.get("npTf").toString();
        }
        if (map.containsKey("npTb")) {
            npTb = map.get("npTb").toString();
        }
        if (map.containsKey("npInfo")) {
            npInfo = map.get("npInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("npId")) {
            if(RegexUtil.isNumber(json.getString("npId"))) {
                npId = json.getInteger("npId");
            }
        }
        if (json.containsKey("piId")) {
            if(RegexUtil.isNumber(json.getString("piId"))) {
                cyId = json.getInteger("piId");
            }
        }
        if (json.containsKey("piName")) {
            piName = json.getString("piName");
        }
        if (json.containsKey("partItem")) {
            partItem = json.getObject("partItem",PartItem.class);
        }
        if (json.containsKey("cyId")) {
            if(RegexUtil.isNumber(json.getString("cyId"))) {
                cyId = json.getInteger("cyId");
            }
        }
        if (json.containsKey("cyName")) {
            cyName = json.getString("cyName");
        }
        if (json.containsKey("company")) {
            company = json.getObject("company",Company.class);
        }
        if (json.containsKey("npWork")) {
            npWork = json.getString("npWork");
        }
        if (json.containsKey("npEs")) {
            npEs = DateConverter.strToDate(json.getString("npEs"));
        }
        if (json.containsKey("npEf")) {
            npEf = DateConverter.strToDate(json.getString("npEf"));
        }
        if (json.containsKey("npLs")) {
            npLs = DateConverter.strToDate(json.getString("npLs"));
        }
        if (json.containsKey("npLf")) {
            npLf = DateConverter.strToDate(json.getString("npLf"));
        }
        if (json.containsKey("npRs")) {
            npRs = DateConverter.strToDate(json.getString("npRs"));
        }
        if (json.containsKey("npRf")) {
            npRf = DateConverter.strToDate(json.getString("npRf"));
        }
        if (json.containsKey("npTf")) {
            npTf = json.getString("npTf");
        }
        if (json.containsKey("npTb")) {
            npTb = json.getString("npTb");
        }
        if (json.containsKey("npInfo")) {
            npInfo = json.getString("npInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap();
        if(npId == null) {
            npId = -1;
        }
        map.put("npId", npId);
        if(piId == null) {
            piId = -1;
        }
        map.put("piId", piId);
        map.put("piName", piName);
        map.put("partItem", partItem);
        if(partItem != null) {
            map.put("piId", partItem.getPiId());
            map.put("piPid", partItem.getPiPid());
            map.put("piLevel", partItem.getPiLevel());
            map.put("piName", partItem.getPiName());
            map.put("piFold", partItem.getPiFold());
        } else {
            map.put("piPid", 0);
            map.put("piFold", true);
        }
        if(cyId == null) {
            cyId = -1;
        }
        map.put("cyId", cyId);
        map.put("cyName", cyName);
        map.put("company", company);
        map.put("npWork", npWork);
        if(npEs == null) {
            npEs = DateConverter.cutDate();
        }
        map.put("npEs", DateConverter.dateToStr(npEs));
        if(npEf == null) {
            npEf = DateConverter.cutDate();
        }
        map.put("npEf", DateConverter.dateToStr(npEf));
        if(npLs == null) {
            npLs = DateConverter.cutDate();
        }
        map.put("npLs", DateConverter.dateToStr(npLs));
        if(npLf == null) {
            npLf = DateConverter.cutDate();
        }
        map.put("npLf", DateConverter.dateToStr(npLf));
        if(npRs == null) {
            npRs = DateConverter.cutDate();
        }
        map.put("npRs", DateConverter.dateToStr(npRs));
        if(npRf == null) {
            npRf = DateConverter.cutDate();
        }
        map.put("npRf", DateConverter.dateToStr(npRf));
        map.put("npTf", npTf);
        map.put("npTb", npTb);
        map.put("npInfo", npInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(npId == null) {
            npId = -1;
        }
        json.put("npId", npId);
        if(piId == null) {
            piId = -1;
        }
        json.put("piId", piId);
        json.put("piName", piName);
        json.put("partItem", partItem);
        if(cyId == null) {
            cyId = -1;
        }
        json.put("cyId", cyId);
        json.put("cyName", cyName);
        json.put("company", company);
        json.put("npWork", npWork);
        if(npEs == null) {
            npEs = DateConverter.cutDate();
        }
        json.put("npEs", DateConverter.dateToStr(npEs));
        if(npEf == null) {
            npEf = DateConverter.cutDate();
        }
        json.put("npEf", DateConverter.dateToStr(npEf));
        if(npLs == null) {
            npLs = DateConverter.cutDate();
        }
        json.put("npLs", DateConverter.dateToStr(npLs));
        if(npLf == null) {
            npLf = DateConverter.cutDate();
        }
        json.put("npLf", DateConverter.dateToStr(npLf));
        if(npRs == null) {
            npRs = DateConverter.cutDate();
        }
        json.put("npRs", DateConverter.dateToStr(npRs));
        if(npRf == null) {
            npRf = DateConverter.cutDate();
        }
        json.put("npRf", DateConverter.dateToStr(npRf));
        json.put("npTf", npTf);
        json.put("npTb", npTb);
        json.put("npInfo", npInfo);

        return json;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        NetPlan other = (NetPlan) that;
        return (this.getNpId() == null ? other.getNpId() == null : this.getNpId().equals(other.getNpId()))
                && (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
                && (this.getPiName() == null ? other.getPiName() == null : this.getPiName().equals(other.getPiName()))
                && (this.getPartItem() == null ? other.getPartItem() == null : this.getPartItem().equals(other.getPartItem()))
                && (this.getCyId() == null ? other.getCyId() == null : this.getCyId().equals(other.getCyId()))
                && (this.getCyName() == null ? other.getCyName() == null : this.getCyName().equals(other.getCyName()))
                && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
                && (this.getNpWork() == null ? other.getNpWork() == null : this.getNpWork().equals(other.getNpWork()))
                && (this.getNpEs() == null ? other.getNpEs() == null : this.getNpEs().equals(other.getNpEs()))
                && (this.getNpEf() == null ? other.getNpEf() == null : this.getNpEf().equals(other.getNpEf()))
                && (this.getNpLs() == null ? other.getNpLs() == null : this.getNpLs().equals(other.getNpLs()))
                && (this.getNpLf() == null ? other.getNpLf() == null : this.getNpLf().equals(other.getNpLf()))
                && (this.getNpRs() == null ? other.getNpRs() == null : this.getNpRs().equals(other.getNpRs()))
                && (this.getNpRf() == null ? other.getNpRf() == null : this.getNpRf().equals(other.getNpRf()))
                && (this.getNpTf() == null ? other.getNpTf() == null : this.getNpTf().equals(other.getNpTf()))
                && (this.getNpTb() == null ? other.getNpTb() == null : this.getNpTb().equals(other.getNpTb()))
                && (this.getNpInfo() == null ? other.getNpInfo() == null : this.getNpInfo().equals(other.getNpInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNpId() == null) ? 0 : getNpId().hashCode());
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiName() == null) ? 0 : getPiName().hashCode());
        result = prime * result + ((getPartItem() == null) ? 0 : getPartItem().hashCode());
        result = prime * result + ((getCyId() == null) ? 0 : getCyId().hashCode());
        result = prime * result + ((getCyName() == null) ? 0 : getCyName().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getNpWork() == null) ? 0 : getNpWork().hashCode());
        result = prime * result + ((getNpEs() == null) ? 0 : getNpEs().hashCode());
        result = prime * result + ((getNpEf() == null) ? 0 : getNpEf().hashCode());
        result = prime * result + ((getNpLs() == null) ? 0 : getNpLs().hashCode());
        result = prime * result + ((getNpLf() == null) ? 0 : getNpLf().hashCode());
        result = prime * result + ((getNpRs() == null) ? 0 : getNpRs().hashCode());
        result = prime * result + ((getNpRf() == null) ? 0 : getNpRf().hashCode());
        result = prime * result + ((getNpTf() == null) ? 0 : getNpTf().hashCode());
        result = prime * result + ((getNpTb() == null) ? 0 : getNpTb().hashCode());
        result = prime * result + ((getNpInfo() == null) ? 0 : getNpInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("containsKeyh = ").append(hashCode());
        sb.append(", npId=").append(npId);
        sb.append(", piId=").append(piId);
        sb.append(", piName=").append(piName);
        sb.append(", partItem=").append(partItem);
        sb.append(", cyId=").append(cyId);
        sb.append(", cyName=").append(cyName);
        sb.append(", company=").append(company);
        sb.append(", npWork=").append(npWork);
        sb.append(", npEs=").append(npEs);
        sb.append(", npEf=").append(npEf);
        sb.append(", npLs=").append(npLs);
        sb.append(", npLf=").append(npLf);
        sb.append(", npRs=").append(npRs);
        sb.append(", npRf=").append(npRf);
        sb.append(", npTf=").append(npTf);
        sb.append(", npTb=").append(npTb);
        sb.append(", npInfo=").append(npInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}