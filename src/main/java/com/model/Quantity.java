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
public class Quantity implements Serializable {
    /**
     * 数量ID
     */
    private Integer qyId;

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
    private String qyCode;

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
    private Date qyDate;

    /**
     * 项目名称
     */
    private String qyName;

    /**
     * 计量单位
     */
    private String qyUnit;

    /**
     * 已完设计数量
     */
    private Double qyDoDesign;

    /**
     * 已完变更数量
     */
    private Double qyDoChange;

    /**
     * 对上计价设计数量
     */
    private Double qyUpDesign;

    /**
     * 对上计价变更数量
     */
    private Double qyUpChange;

    /**
     * 对下计价设计数量
     */
    private Double qyDownDesign;

    /**
     * 对下计价变更数量
     */
    private Double qyDownChange;

    /**
     * 数量备注
     */
    private String qyInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public Quantity() {
    }

    /**
     * 部分构造方法
     */
    public Quantity(Integer qyId, PartItem partItem) {
        this.qyId = qyId;
        this.partItem = partItem;
        this.piId = partItem.getPiId();
        this.piName = partItem.getPiName();
    }

    public Quantity(Integer qyId, CostLayer costLayer) {
        this.qyId = qyId;
        this.costLayer = costLayer;
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    /**
     * 完整构造方法
     */
    public Quantity(Integer qyId, String qyCode, Integer piId, String piName, Integer clId, String clCode,
                    Date qyDate, String qyName, String qyUnit, Double qyDoDesign, Double qyDoChange,
                    Double qyUpDesign, Double qyUpChange, Double qyDownDesign, Double qyDownChange, String qyInfo) {
        this.qyId = qyId;
        this.qyCode = qyCode;
        this.piId = piId;
        this.piName = piName;
        this.clId = clId;
        this.clCode = clCode;
        this.qyDate = qyDate;
        this.qyName = qyName;
        this.qyUnit = qyUnit;
        this.qyDoDesign = qyDoDesign;
        this.qyDoChange = qyDoChange;
        this.qyUpDesign = qyUpDesign;
        this.qyUpChange = qyUpChange;
        this.qyDownDesign = qyDownDesign;
        this.qyDownChange = qyDownChange;
        this.qyInfo = qyInfo;
    }
//    @JsonCreator
//    public Quantity(@JsonProperty("qyId") Integer qyId, @JsonProperty("qyCode") String qyCode,
//                    @JsonProperty("piId") Integer piId, @JsonProperty("piName") String piName,
//                    @JsonProperty("clId") Integer clId, @JsonProperty("clCode") String clCode,
//                    @JsonProperty("qyDate") Date qyDate, @JsonProperty("qyName") String qyName,
//                    @JsonProperty("qyUnit") String qyUnit, @JsonProperty("qyDoDesign") Double qyDoDesign,
//                    @JsonProperty("qyDoChange") Double qyDoChange, @JsonProperty("qyUpDesign") Double qyUpDesign, @JsonProperty("qyUpChange") Double qyUpChange,
//                    @JsonProperty("qyDownDesign") Double qyDownDesign, @JsonProperty("qyDownChange") Double qyDownChange, @JsonProperty("qyInfo") String qyInfo) {
//        this.qyId = qyId;
//        this.qyCode = qyCode;
//        this.piId = piId;
//        this.piName = piName;
//        this.clId = clId;
//        this.clCode = clCode;
//        this.qyDate = qyDate;
//        this.qyName = qyName;
//        this.qyUnit = qyUnit;
//        this.qyDoDesign = qyDoDesign;
//        this.qyDoChange = qyDoChange;
//        this.qyUpDesign = qyUpDesign;
//        this.qyUpChange = qyUpChange;
//        this.qyDownDesign = qyDownDesign;
//        this.qyDownChange = qyDownChange;
//        this.qyInfo = qyInfo;
//    }

    public Integer getQyId() {
        return qyId;
    }

    public void setQyId(Integer qyId) {
        this.qyId = qyId;
    }

    public String getQyCode() {
        return qyCode;
    }

    public void setQyCode(String qyCode) {
        this.qyCode = qyCode;
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

    public Date getQyDate() {
        return qyDate;
    }

    public void setQyDate(Date qyDate) {
        this.qyDate = qyDate;
    }

    public String getQyName() {
        return qyName;
    }

    public void setQyName(String qyName) {
        this.qyName = qyName;
    }

    public String getQyUnit() {
        return qyUnit;
    }

    public void setQyUnit(String qyUnit) {
        this.qyUnit = qyUnit;
    }

    public Double getQyDoDesign() {
        return qyDoDesign;
    }

    public void setQyDoDesign(Double qyDoDesign) {
        this.qyDoDesign = qyDoDesign;
    }

    public Double getQyDoChange() {
        return qyDoChange;
    }

    public void setQyDoChange(Double qyDoChange) {
        this.qyDoChange = qyDoChange;
    }

    public Double getQyUpDesign() {
        return qyUpDesign;
    }

    public void setQyUpDesign(Double qyUpDesign) {
        this.qyUpDesign = qyUpDesign;
    }

    public Double getQyUpChange() {
        return qyUpChange;
    }

    public void setQyUpChange(Double qyUpChange) {
        this.qyUpChange = qyUpChange;
    }

    public Double getQyDownDesign() {
        return qyDownDesign;
    }

    public void setQyDownDesign(Double qyDownDesign) {
        this.qyDownDesign = qyDownDesign;
    }

    public Double getQyDownChange() {
        return qyDownChange;
    }

    public void setQyDownChange(Double qyDownChange) {
        this.qyDownChange = qyDownChange;
    }

    public String getQyInfo() {
        return qyInfo;
    }

    public void setQyInfo(String qyInfo) {
        this.qyInfo = qyInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("qyId")) {
            if(RegexUtil.isNumber(_value)) {
                qyId = Integer.parseInt(_value);
            }
        }
        if (field.equals("qyCode")) {
            qyCode = _value;
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
        if (field.equals("qyDate")) {
            qyDate = DateConverter.strToDate(_value);
        }
        if (field.equals("qyName")) {
            qyName = _value;
        }
        if (field.equals("qyUnit")) {
            qyUnit = _value;
        }
        if (field.equals("qyDoDesign")) {
            if(RegexUtil.isNumber(_value)) {
                qyDoDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("qyDoChange")) {
            if(RegexUtil.isNumber(_value)) {
                qyDoChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("qyUpDesign")) {
            if(RegexUtil.isNumber(_value)) {
                qyUpDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("qyUpChange")) {
            if(RegexUtil.isNumber(_value)) {
                qyUpChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("qyDownDesign")) {
            if(RegexUtil.isNumber(_value)) {
                qyDownDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("qyDownChange")) {
            if(RegexUtil.isNumber(_value)) {
                qyDownChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("qyInfo")) {
            qyInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("qyId")) {
            String value = map.get("qyId").toString();
            if(RegexUtil.isNumber(value)) {
                qyId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("qyCode")) {
            qyCode = map.get("qyCode").toString();
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
        if (map.containsKey("qyDate")) {
            qyDate = DateConverter.strToDate(map.get("qyDate").toString());
        }
        if (map.containsKey("qyName")) {
            qyName = map.get("qyName").toString();
        }
        if (map.containsKey("qyUnit")) {
            qyUnit = map.get("qyUnit").toString();
        }
        if (map.containsKey("qyDoDesign")) {
            String value = map.get("qyDoDesign").toString();
            if(RegexUtil.isNumber(value)) {
                qyDoDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("qyDoChange")) {
            String value = map.get("qyDoChange").toString();
            if(RegexUtil.isNumber(value)) {
                qyDoChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("qyUpDesign")) {
            String value = map.get("qyUpDesign").toString();
            if(RegexUtil.isNumber(value)) {
                qyUpDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("qyUpChange")) {
            String value = map.get("qyUpChange").toString();
            if(RegexUtil.isNumber(value)) {
                qyUpChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("qyDownDesign")) {
            String value = map.get("qyDownDesign").toString();
            if(RegexUtil.isNumber(value)) {
                qyDownDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("qyDownChange")) {
            String value = map.get("qyDownChange").toString();
            if(RegexUtil.isNumber(value)) {
                qyDownChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("qyInfo")) {
            qyInfo = map.get("qyInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("qyId")) {
            if(RegexUtil.isNumber(json.getString("qyId"))) {
                qyId = json.getInteger("qyId");
            }
        }
        if (json.containsKey("qyCode")) {
            qyCode = json.getString("qyCode");
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
        if (json.containsKey("qyDate")) {
            qyDate = DateConverter.strToDate(json.getString("qyDate"));
        }
        if (json.containsKey("qyName")) {
            qyName = json.getString("qyName");
        }
        if (json.containsKey("qyUnit")) {
            qyUnit = json.getString("qyUnit");
        }
        if (json.containsKey("qyDoDesign")) {
            if(RegexUtil.isNumber(json.getString("qyDoDesign"))) {
                qyDoDesign = json.getDouble("qyDoDesign");
            }
        }
        if (json.containsKey("qyDoChange")) {
            if(RegexUtil.isNumber(json.getString("qyDoChange"))) {
                qyDoChange = json.getDouble("qyDoChange");
            }
        }
        if (json.containsKey("qyUpDesign")) {
            if(RegexUtil.isNumber(json.getString("qyUpDesign"))) {
                qyUpDesign = json.getDouble("qyUpDesign");
            }
        }
        if (json.containsKey("qyUpChange")) {
            if(RegexUtil.isNumber(json.getString("qyUpChange"))) {
                qyUpChange = json.getDouble("qyUpChange");
            }
        }
        if (json.containsKey("qyDownDesign")) {
            if(RegexUtil.isNumber(json.getString("qyDownDesign"))) {
                qyDownDesign = json.getDouble("qyDownDesign");
            }
        }
        if (json.containsKey("qyDownChange")) {
            if(RegexUtil.isNumber(json.getString("qyDownChange"))) {
                qyDownChange = json.getDouble("qyDownChange");
            }
        }
        if (json.containsKey("qyInfo")) {
            qyInfo = json.getString("qyInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(qyId == null) {
            qyId = -1;
        }
        map.put("qyId", qyId);
        map.put("qyCode", qyCode);
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
            map.put("qyName", partItem.getPiName());
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
        map.put("qyDate", DateConverter.dateToStr(qyDate));
        if(qyName != null) {
            map.put("qyName", qyName);
        }
        map.put("qyUnit", qyUnit);
        if(qyDoDesign == null) {
            qyDoDesign = -1.0;
        }
        map.put("qyDoDesign", qyDoDesign);
        if(qyDoChange == null) {
            qyDoChange = -1.0;
        }
        map.put("qyDoChange", qyDoChange);
        if(qyUpDesign == null) {
            qyUpDesign = -1.0;
        }
        map.put("qyUpDesign", qyUpDesign);
        if(qyUpChange == null) {
            qyUpChange = -1.0;
        }
        map.put("qyUpChange", qyUpChange);
        if(qyDownDesign == null) {
            qyDownDesign = -1.0;
        }
        map.put("qyDownDesign", qyDownDesign);
        if(qyDownChange == null) {
            qyDownChange = -1.0;
        }
        map.put("qyDownChange", qyDownChange);
        map.put("qyInfo", qyInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(qyId == null) {
            qyId = -1;
        }
        json.put("qyId", qyId);
        json.put("qyCode", qyCode);
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
        json.put("qyDate", DateConverter.dateToStr(qyDate));
        json.put("qyName", qyName);
        json.put("qyUnit", qyUnit);
        if(qyDoDesign == null) {
            qyDoDesign = -1.0;
        }
        json.put("qyDoDesign", qyDoDesign);
        if(qyDoChange == null) {
            qyDoChange = -1.0;
        }
        json.put("qyDoChange", qyDoChange);
        if(qyUpDesign == null) {
            qyUpDesign = -1.0;
        }
        json.put("qyUpDesign", qyUpDesign);
        if(qyUpChange == null) {
            qyUpChange = -1.0;
        }
        json.put("qyUpChange", qyUpChange);
        if(qyDownDesign == null) {
            qyDownDesign = -1.0;
        }
        json.put("qyDownDesign", qyDownDesign);
        if(qyDownChange == null) {
            qyDownChange = -1.0;
        }
        json.put("qyDownChange", qyDownChange);
        json.put("qyInfo", qyInfo);

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
        Quantity other = (Quantity) that;
        return (this.getQyId() == null ? other.getQyId() == null : this.getQyId().equals(other.getQyId()))
                && (this.getQyCode() == null ? other.getQyCode() == null : this.getQyCode().equals(other.getQyCode()))
                && (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
                && (this.getPiName() == null ? other.getPiName() == null : this.getPiName().equals(other.getPiName()))
                && (this.getPartItem() == null ? other.getPartItem() == null : this.getPartItem().equals(other.getPartItem()))
                && (this.getClId() == null ? other.getClId() == null : this.getClId().equals(other.getClId()))
                && (this.getClCode() == null ? other.getClCode() == null : this.getClCode().equals(other.getClCode()))
                && (this.getCostLayer() == null ? other.getCostLayer() == null : this.getCostLayer().equals(other.getCostLayer()))
                && (this.getQyDate() == null ? other.getQyDate() == null : this.getQyDate().equals(other.getQyDate()))
                && (this.getQyName() == null ? other.getQyName() == null : this.getQyName().equals(other.getQyName()))
                && (this.getQyUnit() == null ? other.getQyUnit() == null : this.getQyUnit().equals(other.getQyUnit()))
                && (this.getQyDoDesign() == null ? other.getQyDoDesign() == null : this.getQyDoDesign().equals(other.getQyDoDesign()))
                && (this.getQyDoChange() == null ? other.getQyDoChange() == null : this.getQyDoChange().equals(other.getQyDoChange()))
                && (this.getQyUpDesign() == null ? other.getQyUpDesign() == null : this.getQyUpDesign().equals(other.getQyUpDesign()))
                && (this.getQyUpChange() == null ? other.getQyUpChange() == null : this.getQyUpChange().equals(other.getQyUpChange()))
                && (this.getQyDownDesign() == null ? other.getQyDownDesign() == null : this.getQyDownDesign().equals(other.getQyDownDesign()))
                && (this.getQyDownChange() == null ? other.getQyDownChange() == null : this.getQyDownChange().equals(other.getQyDownChange()))
                && (this.getQyInfo() == null ? other.getQyInfo() == null : this.getQyInfo().equals(other.getQyInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQyId() == null) ? 0 : getQyId().hashCode());
        result = prime * result + ((getQyCode() == null) ? 0 : getQyCode().hashCode());
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiName() == null) ? 0 : getPiName().hashCode());
        result = prime * result + ((getPartItem() == null) ? 0 : getPartItem().hashCode());
        result = prime * result + ((getClId() == null) ? 0 : getClId().hashCode());
        result = prime * result + ((getClCode() == null) ? 0 : getClCode().hashCode());
        result = prime * result + ((getCostLayer() == null) ? 0 : getCostLayer().hashCode());
        result = prime * result + ((getQyDate() == null) ? 0 : getQyDate().hashCode());
        result = prime * result + ((getQyName() == null) ? 0 : getQyName().hashCode());
        result = prime * result + ((getQyUnit() == null) ? 0 : getQyUnit().hashCode());
        result = prime * result + ((getQyDoDesign() == null) ? 0 : getQyDoDesign().hashCode());
        result = prime * result + ((getQyDoChange() == null) ? 0 : getQyDoChange().hashCode());
        result = prime * result + ((getQyUpDesign() == null) ? 0 : getQyUpDesign().hashCode());
        result = prime * result + ((getQyUpChange() == null) ? 0 : getQyUpChange().hashCode());
        result = prime * result + ((getQyDownDesign() == null) ? 0 : getQyDownDesign().hashCode());
        result = prime * result + ((getQyDownChange() == null) ? 0 : getQyDownChange().hashCode());
        result = prime * result + ((getQyInfo() == null) ? 0 : getQyInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qyId=").append(qyId);
        sb.append(", qyCode=").append(qyCode);
        sb.append(", piId=").append(piId);
        sb.append(", piName=").append(piName);
        sb.append(", partItem=").append(partItem);
        sb.append(", clId=").append(clId);
        sb.append(", clCode=").append(clCode);
        sb.append(", costLayer=").append(costLayer);
        sb.append(", qyDate=").append(qyDate);
        sb.append(", qyName=").append(qyName);
        sb.append(", qyUnit=").append(qyUnit);
        sb.append(", qyDoDesign=").append(qyDoDesign);
        sb.append(", qyDoChange=").append(qyDoChange);
        sb.append(", qyUpDesign=").append(qyUpDesign);
        sb.append(", qyUpChange=").append(qyUpChange);
        sb.append(", qyDownDesign=").append(qyDownDesign);
        sb.append(", qyDownChange=").append(qyDownChange);
        sb.append(", qyInfo=").append(qyInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}