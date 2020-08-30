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
public class Temporary implements Serializable {
    /**
     * 数量ID
     */
    private Integer tyId;

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
    private String tyCode;

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
    private Date tyDate;

    /**
     * 项目名称
     */
    private String tyName;

    /**
     * 计量单位
     */
    private String tyUnit;

    /**
     * 已完设计数量
     */
    private Double tyDoDesign;

    /**
     * 已完变更数量
     */
    private Double tyDoChange;

    /**
     * 对上计价设计数量
     */
    private Double tyUpDesign;

    /**
     * 对上计价变更数量
     */
    private Double tyUpChange;

    /**
     * 对下计价设计数量
     */
    private Double tyDownDesign;

    /**
     * 对下计价变更数量
     */
    private Double tyDownChange;

    /**
     * 数量备注
     */
    private String tyInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public Temporary() {
    }

    /**
     * 部分构造方法
     */
    public Temporary(Integer tyId, PartItem partItem) {
        this.tyId = tyId;
        this.partItem = partItem;
        this.piId = partItem.getPiId();
        this.piName = partItem.getPiName();
    }

    public Temporary(Integer tyId, CostLayer costLayer) {
        this.tyId = tyId;
        this.costLayer = costLayer;
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    /**
     * 完整构造方法
     */
    public Temporary(Integer tyId, String tyCode, Integer piId, String piName, Integer clId, String clCode,
                    Date tyDate, String tyName, String tyUnit, Double tyDoDesign, Double tyDoChange,
                    Double tyUpDesign, Double tyUpChange, Double tyDownDesign, Double tyDownChange, String tyInfo) {
        this.tyId = tyId;
        this.tyCode = tyCode;
        this.piId = piId;
        this.piName = piName;
        this.clId = clId;
        this.clCode = clCode;
        this.tyDate = tyDate;
        this.tyName = tyName;
        this.tyUnit = tyUnit;
        this.tyDoDesign = tyDoDesign;
        this.tyDoChange = tyDoChange;
        this.tyUpDesign = tyUpDesign;
        this.tyUpChange = tyUpChange;
        this.tyDownDesign = tyDownDesign;
        this.tyDownChange = tyDownChange;
        this.tyInfo = tyInfo;
    }
//    @JsonCreator
//    public Temporary(@JsonProperty("tyId") Integer tyId, @JsonProperty("tyCode") String tyCode,
//                    @JsonProperty("piId") Integer piId, @JsonProperty("piName") String piName,
//                    @JsonProperty("clId") Integer clId, @JsonProperty("clCode") String clCode,
//                    @JsonProperty("tyDate") Date tyDate, @JsonProperty("tyName") String tyName,
//                    @JsonProperty("tyUnit") String tyUnit, @JsonProperty("tyDoDesign") Double tyDoDesign,
//                    @JsonProperty("tyDoChange") Double tyDoChange, @JsonProperty("tyUpDesign") Double tyUpDesign, @JsonProperty("tyUpChange") Double tyUpChange,
//                    @JsonProperty("tyDownDesign") Double tyDownDesign, @JsonProperty("tyDownChange") Double tyDownChange, @JsonProperty("tyInfo") String tyInfo) {
//        this.tyId = tyId;
//        this.tyCode = tyCode;
//        this.piId = piId;
//        this.piName = piName;
//        this.clId = clId;
//        this.clCode = clCode;
//        this.tyDate = tyDate;
//        this.tyName = tyName;
//        this.tyUnit = tyUnit;
//        this.tyDoDesign = tyDoDesign;
//        this.tyDoChange = tyDoChange;
//        this.tyUpDesign = tyUpDesign;
//        this.tyUpChange = tyUpChange;
//        this.tyDownDesign = tyDownDesign;
//        this.tyDownChange = tyDownChange;
//        this.tyInfo = tyInfo;
//    }

    public Integer getTyId() {
        return tyId;
    }

    public void setTyId(Integer tyId) {
        this.tyId = tyId;
    }

    public String getTyCode() {
        return tyCode;
    }

    public void setTyCode(String tyCode) {
        this.tyCode = tyCode;
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

    public Date getTyDate() {
        return tyDate;
    }

    public void setTyDate(Date tyDate) {
        this.tyDate = tyDate;
    }

    public String getTyName() {
        return tyName;
    }

    public void setTyName(String tyName) {
        this.tyName = tyName;
    }

    public String getTyUnit() {
        return tyUnit;
    }

    public void setTyUnit(String tyUnit) {
        this.tyUnit = tyUnit;
    }

    public Double getTyDoDesign() {
        return tyDoDesign;
    }

    public void setTyDoDesign(Double tyDoDesign) {
        this.tyDoDesign = tyDoDesign;
    }

    public Double getTyDoChange() {
        return tyDoChange;
    }

    public void setTyDoChange(Double tyDoChange) {
        this.tyDoChange = tyDoChange;
    }

    public Double getTyUpDesign() {
        return tyUpDesign;
    }

    public void setTyUpDesign(Double tyUpDesign) {
        this.tyUpDesign = tyUpDesign;
    }

    public Double getTyUpChange() {
        return tyUpChange;
    }

    public void setTyUpChange(Double tyUpChange) {
        this.tyUpChange = tyUpChange;
    }

    public Double getTyDownDesign() {
        return tyDownDesign;
    }

    public void setTyDownDesign(Double tyDownDesign) {
        this.tyDownDesign = tyDownDesign;
    }

    public Double getTyDownChange() {
        return tyDownChange;
    }

    public void setTyDownChange(Double tyDownChange) {
        this.tyDownChange = tyDownChange;
    }

    public String getTyInfo() {
        return tyInfo;
    }

    public void setTyInfo(String tyInfo) {
        this.tyInfo = tyInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("tyId")) {
            if(RegexUtil.isNumber(_value)) {
                tyId = Integer.parseInt(_value);
            }
        }
        if (field.equals("tyCode")) {
            tyCode = _value;
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
        if (field.equals("tyDate")) {
            tyDate = DateConverter.strToDate(_value);
        }
        if (field.equals("tyName")) {
            tyName = _value;
        }
        if (field.equals("tyUnit")) {
            tyUnit = _value;
        }
        if (field.equals("tyDoDesign")) {
            if(RegexUtil.isNumber(_value)) {
                tyDoDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("tyDoChange")) {
            if(RegexUtil.isNumber(_value)) {
                tyDoChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("tyUpDesign")) {
            if(RegexUtil.isNumber(_value)) {
                tyUpDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("tyUpChange")) {
            if(RegexUtil.isNumber(_value)) {
                tyUpChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("tyDownDesign")) {
            if(RegexUtil.isNumber(_value)) {
                tyDownDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("tyDownChange")) {
            if(RegexUtil.isNumber(_value)) {
                tyDownChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("tyInfo")) {
            tyInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("tyId")) {
            String value = map.get("tyId").toString();
            if(RegexUtil.isNumber(value)) {
                tyId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("tyCode")) {
            tyCode = map.get("tyCode").toString();
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
        if (map.containsKey("tyDate")) {
            tyDate = DateConverter.strToDate(map.get("tyDate").toString());
        }
        if (map.containsKey("tyName")) {
            tyName = map.get("tyName").toString();
        }
        if (map.containsKey("tyUnit")) {
            tyUnit = map.get("tyUnit").toString();
        }
        if (map.containsKey("tyDoDesign")) {
            String value = map.get("tyDoDesign").toString();
            if(RegexUtil.isNumber(value)) {
                tyDoDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("tyDoChange")) {
            String value = map.get("tyDoChange").toString();
            if(RegexUtil.isNumber(value)) {
                tyDoChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("tyUpDesign")) {
            String value = map.get("tyUpDesign").toString();
            if(RegexUtil.isNumber(value)) {
                tyUpDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("tyUpChange")) {
            String value = map.get("tyUpChange").toString();
            if(RegexUtil.isNumber(value)) {
                tyUpChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("tyDownDesign")) {
            String value = map.get("tyDownDesign").toString();
            if(RegexUtil.isNumber(value)) {
                tyDownDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("tyDownChange")) {
            String value = map.get("tyDownChange").toString();
            if(RegexUtil.isNumber(value)) {
                tyDownChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("tyInfo")) {
            tyInfo = map.get("tyInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("tyId")) {
            if(RegexUtil.isNumber(json.getString("tyId"))) {
                tyId = json.getInteger("tyId");
            }
        }
        if (json.containsKey("tyCode")) {
            tyCode = json.getString("tyCode");
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
        if (json.containsKey("tyDate")) {
            tyDate = DateConverter.strToDate(json.getString("tyDate"));
        }
        if (json.containsKey("tyName")) {
            tyName = json.getString("tyName");
        }
        if (json.containsKey("tyUnit")) {
            tyUnit = json.getString("tyUnit");
        }
        if (json.containsKey("tyDoDesign")) {
            if(RegexUtil.isNumber(json.getString("tyDoDesign"))) {
                tyDoDesign = json.getDouble("tyDoDesign");
            }
        }
        if (json.containsKey("tyDoChange")) {
            if(RegexUtil.isNumber(json.getString("tyDoChange"))) {
                tyDoChange = json.getDouble("tyDoChange");
            }
        }
        if (json.containsKey("tyUpDesign")) {
            if(RegexUtil.isNumber(json.getString("tyUpDesign"))) {
                tyUpDesign = json.getDouble("tyUpDesign");
            }
        }
        if (json.containsKey("tyUpChange")) {
            if(RegexUtil.isNumber(json.getString("tyUpChange"))) {
                tyUpChange = json.getDouble("tyUpChange");
            }
        }
        if (json.containsKey("tyDownDesign")) {
            if(RegexUtil.isNumber(json.getString("tyDownDesign"))) {
                tyDownDesign = json.getDouble("tyDownDesign");
            }
        }
        if (json.containsKey("tyDownChange")) {
            if(RegexUtil.isNumber(json.getString("tyDownChange"))) {
                tyDownChange = json.getDouble("tyDownChange");
            }
        }
        if (json.containsKey("tyInfo")) {
            tyInfo = json.getString("tyInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(tyId == null) {
            tyId = -1;
        }
        map.put("tyId", tyId);
        map.put("tyCode", tyCode);
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
            map.put("tyName", partItem.getPiName());
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
        map.put("tyDate", DateConverter.dateToStr(tyDate));
        if(tyName != null) {
            map.put("tyName", tyName);
        }
        map.put("tyUnit", tyUnit);
        if(tyDoDesign == null) {
            tyDoDesign = -1.0;
        }
        map.put("tyDoDesign", tyDoDesign);
        if(tyDoChange == null) {
            tyDoChange = -1.0;
        }
        map.put("tyDoChange", tyDoChange);
        if(tyUpDesign == null) {
            tyUpDesign = -1.0;
        }
        map.put("tyUpDesign", tyUpDesign);
        if(tyUpChange == null) {
            tyUpChange = -1.0;
        }
        map.put("tyUpChange", tyUpChange);
        if(tyDownDesign == null) {
            tyDownDesign = -1.0;
        }
        map.put("tyDownDesign", tyDownDesign);
        if(tyDownChange == null) {
            tyDownChange = -1.0;
        }
        map.put("tyDownChange", tyDownChange);
        map.put("tyInfo", tyInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(tyId == null) {
            tyId = -1;
        }
        json.put("tyId", tyId);
        json.put("tyCode", tyCode);
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
        json.put("tyDate", DateConverter.dateToStr(tyDate));
        json.put("tyName", tyName);
        json.put("tyUnit", tyUnit);
        if(tyDoDesign == null) {
            tyDoDesign = -1.0;
        }
        json.put("tyDoDesign", tyDoDesign);
        if(tyDoChange == null) {
            tyDoChange = -1.0;
        }
        json.put("tyDoChange", tyDoChange);
        if(tyUpDesign == null) {
            tyUpDesign = -1.0;
        }
        json.put("tyUpDesign", tyUpDesign);
        if(tyUpChange == null) {
            tyUpChange = -1.0;
        }
        json.put("tyUpChange", tyUpChange);
        if(tyDownDesign == null) {
            tyDownDesign = -1.0;
        }
        json.put("tyDownDesign", tyDownDesign);
        if(tyDownChange == null) {
            tyDownChange = -1.0;
        }
        json.put("tyDownChange", tyDownChange);
        json.put("tyInfo", tyInfo);

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
        Temporary other = (Temporary) that;
        return (this.getTyId() == null ? other.getTyId() == null : this.getTyId().equals(other.getTyId()))
                && (this.getTyCode() == null ? other.getTyCode() == null : this.getTyCode().equals(other.getTyCode()))
                && (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
                && (this.getPiName() == null ? other.getPiName() == null : this.getPiName().equals(other.getPiName()))
                && (this.getPartItem() == null ? other.getPartItem() == null : this.getPartItem().equals(other.getPartItem()))
                && (this.getClId() == null ? other.getClId() == null : this.getClId().equals(other.getClId()))
                && (this.getClCode() == null ? other.getClCode() == null : this.getClCode().equals(other.getClCode()))
                && (this.getCostLayer() == null ? other.getCostLayer() == null : this.getCostLayer().equals(other.getCostLayer()))
                && (this.getTyDate() == null ? other.getTyDate() == null : this.getTyDate().equals(other.getTyDate()))
                && (this.getTyName() == null ? other.getTyName() == null : this.getTyName().equals(other.getTyName()))
                && (this.getTyUnit() == null ? other.getTyUnit() == null : this.getTyUnit().equals(other.getTyUnit()))
                && (this.getTyDoDesign() == null ? other.getTyDoDesign() == null : this.getTyDoDesign().equals(other.getTyDoDesign()))
                && (this.getTyDoChange() == null ? other.getTyDoChange() == null : this.getTyDoChange().equals(other.getTyDoChange()))
                && (this.getTyUpDesign() == null ? other.getTyUpDesign() == null : this.getTyUpDesign().equals(other.getTyUpDesign()))
                && (this.getTyUpChange() == null ? other.getTyUpChange() == null : this.getTyUpChange().equals(other.getTyUpChange()))
                && (this.getTyDownDesign() == null ? other.getTyDownDesign() == null : this.getTyDownDesign().equals(other.getTyDownDesign()))
                && (this.getTyDownChange() == null ? other.getTyDownChange() == null : this.getTyDownChange().equals(other.getTyDownChange()))
                && (this.getTyInfo() == null ? other.getTyInfo() == null : this.getTyInfo().equals(other.getTyInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTyId() == null) ? 0 : getTyId().hashCode());
        result = prime * result + ((getTyCode() == null) ? 0 : getTyCode().hashCode());
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiName() == null) ? 0 : getPiName().hashCode());
        result = prime * result + ((getPartItem() == null) ? 0 : getPartItem().hashCode());
        result = prime * result + ((getClId() == null) ? 0 : getClId().hashCode());
        result = prime * result + ((getClCode() == null) ? 0 : getClCode().hashCode());
        result = prime * result + ((getCostLayer() == null) ? 0 : getCostLayer().hashCode());
        result = prime * result + ((getTyDate() == null) ? 0 : getTyDate().hashCode());
        result = prime * result + ((getTyName() == null) ? 0 : getTyName().hashCode());
        result = prime * result + ((getTyUnit() == null) ? 0 : getTyUnit().hashCode());
        result = prime * result + ((getTyDoDesign() == null) ? 0 : getTyDoDesign().hashCode());
        result = prime * result + ((getTyDoChange() == null) ? 0 : getTyDoChange().hashCode());
        result = prime * result + ((getTyUpDesign() == null) ? 0 : getTyUpDesign().hashCode());
        result = prime * result + ((getTyUpChange() == null) ? 0 : getTyUpChange().hashCode());
        result = prime * result + ((getTyDownDesign() == null) ? 0 : getTyDownDesign().hashCode());
        result = prime * result + ((getTyDownChange() == null) ? 0 : getTyDownChange().hashCode());
        result = prime * result + ((getTyInfo() == null) ? 0 : getTyInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tyId=").append(tyId);
        sb.append(", tyCode=").append(tyCode);
        sb.append(", piId=").append(piId);
        sb.append(", piName=").append(piName);
        sb.append(", partItem=").append(partItem);
        sb.append(", clId=").append(clId);
        sb.append(", clCode=").append(clCode);
        sb.append(", costLayer=").append(costLayer);
        sb.append(", tyDate=").append(tyDate);
        sb.append(", tyName=").append(tyName);
        sb.append(", tyUnit=").append(tyUnit);
        sb.append(", tyDoDesign=").append(tyDoDesign);
        sb.append(", tyDoChange=").append(tyDoChange);
        sb.append(", tyUpDesign=").append(tyUpDesign);
        sb.append(", tyUpChange=").append(tyUpChange);
        sb.append(", tyDownDesign=").append(tyDownDesign);
        sb.append(", tyDownChange=").append(tyDownChange);
        sb.append(", tyInfo=").append(tyInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}