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
public class Indirect implements Serializable {
    /**
     * 数量ID
     */
    private Integer itId;

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
    private String itCode;

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
    private Date itDate;

    /**
     * 项目名称
     */
    private String itName;

    /**
     * 计量单位
     */
    private String itUnit;

    /**
     * 已完设计数量
     */
    private Double itDoDesign;

    /**
     * 已完变更数量
     */
    private Double itDoChange;

    /**
     * 对上计价设计数量
     */
    private Double itUpDesign;

    /**
     * 对上计价变更数量
     */
    private Double itUpChange;

    /**
     * 对下计价设计数量
     */
    private Double itDownDesign;

    /**
     * 对下计价变更数量
     */
    private Double itDownChange;

    /**
     * 数量备注
     */
    private String itInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public Indirect() {
    }

    /**
     * 部分构造方法
     */
    public Indirect(Integer itId, PartItem partItem) {
        this.itId = itId;
        this.partItem = partItem;
        this.piId = partItem.getPiId();
        this.piName = partItem.getPiName();
    }

    public Indirect(Integer itId, CostLayer costLayer) {
        this.itId = itId;
        this.costLayer = costLayer;
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    /**
     * 完整构造方法
     */
    public Indirect(Integer itId, String itCode, Integer piId, String piName, Integer clId, String clCode,
                    Date itDate, String itName, String itUnit, Double itDoDesign, Double itDoChange,
                    Double itUpDesign, Double itUpChange, Double itDownDesign, Double itDownChange, String itInfo) {
        this.itId = itId;
        this.itCode = itCode;
        this.piId = piId;
        this.piName = piName;
        this.clId = clId;
        this.clCode = clCode;
        this.itDate = itDate;
        this.itName = itName;
        this.itUnit = itUnit;
        this.itDoDesign = itDoDesign;
        this.itDoChange = itDoChange;
        this.itUpDesign = itUpDesign;
        this.itUpChange = itUpChange;
        this.itDownDesign = itDownDesign;
        this.itDownChange = itDownChange;
        this.itInfo = itInfo;
    }
//    @JsonCreator
//    public Indirect(@JsonProperty("itId") Integer itId, @JsonProperty("itCode") String itCode,
//                    @JsonProperty("piId") Integer piId, @JsonProperty("piName") String piName,
//                    @JsonProperty("clId") Integer clId, @JsonProperty("clCode") String clCode,
//                    @JsonProperty("itDate") Date itDate, @JsonProperty("itName") String itName,
//                    @JsonProperty("itUnit") String itUnit, @JsonProperty("itDoDesign") Double itDoDesign,
//                    @JsonProperty("itDoChange") Double itDoChange, @JsonProperty("itUpDesign") Double itUpDesign, @JsonProperty("itUpChange") Double itUpChange,
//                    @JsonProperty("itDownDesign") Double itDownDesign, @JsonProperty("itDownChange") Double itDownChange, @JsonProperty("itInfo") String itInfo) {
//        this.itId = itId;
//        this.itCode = itCode;
//        this.piId = piId;
//        this.piName = piName;
//        this.clId = clId;
//        this.clCode = clCode;
//        this.itDate = itDate;
//        this.itName = itName;
//        this.itUnit = itUnit;
//        this.itDoDesign = itDoDesign;
//        this.itDoChange = itDoChange;
//        this.itUpDesign = itUpDesign;
//        this.itUpChange = itUpChange;
//        this.itDownDesign = itDownDesign;
//        this.itDownChange = itDownChange;
//        this.itInfo = itInfo;
//    }

    public Integer getItId() {
        return itId;
    }

    public void setItId(Integer itId) {
        this.itId = itId;
    }

    public String getItCode() {
        return itCode;
    }

    public void setItCode(String itCode) {
        this.itCode = itCode;
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

    public Date getItDate() {
        return itDate;
    }

    public void setItDate(Date itDate) {
        this.itDate = itDate;
    }

    public String getItName() {
        return itName;
    }

    public void setItName(String itName) {
        this.itName = itName;
    }

    public String getItUnit() {
        return itUnit;
    }

    public void setItUnit(String itUnit) {
        this.itUnit = itUnit;
    }

    public Double getItDoDesign() {
        return itDoDesign;
    }

    public void setItDoDesign(Double itDoDesign) {
        this.itDoDesign = itDoDesign;
    }

    public Double getItDoChange() {
        return itDoChange;
    }

    public void setItDoChange(Double itDoChange) {
        this.itDoChange = itDoChange;
    }

    public Double getItUpDesign() {
        return itUpDesign;
    }

    public void setItUpDesign(Double itUpDesign) {
        this.itUpDesign = itUpDesign;
    }

    public Double getItUpChange() {
        return itUpChange;
    }

    public void setItUpChange(Double itUpChange) {
        this.itUpChange = itUpChange;
    }

    public Double getItDownDesign() {
        return itDownDesign;
    }

    public void setItDownDesign(Double itDownDesign) {
        this.itDownDesign = itDownDesign;
    }

    public Double getItDownChange() {
        return itDownChange;
    }

    public void setItDownChange(Double itDownChange) {
        this.itDownChange = itDownChange;
    }

    public String getItInfo() {
        return itInfo;
    }

    public void setItInfo(String itInfo) {
        this.itInfo = itInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("itId")) {
            if(RegexUtil.isNumber(_value)) {
                itId = Integer.parseInt(_value);
            }
        }
        if (field.equals("itCode")) {
            itCode = _value;
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
        if (field.equals("itDate")) {
            itDate = DateConverter.strToDate(_value);
        }
        if (field.equals("itName")) {
            itName = _value;
        }
        if (field.equals("itUnit")) {
            itUnit = _value;
        }
        if (field.equals("itDoDesign")) {
            if(RegexUtil.isNumber(_value)) {
                itDoDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("itDoChange")) {
            if(RegexUtil.isNumber(_value)) {
                itDoChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("itUpDesign")) {
            if(RegexUtil.isNumber(_value)) {
                itUpDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("itUpChange")) {
            if(RegexUtil.isNumber(_value)) {
                itUpChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("itDownDesign")) {
            if(RegexUtil.isNumber(_value)) {
                itDownDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("itDownChange")) {
            if(RegexUtil.isNumber(_value)) {
                itDownChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("itInfo")) {
            itInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("itId")) {
            String value = map.get("itId").toString();
            if(RegexUtil.isNumber(value)) {
                itId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("itCode")) {
            itCode = map.get("itCode").toString();
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
        if (map.containsKey("itDate")) {
            itDate = DateConverter.strToDate(map.get("itDate").toString());
        }
        if (map.containsKey("itName")) {
            itName = map.get("itName").toString();
        }
        if (map.containsKey("itUnit")) {
            itUnit = map.get("itUnit").toString();
        }
        if (map.containsKey("itDoDesign")) {
            String value = map.get("itDoDesign").toString();
            if(RegexUtil.isNumber(value)) {
                itDoDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("itDoChange")) {
            String value = map.get("itDoChange").toString();
            if(RegexUtil.isNumber(value)) {
                itDoChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("itUpDesign")) {
            String value = map.get("itUpDesign").toString();
            if(RegexUtil.isNumber(value)) {
                itUpDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("itUpChange")) {
            String value = map.get("itUpChange").toString();
            if(RegexUtil.isNumber(value)) {
                itUpChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("itDownDesign")) {
            String value = map.get("itDownDesign").toString();
            if(RegexUtil.isNumber(value)) {
                itDownDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("itDownChange")) {
            String value = map.get("itDownChange").toString();
            if(RegexUtil.isNumber(value)) {
                itDownChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("itInfo")) {
            itInfo = map.get("itInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("itId")) {
            if(RegexUtil.isNumber(json.getString("itId"))) {
                itId = json.getInteger("itId");
            }
        }
        if (json.containsKey("itCode")) {
            itCode = json.getString("itCode");
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
        if (json.containsKey("itDate")) {
            itDate = DateConverter.strToDate(json.getString("itDate"));
        }
        if (json.containsKey("itName")) {
            itName = json.getString("itName");
        }
        if (json.containsKey("itUnit")) {
            itUnit = json.getString("itUnit");
        }
        if (json.containsKey("itDoDesign")) {
            if(RegexUtil.isNumber(json.getString("itDoDesign"))) {
                itDoDesign = json.getDouble("itDoDesign");
            }
        }
        if (json.containsKey("itDoChange")) {
            if(RegexUtil.isNumber(json.getString("itDoChange"))) {
                itDoChange = json.getDouble("itDoChange");
            }
        }
        if (json.containsKey("itUpDesign")) {
            if(RegexUtil.isNumber(json.getString("itUpDesign"))) {
                itUpDesign = json.getDouble("itUpDesign");
            }
        }
        if (json.containsKey("itUpChange")) {
            if(RegexUtil.isNumber(json.getString("itUpChange"))) {
                itUpChange = json.getDouble("itUpChange");
            }
        }
        if (json.containsKey("itDownDesign")) {
            if(RegexUtil.isNumber(json.getString("itDownDesign"))) {
                itDownDesign = json.getDouble("itDownDesign");
            }
        }
        if (json.containsKey("itDownChange")) {
            if(RegexUtil.isNumber(json.getString("itDownChange"))) {
                itDownChange = json.getDouble("itDownChange");
            }
        }
        if (json.containsKey("itInfo")) {
            itInfo = json.getString("itInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(itId == null) {
            itId = -1;
        }
        map.put("itId", itId);
        map.put("itCode", itCode);
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
            map.put("itName", partItem.getPiName());
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
        map.put("itDate", DateConverter.dateToStr(itDate));
        if(itName != null) {
            map.put("itName", itName);
        }
        map.put("itUnit", itUnit);
        if(itDoDesign == null) {
            itDoDesign = -1.0;
        }
        map.put("itDoDesign", itDoDesign);
        if(itDoChange == null) {
            itDoChange = -1.0;
        }
        map.put("itDoChange", itDoChange);
        if(itUpDesign == null) {
            itUpDesign = -1.0;
        }
        map.put("itUpDesign", itUpDesign);
        if(itUpChange == null) {
            itUpChange = -1.0;
        }
        map.put("itUpChange", itUpChange);
        if(itDownDesign == null) {
            itDownDesign = -1.0;
        }
        map.put("itDownDesign", itDownDesign);
        if(itDownChange == null) {
            itDownChange = -1.0;
        }
        map.put("itDownChange", itDownChange);
        map.put("itInfo", itInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(itId == null) {
            itId = -1;
        }
        json.put("itId", itId);
        json.put("itCode", itCode);
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
        json.put("itDate", DateConverter.dateToStr(itDate));
        json.put("itName", itName);
        json.put("itUnit", itUnit);
        if(itDoDesign == null) {
            itDoDesign = -1.0;
        }
        json.put("itDoDesign", itDoDesign);
        if(itDoChange == null) {
            itDoChange = -1.0;
        }
        json.put("itDoChange", itDoChange);
        if(itUpDesign == null) {
            itUpDesign = -1.0;
        }
        json.put("itUpDesign", itUpDesign);
        if(itUpChange == null) {
            itUpChange = -1.0;
        }
        json.put("itUpChange", itUpChange);
        if(itDownDesign == null) {
            itDownDesign = -1.0;
        }
        json.put("itDownDesign", itDownDesign);
        if(itDownChange == null) {
            itDownChange = -1.0;
        }
        json.put("itDownChange", itDownChange);
        json.put("itInfo", itInfo);

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
        Indirect other = (Indirect) that;
        return (this.getItId() == null ? other.getItId() == null : this.getItId().equals(other.getItId()))
                && (this.getItCode() == null ? other.getItCode() == null : this.getItCode().equals(other.getItCode()))
                && (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
                && (this.getPiName() == null ? other.getPiName() == null : this.getPiName().equals(other.getPiName()))
                && (this.getPartItem() == null ? other.getPartItem() == null : this.getPartItem().equals(other.getPartItem()))
                && (this.getClId() == null ? other.getClId() == null : this.getClId().equals(other.getClId()))
                && (this.getClCode() == null ? other.getClCode() == null : this.getClCode().equals(other.getClCode()))
                && (this.getCostLayer() == null ? other.getCostLayer() == null : this.getCostLayer().equals(other.getCostLayer()))
                && (this.getItDate() == null ? other.getItDate() == null : this.getItDate().equals(other.getItDate()))
                && (this.getItName() == null ? other.getItName() == null : this.getItName().equals(other.getItName()))
                && (this.getItUnit() == null ? other.getItUnit() == null : this.getItUnit().equals(other.getItUnit()))
                && (this.getItDoDesign() == null ? other.getItDoDesign() == null : this.getItDoDesign().equals(other.getItDoDesign()))
                && (this.getItDoChange() == null ? other.getItDoChange() == null : this.getItDoChange().equals(other.getItDoChange()))
                && (this.getItUpDesign() == null ? other.getItUpDesign() == null : this.getItUpDesign().equals(other.getItUpDesign()))
                && (this.getItUpChange() == null ? other.getItUpChange() == null : this.getItUpChange().equals(other.getItUpChange()))
                && (this.getItDownDesign() == null ? other.getItDownDesign() == null : this.getItDownDesign().equals(other.getItDownDesign()))
                && (this.getItDownChange() == null ? other.getItDownChange() == null : this.getItDownChange().equals(other.getItDownChange()))
                && (this.getItInfo() == null ? other.getItInfo() == null : this.getItInfo().equals(other.getItInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItId() == null) ? 0 : getItId().hashCode());
        result = prime * result + ((getItCode() == null) ? 0 : getItCode().hashCode());
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiName() == null) ? 0 : getPiName().hashCode());
        result = prime * result + ((getPartItem() == null) ? 0 : getPartItem().hashCode());
        result = prime * result + ((getClId() == null) ? 0 : getClId().hashCode());
        result = prime * result + ((getClCode() == null) ? 0 : getClCode().hashCode());
        result = prime * result + ((getCostLayer() == null) ? 0 : getCostLayer().hashCode());
        result = prime * result + ((getItDate() == null) ? 0 : getItDate().hashCode());
        result = prime * result + ((getItName() == null) ? 0 : getItName().hashCode());
        result = prime * result + ((getItUnit() == null) ? 0 : getItUnit().hashCode());
        result = prime * result + ((getItDoDesign() == null) ? 0 : getItDoDesign().hashCode());
        result = prime * result + ((getItDoChange() == null) ? 0 : getItDoChange().hashCode());
        result = prime * result + ((getItUpDesign() == null) ? 0 : getItUpDesign().hashCode());
        result = prime * result + ((getItUpChange() == null) ? 0 : getItUpChange().hashCode());
        result = prime * result + ((getItDownDesign() == null) ? 0 : getItDownDesign().hashCode());
        result = prime * result + ((getItDownChange() == null) ? 0 : getItDownChange().hashCode());
        result = prime * result + ((getItInfo() == null) ? 0 : getItInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itId=").append(itId);
        sb.append(", itCode=").append(itCode);
        sb.append(", piId=").append(piId);
        sb.append(", piName=").append(piName);
        sb.append(", partItem=").append(partItem);
        sb.append(", clId=").append(clId);
        sb.append(", clCode=").append(clCode);
        sb.append(", costLayer=").append(costLayer);
        sb.append(", itDate=").append(itDate);
        sb.append(", itName=").append(itName);
        sb.append(", itUnit=").append(itUnit);
        sb.append(", itDoDesign=").append(itDoDesign);
        sb.append(", itDoChange=").append(itDoChange);
        sb.append(", itUpDesign=").append(itUpDesign);
        sb.append(", itUpChange=").append(itUpChange);
        sb.append(", itDownDesign=").append(itDownDesign);
        sb.append(", itDownChange=").append(itDownChange);
        sb.append(", itInfo=").append(itInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}