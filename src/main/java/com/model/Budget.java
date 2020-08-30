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
public class Budget implements Serializable {
    /**
     * 概算ID
     */
    private Integer bgId;

    /**
     * 清单ID
     */
    private Integer ctId;

    /**
     * 清单编码
     */
    private String ctCode;

    /**
     * 清单信息
     */
    private Contract contract;

    /**
     * 定额编码
     */
    private String bgCode;

    /**
     * 细目名称
     */
    private String bgName;

    /**
     * 计量单位
     */
    private String bgUnit;

    /**
     * 单位比率
     */
    private Double bgRate;

    /**
     * 概算数量
     */
    private Double bgQty;

    /**
     * 概算单价
     */
    private Double bgPrice;

    /**
     * 概算合价
     */
    private Double bgMoney;

    /**
     * 概算备注
     */
    private String bgInfo;

    private static final long serialVersionUID = 1L;


    /**
     * 默认构造方法
     */
    public Budget() {
    }

    /**
     * 部分构造方法
     */
    public Budget(Integer bgId, String bgCode, Contract contract) {
        this.bgId = bgId;
        this.bgCode = bgCode;
        this.contract = contract;
        this.ctId = contract.getCtId();
        this.ctCode = contract.getCtCode();
    }

    /**
     * 完整构造方法
     */
    public Budget(Integer bgId, Integer ctId, String ctCode, String bgCode, String bgName, String bgUnit,
                  Double bgRate, Double bgQty, Double bgPrice, Double bgMoney, String bgInfo) {
        this.bgId = bgId;
        this.ctId = ctId;
        this.ctCode = ctCode;
        this.bgCode = bgCode;
        this.bgName = bgName;
        this.bgUnit = bgUnit;
        this.bgRate = bgRate;
        this.bgQty = bgQty;
        this.bgPrice = bgPrice;
        this.bgMoney = bgMoney;
        this.bgInfo = bgInfo;
    }
//
//    @JsonCreator
//    public Budget(@JsonProperty("bgId") Integer bgId, @JsonProperty("ctId") Integer ctId, @JsonProperty("ctCode") String ctCode, @JsonProperty("bgCode") String bgCode,
//                  @JsonProperty("bgName") String bgName, @JsonProperty("bgUnit") String bgUnit, @JsonProperty("bgRate") Double bgRate, @JsonProperty("bgQty") Double bgQty,
//                  @JsonProperty("bgPrice") Double bgPrice, @JsonProperty("bgMoney") Double bgMoney, @JsonProperty("bgInfo") String bgInfo) {
//        this.bgId = bgId;
//        this.ctId = ctId;
//        this.ctCode = ctCode;
//        this.bgCode = bgCode;
//        this.bgName = bgName;
//        this.bgUnit = bgUnit;
//        this.bgRate = bgRate;
//        this.bgQty = bgQty;
//        this.bgPrice = bgPrice;
//        this.bgMoney = bgMoney;
//        this.bgInfo = bgInfo;
//    }

    public Integer getBgId() {
        return bgId;
    }

    public void setBgId(Integer bgId) {
        this.bgId = bgId;
    }

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public String getCtCode() {
        return ctCode;
    }

    public void setCtCode(String ctCode) {
        this.ctCode = ctCode;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
        this.ctId = contract.getCtId();
        this.ctCode = contract.getCtCode();
    }

    public String getBgCode() {
        return bgCode;
    }

    public void setBgCode(String bgCode) {
        this.bgCode = bgCode;
    }

    public String getBgName() {
        return bgName;
    }

    public void setBgName(String bgName) {
        this.bgName = bgName;
    }

    public String getBgUnit() {
        return bgUnit;
    }

    public void setBgUnit(String bgUnit) {
        this.bgUnit = bgUnit;
    }

    public Double getBgRate() {
        return bgRate;
    }

    public void setBgRate(Double bgRate) {
        this.bgRate = bgRate;
    }

    public Double getBgQty() {
        return bgQty;
    }

    public void setBgQty(Double bgQty) {
        this.bgQty = bgQty;
    }

    public Double getBgPrice() {
        return bgPrice;
    }

    public void setBgPrice(Double bgPrice) {
        this.bgPrice = bgPrice;
    }

    public Double getBgMoney() {
        return bgMoney;
    }

    public void setBgMoney(Double bgMoney) {
        this.bgMoney = bgMoney;
    }

    public String getBgInfo() {
        return bgInfo;
    }

    public void setBgInfo(String bgInfo) {
        this.bgInfo = bgInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("bgId")) {
            if(RegexUtil.isNumber(_value)) {
                bgId = Integer.parseInt(_value);
            }
        }
        if (field.equals("ctId")) {
            if(RegexUtil.isNumber(_value)) {
                ctId = Integer.parseInt(_value);
            }
        }
        if (field.equals("ctCode")) {
            ctCode = _value;
        }
        if (field.equals("contract")) {
            contract = (Contract)value;
        }
        if (field.equals("bgCode")) {
            bgCode = _value;
        }
        if (field.equals("bgName")) {
            bgName = _value;
        }
        if (field.equals("bgUnit")) {
            bgUnit = _value;
        }
        if (field.equals("bgRate")) {
            if(RegexUtil.isNumber(_value)) {
                bgRate = Double.parseDouble(_value);
            }
        }
        if (field.equals("bgQty")) {
            if(RegexUtil.isNumber(_value)) {
                bgQty = Double.parseDouble(_value);
            }
        }
        if (field.equals("bgPrice")) {
            if(RegexUtil.isNumber(_value)) {
                bgPrice = Double.parseDouble(_value);
            }
        }
        if (field.equals("bgMoney")) {
            if(RegexUtil.isNumber(_value)) {
                bgMoney = Double.parseDouble(_value);
            }
        }
        if (field.equals("bgInfo")) {
            bgInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("bgId")) {
            String value = map.get("bgId").toString();
            if(RegexUtil.isNumber(value)) {
                bgId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("ctId")) {
            String value = map.get("ctId").toString();
            if(RegexUtil.isNumber(value)) {
                ctId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("ctCode")) {
            ctCode = map.get("ctCode").toString();
        }
        if (map.containsKey("contract")) {
            contract = (Contract) map.get("contract");
        }
        if (map.containsKey("bgCode")) {
            bgCode = map.get("bgCode").toString();
        }
        if (map.containsKey("bgName")) {
            bgName = map.get("bgName").toString();
        }
        if (map.containsKey("bgUnit")) {
            bgUnit = map.get("bgUnit").toString();
        }
        if (map.containsKey("bgRate")) {
            String value = map.get("bgRate").toString();
            if(RegexUtil.isNumber(value)) {
                bgRate = Double.parseDouble(value);
            }
        }
        if (map.containsKey("bgQty")) {
            String value = map.get("bgQty").toString();
            if(RegexUtil.isNumber(value)) {
                bgQty = Double.parseDouble(value);
            }
        }
        if (map.containsKey("bgPrice")) {
            String value = map.get("bgPrice").toString();
            if(RegexUtil.isNumber(value)) {
                bgPrice = Double.parseDouble(value);
            }
        }
        if (map.containsKey("bgMoney")) {
            String value = map.get("bgMoney").toString();
            if(RegexUtil.isNumber(value)) {
                bgMoney = Double.parseDouble(value);
            }
        }
        if (map.containsKey("bgInfo")) {
            bgInfo = map.get("bgInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("bgId")) {
            if(RegexUtil.isNumber(json.getString("bgId"))) {
                bgId = json.getInteger("bgId");
            }
        }
        if (json.containsKey("ctId")) {
            if(RegexUtil.isNumber(json.getString("ctId"))) {
                ctId = json.getInteger("ctId");
            }
        }
        if (json.containsKey("ctCode")) {
            ctCode = json.getString("ctCode");
        }
        if (json.containsKey("contract")) {
            contract = json.getObject("contract",Contract.class);
        }
        if (json.containsKey("bgCode")) {
            bgCode = json.getString("bgCode");
        }
        if (json.containsKey("bgName")) {
            bgName = json.getString("bgName");
        }
        if (json.containsKey("bgUnit")) {
            bgUnit = json.getString("bgUnit");
        }
        if (json.containsKey("bgRate")) {
            if(RegexUtil.isNumber(json.getString("bgRate"))) {
                bgRate = json.getDouble("bgRate");
            }
        }
        if (json.containsKey("bgQty")) {
            if(RegexUtil.isNumber(json.getString("bgQty"))) {
                bgQty = json.getDouble("bgQty");
            }
        }
        if (json.containsKey("bgPrice")) {
            if(RegexUtil.isNumber(json.getString("bgPrice"))) {
                bgPrice = json.getDouble("bgPrice");
            }
        }
        if (json.containsKey("bgMoney")) {
            if(RegexUtil.isNumber(json.getString("bgMoney"))) {
                bgMoney = json.getDouble("bgMoney");
            }
        }
        if (json.containsKey("bgInfo")) {
            bgInfo = json.getString("bgInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(bgId == null) {
            bgId = -1;
        }
        map.put("bgId", bgId);
        if(ctId == null) {
            ctId = -1;
        }
        map.put("ctId", ctId);
        map.put("ctCode", ctCode);
        map.put("contract", contract);
        if(contract != null) {
            map.put("ctId", contract.getCtId());
            map.put("ctPid", contract.getCtPid());
            map.put("ctLevel", contract.getCtLevel());
            map.put("ctCode", contract.getCtCode());
            map.put("ctName", contract.getCtName());
            map.put("ctFold", contract.getCtFold());
        } else {
            map.put("ctPid", 0);
            map.put("ctFold", true);
        }
        map.put("bgCode", bgCode);
        map.put("bgName", bgName);
        if(bgName != null) {
            map.put("ctCode", bgCode);
            map.put("ctName", bgName);
        }
        map.put("bgUnit", bgUnit);
        if(bgRate == null) {
            bgRate = -1.0;
        }
        map.put("bgRate", bgRate);
        if(bgQty == null) {
            bgQty = -1.0;
        }
        map.put("bgQty", bgQty);
        if(bgPrice == null) {
            bgPrice = -1.0;
        }
        map.put("bgPrice", bgPrice);
        if(bgMoney == null) {
            bgMoney = -1.0;
        }
        map.put("bgMoney", bgMoney);
        map.put("bgInfo", bgInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(bgId == null) {
            bgId = -1;
        }
        json.put("bgId", bgId);
        if(ctId == null) {
            ctId = -1;
        }
        json.put("ctId", ctId);
        json.put("ctCode", ctCode);
        json.put("contract", contract);
        json.put("bgCode", bgCode);
        json.put("bgName", bgName);
        json.put("bgUnit", bgUnit);
        if(bgRate == null) {
            bgRate = -1.0;
        }
        json.put("bgRate", bgRate);
        if(bgQty == null) {
            bgQty = -1.0;
        }
        json.put("bgQty", bgQty);
        if(bgPrice == null) {
            bgPrice = -1.0;
        }
        json.put("bgPrice", bgPrice);
        if(bgMoney == null) {
            bgMoney = -1.0;
        }
        json.put("bgMoney", bgMoney);
        json.put("bgInfo", bgInfo);

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
        Budget other = (Budget) that;
        return (this.getBgId() == null ? other.getBgId() == null : this.getBgId().equals(other.getBgId()))
            && (this.getCtId() == null ? other.getCtId() == null : this.getCtId().equals(other.getCtId()))
            && (this.getCtCode() == null ? other.getCtCode() == null : this.getCtCode().equals(other.getCtCode()))
            && (this.getContract() == null ? other.getContract() == null : this.getContract().equals(other.getContract()))
            && (this.getBgCode() == null ? other.getBgCode() == null : this.getBgCode().equals(other.getBgCode()))
            && (this.getBgName() == null ? other.getBgName() == null : this.getBgName().equals(other.getBgName()))
            && (this.getBgUnit() == null ? other.getBgUnit() == null : this.getBgUnit().equals(other.getBgUnit()))
            && (this.getBgRate() == null ? other.getBgRate() == null : this.getBgRate().equals(other.getBgRate()))
            && (this.getBgQty() == null ? other.getBgQty() == null : this.getBgQty().equals(other.getBgQty()))
            && (this.getBgPrice() == null ? other.getBgPrice() == null : this.getBgPrice().equals(other.getBgPrice()))
            && (this.getBgMoney() == null ? other.getBgMoney() == null : this.getBgMoney().equals(other.getBgMoney()))
            && (this.getBgInfo() == null ? other.getBgInfo() == null : this.getBgInfo().equals(other.getBgInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBgId() == null) ? 0 : getBgId().hashCode());
        result = prime * result + ((getCtId() == null) ? 0 : getCtId().hashCode());
        result = prime * result + ((getCtCode() == null) ? 0 : getCtCode().hashCode());
        result = prime * result + ((getContract() == null) ? 0 : getContract().hashCode());
        result = prime * result + ((getBgCode() == null) ? 0 : getBgCode().hashCode());
        result = prime * result + ((getBgName() == null) ? 0 : getBgName().hashCode());
        result = prime * result + ((getBgUnit() == null) ? 0 : getBgUnit().hashCode());
        result = prime * result + ((getBgRate() == null) ? 0 : getBgRate().hashCode());
        result = prime * result + ((getBgQty() == null) ? 0 : getBgQty().hashCode());
        result = prime * result + ((getBgPrice() == null) ? 0 : getBgPrice().hashCode());
        result = prime * result + ((getBgMoney() == null) ? 0 : getBgMoney().hashCode());
        result = prime * result + ((getBgInfo() == null) ? 0 : getBgInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bgId=").append(bgId);
        sb.append(", ctId=").append(ctId);
        sb.append(", ctCode=").append(ctCode);
        sb.append(", contract=").append(contract);
        sb.append(", bgCode=").append(bgCode);
        sb.append(", bgName=").append(bgName);
        sb.append(", bgUnit=").append(bgUnit);
        sb.append(", bgRate=").append(bgRate);
        sb.append(", bgQty=").append(bgQty);
        sb.append(", bgPrice=").append(bgPrice);
        sb.append(", bgMoney=").append(bgMoney);
        sb.append(", bgInfo=").append(bgInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}