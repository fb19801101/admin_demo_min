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
public class Equipment implements Serializable {
    /**
     * 数量ID
     */
    private Integer etId;

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
    private String etCode;

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
    private Date etDate;

    /**
     * 项目名称
     */
    private String etName;

    /**
     * 计量单位
     */
    private String etUnit;

    /**
     * 已完设计数量
     */
    private Double etDoDesign;

    /**
     * 已完变更数量
     */
    private Double etDoChange;

    /**
     * 对上计价设计数量
     */
    private Double etUpDesign;

    /**
     * 对上计价变更数量
     */
    private Double etUpChange;

    /**
     * 对下计价设计数量
     */
    private Double etDownDesign;

    /**
     * 对下计价变更数量
     */
    private Double etDownChange;

    /**
     * 数量备注
     */
    private String etInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public Equipment() {
    }

    /**
     * 部分构造方法
     */
    public Equipment(Integer etId, PartItem partItem) {
        this.etId = etId;
        this.partItem = partItem;
        this.piId = partItem.getPiId();
        this.piName = partItem.getPiName();
    }

    public Equipment(Integer etId, CostLayer costLayer) {
        this.etId = etId;
        this.costLayer = costLayer;
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    /**
     * 完整构造方法
     */
    public Equipment(Integer etId, String etCode, Integer piId, String piName, Integer clId, String clCode,
                    Date etDate, String etName, String etUnit, Double etDoDesign, Double etDoChange,
                    Double etUpDesign, Double etUpChange, Double etDownDesign, Double etDownChange, String etInfo) {
        this.etId = etId;
        this.etCode = etCode;
        this.piId = piId;
        this.piName = piName;
        this.clId = clId;
        this.clCode = clCode;
        this.etDate = etDate;
        this.etName = etName;
        this.etUnit = etUnit;
        this.etDoDesign = etDoDesign;
        this.etDoChange = etDoChange;
        this.etUpDesign = etUpDesign;
        this.etUpChange = etUpChange;
        this.etDownDesign = etDownDesign;
        this.etDownChange = etDownChange;
        this.etInfo = etInfo;
    }
//    @JsonCreator
//    public Equipment(@JsonProperty("etId") Integer etId, @JsonProperty("etCode") String etCode,
//                    @JsonProperty("piId") Integer piId, @JsonProperty("piName") String piName,
//                    @JsonProperty("clId") Integer clId, @JsonProperty("clCode") String clCode,
//                    @JsonProperty("etDate") Date etDate, @JsonProperty("etName") String etName,
//                    @JsonProperty("etUnit") String etUnit, @JsonProperty("etDoDesign") Double etDoDesign,
//                    @JsonProperty("etDoChange") Double etDoChange, @JsonProperty("etUpDesign") Double etUpDesign, @JsonProperty("etUpChange") Double etUpChange,
//                    @JsonProperty("etDownDesign") Double etDownDesign, @JsonProperty("etDownChange") Double etDownChange, @JsonProperty("etInfo") String etInfo) {
//        this.etId = etId;
//        this.etCode = etCode;
//        this.piId = piId;
//        this.piName = piName;
//        this.clId = clId;
//        this.clCode = clCode;
//        this.etDate = etDate;
//        this.etName = etName;
//        this.etUnit = etUnit;
//        this.etDoDesign = etDoDesign;
//        this.etDoChange = etDoChange;
//        this.etUpDesign = etUpDesign;
//        this.etUpChange = etUpChange;
//        this.etDownDesign = etDownDesign;
//        this.etDownChange = etDownChange;
//        this.etInfo = etInfo;
//    }

    public Integer getEtId() {
        return etId;
    }

    public void setEtId(Integer etId) {
        this.etId = etId;
    }

    public String getEtCode() {
        return etCode;
    }

    public void setEtCode(String etCode) {
        this.etCode = etCode;
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

    public Date getEtDate() {
        return etDate;
    }

    public void setEtDate(Date etDate) {
        this.etDate = etDate;
    }

    public String getEtName() {
        return etName;
    }

    public void setEtName(String etName) {
        this.etName = etName;
    }

    public String getEtUnit() {
        return etUnit;
    }

    public void setEtUnit(String etUnit) {
        this.etUnit = etUnit;
    }

    public Double getEtDoDesign() {
        return etDoDesign;
    }

    public void setEtDoDesign(Double etDoDesign) {
        this.etDoDesign = etDoDesign;
    }

    public Double getEtDoChange() {
        return etDoChange;
    }

    public void setEtDoChange(Double etDoChange) {
        this.etDoChange = etDoChange;
    }

    public Double getEtUpDesign() {
        return etUpDesign;
    }

    public void setEtUpDesign(Double etUpDesign) {
        this.etUpDesign = etUpDesign;
    }

    public Double getEtUpChange() {
        return etUpChange;
    }

    public void setEtUpChange(Double etUpChange) {
        this.etUpChange = etUpChange;
    }

    public Double getEtDownDesign() {
        return etDownDesign;
    }

    public void setEtDownDesign(Double etDownDesign) {
        this.etDownDesign = etDownDesign;
    }

    public Double getEtDownChange() {
        return etDownChange;
    }

    public void setEtDownChange(Double etDownChange) {
        this.etDownChange = etDownChange;
    }

    public String getEtInfo() {
        return etInfo;
    }

    public void setEtInfo(String etInfo) {
        this.etInfo = etInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("etId")) {
            if(RegexUtil.isNumber(_value)) {
                etId = Integer.parseInt(_value);
            }
        }
        if (field.equals("etCode")) {
            etCode = _value;
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
        if (field.equals("etDate")) {
            etDate = DateConverter.strToDate(_value);
        }
        if (field.equals("etName")) {
            etName = _value;
        }
        if (field.equals("etUnit")) {
            etUnit = _value;
        }
        if (field.equals("etDoDesign")) {
            if(RegexUtil.isNumber(_value)) {
                etDoDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("etDoChange")) {
            if(RegexUtil.isNumber(_value)) {
                etDoChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("etUpDesign")) {
            if(RegexUtil.isNumber(_value)) {
                etUpDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("etUpChange")) {
            if(RegexUtil.isNumber(_value)) {
                etUpChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("etDownDesign")) {
            if(RegexUtil.isNumber(_value)) {
                etDownDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("etDownChange")) {
            if(RegexUtil.isNumber(_value)) {
                etDownChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("etInfo")) {
            etInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("etId")) {
            String value = map.get("etId").toString();
            if(RegexUtil.isNumber(value)) {
                etId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("etCode")) {
            etCode = map.get("etCode").toString();
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
        if (map.containsKey("etDate")) {
            etDate = DateConverter.strToDate(map.get("etDate").toString());
        }
        if (map.containsKey("etName")) {
            etName = map.get("etName").toString();
        }
        if (map.containsKey("etUnit")) {
            etUnit = map.get("etUnit").toString();
        }
        if (map.containsKey("etDoDesign")) {
            String value = map.get("etDoDesign").toString();
            if(RegexUtil.isNumber(value)) {
                etDoDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("etDoChange")) {
            String value = map.get("etDoChange").toString();
            if(RegexUtil.isNumber(value)) {
                etDoChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("etUpDesign")) {
            String value = map.get("etUpDesign").toString();
            if(RegexUtil.isNumber(value)) {
                etUpDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("etUpChange")) {
            String value = map.get("etUpChange").toString();
            if(RegexUtil.isNumber(value)) {
                etUpChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("etDownDesign")) {
            String value = map.get("etDownDesign").toString();
            if(RegexUtil.isNumber(value)) {
                etDownDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("etDownChange")) {
            String value = map.get("etDownChange").toString();
            if(RegexUtil.isNumber(value)) {
                etDownChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("etInfo")) {
            etInfo = map.get("etInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("etId")) {
            if(RegexUtil.isNumber(json.getString("etId"))) {
                etId = json.getInteger("etId");
            }
        }
        if (json.containsKey("etCode")) {
            etCode = json.getString("etCode");
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
        if (json.containsKey("etDate")) {
            etDate = DateConverter.strToDate(json.getString("etDate"));
        }
        if (json.containsKey("etName")) {
            etName = json.getString("etName");
        }
        if (json.containsKey("etUnit")) {
            etUnit = json.getString("etUnit");
        }
        if (json.containsKey("etDoDesign")) {
            if(RegexUtil.isNumber(json.getString("etDoDesign"))) {
                etDoDesign = json.getDouble("etDoDesign");
            }
        }
        if (json.containsKey("etDoChange")) {
            if(RegexUtil.isNumber(json.getString("etDoChange"))) {
                etDoChange = json.getDouble("etDoChange");
            }
        }
        if (json.containsKey("etUpDesign")) {
            if(RegexUtil.isNumber(json.getString("etUpDesign"))) {
                etUpDesign = json.getDouble("etUpDesign");
            }
        }
        if (json.containsKey("etUpChange")) {
            if(RegexUtil.isNumber(json.getString("etUpChange"))) {
                etUpChange = json.getDouble("etUpChange");
            }
        }
        if (json.containsKey("etDownDesign")) {
            if(RegexUtil.isNumber(json.getString("etDownDesign"))) {
                etDownDesign = json.getDouble("etDownDesign");
            }
        }
        if (json.containsKey("etDownChange")) {
            if(RegexUtil.isNumber(json.getString("etDownChange"))) {
                etDownChange = json.getDouble("etDownChange");
            }
        }
        if (json.containsKey("etInfo")) {
            etInfo = json.getString("etInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(etId == null) {
            etId = -1;
        }
        map.put("etId", etId);
        map.put("etCode", etCode);
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
            map.put("etName", partItem.getPiName());
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
        map.put("etDate", DateConverter.dateToStr(etDate));
        if(etName != null) {
            map.put("etName", etName);
        }
        map.put("etUnit", etUnit);
        if(etDoDesign == null) {
            etDoDesign = -1.0;
        }
        map.put("etDoDesign", etDoDesign);
        if(etDoChange == null) {
            etDoChange = -1.0;
        }
        map.put("etDoChange", etDoChange);
        if(etUpDesign == null) {
            etUpDesign = -1.0;
        }
        map.put("etUpDesign", etUpDesign);
        if(etUpChange == null) {
            etUpChange = -1.0;
        }
        map.put("etUpChange", etUpChange);
        if(etDownDesign == null) {
            etDownDesign = -1.0;
        }
        map.put("etDownDesign", etDownDesign);
        if(etDownChange == null) {
            etDownChange = -1.0;
        }
        map.put("etDownChange", etDownChange);
        map.put("etInfo", etInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(etId == null) {
            etId = -1;
        }
        json.put("etId", etId);
        json.put("etCode", etCode);
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
        json.put("etDate", DateConverter.dateToStr(etDate));
        json.put("etName", etName);
        json.put("etUnit", etUnit);
        if(etDoDesign == null) {
            etDoDesign = -1.0;
        }
        json.put("etDoDesign", etDoDesign);
        if(etDoChange == null) {
            etDoChange = -1.0;
        }
        json.put("etDoChange", etDoChange);
        if(etUpDesign == null) {
            etUpDesign = -1.0;
        }
        json.put("etUpDesign", etUpDesign);
        if(etUpChange == null) {
            etUpChange = -1.0;
        }
        json.put("etUpChange", etUpChange);
        if(etDownDesign == null) {
            etDownDesign = -1.0;
        }
        json.put("etDownDesign", etDownDesign);
        if(etDownChange == null) {
            etDownChange = -1.0;
        }
        json.put("etDownChange", etDownChange);
        json.put("etInfo", etInfo);

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
        Equipment other = (Equipment) that;
        return (this.getEtId() == null ? other.getEtId() == null : this.getEtId().equals(other.getEtId()))
                && (this.getEtCode() == null ? other.getEtCode() == null : this.getEtCode().equals(other.getEtCode()))
                && (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
                && (this.getPiName() == null ? other.getPiName() == null : this.getPiName().equals(other.getPiName()))
                && (this.getPartItem() == null ? other.getPartItem() == null : this.getPartItem().equals(other.getPartItem()))
                && (this.getClId() == null ? other.getClId() == null : this.getClId().equals(other.getClId()))
                && (this.getClCode() == null ? other.getClCode() == null : this.getClCode().equals(other.getClCode()))
                && (this.getCostLayer() == null ? other.getCostLayer() == null : this.getCostLayer().equals(other.getCostLayer()))
                && (this.getEtDate() == null ? other.getEtDate() == null : this.getEtDate().equals(other.getEtDate()))
                && (this.getEtName() == null ? other.getEtName() == null : this.getEtName().equals(other.getEtName()))
                && (this.getEtUnit() == null ? other.getEtUnit() == null : this.getEtUnit().equals(other.getEtUnit()))
                && (this.getEtDoDesign() == null ? other.getEtDoDesign() == null : this.getEtDoDesign().equals(other.getEtDoDesign()))
                && (this.getEtDoChange() == null ? other.getEtDoChange() == null : this.getEtDoChange().equals(other.getEtDoChange()))
                && (this.getEtUpDesign() == null ? other.getEtUpDesign() == null : this.getEtUpDesign().equals(other.getEtUpDesign()))
                && (this.getEtUpChange() == null ? other.getEtUpChange() == null : this.getEtUpChange().equals(other.getEtUpChange()))
                && (this.getEtDownDesign() == null ? other.getEtDownDesign() == null : this.getEtDownDesign().equals(other.getEtDownDesign()))
                && (this.getEtDownChange() == null ? other.getEtDownChange() == null : this.getEtDownChange().equals(other.getEtDownChange()))
                && (this.getEtInfo() == null ? other.getEtInfo() == null : this.getEtInfo().equals(other.getEtInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEtId() == null) ? 0 : getEtId().hashCode());
        result = prime * result + ((getEtCode() == null) ? 0 : getEtCode().hashCode());
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiName() == null) ? 0 : getPiName().hashCode());
        result = prime * result + ((getPartItem() == null) ? 0 : getPartItem().hashCode());
        result = prime * result + ((getClId() == null) ? 0 : getClId().hashCode());
        result = prime * result + ((getClCode() == null) ? 0 : getClCode().hashCode());
        result = prime * result + ((getCostLayer() == null) ? 0 : getCostLayer().hashCode());
        result = prime * result + ((getEtDate() == null) ? 0 : getEtDate().hashCode());
        result = prime * result + ((getEtName() == null) ? 0 : getEtName().hashCode());
        result = prime * result + ((getEtUnit() == null) ? 0 : getEtUnit().hashCode());
        result = prime * result + ((getEtDoDesign() == null) ? 0 : getEtDoDesign().hashCode());
        result = prime * result + ((getEtDoChange() == null) ? 0 : getEtDoChange().hashCode());
        result = prime * result + ((getEtUpDesign() == null) ? 0 : getEtUpDesign().hashCode());
        result = prime * result + ((getEtUpChange() == null) ? 0 : getEtUpChange().hashCode());
        result = prime * result + ((getEtDownDesign() == null) ? 0 : getEtDownDesign().hashCode());
        result = prime * result + ((getEtDownChange() == null) ? 0 : getEtDownChange().hashCode());
        result = prime * result + ((getEtInfo() == null) ? 0 : getEtInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", etId=").append(etId);
        sb.append(", etCode=").append(etCode);
        sb.append(", piId=").append(piId);
        sb.append(", piName=").append(piName);
        sb.append(", partItem=").append(partItem);
        sb.append(", clId=").append(clId);
        sb.append(", clCode=").append(clCode);
        sb.append(", costLayer=").append(costLayer);
        sb.append(", etDate=").append(etDate);
        sb.append(", etName=").append(etName);
        sb.append(", etUnit=").append(etUnit);
        sb.append(", etDoDesign=").append(etDoDesign);
        sb.append(", etDoChange=").append(etDoChange);
        sb.append(", etUpDesign=").append(etUpDesign);
        sb.append(", etUpChange=").append(etUpChange);
        sb.append(", etDownDesign=").append(etDownDesign);
        sb.append(", etDownChange=").append(etDownChange);
        sb.append(", etInfo=").append(etInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}