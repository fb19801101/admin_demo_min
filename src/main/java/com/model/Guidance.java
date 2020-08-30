package com.model;

import com.alibaba.fastjson.JSONObject;
import com.dateutil.RegexUtil;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 
 * 
 */
public class Guidance implements Serializable {
    /**
     * 指导价ID
     */
    private Integer gdId;

    /**
     * 指导价编码
     */
    private String gdCode;

    /**
     * 计量标识
     */
    private String gdLabel;

    /**
     * 细目名称
     */
    private String gdName;

    /**
     * 计量单位
     */
    private String gdUnit;

    /**
     * 单位比率
     */
    private Double gdRate;

    /**
     * 含税指导单价
     */
    private Double gdPrice;

    /**
     * 含税项目单价
     */
    private Double gdItem;

    /**
     * 工作内容
     */
    private String gdWork;

    /**
     * 费用组成
     */
    private String gdCost;

    /**
     * 计量规则
     */
    private String gdRole;

    /**
     * 指导价备注
     */
    private String gdInfo;

    private static final long serialVersionUID = 1L;


    /**
     * 默认构造方法
     */
    public Guidance() {
    }

    /**
     * 完整构造方法
     */
    public Guidance(Integer gdId, String gdCode, String gdLabel, String gdName, String gdUnit,
                    double gdRate, double gdPrice, double gdItem, String gdWork,
                    String gdCost, String gdRole, String gdInfo) {
        this.gdId = gdId;
        this.gdCode = gdCode;
        this.gdLabel = gdLabel;
        this.gdName = gdName;
        this.gdUnit = gdUnit;
        this.gdRate = gdRate;
        this.gdPrice = gdPrice;
        this.gdItem = gdItem;
        this.gdWork = gdWork;
        this.gdCost = gdCost;
        this.gdRole = gdRole;
        this.gdInfo = gdInfo;
    }
//    @JsonCreator
//    public Guidance(@JsonProperty("gdId") Integer gdId, @JsonProperty("gdCode") String gdCode,
//                    @JsonProperty("gdLabel") String gdLabel, @JsonProperty("gdName") String gdName,
//                    @JsonProperty("gdUnit") String gdUnit, @JsonProperty("gdRate") double gdRate,
//                    @JsonProperty("gdPrice") double gdPrice, @JsonProperty("gdItem") double gdItem,
//                    @JsonProperty("gdWork") String gdWork, @JsonProperty("gdCost") String gdCost,
//                    @JsonProperty("gdRole") String gdRole, @JsonProperty("gdInfo") String gdInfo) {
//        this.gdId = gdId;
//        this.gdCode = gdCode;
//        this.gdLabel = gdLabel;
//        this.gdName = gdName;
//        this.gdUnit = gdUnit;
//        this.gdRate = gdRate;
//        this.gdPrice = gdPrice;
//        this.gdItem = gdItem;
//        this.gdWork = gdWork;
//        this.gdCost = gdCost;
//        this.gdRole = gdRole;
//        this.gdInfo = gdInfo;
//    }

    public Integer getGdId() {
        return gdId;
    }

    public void setGdId(Integer gdId) {
        this.gdId = gdId;
    }

    public String getGdCode() {
        return gdCode;
    }

    public void setGdCode(String gdCode) {
        this.gdCode = gdCode;
    }

    public String getGdLabel() {
        return gdLabel;
    }

    public void setGdLabel(String gdLabel) {
        this.gdLabel = gdLabel;
    }

    public String getGdName() {
        return gdName;
    }

    public void setGdName(String gdName) {
        this.gdName = gdName;
    }

    public String getGdUnit() {
        return gdUnit;
    }

    public void setGdUnit(String gdUnit) {
        this.gdUnit = gdUnit;
    }

    public Double getGdRate() {
        return gdRate;
    }

    public void setGdRate(Double gdRate) {
        this.gdRate = gdRate;
    }

    public Double getGdPrice() {
        return gdPrice;
    }

    public void setGdPrice(Double gdPrice) {
        this.gdPrice = gdPrice;
    }

    public Double getGdItem() {
        return gdItem;
    }

    public void setGdItem(Double gdItem) {
        this.gdItem = gdItem;
    }

    public String getGdWork() {
        return gdWork;
    }

    public void setGdWork(String gdWork) {
        this.gdWork = gdWork;
    }

    public String getGdCost() {
        return gdCost;
    }

    public void setGdCost(String gdCost) {
        this.gdCost = gdCost;
    }

    public String getGdRole() {
        return gdRole;
    }

    public void setGdRole(String gdRole) {
        this.gdRole = gdRole;
    }

    public String getGdInfo() {
        return gdInfo;
    }

    public void setGdInfo(String gdInfo) {
        this.gdInfo = gdInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("gdId")) {
            if(RegexUtil.isNumber(_value)) {
                gdId = Integer.parseInt(_value);
            }
        }
        if (field.equals("gdCode")) {
            gdCode = _value;
        }
        if (field.equals("gdLabel")) {
            gdLabel = _value;
        }
        if (field.equals("gdName")) {
            gdName = _value;
        }
        if (field.equals("gdUnit")) {
            gdUnit = _value;
        }
        if (field.equals("gdRate")) {
            if(RegexUtil.isNumber(_value)) {
                gdRate = Double.parseDouble(_value);
            }
        }
        if (field.equals("gdPrice")) {
            if(RegexUtil.isNumber(_value)) {
                gdPrice = Double.parseDouble(_value);
            }
        }
        if (field.equals("gdItem")) {
            if(RegexUtil.isNumber(_value)) {
                gdItem = Double.parseDouble(_value);
            }
        }
        if (field.equals("gdWork")) {
            gdWork = _value;
        }
        if (field.equals("gdCost")) {
            gdCost = _value;
        }
        if (field.equals("gdRole")) {
            gdRole = _value;
        }
        if (field.equals("gdInfo")) {
            gdInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("gdId")) {
            String value = map.get("gdId").toString();
            if(RegexUtil.isNumber(value)) {
                gdId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("gdCode")) {
            gdCode = map.get("gdCode").toString();
        }
        if (map.containsKey("gdLabel")) {
            gdLabel = map.get("gdLabel").toString();
        }
        if (map.containsKey("gdName")) {
            gdName = map.get("gdName").toString();
        }
        if (map.containsKey("gdUnit")) {
            gdUnit = map.get("gdUnit").toString();
        }
        if (map.containsKey("gdRate")) {
            String value = map.get("gdRate").toString();
            if(RegexUtil.isNumber(value)) {
                gdRate = Double.parseDouble(value);
            }
        }
        if (map.containsKey("gdPrice")) {
            String value = map.get("gdPrice").toString();
            if(RegexUtil.isNumber(value)) {
                gdPrice = Double.parseDouble(value);
            }
        }
        if (map.containsKey("gdItem")) {
            String value = map.get("gdItem").toString();
            if(RegexUtil.isNumber(value)) {
                gdItem = Double.parseDouble(value);
            }
        }
        if (map.containsKey("gdWork")) {
            gdWork = map.get("gdWork").toString();
        }
        if (map.containsKey("gdCost")) {
            gdCost = map.get("gdCost").toString();
        }
        if (map.containsKey("gdRole")) {
            gdRole = map.get("gdRole").toString();
        }
        if (map.containsKey("gdInfo")) {
            gdInfo = map.get("gdInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("gdId")) {
            if(RegexUtil.isNumber(json.getString("gdId"))) {
                gdId = json.getInteger("gdId");
            }
        }
        if (json.containsKey("gdCode")) {
            gdCode = json.getString("gdCode");
        }
        if (json.containsKey("gdLabel")) {
            gdLabel = json.getString("gdLabel");
        }
        if (json.containsKey("gdName")) {
            gdName = json.getString("gdName");
        }
        if (json.containsKey("gdUnit")) {
            gdUnit = json.getString("gdUnit");
        }
        if (json.containsKey("gdRate")) {
            if(RegexUtil.isNumber(json.getString("gdRate"))) {
                gdRate = json.getDouble("gdRate");
            }
        }
        if (json.containsKey("gdPrice")) {
            if(RegexUtil.isNumber(json.getString("gdPrice"))) {
                gdPrice = json.getDouble("gdPrice");
            }
        }
        if (json.containsKey("gdItem")) {
            if(RegexUtil.isNumber(json.getString("gdItem"))) {
                gdItem = json.getDouble("gdItem");
            }
        }
        if (json.containsKey("gdWork")) {
            gdWork = json.getString("gdWork");
        }
        if (json.containsKey("gdCost")) {
            gdCost = json.getString("gdCost");
        }
        if (json.containsKey("gdRole")) {
            gdRole = json.getString("gdRole");
        }
        if (json.containsKey("gdInfo")) {
            gdInfo = json.getString("gdInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(gdId == null) {
            gdId = -1;
        }
        map.put("gdId", gdId);
        map.put("gdCode", gdCode);
        map.put("gdLabel", gdLabel);
        map.put("gdName", gdName);
        map.put("gdUnit", gdUnit);
        if(gdRate == null) {
            gdRate = -1.0;
        }
        map.put("gdRate", gdRate);
        if(gdPrice == null) {
            gdPrice = -1.0;
        }
        map.put("gdPrice", gdPrice);
        if(gdItem == null) {
            gdItem = -1.0;
        }
        map.put("gdItem", gdItem);
        map.put("gdWork", gdWork);
        map.put("gdCost", gdCost);
        map.put("gdRole", gdRole);
        map.put("gdInfo", gdInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(gdId == null) {
            gdId = -1;
        }
        json.put("gdId", gdId);
        json.put("gdCode", gdCode);
        json.put("gdLabel", gdLabel);
        json.put("gdName", gdName);
        json.put("gdUnit", gdUnit);
        if(gdRate == null) {
            gdRate = -1.0;
        }
        json.put("gdRate", gdRate);
        if(gdPrice == null) {
            gdPrice = -1.0;
        }
        json.put("gdPrice", gdPrice);
        if(gdItem == null) {
            gdItem = -1.0;
        }
        json.put("gdItem", gdItem);
        json.put("gdWork", gdWork);
        json.put("gdCost", gdCost);
        json.put("gdRole", gdRole);
        json.put("gdInfo", gdInfo);

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
        Guidance other = (Guidance) that;
        return (this.getGdId() == null ? other.getGdId() == null : this.getGdId().equals(other.getGdId()))
            && (this.getGdCode() == null ? other.getGdCode() == null : this.getGdCode().equals(other.getGdCode()))
            && (this.getGdLabel() == null ? other.getGdLabel() == null : this.getGdLabel().equals(other.getGdLabel()))
            && (this.getGdName() == null ? other.getGdName() == null : this.getGdName().equals(other.getGdName()))
            && (this.getGdUnit() == null ? other.getGdUnit() == null : this.getGdUnit().equals(other.getGdUnit()))
            && (this.getGdRate() == null ? other.getGdRate() == null : this.getGdRate().equals(other.getGdRate()))
            && (this.getGdPrice() == null ? other.getGdPrice() == null : this.getGdPrice().equals(other.getGdPrice()))
            && (this.getGdItem() == null ? other.getGdItem() == null : this.getGdItem().equals(other.getGdItem()))
            && (this.getGdWork() == null ? other.getGdWork() == null : this.getGdWork().equals(other.getGdWork()))
            && (this.getGdCost() == null ? other.getGdCost() == null : this.getGdCost().equals(other.getGdCost()))
            && (this.getGdRole() == null ? other.getGdRole() == null : this.getGdRole().equals(other.getGdRole()))
            && (this.getGdInfo() == null ? other.getGdInfo() == null : this.getGdInfo().equals(other.getGdInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGdId() == null) ? 0 : getGdId().hashCode());
        result = prime * result + ((getGdCode() == null) ? 0 : getGdCode().hashCode());
        result = prime * result + ((getGdLabel() == null) ? 0 : getGdLabel().hashCode());
        result = prime * result + ((getGdName() == null) ? 0 : getGdName().hashCode());
        result = prime * result + ((getGdUnit() == null) ? 0 : getGdUnit().hashCode());
        result = prime * result + ((getGdRate() == null) ? 0 : getGdRate().hashCode());
        result = prime * result + ((getGdPrice() == null) ? 0 : getGdPrice().hashCode());
        result = prime * result + ((getGdItem() == null) ? 0 : getGdItem().hashCode());
        result = prime * result + ((getGdWork() == null) ? 0 : getGdWork().hashCode());
        result = prime * result + ((getGdCost() == null) ? 0 : getGdCost().hashCode());
        result = prime * result + ((getGdRole() == null) ? 0 : getGdRole().hashCode());
        result = prime * result + ((getGdInfo() == null) ? 0 : getGdInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gdId=").append(gdId);
        sb.append(", gdCode=").append(gdCode);
        sb.append(", gdLabel=").append(gdLabel);
        sb.append(", gdName=").append(gdName);
        sb.append(", gdUnit=").append(gdUnit);
        sb.append(", gdRate=").append(gdRate);
        sb.append(", gdPrice=").append(gdPrice);
        sb.append(", gdItem=").append(gdItem);
        sb.append(", gdWork=").append(gdWork);
        sb.append(", gdCost=").append(gdCost);
        sb.append(", gdRole=").append(gdRole);
        sb.append(", gdInfo=").append(gdInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}