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
public class Contract implements Serializable {
    /**
     * 清单ID
     */
    private Integer ctId;

    /**
     * 根清单ID
     */
    private Integer ctPid;

    /**
     * 清单级别
     */
    private Byte ctLevel;

    /**
     * 清单编码
     */
    private String ctCode;

    /**
     * 细目名称
     */
    private String ctName;

    /**
     * 计价单位
     */
    private String ctUnit;

    /**
     * 工程数量
     */
    private Double ctQty;

    /**
     * 综合单价
     */
    private Double ctPrice;

    /**
     * 清单合价
     */
    private Double ctMoney;

    /**
     * 清单备注
     */
    private String ctInfo;

    /**
     * 树形选择框
     */
    private Byte ctCheck = 0;

    /**
     * 树形类别折叠
     */
    private Boolean ctFold = true;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public Contract() {
    }

    /**
     * 完整构造方法
     */
    public Contract(Integer ctId, Integer ctPid, Byte ctLevel, String ctCode, String ctName,
                    String ctUnit, Double ctQty, Double ctPrice, Double ctMoney, Byte ctCheck, Boolean ctFold, String ctInfo) {
        this.ctId = ctId;
        this.ctPid = ctPid;
        this.ctLevel = ctLevel;
        this.ctCode = ctCode;
        this.ctName = ctName;
        this.ctUnit = ctUnit;
        this.ctQty = ctQty;
        this.ctPrice = ctPrice;
        this.ctMoney = ctMoney;
        this.ctCheck = ctCheck;
        this.ctFold = ctFold;
        this.ctInfo = ctInfo;
    }
//    @JsonCreator
//    public Contract(@JsonProperty("ctId") Integer ctId, @JsonProperty("ctPid") Integer ctPid,
//                    @JsonProperty("ctLevel") Byte ctLevel, @JsonProperty("ctCode") String ctCode,
//                    @JsonProperty("ctName") String ctName, @JsonProperty("ctUnit") String ctUnit,
//                    @JsonProperty("ctQty") Double ctQty, @JsonProperty("ctPrice") Double ctPrice,
//                    @JsonProperty("ctCheck") Byte ctCheck, @JsonProperty("ctFold") Boolean ctFold,
//                    @JsonProperty("ctMoney") Double ctMoney, @JsonProperty("ctInfo") String ctInfo) {
//        this.ctId = ctId;
//        this.ctPid = ctPid;
//        this.ctLevel = ctLevel;
//        this.ctCode = ctCode;
//        this.ctName = ctName;
//        this.ctUnit = ctUnit;
//        this.ctQty = ctQty;
//        this.ctPrice = ctPrice;
//        this.ctMoney = ctMoney;
//        this.ctCheck = ctCheck;
//        this.ctFold = ctFold;
//        this.ctInfo = ctInfo;
//    }

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public Integer getCtPid() {
        return ctPid;
    }

    public void setCtPid(Integer ctPid) {
        this.ctPid = ctPid;
    }

    public Byte getCtLevel() {
        return ctLevel;
    }

    public void setCtLevel(Byte ctLevel) {
        this.ctLevel = ctLevel;
    }

    public String getCtCode() {
        return ctCode;
    }

    public void setCtCode(String ctCode) {
        this.ctCode = ctCode;
    }

    public String getCtName() {
        return ctName;
    }

    public void setCtName(String ctName) {
        this.ctName = ctName;
    }

    public String getCtUnit() {
        return ctUnit;
    }

    public void setCtUnit(String ctUnit) {
        this.ctUnit = ctUnit;
    }

    public Double getCtQty() {
        return ctQty;
    }

    public void setCtQty(Double ctQty) {
        this.ctQty = ctQty;
    }

    public Double getCtPrice() {
        return ctPrice;
    }

    public void setCtPrice(Double ctPrice) {
        this.ctPrice = ctPrice;
    }

    public Double getCtMoney() {
        return ctMoney;
    }

    public void setCtMoney(Double ctMoney) {
        this.ctMoney = ctMoney;
    }

    public Byte getCtCheck() {
        return ctCheck;
    }

    public void setCtCheck(Byte ctCheck) {
        this.ctCheck = ctCheck;
    }

    public Boolean getCtFold() {
        return ctFold;
    }

    public void setCtFold(Boolean ctFold) {
        this.ctFold = ctFold;
    }

    public String getCtInfo() {
        return ctInfo;
    }

    public void setCtInfo(String ctInfo) {
        this.ctInfo = ctInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("ctId")) {
            if(RegexUtil.isNumber(_value)) {
                ctId = Integer.parseInt(_value);
            }
        }
        if (field.equals("ctPid")) {
            if(RegexUtil.isNumber(_value)) {
                ctPid = Integer.parseInt(_value);
            }
        }
        if (field.equals("ctLevel")) {
            if(RegexUtil.isNumber(_value) && _value.compareTo("127") <= 0) {
                ctLevel = Byte.parseByte(_value);
            }
        }
        if (field.equals("ctCode")) {
            ctCode = _value;
        }
        if (field.equals("ctName")) {
            ctName = _value;
        }
        if (field.equals("ctUnit")) {
            ctUnit = _value;
        }
        if (field.equals("ctQty")) {
            if(RegexUtil.isNumber(_value)) {
                ctQty = Double.parseDouble(_value);
            }
        }
        if (field.equals("ctPrice")) {
            if(RegexUtil.isNumber(_value)) {
                ctPrice = Double.parseDouble(_value);
            }
        }
        if (field.equals("ctMoney")) {
            if(RegexUtil.isNumber(_value)) {
                ctMoney = Double.parseDouble(_value);
            }
        }
        if (field.equals("ctCheck")) {
            if(RegexUtil.isNumber(_value) && _value.compareTo("127") <= 0) {
                ctCheck = Byte.parseByte(_value);
            }
        }
        if (field.equals("ctFold")) {
            if(RegexUtil.isNumber(_value)) {
                ctFold = Boolean.parseBoolean(_value);
            }
        }
        if (field.equals("ctInfo")) {
            ctInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("ctId")) {
            String value = map.get("ctId").toString();
            if(RegexUtil.isNumber(value)) {
                ctId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("ctPid")) {
            String value = map.get("ctPid").toString();
            if(RegexUtil.isNumber(value)) {
                ctPid = Integer.parseInt(value);
            }
        }
        if (map.containsKey("ctLevel")) {
            String value = map.get("ctLevel").toString();
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                ctLevel = Byte.parseByte(value);
            }
        }
        if (map.containsKey("ctCode")) {
            ctCode = map.get("ctCode").toString();
        }
        if (map.containsKey("ctName")) {
            ctName = map.get("ctName").toString();
        }
        if (map.containsKey("ctUnit")) {
            ctUnit = map.get("ctUnit").toString();
        }
        if (map.containsKey("ctQty")) {
            String value = map.get("ctQty").toString();
            if(RegexUtil.isNumber(value)) {
                ctQty = Double.parseDouble(value);
            }
        }
        if (map.containsKey("ctPrice")) {
            String value = map.get("ctPrice").toString();
            if(RegexUtil.isNumber(value)) {
                ctPrice = Double.parseDouble(value);
            }
        }
        if (map.containsKey("ctMoney")) {
            String value = map.get("ctMoney").toString();
            if(RegexUtil.isNumber(value)) {
                ctMoney = Double.parseDouble(value);
            }
        }
        if (map.containsKey("ctCheck")) {
            String value = map.get("ctCheck").toString();
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                ctCheck = Byte.parseByte(value);
            }
        }
        if (map.containsKey("ctFold")) {
            String value = map.get("ctFold").toString();
            if(RegexUtil.isNumber(value)) {
                ctFold = Boolean.parseBoolean(value);
            }
        }
        if (map.containsKey("ctInfo")) {
            ctInfo = map.get("ctInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("ctId")) {
            if(RegexUtil.isNumber(json.getString("ctId"))) {
                ctId = json.getInteger("ctId");
            }
        }
        if (json.containsKey("ctPid")) {
            if(RegexUtil.isNumber(json.getString("ctPid"))) {
                ctPid = json.getInteger("ctPid");
            }
        }
        if (json.containsKey("ctLevel")) {
            String value = json.getString("ctLevel");
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                ctLevel = Byte.parseByte(value);
            }
        }
        if (json.containsKey("ctCode")) {
            ctCode = json.getString("ctCode");
        }
        if (json.containsKey("ctName")) {
            ctName = json.getString("ctName");
        }
        if (json.containsKey("ctUnit")) {
            ctUnit = json.getString("ctUnit");
        }
        if (json.containsKey("ctQty")) {
            if(RegexUtil.isNumber(json.getString("ctQty"))) {
                ctQty = json.getDouble("ctQty");
            }
        }
        if (json.containsKey("ctPrice")) {
            if(RegexUtil.isNumber(json.getString("ctPrice"))) {
                ctPrice = json.getDouble("ctPrice");
            }
        }
        if (json.containsKey("ctMoney")) {
            if(RegexUtil.isNumber(json.getString("ctMoney"))) {
                ctMoney = json.getDouble("ctMoney");
            }
        }
        if (json.containsKey("ctCheck")) {
            String value = json.getString("ctCheck");
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                ctCheck = Byte.parseByte(value);
            }
        }
        if (json.containsKey("ctFold")) {
            if(RegexUtil.isNumber(json.getString("ctFold"))) {
                ctFold = json.getBoolean("ctFold");
            }
        }
        if (json.containsKey("ctInfo")) {
            ctInfo = json.getString("ctInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(ctId == null) {
            ctId = -1;
        }
        map.put("ctId", ctId);
        if(ctPid == null) {
            ctPid = -1;
        }
        map.put("ctPid", ctPid);
        if(ctLevel == null) {
            ctLevel = -1;
        }
        map.put("ctLevel", ctLevel);
        map.put("ctCode", ctCode);
        map.put("ctName", ctName);
        map.put("ctUnit", ctUnit);
        if(ctQty == null) {
            ctQty = -1.0;
        }
        map.put("ctQty", ctQty);
        if(ctPrice == null) {
            ctPrice = -1.0;
        }
        map.put("ctPrice", ctPrice);
        if(ctMoney == null) {
            ctMoney = -1.0;
        }
        map.put("ctMoney", ctMoney);
        if(ctCheck == null) {
            ctCheck = 0;
        }
        map.put("ctCheck", ctCheck);
        if(ctFold == null) {
            ctFold = true;
        }
        map.put("ctFold", ctFold);
        map.put("ctInfo", ctInfo);

        //layui-dtree data
        if(ctId == null) {
            ctId = -1;
        }
        map.put("id", ctId);
        if(ctPid == null) {
            ctPid = -1;
        }
        map.put("parentId", ctPid);
        map.put("title", ctName);
        map.put("spread", ctFold);
        map.put("checkArr", ctCheck);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(ctId == null) {
            ctId = -1;
        }
        json.put("ctId", ctId);
        if(ctPid == null) {
            ctPid = -1;
        }
        json.put("ctPid", ctPid);
        if(ctLevel == null) {
            ctLevel = -1;
        }
        json.put("ctLevel", ctLevel);
        json.put("ctCode", ctCode);
        json.put("ctName", ctName);
        json.put("ctUnit", ctUnit);
        if(ctQty == null) {
            ctQty = -1.0;
        }
        json.put("ctQty", ctQty);
        if(ctPrice == null) {
            ctPrice = -1.0;
        }
        json.put("ctPrice", ctPrice);
        if(ctMoney == null) {
            ctMoney = -1.0;
        }
        json.put("ctMoney", ctMoney);
        if(ctCheck == null) {
            ctCheck = 0;
        }
        json.put("ctCheck", ctCheck);
        if(ctFold == null) {
            ctFold = true;
        }
        json.put("ctFold", ctFold);
        json.put("ctInfo", ctInfo);

        //layui-dtree data
        if(ctId == null) {
            ctId = -1;
        }
        json.put("id", ctId);
        if(ctPid == null) {
            ctPid = -1;
        }
        json.put("parentId", ctPid);
        json.put("title", ctName);
        json.put("spread", ctFold);
        json.put("checkArr", ctCheck);

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
        Contract other = (Contract) that;
        return (this.getCtId() == null ? other.getCtId() == null : this.getCtId().equals(other.getCtId()))
                && (this.getCtPid() == null ? other.getCtPid() == null : this.getCtPid().equals(other.getCtPid()))
                && (this.getCtLevel() == null ? other.getCtLevel() == null : this.getCtLevel().equals(other.getCtLevel()))
                && (this.getCtCode() == null ? other.getCtCode() == null : this.getCtCode().equals(other.getCtCode()))
                && (this.getCtName() == null ? other.getCtName() == null : this.getCtName().equals(other.getCtName()))
                && (this.getCtUnit() == null ? other.getCtUnit() == null : this.getCtUnit().equals(other.getCtUnit()))
                && (this.getCtQty() == null ? other.getCtQty() == null : this.getCtQty().equals(other.getCtQty()))
                && (this.getCtPrice() == null ? other.getCtPrice() == null : this.getCtPrice().equals(other.getCtPrice()))
                && (this.getCtMoney() == null ? other.getCtMoney() == null : this.getCtMoney().equals(other.getCtMoney()))
                && (this.getCtCheck() == null ? other.getCtCheck() == null : this.getCtCheck().equals(other.getCtCheck()))
                && (this.getCtFold() == null ? other.getCtFold() == null : this.getCtFold().equals(other.getCtFold()))
                && (this.getCtInfo() == null ? other.getCtInfo() == null : this.getCtInfo().equals(other.getCtInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCtId() == null) ? 0 : getCtId().hashCode());
        result = prime * result + ((getCtPid() == null) ? 0 : getCtPid().hashCode());
        result = prime * result + ((getCtLevel() == null) ? 0 : getCtLevel().hashCode());
        result = prime * result + ((getCtCode() == null) ? 0 : getCtCode().hashCode());
        result = prime * result + ((getCtName() == null) ? 0 : getCtName().hashCode());
        result = prime * result + ((getCtUnit() == null) ? 0 : getCtUnit().hashCode());
        result = prime * result + ((getCtQty() == null) ? 0 : getCtQty().hashCode());
        result = prime * result + ((getCtPrice() == null) ? 0 : getCtPrice().hashCode());
        result = prime * result + ((getCtMoney() == null) ? 0 : getCtMoney().hashCode());
        result = prime * result + ((getCtCheck() == null) ? 0 : getCtCheck().hashCode());
        result = prime * result + ((getCtFold() == null) ? 0 : getCtFold().hashCode());
        result = prime * result + ((getCtInfo() == null) ? 0 : getCtInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ctId=").append(ctId);
        sb.append(", ctPid=").append(ctPid);
        sb.append(", ctLevel=").append(ctLevel);
        sb.append(", ctCode=").append(ctCode);
        sb.append(", ctName=").append(ctName);
        sb.append(", ctUnit=").append(ctUnit);
        sb.append(", ctQty=").append(ctQty);
        sb.append(", ctPrice=").append(ctPrice);
        sb.append(", ctMoney=").append(ctMoney);
        sb.append(", ctCheck=").append(ctCheck);
        sb.append(", ctFold=").append(ctFold);
        sb.append(", ctInfo=").append(ctInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}