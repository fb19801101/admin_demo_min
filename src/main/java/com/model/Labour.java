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
public class Labour implements Serializable {
    /**
     * 数量ID
     */
    private Integer lbId;

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
    private String lbCode;

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
    private Date lbDate;

    /**
     * 项目名称
     */
    private String lbName;

    /**
     * 计量单位
     */
    private String lbUnit;

    /**
     * 已完设计数量
     */
    private Double lbDoDesign;

    /**
     * 已完变更数量
     */
    private Double lbDoChange;

    /**
     * 对上计价设计数量
     */
    private Double lbUpDesign;

    /**
     * 对上计价变更数量
     */
    private Double lbUpChange;

    /**
     * 对下计价设计数量
     */
    private Double lbDownDesign;

    /**
     * 对下计价变更数量
     */
    private Double lbDownChange;

    /**
     * 数量备注
     */
    private String lbInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public Labour() {
    }

    /**
     * 部分构造方法
     */
    public Labour(Integer lbId, PartItem partItem) {
        this.lbId = lbId;
        this.partItem = partItem;
        this.piId = partItem.getPiId();
        this.piName = partItem.getPiName();
    }

    public Labour(Integer lbId, CostLayer costLayer) {
        this.lbId = lbId;
        this.costLayer = costLayer;
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    /**
     * 完整构造方法
     */
    public Labour(Integer lbId, String lbCode, Integer piId, String piName, Integer clId, String clCode,
                    Date lbDate, String lbName, String lbUnit, Double lbDoDesign, Double lbDoChange,
                    Double lbUpDesign, Double lbUpChange, Double lbDownDesign, Double lbDownChange, String lbInfo) {
        this.lbId = lbId;
        this.lbCode = lbCode;
        this.piId = piId;
        this.piName = piName;
        this.clId = clId;
        this.clCode = clCode;
        this.lbDate = lbDate;
        this.lbName = lbName;
        this.lbUnit = lbUnit;
        this.lbDoDesign = lbDoDesign;
        this.lbDoChange = lbDoChange;
        this.lbUpDesign = lbUpDesign;
        this.lbUpChange = lbUpChange;
        this.lbDownDesign = lbDownDesign;
        this.lbDownChange = lbDownChange;
        this.lbInfo = lbInfo;
    }
//    @JsonCreator
//    public Labour(@JsonProperty("lbId") Integer lbId, @JsonProperty("lbCode") String lbCode,
//                    @JsonProperty("piId") Integer piId, @JsonProperty("piName") String piName,
//                    @JsonProperty("clId") Integer clId, @JsonProperty("clCode") String clCode,
//                    @JsonProperty("lbDate") Date lbDate, @JsonProperty("lbName") String lbName,
//                    @JsonProperty("lbUnit") String lbUnit, @JsonProperty("lbDoDesign") Double lbDoDesign,
//                    @JsonProperty("lbDoChange") Double lbDoChange, @JsonProperty("lbUpDesign") Double lbUpDesign, @JsonProperty("lbUpChange") Double lbUpChange,
//                    @JsonProperty("lbDownDesign") Double lbDownDesign, @JsonProperty("lbDownChange") Double lbDownChange, @JsonProperty("lbInfo") String lbInfo) {
//        this.lbId = lbId;
//        this.lbCode = lbCode;
//        this.piId = piId;
//        this.piName = piName;
//        this.clId = clId;
//        this.clCode = clCode;
//        this.lbDate = lbDate;
//        this.lbName = lbName;
//        this.lbUnit = lbUnit;
//        this.lbDoDesign = lbDoDesign;
//        this.lbDoChange = lbDoChange;
//        this.lbUpDesign = lbUpDesign;
//        this.lbUpChange = lbUpChange;
//        this.lbDownDesign = lbDownDesign;
//        this.lbDownChange = lbDownChange;
//        this.lbInfo = lbInfo;
//    }

    public Integer getLbId() {
        return lbId;
    }

    public void setLbId(Integer lbId) {
        this.lbId = lbId;
    }

    public String getLbCode() {
        return lbCode;
    }

    public void setLbCode(String lbCode) {
        this.lbCode = lbCode;
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

    public Date getLbDate() {
        return lbDate;
    }

    public void setLbDate(Date lbDate) {
        this.lbDate = lbDate;
    }

    public String getLbName() {
        return lbName;
    }

    public void setLbName(String lbName) {
        this.lbName = lbName;
    }

    public String getLbUnit() {
        return lbUnit;
    }

    public void setLbUnit(String lbUnit) {
        this.lbUnit = lbUnit;
    }

    public Double getLbDoDesign() {
        return lbDoDesign;
    }

    public void setLbDoDesign(Double lbDoDesign) {
        this.lbDoDesign = lbDoDesign;
    }

    public Double getLbDoChange() {
        return lbDoChange;
    }

    public void setLbDoChange(Double lbDoChange) {
        this.lbDoChange = lbDoChange;
    }

    public Double getLbUpDesign() {
        return lbUpDesign;
    }

    public void setLbUpDesign(Double lbUpDesign) {
        this.lbUpDesign = lbUpDesign;
    }

    public Double getLbUpChange() {
        return lbUpChange;
    }

    public void setLbUpChange(Double lbUpChange) {
        this.lbUpChange = lbUpChange;
    }

    public Double getLbDownDesign() {
        return lbDownDesign;
    }

    public void setLbDownDesign(Double lbDownDesign) {
        this.lbDownDesign = lbDownDesign;
    }

    public Double getLbDownChange() {
        return lbDownChange;
    }

    public void setLbDownChange(Double lbDownChange) {
        this.lbDownChange = lbDownChange;
    }

    public String getLbInfo() {
        return lbInfo;
    }

    public void setLbInfo(String lbInfo) {
        this.lbInfo = lbInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("lbId")) {
            if(RegexUtil.isNumber(_value)) {
                lbId = Integer.parseInt(_value);
            }
        }
        if (field.equals("lbCode")) {
            lbCode = _value;
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
        if (field.equals("lbDate")) {
            lbDate = DateConverter.strToDate(_value);
        }
        if (field.equals("lbName")) {
            lbName = _value;
        }
        if (field.equals("lbUnit")) {
            lbUnit = _value;
        }
        if (field.equals("lbDoDesign")) {
            if(RegexUtil.isNumber(_value)) {
                lbDoDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("lbDoChange")) {
            if(RegexUtil.isNumber(_value)) {
                lbDoChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("lbUpDesign")) {
            if(RegexUtil.isNumber(_value)) {
                lbUpDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("lbUpChange")) {
            if(RegexUtil.isNumber(_value)) {
                lbUpChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("lbDownDesign")) {
            if(RegexUtil.isNumber(_value)) {
                lbDownDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("lbDownChange")) {
            if(RegexUtil.isNumber(_value)) {
                lbDownChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("lbInfo")) {
            lbInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("lbId")) {
            String value = map.get("lbId").toString();
            if(RegexUtil.isNumber(value)) {
                lbId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("lbCode")) {
            lbCode = map.get("lbCode").toString();
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
        if (map.containsKey("lbDate")) {
            lbDate = DateConverter.strToDate(map.get("lbDate").toString());
        }
        if (map.containsKey("lbName")) {
            lbName = map.get("lbName").toString();
        }
        if (map.containsKey("lbUnit")) {
            lbUnit = map.get("lbUnit").toString();
        }
        if (map.containsKey("lbDoDesign")) {
            String value = map.get("lbDoDesign").toString();
            if(RegexUtil.isNumber(value)) {
                lbDoDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("lbDoChange")) {
            String value = map.get("lbDoChange").toString();
            if(RegexUtil.isNumber(value)) {
                lbDoChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("lbUpDesign")) {
            String value = map.get("lbUpDesign").toString();
            if(RegexUtil.isNumber(value)) {
                lbUpDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("lbUpChange")) {
            String value = map.get("lbUpChange").toString();
            if(RegexUtil.isNumber(value)) {
                lbUpChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("lbDownDesign")) {
            String value = map.get("lbDownDesign").toString();
            if(RegexUtil.isNumber(value)) {
                lbDownDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("lbDownChange")) {
            String value = map.get("lbDownChange").toString();
            if(RegexUtil.isNumber(value)) {
                lbDownChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("lbInfo")) {
            lbInfo = map.get("lbInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("lbId")) {
            if(RegexUtil.isNumber(json.getString("lbId"))) {
                lbId = json.getInteger("lbId");
            }
        }
        if (json.containsKey("lbCode")) {
            lbCode = json.getString("lbCode");
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
        if (json.containsKey("lbDate")) {
            lbDate = DateConverter.strToDate(json.getString("lbDate"));
        }
        if (json.containsKey("lbName")) {
            lbName = json.getString("lbName");
        }
        if (json.containsKey("lbUnit")) {
            lbUnit = json.getString("lbUnit");
        }
        if (json.containsKey("lbDoDesign")) {
            if(RegexUtil.isNumber(json.getString("lbDoDesign"))) {
                lbDoDesign = json.getDouble("lbDoDesign");
            }
        }
        if (json.containsKey("lbDoChange")) {
            if(RegexUtil.isNumber(json.getString("lbDoChange"))) {
                lbDoChange = json.getDouble("lbDoChange");
            }
        }
        if (json.containsKey("lbUpDesign")) {
            if(RegexUtil.isNumber(json.getString("lbUpDesign"))) {
                lbUpDesign = json.getDouble("lbUpDesign");
            }
        }
        if (json.containsKey("lbUpChange")) {
            if(RegexUtil.isNumber(json.getString("lbUpChange"))) {
                lbUpChange = json.getDouble("lbUpChange");
            }
        }
        if (json.containsKey("lbDownDesign")) {
            if(RegexUtil.isNumber(json.getString("lbDownDesign"))) {
                lbDownDesign = json.getDouble("lbDownDesign");
            }
        }
        if (json.containsKey("lbDownChange")) {
            if(RegexUtil.isNumber(json.getString("lbDownChange"))) {
                lbDownChange = json.getDouble("lbDownChange");
            }
        }
        if (json.containsKey("lbInfo")) {
            lbInfo = json.getString("lbInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(lbId == null) {
            lbId = -1;
        }
        map.put("lbId", lbId);
        map.put("lbCode", lbCode);
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
            map.put("lbName", partItem.getPiName());
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
        map.put("lbDate", DateConverter.dateToStr(lbDate));
        if(lbName != null) {
            map.put("lbName", lbName);
        }
        map.put("lbUnit", lbUnit);
        if(lbDoDesign == null) {
            lbDoDesign = -1.0;
        }
        map.put("lbDoDesign", lbDoDesign);
        if(lbDoChange == null) {
            lbDoChange = -1.0;
        }
        map.put("lbDoChange", lbDoChange);
        if(lbUpDesign == null) {
            lbUpDesign = -1.0;
        }
        map.put("lbUpDesign", lbUpDesign);
        if(lbUpChange == null) {
            lbUpChange = -1.0;
        }
        map.put("lbUpChange", lbUpChange);
        if(lbDownDesign == null) {
            lbDownDesign = -1.0;
        }
        map.put("lbDownDesign", lbDownDesign);
        if(lbDownChange == null) {
            lbDownChange = -1.0;
        }
        map.put("lbDownChange", lbDownChange);
        map.put("lbInfo", lbInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(lbId == null) {
            lbId = -1;
        }
        json.put("lbId", lbId);
        json.put("lbCode", lbCode);
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
        json.put("lbDate", DateConverter.dateToStr(lbDate));
        json.put("lbName", lbName);
        json.put("lbUnit", lbUnit);
        if(lbDoDesign == null) {
            lbDoDesign = -1.0;
        }
        json.put("lbDoDesign", lbDoDesign);
        if(lbDoChange == null) {
            lbDoChange = -1.0;
        }
        json.put("lbDoChange", lbDoChange);
        if(lbUpDesign == null) {
            lbUpDesign = -1.0;
        }
        json.put("lbUpDesign", lbUpDesign);
        if(lbUpChange == null) {
            lbUpChange = -1.0;
        }
        json.put("lbUpChange", lbUpChange);
        if(lbDownDesign == null) {
            lbDownDesign = -1.0;
        }
        json.put("lbDownDesign", lbDownDesign);
        if(lbDownChange == null) {
            lbDownChange = -1.0;
        }
        json.put("lbDownChange", lbDownChange);
        json.put("lbInfo", lbInfo);

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
        Labour other = (Labour) that;
        return (this.getLbId() == null ? other.getLbId() == null : this.getLbId().equals(other.getLbId()))
                && (this.getLbCode() == null ? other.getLbCode() == null : this.getLbCode().equals(other.getLbCode()))
                && (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
                && (this.getPiName() == null ? other.getPiName() == null : this.getPiName().equals(other.getPiName()))
                && (this.getPartItem() == null ? other.getPartItem() == null : this.getPartItem().equals(other.getPartItem()))
                && (this.getClId() == null ? other.getClId() == null : this.getClId().equals(other.getClId()))
                && (this.getClCode() == null ? other.getClCode() == null : this.getClCode().equals(other.getClCode()))
                && (this.getCostLayer() == null ? other.getCostLayer() == null : this.getCostLayer().equals(other.getCostLayer()))
                && (this.getLbDate() == null ? other.getLbDate() == null : this.getLbDate().equals(other.getLbDate()))
                && (this.getLbName() == null ? other.getLbName() == null : this.getLbName().equals(other.getLbName()))
                && (this.getLbUnit() == null ? other.getLbUnit() == null : this.getLbUnit().equals(other.getLbUnit()))
                && (this.getLbDoDesign() == null ? other.getLbDoDesign() == null : this.getLbDoDesign().equals(other.getLbDoDesign()))
                && (this.getLbDoChange() == null ? other.getLbDoChange() == null : this.getLbDoChange().equals(other.getLbDoChange()))
                && (this.getLbUpDesign() == null ? other.getLbUpDesign() == null : this.getLbUpDesign().equals(other.getLbUpDesign()))
                && (this.getLbUpChange() == null ? other.getLbUpChange() == null : this.getLbUpChange().equals(other.getLbUpChange()))
                && (this.getLbDownDesign() == null ? other.getLbDownDesign() == null : this.getLbDownDesign().equals(other.getLbDownDesign()))
                && (this.getLbDownChange() == null ? other.getLbDownChange() == null : this.getLbDownChange().equals(other.getLbDownChange()))
                && (this.getLbInfo() == null ? other.getLbInfo() == null : this.getLbInfo().equals(other.getLbInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLbId() == null) ? 0 : getLbId().hashCode());
        result = prime * result + ((getLbCode() == null) ? 0 : getLbCode().hashCode());
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiName() == null) ? 0 : getPiName().hashCode());
        result = prime * result + ((getPartItem() == null) ? 0 : getPartItem().hashCode());
        result = prime * result + ((getClId() == null) ? 0 : getClId().hashCode());
        result = prime * result + ((getClCode() == null) ? 0 : getClCode().hashCode());
        result = prime * result + ((getCostLayer() == null) ? 0 : getCostLayer().hashCode());
        result = prime * result + ((getLbDate() == null) ? 0 : getLbDate().hashCode());
        result = prime * result + ((getLbName() == null) ? 0 : getLbName().hashCode());
        result = prime * result + ((getLbUnit() == null) ? 0 : getLbUnit().hashCode());
        result = prime * result + ((getLbDoDesign() == null) ? 0 : getLbDoDesign().hashCode());
        result = prime * result + ((getLbDoChange() == null) ? 0 : getLbDoChange().hashCode());
        result = prime * result + ((getLbUpDesign() == null) ? 0 : getLbUpDesign().hashCode());
        result = prime * result + ((getLbUpChange() == null) ? 0 : getLbUpChange().hashCode());
        result = prime * result + ((getLbDownDesign() == null) ? 0 : getLbDownDesign().hashCode());
        result = prime * result + ((getLbDownChange() == null) ? 0 : getLbDownChange().hashCode());
        result = prime * result + ((getLbInfo() == null) ? 0 : getLbInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lbId=").append(lbId);
        sb.append(", lbCode=").append(lbCode);
        sb.append(", piId=").append(piId);
        sb.append(", piName=").append(piName);
        sb.append(", partItem=").append(partItem);
        sb.append(", clId=").append(clId);
        sb.append(", clCode=").append(clCode);
        sb.append(", costLayer=").append(costLayer);
        sb.append(", lbDate=").append(lbDate);
        sb.append(", lbName=").append(lbName);
        sb.append(", lbUnit=").append(lbUnit);
        sb.append(", lbDoDesign=").append(lbDoDesign);
        sb.append(", lbDoChange=").append(lbDoChange);
        sb.append(", lbUpDesign=").append(lbUpDesign);
        sb.append(", lbUpChange=").append(lbUpChange);
        sb.append(", lbDownDesign=").append(lbDownDesign);
        sb.append(", lbDownChange=").append(lbDownChange);
        sb.append(", lbInfo=").append(lbInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}