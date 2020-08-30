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
public class Material implements Serializable {
    /**
     * 数量ID
     */
    private Integer mlId;

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
    private String mlCode;

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
    private Date mlDate;

    /**
     * 项目名称
     */
    private String mlName;

    /**
     * 计量单位
     */
    private String mlUnit;

    /**
     * 已完设计数量
     */
    private Double mlDoDesign;

    /**
     * 已完变更数量
     */
    private Double mlDoChange;

    /**
     * 对上计价设计数量
     */
    private Double mlUpDesign;

    /**
     * 对上计价变更数量
     */
    private Double mlUpChange;

    /**
     * 对下计价设计数量
     */
    private Double mlDownDesign;

    /**
     * 对下计价变更数量
     */
    private Double mlDownChange;

    /**
     * 数量备注
     */
    private String mlInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public Material() {
    }

    /**
     * 部分构造方法
     */
    public Material(Integer mlId, PartItem partItem) {
        this.mlId = mlId;
        this.partItem = partItem;
        this.piId = partItem.getPiId();
        this.piName = partItem.getPiName();
    }

    public Material(Integer mlId, CostLayer costLayer) {
        this.mlId = mlId;
        this.costLayer = costLayer;
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    /**
     * 完整构造方法
     */
    public Material(Integer mlId, String mlCode, Integer piId, String piName, Integer clId, String clCode,
                    Date mlDate, String mlName, String mlUnit, Double mlDoDesign, Double mlDoChange,
                    Double mlUpDesign, Double mlUpChange, Double mlDownDesign, Double mlDownChange, String mlInfo) {
        this.mlId = mlId;
        this.mlCode = mlCode;
        this.piId = piId;
        this.piName = piName;
        this.clId = clId;
        this.clCode = clCode;
        this.mlDate = mlDate;
        this.mlName = mlName;
        this.mlUnit = mlUnit;
        this.mlDoDesign = mlDoDesign;
        this.mlDoChange = mlDoChange;
        this.mlUpDesign = mlUpDesign;
        this.mlUpChange = mlUpChange;
        this.mlDownDesign = mlDownDesign;
        this.mlDownChange = mlDownChange;
        this.mlInfo = mlInfo;
    }
//    @JsonCreator
//    public Material(@JsonProperty("mlId") Integer mlId, @JsonProperty("mlCode") String mlCode,
//                    @JsonProperty("piId") Integer piId, @JsonProperty("piName") String piName,
//                    @JsonProperty("clId") Integer clId, @JsonProperty("clCode") String clCode,
//                    @JsonProperty("mlDate") Date mlDate, @JsonProperty("mlName") String mlName,
//                    @JsonProperty("mlUnit") String mlUnit, @JsonProperty("mlDoDesign") Double mlDoDesign,
//                    @JsonProperty("mlDoChange") Double mlDoChange, @JsonProperty("mlUpDesign") Double mlUpDesign, @JsonProperty("mlUpChange") Double mlUpChange,
//                    @JsonProperty("mlDownDesign") Double mlDownDesign, @JsonProperty("mlDownChange") Double mlDownChange, @JsonProperty("mlInfo") String mlInfo) {
//        this.mlId = mlId;
//        this.mlCode = mlCode;
//        this.piId = piId;
//        this.piName = piName;
//        this.clId = clId;
//        this.clCode = clCode;
//        this.mlDate = mlDate;
//        this.mlName = mlName;
//        this.mlUnit = mlUnit;
//        this.mlDoDesign = mlDoDesign;
//        this.mlDoChange = mlDoChange;
//        this.mlUpDesign = mlUpDesign;
//        this.mlUpChange = mlUpChange;
//        this.mlDownDesign = mlDownDesign;
//        this.mlDownChange = mlDownChange;
//        this.mlInfo = mlInfo;
//    }

    public Integer getMlId() {
        return mlId;
    }

    public void setMlId(Integer mlId) {
        this.mlId = mlId;
    }

    public String getMlCode() {
        return mlCode;
    }

    public void setMlCode(String mlCode) {
        this.mlCode = mlCode;
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

    public Date getMlDate() {
        return mlDate;
    }

    public void setMlDate(Date mlDate) {
        this.mlDate = mlDate;
    }

    public String getMlName() {
        return mlName;
    }

    public void setMlName(String mlName) {
        this.mlName = mlName;
    }

    public String getMlUnit() {
        return mlUnit;
    }

    public void setMlUnit(String mlUnit) {
        this.mlUnit = mlUnit;
    }

    public Double getMlDoDesign() {
        return mlDoDesign;
    }

    public void setMlDoDesign(Double mlDoDesign) {
        this.mlDoDesign = mlDoDesign;
    }

    public Double getMlDoChange() {
        return mlDoChange;
    }

    public void setMlDoChange(Double mlDoChange) {
        this.mlDoChange = mlDoChange;
    }

    public Double getMlUpDesign() {
        return mlUpDesign;
    }

    public void setMlUpDesign(Double mlUpDesign) {
        this.mlUpDesign = mlUpDesign;
    }

    public Double getMlUpChange() {
        return mlUpChange;
    }

    public void setMlUpChange(Double mlUpChange) {
        this.mlUpChange = mlUpChange;
    }

    public Double getMlDownDesign() {
        return mlDownDesign;
    }

    public void setMlDownDesign(Double mlDownDesign) {
        this.mlDownDesign = mlDownDesign;
    }

    public Double getMlDownChange() {
        return mlDownChange;
    }

    public void setMlDownChange(Double mlDownChange) {
        this.mlDownChange = mlDownChange;
    }

    public String getMlInfo() {
        return mlInfo;
    }

    public void setMlInfo(String mlInfo) {
        this.mlInfo = mlInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("mlId")) {
            if(RegexUtil.isNumber(_value)) {
                mlId = Integer.parseInt(_value);
            }
        }
        if (field.equals("mlCode")) {
            mlCode = _value;
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
        if (field.equals("mlDate")) {
            mlDate = DateConverter.strToDate(_value);
        }
        if (field.equals("mlName")) {
            mlName = _value;
        }
        if (field.equals("mlUnit")) {
            mlUnit = _value;
        }
        if (field.equals("mlDoDesign")) {
            if(RegexUtil.isNumber(_value)) {
                mlDoDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("mlDoChange")) {
            if(RegexUtil.isNumber(_value)) {
                mlDoChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("mlUpDesign")) {
            if(RegexUtil.isNumber(_value)) {
                mlUpDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("mlUpChange")) {
            if(RegexUtil.isNumber(_value)) {
                mlUpChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("mlDownDesign")) {
            if(RegexUtil.isNumber(_value)) {
                mlDownDesign = Double.parseDouble(_value);
            }
        }
        if (field.equals("mlDownChange")) {
            if(RegexUtil.isNumber(_value)) {
                mlDownChange = Double.parseDouble(_value);
            }
        }
        if (field.equals("mlInfo")) {
            mlInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("mlId")) {
            String value = map.get("mlId").toString();
            if(RegexUtil.isNumber(value)) {
                mlId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("mlCode")) {
            mlCode = map.get("mlCode").toString();
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
        if (map.containsKey("mlDate")) {
            mlDate = DateConverter.strToDate(map.get("mlDate").toString());
        }
        if (map.containsKey("mlName")) {
            mlName = map.get("mlName").toString();
        }
        if (map.containsKey("mlUnit")) {
            mlUnit = map.get("mlUnit").toString();
        }
        if (map.containsKey("mlDoDesign")) {
            String value = map.get("mlDoDesign").toString();
            if(RegexUtil.isNumber(value)) {
                mlDoDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("mlDoChange")) {
            String value = map.get("mlDoChange").toString();
            if(RegexUtil.isNumber(value)) {
                mlDoChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("mlUpDesign")) {
            String value = map.get("mlUpDesign").toString();
            if(RegexUtil.isNumber(value)) {
                mlUpDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("mlUpChange")) {
            String value = map.get("mlUpChange").toString();
            if(RegexUtil.isNumber(value)) {
                mlUpChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("mlDownDesign")) {
            String value = map.get("mlDownDesign").toString();
            if(RegexUtil.isNumber(value)) {
                mlDownDesign = Double.parseDouble(value);
            }
        }
        if (map.containsKey("mlDownChange")) {
            String value = map.get("mlDownChange").toString();
            if(RegexUtil.isNumber(value)) {
                mlDownChange = Double.parseDouble(value);
            }
        }
        if (map.containsKey("mlInfo")) {
            mlInfo = map.get("mlInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("mlId")) {
            if(RegexUtil.isNumber(json.getString("mlId"))) {
                mlId = json.getInteger("mlId");
            }
        }
        if (json.containsKey("mlCode")) {
            mlCode = json.getString("mlCode");
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
        if (json.containsKey("mlDate")) {
            mlDate = DateConverter.strToDate(json.getString("mlDate"));
        }
        if (json.containsKey("mlName")) {
            mlName = json.getString("mlName");
        }
        if (json.containsKey("mlUnit")) {
            mlUnit = json.getString("mlUnit");
        }
        if (json.containsKey("mlDoDesign")) {
            if(RegexUtil.isNumber(json.getString("mlDoDesign"))) {
                mlDoDesign = json.getDouble("mlDoDesign");
            }
        }
        if (json.containsKey("mlDoChange")) {
            if(RegexUtil.isNumber(json.getString("mlDoChange"))) {
                mlDoChange = json.getDouble("mlDoChange");
            }
        }
        if (json.containsKey("mlUpDesign")) {
            if(RegexUtil.isNumber(json.getString("mlUpDesign"))) {
                mlUpDesign = json.getDouble("mlUpDesign");
            }
        }
        if (json.containsKey("mlUpChange")) {
            if(RegexUtil.isNumber(json.getString("mlUpChange"))) {
                mlUpChange = json.getDouble("mlUpChange");
            }
        }
        if (json.containsKey("mlDownDesign")) {
            if(RegexUtil.isNumber(json.getString("mlDownDesign"))) {
                mlDownDesign = json.getDouble("mlDownDesign");
            }
        }
        if (json.containsKey("mlDownChange")) {
            if(RegexUtil.isNumber(json.getString("mlDownChange"))) {
                mlDownChange = json.getDouble("mlDownChange");
            }
        }
        if (json.containsKey("mlInfo")) {
            mlInfo = json.getString("mlInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(mlId == null) {
            mlId = -1;
        }
        map.put("mlId", mlId);
        map.put("mlCode", mlCode);
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
            map.put("mlName", partItem.getPiName());
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
        map.put("mlDate", DateConverter.dateToStr(mlDate));
        if(mlName != null) {
            map.put("mlName", mlName);
        }
        map.put("mlUnit", mlUnit);
        if(mlDoDesign == null) {
            mlDoDesign = -1.0;
        }
        map.put("mlDoDesign", mlDoDesign);
        if(mlDoChange == null) {
            mlDoChange = -1.0;
        }
        map.put("mlDoChange", mlDoChange);
        if(mlUpDesign == null) {
            mlUpDesign = -1.0;
        }
        map.put("mlUpDesign", mlUpDesign);
        if(mlUpChange == null) {
            mlUpChange = -1.0;
        }
        map.put("mlUpChange", mlUpChange);
        if(mlDownDesign == null) {
            mlDownDesign = -1.0;
        }
        map.put("mlDownDesign", mlDownDesign);
        if(mlDownChange == null) {
            mlDownChange = -1.0;
        }
        map.put("mlDownChange", mlDownChange);
        map.put("mlInfo", mlInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(mlId == null) {
            mlId = -1;
        }
        json.put("mlId", mlId);
        json.put("mlCode", mlCode);
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
        json.put("mlDate", DateConverter.dateToStr(mlDate));
        json.put("mlName", mlName);
        json.put("mlUnit", mlUnit);
        if(mlDoDesign == null) {
            mlDoDesign = -1.0;
        }
        json.put("mlDoDesign", mlDoDesign);
        if(mlDoChange == null) {
            mlDoChange = -1.0;
        }
        json.put("mlDoChange", mlDoChange);
        if(mlUpDesign == null) {
            mlUpDesign = -1.0;
        }
        json.put("mlUpDesign", mlUpDesign);
        if(mlUpChange == null) {
            mlUpChange = -1.0;
        }
        json.put("mlUpChange", mlUpChange);
        if(mlDownDesign == null) {
            mlDownDesign = -1.0;
        }
        json.put("mlDownDesign", mlDownDesign);
        if(mlDownChange == null) {
            mlDownChange = -1.0;
        }
        json.put("mlDownChange", mlDownChange);
        json.put("mlInfo", mlInfo);

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
        Material other = (Material) that;
        return (this.getMlId() == null ? other.getMlId() == null : this.getMlId().equals(other.getMlId()))
                && (this.getMlCode() == null ? other.getMlCode() == null : this.getMlCode().equals(other.getMlCode()))
                && (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
                && (this.getPiName() == null ? other.getPiName() == null : this.getPiName().equals(other.getPiName()))
                && (this.getPartItem() == null ? other.getPartItem() == null : this.getPartItem().equals(other.getPartItem()))
                && (this.getClId() == null ? other.getClId() == null : this.getClId().equals(other.getClId()))
                && (this.getClCode() == null ? other.getClCode() == null : this.getClCode().equals(other.getClCode()))
                && (this.getCostLayer() == null ? other.getCostLayer() == null : this.getCostLayer().equals(other.getCostLayer()))
                && (this.getMlDate() == null ? other.getMlDate() == null : this.getMlDate().equals(other.getMlDate()))
                && (this.getMlName() == null ? other.getMlName() == null : this.getMlName().equals(other.getMlName()))
                && (this.getMlUnit() == null ? other.getMlUnit() == null : this.getMlUnit().equals(other.getMlUnit()))
                && (this.getMlDoDesign() == null ? other.getMlDoDesign() == null : this.getMlDoDesign().equals(other.getMlDoDesign()))
                && (this.getMlDoChange() == null ? other.getMlDoChange() == null : this.getMlDoChange().equals(other.getMlDoChange()))
                && (this.getMlUpDesign() == null ? other.getMlUpDesign() == null : this.getMlUpDesign().equals(other.getMlUpDesign()))
                && (this.getMlUpChange() == null ? other.getMlUpChange() == null : this.getMlUpChange().equals(other.getMlUpChange()))
                && (this.getMlDownDesign() == null ? other.getMlDownDesign() == null : this.getMlDownDesign().equals(other.getMlDownDesign()))
                && (this.getMlDownChange() == null ? other.getMlDownChange() == null : this.getMlDownChange().equals(other.getMlDownChange()))
                && (this.getMlInfo() == null ? other.getMlInfo() == null : this.getMlInfo().equals(other.getMlInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMlId() == null) ? 0 : getMlId().hashCode());
        result = prime * result + ((getMlCode() == null) ? 0 : getMlCode().hashCode());
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiName() == null) ? 0 : getPiName().hashCode());
        result = prime * result + ((getPartItem() == null) ? 0 : getPartItem().hashCode());
        result = prime * result + ((getClId() == null) ? 0 : getClId().hashCode());
        result = prime * result + ((getClCode() == null) ? 0 : getClCode().hashCode());
        result = prime * result + ((getCostLayer() == null) ? 0 : getCostLayer().hashCode());
        result = prime * result + ((getMlDate() == null) ? 0 : getMlDate().hashCode());
        result = prime * result + ((getMlName() == null) ? 0 : getMlName().hashCode());
        result = prime * result + ((getMlUnit() == null) ? 0 : getMlUnit().hashCode());
        result = prime * result + ((getMlDoDesign() == null) ? 0 : getMlDoDesign().hashCode());
        result = prime * result + ((getMlDoChange() == null) ? 0 : getMlDoChange().hashCode());
        result = prime * result + ((getMlUpDesign() == null) ? 0 : getMlUpDesign().hashCode());
        result = prime * result + ((getMlUpChange() == null) ? 0 : getMlUpChange().hashCode());
        result = prime * result + ((getMlDownDesign() == null) ? 0 : getMlDownDesign().hashCode());
        result = prime * result + ((getMlDownChange() == null) ? 0 : getMlDownChange().hashCode());
        result = prime * result + ((getMlInfo() == null) ? 0 : getMlInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mlId=").append(mlId);
        sb.append(", mlCode=").append(mlCode);
        sb.append(", piId=").append(piId);
        sb.append(", piName=").append(piName);
        sb.append(", partItem=").append(partItem);
        sb.append(", clId=").append(clId);
        sb.append(", clCode=").append(clCode);
        sb.append(", costLayer=").append(costLayer);
        sb.append(", mlDate=").append(mlDate);
        sb.append(", mlName=").append(mlName);
        sb.append(", mlUnit=").append(mlUnit);
        sb.append(", mlDoDesign=").append(mlDoDesign);
        sb.append(", mlDoChange=").append(mlDoChange);
        sb.append(", mlUpDesign=").append(mlUpDesign);
        sb.append(", mlUpChange=").append(mlUpChange);
        sb.append(", mlDownDesign=").append(mlDownDesign);
        sb.append(", mlDownChange=").append(mlDownChange);
        sb.append(", mlInfo=").append(mlInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}