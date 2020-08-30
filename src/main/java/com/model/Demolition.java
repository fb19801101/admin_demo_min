package com.model;

import com.alibaba.fastjson.JSONObject;
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
public class Demolition implements Serializable {
    /**
     * 数量ID
     */
    private Integer dnId;

    /**
     * 分项ID
     */
    private Integer piId;

    /**
     * 成本层ID
     */
    private Integer clId;

    /**
     * 数量编码
     */
    private String dnCode;

    /**
     * 分项名称
     */
    private String piName;

    /**
     * 分部分项
     */
    private PartItem partItem;

    /**
     * 成本层编码
     */
    private String clCode;

    /**
     * 成本层
     */
    private CostLayer costLayer;

    /**
     * 施工日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dnDate;

    /**
     * 项目名称
     */
    private String dnName;

    /**
     * 计量单位
     */
    private String dnUnit;

    /**
     * 已完设计数量
     */
    private Double dnDoDesign;

    /**
     * 已完变更数量
     */
    private Double dnDoChange;

    /**
     * 对上计价设计数量
     */
    private Double dnUpDesign;

    /**
     * 对上计价变更数量
     */
    private Double dnUpChange;

    /**
     * 对下计价设计数量
     */
    private Double dnDownDesign;

    /**
     * 对下计价变更数量
     */
    private Double dnDownChange;

    /**
     * 数量备注
     */
    private String dnInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public Demolition() {
    }

    /**
     * 部分构造方法
     */
    public Demolition(Integer dnId, PartItem partItem) {
        this.dnId = dnId;
        this.partItem = partItem;
        this.piId = partItem.getPiId();
        this.piName = partItem.getPiName();
    }

    public Demolition(Integer dnId, CostLayer costLayer) {
        this.dnId = dnId;
        this.costLayer = costLayer;
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    /**
     * 完整构造方法
     */
    public Demolition(Integer dnId, String dnCode, Integer piId, String piName, Integer clId, String clCode,
                    Date dnDate, String dnName, String dnUnit, Double dnDoDesign, Double dnDoChange,
                    Double dnUpDesign, Double dnUpChange, Double dnDownDesign, Double dnDownChange, String dnInfo) {
        this.dnId = dnId;
        this.dnCode = dnCode;
        this.piId = piId;
        this.piName = piName;
        this.clId = clId;
        this.clCode = clCode;
        this.dnDate = dnDate;
        this.dnName = dnName;
        this.dnUnit = dnUnit;
        this.dnDoDesign = dnDoDesign;
        this.dnDoChange = dnDoChange;
        this.dnUpDesign = dnUpDesign;
        this.dnUpChange = dnUpChange;
        this.dnDownDesign = dnDownDesign;
        this.dnDownChange = dnDownChange;
        this.dnInfo = dnInfo;
    }
//    @JsonCreator
//    public Demolition(@JsonProperty("dnId") Integer dnId, @JsonProperty("dnCode") String dnCode,
//                    @JsonProperty("piId") Integer piId, @JsonProperty("piName") String piName,
//                    @JsonProperty("clId") Integer clId, @JsonProperty("clCode") String clCode,
//                    @JsonProperty("dnDate") Date dnDate, @JsonProperty("dnName") String dnName,
//                    @JsonProperty("dnUnit") String dnUnit, @JsonProperty("dnDoDesign") Double dnDoDesign,
//                    @JsonProperty("dnDoChange") Double dnDoChange, @JsonProperty("dnUpDesign") Double dnUpDesign, @JsonProperty("dnUpChange") Double dnUpChange,
//                    @JsonProperty("dnDownDesign") Double dnDownDesign, @JsonProperty("dnDownChange") Double dnDownChange, @JsonProperty("dnInfo") String dnInfo) {
//        this.dnId = dnId;
//        this.dnCode = dnCode;
//        this.piId = piId;
//        this.piName = piName;
//        this.clId = clId;
//        this.clCode = clCode;
//        this.dnDate = dnDate;
//        this.dnName = dnName;
//        this.dnUnit = dnUnit;
//        this.dnDoDesign = dnDoDesign;
//        this.dnDoChange = dnDoChange;
//        this.dnUpDesign = dnUpDesign;
//        this.dnUpChange = dnUpChange;
//        this.dnDownDesign = dnDownDesign;
//        this.dnDownChange = dnDownChange;
//        this.dnInfo = dnInfo;
//    }

    public Integer getDnId() {
        return dnId;
    }

    public void setDnId(Integer dnId) {
        this.dnId = dnId;
    }

    public String getDnCode() {
        return dnCode;
    }

    public void setDnCode(String dnCode) {
        this.dnCode = dnCode;
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

    public PartItem getPartItem() {
        return partItem;
    }

    public void setPartItem(PartItem partItem) {
        this.partItem = partItem;
        this.piId = partItem.getPiId();
        this.piName = partItem.getPiName();
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public String getClCode() {
        return clCode;
    }

    public void setClCode(String clCode) {
        this.clCode = clCode;
    }

    public CostLayer getCostLayer() {
        return costLayer;
    }

    public void setCostLayer(CostLayer costLayer) {
        this.costLayer = costLayer;
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    public Date getDnDate() {
        return dnDate;
    }

    public void setDnDate(Date dnDate) {
        this.dnDate = dnDate;
    }

    public String getDnName() {
        return dnName;
    }

    public void setDnName(String dnName) {
        this.dnName = dnName;
    }

    public String getDnUnit() {
        return dnUnit;
    }

    public void setDnUnit(String dnUnit) {
        this.dnUnit = dnUnit;
    }

    public Double getDnDoDesign() {
        return dnDoDesign;
    }

    public void setDnDoDesign(Double dnDoDesign) {
        this.dnDoDesign = dnDoDesign;
    }

    public Double getDnDoChange() {
        return dnDoChange;
    }

    public void setDnDoChange(Double dnDoChange) {
        this.dnDoChange = dnDoChange;
    }

    public Double getDnUpDesign() {
        return dnUpDesign;
    }

    public void setDnUpDesign(Double dnUpDesign) {
        this.dnUpDesign = dnUpDesign;
    }

    public Double getDnUpChange() {
        return dnUpChange;
    }

    public void setDnUpChange(Double dnUpChange) {
        this.dnUpChange = dnUpChange;
    }

    public Double getDnDownDesign() {
        return dnDownDesign;
    }

    public void setDnDownDesign(Double dnDownDesign) {
        this.dnDownDesign = dnDownDesign;
    }

    public Double getDnDownChange() {
        return dnDownChange;
    }

    public void setDnDownChange(Double dnDownChange) {
        this.dnDownChange = dnDownChange;
    }

    public String getDnInfo() {
        return dnInfo;
    }

    public void setDnInfo(String dnInfo) {
        this.dnInfo = dnInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("dnId")) {
            if(RegexUtil.isNumber(_value)) {
                dnId = Integer.parseInt(_value);
            }
        }
        if (field.equals("dnCode")) {
            dnCode = _value;
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
        if (field.equals("clId")) {
            if(RegexUtil.isNumber(_value)) {
                clId = Integer.parseInt(_value);
            }
        }
        if (field.equals("clCode")) {
            clCode = _value;
        }
        if (field.equals("costLayer")) {
            costLayer = (CostLayer) value;
        }
        if (field.equals("dnDate")) {
            dnDate = DateConverter.strToDate(_value);
        }
        if (field.equals("dnName")) {
            dnName = _value;
        }
        if (field.equals("dnUnit")) {
            dnUnit = _value;
        }
        if (field.equals("dnDoDesign")) {
            if(RegexUtil.isNumber(_value)) {
                dnDoDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("dnDoChange")) {
            if(RegexUtil.isNumber(_value)) {
                dnDoChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("dnUpDesign")) {
            if(RegexUtil.isNumber(_value)) {
                dnUpDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("dnUpChange")) {
            if(RegexUtil.isNumber(_value)) {
                dnUpChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("dnDownDesign")) {
            if(RegexUtil.isNumber(_value)) {
                dnDownDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("dnDownChange")) {
            if(RegexUtil.isNumber(_value)) {
                dnDownChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("dnInfo")) {
            dnInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("dnId")) {
            String value = map.get("dnId").toString();
            if(RegexUtil.isNumber(value)) {
                dnId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("dnCode")) {
            dnCode = map.get("dnCode").toString();
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
        if (map.containsKey("clId")) {
            String value = map.get("clId").toString();
            if(RegexUtil.isNumber(value)) {
                clId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("clCode")) {
            clCode = map.get("clCode").toString();
        }
        if (map.containsKey("costLayer")) {
            costLayer = (CostLayer) map.get("costLayer");
        }
        if (map.containsKey("dnDate")) {
            dnDate = DateConverter.strToDate(map.get("dnDate").toString());
        }
        if (map.containsKey("dnName")) {
            dnName = map.get("dnName").toString();
        }
        if (map.containsKey("dnUnit")) {
            dnUnit = map.get("dnUnit").toString();
        }
        if (map.containsKey("dnDoDesign")) {
            String value = map.get("dnDoDesign").toString();
            if(RegexUtil.isNumber(value)) {
                dnDoDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("dnDoChange")) {
            String value = map.get("dnDoChange").toString();
            if(RegexUtil.isNumber(value)) {
                dnDoChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("dnUpDesign")) {
            String value = map.get("dnUpDesign").toString();
            if(RegexUtil.isNumber(value)) {
                dnUpDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("dnUpChange")) {
            String value = map.get("dnUpChange").toString();
            if(RegexUtil.isNumber(value)) {
                dnUpChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("dnDownDesign")) {
            String value = map.get("dnDownDesign").toString();
            if(RegexUtil.isNumber(value)) {
                dnDownDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("dnDownChange")) {
            String value = map.get("dnDownChange").toString();
            if(RegexUtil.isNumber(value)) {
                dnDownChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("dnInfo")) {
            dnInfo = map.get("dnInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("dnId")) {
            if(RegexUtil.isNumber(json.getString("dnId"))) {
                dnId = json.getInteger("dnId");
            }
        }
        if (json.containsKey("dnCode")) {
            dnCode = json.getString("dnCode");
        }
        if (json.containsKey("piId")) {
            if(RegexUtil.isNumber(json.getString("piId"))) {
                piId = json.getInteger("piId");
            }
        }
        if (json.containsKey("piName")) {
            piName = json.getString("piName");
        }
        if (json.containsKey("partItem")) {
            partItem = json.getObject("partItem", PartItem.class);
        }
        if (json.containsKey("clId")) {
            if(RegexUtil.isNumber(json.getString("clId"))) {
                clId = json.getInteger("clId");
            }
        }
        if (json.containsKey("clCode")) {
            clCode = json.getString("clCode");
        }
        if (json.containsKey("costLayer")) {
            costLayer = json.getObject("costLayer", CostLayer.class);
        }
        if (json.containsKey("dnDate")) {
            dnDate = DateConverter.strToDate(json.getString("dnDate"));
        }
        if (json.containsKey("dnName")) {
            dnName = json.getString("dnName");
        }
        if (json.containsKey("dnUnit")) {
            dnUnit = json.getString("dnUnit");
        }
        if (json.containsKey("dnDoDesign")) {
            if(RegexUtil.isNumber(json.getString("dnDoDesign"))) {
                dnDoDesign = json.getDouble("dnDoDesign");
            }
        }
        if (json.containsKey("dnDoChange")) {
            if(RegexUtil.isNumber(json.getString("dnDoChange"))) {
                dnDoChange = json.getDouble("dnDoChange");
            }
        }
        if (json.containsKey("dnUpDesign")) {
            if(RegexUtil.isNumber(json.getString("dnUpDesign"))) {
                dnUpDesign = json.getDouble("dnUpDesign");
            }
        }
        if (json.containsKey("dnUpChange")) {
            if(RegexUtil.isNumber(json.getString("dnUpChange"))) {
                dnUpChange = json.getDouble("dnUpChange");
            }
        }
        if (json.containsKey("dnDownDesign")) {
            if(RegexUtil.isNumber(json.getString("dnDownDesign"))) {
                dnDownDesign = json.getDouble("dnDownDesign");
            }
        }
        if (json.containsKey("dnDownChange")) {
            if(RegexUtil.isNumber(json.getString("dnDownChange"))) {
                dnDownChange = json.getDouble("dnDownChange");
            }
        }
        if (json.containsKey("dnInfo")) {
            dnInfo = json.getString("dnInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(dnId == null) {
            dnId = -1;
        }
        map.put("dnId", dnId);
        map.put("dnCode", dnCode);
        if(piId == null) {
            piId = -1;
        }
        map.put("piId", piId);
        map.put("piName", piName);
        map.put("partItem", partItem);
        if(partItem != null) {
            map.put("piId", partItem.getPiId());
            map.put("piPid", partItem.getPiPid());
            map.put("piName", partItem.getPiName());
            map.put("dnName", partItem.getPiName());
            map.put("piFold", partItem.getPiFold());
        } else {
            map.put("piPid", 0);
            map.put("piFold", true);
        }
        if(clId == null) {
            clId = -1;
        }
        map.put("clId", clId);
        map.put("clCode", clCode);
        map.put("costLayer", costLayer);
        map.put("dnDate", DateConverter.dateToStr(dnDate));
        if(dnName != null) {
            map.put("dnName", dnName);
        }
        map.put("dnUnit", dnUnit);
        if(dnDoDesign == null) {
            dnDoDesign = -1.0;
        }
        map.put("dnDoDesign", dnDoDesign);
        if(dnDoChange == null) {
            dnDoChange = -1.0;
        }
        map.put("dnDoChange", dnDoChange);
        if(dnUpDesign == null) {
            dnUpDesign = -1.0;
        }
        map.put("dnUpDesign", dnUpDesign);
        if(dnUpChange == null) {
            dnUpChange = -1.0;
        }
        map.put("dnUpChange", dnUpChange);
        if(dnDownDesign == null) {
            dnDownDesign = -1.0;
        }
        map.put("dnDownDesign", dnDownDesign);
        if(dnDownChange == null) {
            dnDownChange = -1.0;
        }
        map.put("dnDownChange", dnDownChange);
        map.put("dnInfo", dnInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(dnId == null) {
            dnId = -1;
        }
        json.put("dnId", dnId);
        json.put("dnCode", dnCode);
        if(piId == null) {
            piId = -1;
        }
        json.put("piId", piId);
        json.put("piName", piName);
        json.put("partItem", partItem);
        if(clId == null) {
            clId = -1;
        }
        json.put("clId", clId);
        json.put("clCode", clCode);
        json.put("costLayer", costLayer);
        json.put("dnDate", DateConverter.dateToStr(dnDate));
        json.put("dnName", dnName);
        json.put("dnUnit", dnUnit);
        if(dnDoDesign == null) {
            dnDoDesign = -1.0;
        }
        json.put("dnDoDesign", dnDoDesign);
        if(dnDoChange == null) {
            dnDoChange = -1.0;
        }
        json.put("dnDoChange", dnDoChange);
        if(dnUpDesign == null) {
            dnUpDesign = -1.0;
        }
        json.put("dnUpDesign", dnUpDesign);
        if(dnUpChange == null) {
            dnUpChange = -1.0;
        }
        json.put("dnUpChange", dnUpChange);
        if(dnDownDesign == null) {
            dnDownDesign = -1.0;
        }
        json.put("dnDownDesign", dnDownDesign);
        if(dnDownChange == null) {
            dnDownChange = -1.0;
        }
        json.put("dnDownChange", dnDownChange);
        json.put("dnInfo", dnInfo);

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
        Demolition other = (Demolition) that;
        return (this.getDnId() == null ? other.getDnId() == null : this.getDnId().equals(other.getDnId()))
                && (this.getDnCode() == null ? other.getDnCode() == null : this.getDnCode().equals(other.getDnCode()))
                && (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
                && (this.getPiName() == null ? other.getPiName() == null : this.getPiName().equals(other.getPiName()))
                && (this.getPartItem() == null ? other.getPartItem() == null : this.getPartItem().equals(other.getPartItem()))
                && (this.getClId() == null ? other.getClId() == null : this.getClId().equals(other.getClId()))
                && (this.getClCode() == null ? other.getClCode() == null : this.getClCode().equals(other.getClCode()))
                && (this.getCostLayer() == null ? other.getCostLayer() == null : this.getCostLayer().equals(other.getCostLayer()))
                && (this.getDnDate() == null ? other.getDnDate() == null : this.getDnDate().equals(other.getDnDate()))
                && (this.getDnName() == null ? other.getDnName() == null : this.getDnName().equals(other.getDnName()))
                && (this.getDnUnit() == null ? other.getDnUnit() == null : this.getDnUnit().equals(other.getDnUnit()))
                && (this.getDnDoDesign() == null ? other.getDnDoDesign() == null : this.getDnDoDesign().equals(other.getDnDoDesign()))
                && (this.getDnDoChange() == null ? other.getDnDoChange() == null : this.getDnDoChange().equals(other.getDnDoChange()))
                && (this.getDnUpDesign() == null ? other.getDnUpDesign() == null : this.getDnUpDesign().equals(other.getDnUpDesign()))
                && (this.getDnUpChange() == null ? other.getDnUpChange() == null : this.getDnUpChange().equals(other.getDnUpChange()))
                && (this.getDnDownDesign() == null ? other.getDnDownDesign() == null : this.getDnDownDesign().equals(other.getDnDownDesign()))
                && (this.getDnDownChange() == null ? other.getDnDownChange() == null : this.getDnDownChange().equals(other.getDnDownChange()))
                && (this.getDnInfo() == null ? other.getDnInfo() == null : this.getDnInfo().equals(other.getDnInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDnId() == null) ? 0 : getDnId().hashCode());
        result = prime * result + ((getDnCode() == null) ? 0 : getDnCode().hashCode());
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiName() == null) ? 0 : getPiName().hashCode());
        result = prime * result + ((getPartItem() == null) ? 0 : getPartItem().hashCode());
        result = prime * result + ((getClId() == null) ? 0 : getClId().hashCode());
        result = prime * result + ((getClCode() == null) ? 0 : getClCode().hashCode());
        result = prime * result + ((getCostLayer() == null) ? 0 : getCostLayer().hashCode());
        result = prime * result + ((getDnDate() == null) ? 0 : getDnDate().hashCode());
        result = prime * result + ((getDnName() == null) ? 0 : getDnName().hashCode());
        result = prime * result + ((getDnUnit() == null) ? 0 : getDnUnit().hashCode());
        result = prime * result + ((getDnDoDesign() == null) ? 0 : getDnDoDesign().hashCode());
        result = prime * result + ((getDnDoChange() == null) ? 0 : getDnDoChange().hashCode());
        result = prime * result + ((getDnUpDesign() == null) ? 0 : getDnUpDesign().hashCode());
        result = prime * result + ((getDnUpChange() == null) ? 0 : getDnUpChange().hashCode());
        result = prime * result + ((getDnDownDesign() == null) ? 0 : getDnDownDesign().hashCode());
        result = prime * result + ((getDnDownChange() == null) ? 0 : getDnDownChange().hashCode());
        result = prime * result + ((getDnInfo() == null) ? 0 : getDnInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dnId=").append(dnId);
        sb.append(", dnCode=").append(dnCode);
        sb.append(", piId=").append(piId);
        sb.append(", piName=").append(piName);
        sb.append(", partItem=").append(partItem);
        sb.append(", clId=").append(clId);
        sb.append(", clCode=").append(clCode);
        sb.append(", costLayer=").append(costLayer);
        sb.append(", dnDate=").append(dnDate);
        sb.append(", dnName=").append(dnName);
        sb.append(", dnUnit=").append(dnUnit);
        sb.append(", dnDoDesign=").append(dnDoDesign);
        sb.append(", dnDoChange=").append(dnDoChange);
        sb.append(", dnUpDesign=").append(dnUpDesign);
        sb.append(", dnUpChange=").append(dnUpChange);
        sb.append(", dnDownDesign=").append(dnDownDesign);
        sb.append(", dnDownChange=").append(dnDownChange);
        sb.append(", dnInfo=").append(dnInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}