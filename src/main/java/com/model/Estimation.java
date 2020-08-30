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
public class Estimation implements Serializable {
    /**
     * 测算ID
     */
    private Integer enId;

    /**
     * 清单ID
     */
    private Integer ctId;

    /**
     * 指导价ID
     */
    private Integer gdId;

    /**
     * 成本层ID
     */
    private Integer clId;

    /**
     * 清单编码
     */
    private String ctCode;

    /**
     * 指导价编码
     */
    private String gdCode;

    /**
     * 成本层编码
     */
    private String clCode;

    /**
     * 清单信息
     */
    private Contract contract;

    /**
     * 指导价信息
     */
    private Guidance guidance;

    /**
     * 成本呈
     */
    private CostLayer costLayer;

    /**
     * 测算编码
     */
    private String enCode;

    /**
     * 细目名称
     */
    private String enName;

    /**
     * 计量单位
     */
    private String enUnit;

    /**
     * 劳务数量
     */
    private Double enQtyLabour;

    /**
     * 劳务单价
     */
    private Double enPriceLabour;

    /**
     * 劳务合价
     */
    private Double enMoneyLabour;

    /**
     * 损耗系数
     */
    private Double enFactor;

    /**
     * 主材数量
     */
    private Double enQtyMaterial;

    /**
     * 主材单价
     */
    private Double enPriceMaterial;

    /**
     * 主材合价
     */
    private Double enMoneyMaterial;

    /**
     * 测算备注
     */
    private String enInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public Estimation() {
    }

    /**
     * 部分构造方法
     */
    public Estimation(Integer enId, String enCode, Contract contract) {
        this.enId = enId;
        this.enCode = enCode;
        this.contract = contract;
        this.ctId = contract.getCtId();
        this.ctCode = contract.getCtCode();
    }

    public Estimation(Integer enId, String enCode, Guidance guidance) {
        this.enId = enId;
        this.enCode = enCode;
        this.guidance = guidance;
        this.gdId = guidance.getGdId();
        this.enCode = guidance.getGdCode();
    }

    public Estimation(Integer enId, String enCode, CostLayer costLayer) {
        this.enId = enId;
        this.enCode = enCode;
        this.costLayer = costLayer;
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    public Estimation(Integer enId, String enCode, Contract contract, Guidance guidance) {
        this.enId = enId;
        this.enCode = enCode;
        this.contract = contract;
        this.guidance = guidance;
        this.ctId = contract.getCtId();
        this.ctCode = contract.getCtCode();
        this.gdId = guidance.getGdId();
        this.enCode = guidance.getGdCode();
    }

    public Estimation(Integer enId, String enCode, Contract contract, CostLayer costLayer) {
        this.enId = enId;
        this.enCode = enCode;
        this.contract = contract;
        this.costLayer = costLayer;
        this.ctId = contract.getCtId();
        this.ctCode = contract.getCtCode();
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    public Estimation(Integer enId, String enCode, Guidance guidance, CostLayer costLayer) {
        this.enId = enId;
        this.enCode = enCode;
        this.guidance = guidance;
        this.costLayer = costLayer;
        this.gdId = guidance.getGdId();
        this.enCode = guidance.getGdCode();
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    public Estimation(Integer enId, String enCode, Contract contract, Guidance guidance, CostLayer costLayer) {
        this.enId = enId;
        this.enCode = enCode;
        this.contract = contract;
        this.guidance = guidance;
        this.costLayer = costLayer;
        this.ctId = contract.getCtId();
        this.ctCode = contract.getCtCode();
        this.gdId = guidance.getGdId();
        this.enCode = guidance.getGdCode();
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    /**
     * 完整构造方法
     */
    public Estimation(Integer enId, Integer ctId, Integer gdId, Integer clId, String ctCode, String gdCode, String clCode, String enCode,
                      String enName, String enUnit, Double enQtyLabour, Double enPriceLabour, Double enMoneyLabour,
                      Double enFactor, Double enQtyMaterial, Double enPriceMaterial, Double enMoneyMaterial, String enInfo) {
        this.enId = enId;
        this.ctId = ctId;
        this.gdId = gdId;
        this.clId = clId;
        this.ctCode = ctCode;
        this.gdCode = gdCode;
        this.clCode = clCode;
        this.enCode = enCode;
        this.enName = enName;
        this.enUnit = enUnit;
        this.enQtyLabour = enQtyLabour;
        this.enPriceLabour = enPriceLabour;
        this.enMoneyLabour = enMoneyLabour;
        this.enFactor = enFactor;
        this.enQtyMaterial = enQtyMaterial;
        this.enPriceMaterial = enPriceMaterial;
        this.enMoneyMaterial = enMoneyMaterial;
        this.enInfo = enInfo;
    }
//
//    @JsonCreator
//    public EstimationMaterial(@JsonProperty("enId") Integer enId, @JsonProperty("ctId") Integer ctId, @JsonProperty("gdId") Integer gdId, @JsonProperty("clId") Integer clId,
//                  @JsonProperty("ctCode") String ctCode, @JsonProperty("gdCode") String gdCode, @JsonProperty("clCode") String clCode, @JsonProperty("enCode") String enCode,
//                  @JsonProperty("enName") String enName, @JsonProperty("enUnit") String enUnit, @JsonProperty("enQtyLabour") Double enQtyLabour,
//                  @JsonProperty("enPriceLabour") Double enPriceLabour, @JsonProperty("enMoneyLabour") Double enMoneyLabour,
//                  @JsonProperty("enFactor") Double enFactor, @JsonProperty("enQtyMaterial") Double enQtyMaterial,
//                  @JsonProperty("enPriceMaterial") Double enPriceMaterial, @JsonProperty("enMoneyMaterial") Double enMoneyMaterial, @JsonProperty("enInfo") String enInfo) {
//        this.enId = enId;
//        this.ctId = ctId;
//        this.gdId = gdId;
//        this.clId = clId;
//        this.ctCode = ctCode;
//        this.enCode = enCode;
//        this.gdCode = gdCode;
//        this.clCode = clCode;
//        this.enName = enName;
//        this.enUnit = enUnit;
//        this.enQtyLabour = enQtyLabour;
//        this.enPriceLabour = enPriceLabour;
//        this.enMoneyLabour = enMoneyLabour;
//        this.enFactor = enFactor;
//        this.enQtyMaterial = enQtyMaterial;
//        this.enPriceMaterial = enPriceMaterial;
//        this.enMoneyMaterial = enMoneyMaterial;
//        this.enInfo = enInfo;
//    }

    public Integer getEnId() {
        return enId;
    }

    public void setEnId(Integer enId) {
        this.enId = enId;
    }

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public Integer getGdId() {
        return gdId;
    }

    public void setGdId(Integer gdId) {
        this.gdId = gdId;
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public String getCtCode() {
        return ctCode;
    }

    public void setCtCode(String ctCode) {
        this.ctCode = ctCode;
    }

    public String getGdCode() {
        return gdCode;
    }

    public void setGdCode(String gdCode) {
        this.gdCode = gdCode;
    }

    public String getClCode() {
        return clCode;
    }

    public void setClCode(String clCode) {
        this.clCode = clCode;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
        this.ctId = contract.getCtId();
        this.ctCode = contract.getCtCode();
    }

    public Guidance getGuidance() {
        return guidance;
    }

    public void setGuidance(Guidance guidance) {
        this.guidance = guidance;
        this.gdId = guidance.getGdId();
        this.gdCode = guidance.getGdCode();
    }

    public CostLayer getCostLayer() {
        return costLayer;
    }

    public void setCostLayer(CostLayer costLayer) {
        this.costLayer = costLayer;
        this.clId = costLayer.getClId();
        this.clCode = costLayer.getClCode();
    }

    public String getEnCode() {
        return enCode;
    }

    public void setEnCode(String enCode) {
        this.enCode = enCode;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getEnUnit() {
        return enUnit;
    }

    public void setEnUnit(String enUnit) {
        this.enUnit = enUnit;
    }

    public Double getEnQtyLabour() {
        return enQtyLabour;
    }

    public void setEnQtyLabour(Double enQtyLabour) {
        this.enQtyLabour = enQtyLabour;
    }

    public Double getEnPriceLabour() {
        return enPriceLabour;
    }

    public void setEnPriceLabour(Double enPriceLabour) {
        this.enPriceLabour = enPriceLabour;
    }

    public Double getEnMoneyLabour() {
        return enMoneyLabour;
    }

    public void setEnMoneyLabour(Double enMoneyLabour) {
        this.enMoneyLabour = enMoneyLabour;
    }

    public Double getEnFactor() {
        return enFactor;
    }

    public void setEnFactor(Double enFactor) {
        this.enFactor = enFactor;
    }

    public Double getEnQtyMaterial() {
        return enQtyMaterial;
    }

    public void setEnQtyMaterial(Double enQtyMaterial) {
        this.enQtyMaterial = enQtyMaterial;
    }

    public Double getEnPriceMaterial() {
        return enPriceMaterial;
    }

    public void setEnPriceMaterial(Double enPriceMaterial) {
        this.enPriceMaterial = enPriceMaterial;
    }

    public Double getEnMoneyMaterial() {
        return enMoneyMaterial;
    }

    public void setEnMoneyMaterial(Double enMoneyMaterial) {
        this.enMoneyMaterial = enMoneyMaterial;
    }

    public String getEnInfo() {
        return enInfo;
    }

    public void setEnInfo(String enInfo) {
        this.enInfo = enInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("enId")) {
            if(RegexUtil.isNumber(_value)) {
                enId = Integer.parseInt(_value);
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
        if (field.equals("gdId")) {
            if(RegexUtil.isNumber(_value)) {
                gdId = Integer.parseInt(_value);
            }
        }
        if (field.equals("gdCode")) {
            gdCode = _value;
        }
        if (field.equals("guidance")) {
            guidance = (Guidance)value;
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
            costLayer = (CostLayer)value;
        }
        if (field.equals("enCode")) {
            enCode = _value;
        }
        if (field.equals("enName")) {
            enName = _value;
        }
        if (field.equals("enUnit")) {
            enUnit = _value;
        }
        if (field.equals("enQtyLabour")) {
            if(RegexUtil.isNumber(_value)) {
                enQtyLabour = Double.parseDouble(_value);
            }
        }
        if (field.equals("enPriceLabour")) {
            if(RegexUtil.isNumber(_value)) {
                enPriceLabour = Double.parseDouble(_value);
            }
        }
        if (field.equals("enMoneyLabour")) {
            if(RegexUtil.isNumber(_value)) {
                enMoneyLabour = Double.parseDouble(_value);
            }
        }
        if (field.equals("enFactor")) {
            if(RegexUtil.isNumber(_value)) {
                enFactor = Double.parseDouble(_value);
            }
        }
        if (field.equals("enQtyMaterial")) {
            if(RegexUtil.isNumber(_value)) {
                enQtyMaterial = Double.parseDouble(_value);
            }
        }
        if (field.equals("enPriceMaterial")) {
            if(RegexUtil.isNumber(_value)) {
                enPriceMaterial = Double.parseDouble(_value);
            }
        }
        if (field.equals("enMoneyMaterial")) {
            if(RegexUtil.isNumber(_value)) {
                enMoneyMaterial = Double.parseDouble(_value);
            }
        }
        if (field.equals("enInfo")) {
            enInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("enId")) {
            String value = map.get("enId").toString();
            if(RegexUtil.isNumber(value)) {
                enId = Integer.parseInt(value);
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
        if (map.containsKey("gdId")) {
            String value = map.get("gdId").toString();
            if(RegexUtil.isNumber(value)) {
                gdId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("gdCode")) {
            gdCode = map.get("gdCode").toString();
        }
        if (map.containsKey("guidance")) {
            guidance = (Guidance) map.get("guidance");
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
        if (map.containsKey("enCode")) {
            enCode = map.get("enCode").toString();
        }
        if (map.containsKey("enName")) {
            enName = map.get("enName").toString();
        }
        if (map.containsKey("enUnit")) {
            enUnit = map.get("enUnit").toString();
        }
        if (map.containsKey("enQtyLabour")) {
            String value = map.get("enQtyLabour").toString();
            if(RegexUtil.isNumber(value)) {
                enQtyLabour = Double.parseDouble(value);
            }
        }
        if (map.containsKey("enPriceLabour")) {
            String value = map.get("enPriceLabour").toString();
            if(RegexUtil.isNumber(value)) {
                enPriceLabour = Double.parseDouble(value);
            }
        }
        if (map.containsKey("enMoneyLabour")) {
            String value = map.get("enMoneyLabour").toString();
            if(RegexUtil.isNumber(value)) {
                enMoneyLabour = Double.parseDouble(value);
            }
        }
        if (map.containsKey("enFactor")) {
            String value = map.get("enFactor").toString();
            if(RegexUtil.isNumber(value)) {
                enFactor = Double.parseDouble(value);
            }
        }
        if (map.containsKey("enQtyMaterial")) {
            String value = map.get("enQtyMaterial").toString();
            if(RegexUtil.isNumber(value)) {
                enQtyMaterial = Double.parseDouble(value);
            }
        }
        if (map.containsKey("enPriceMaterial")) {
            String value = map.get("enPriceMaterial").toString();
            if(RegexUtil.isNumber(value)) {
                enPriceMaterial = Double.parseDouble(value);
            }
        }
        if (map.containsKey("enMoneyMaterial")) {
            String value = map.get("enMoneyMaterial").toString();
            if(RegexUtil.isNumber(value)) {
                enMoneyMaterial = Double.parseDouble(value);
            }
        }
        if (map.containsKey("enInfo")) {
            enInfo = map.get("enInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("enId")) {
            if(RegexUtil.isNumber(json.getString("enId"))) {
                enId = json.getInteger("enId");
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
            contract = json.getObject("contract", Contract.class);
        }
        if (json.containsKey("gdId")) {
            if(RegexUtil.isNumber(json.getString("gdId"))) {
                gdId = json.getInteger("gdId");
            }
        }
        if (json.containsKey("gdCode")) {
            gdCode = json.getString("gdCode");
        }
        if (json.containsKey("guidance")) {
            guidance = json.getObject("guidance", Guidance.class);
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
        if (json.containsKey("enCode")) {
            enCode = json.getString("enCode");
        }
        if (json.containsKey("enName")) {
            enName = json.getString("enName");
        }
        if (json.containsKey("enUnit")) {
            enUnit = json.getString("enUnit");
        }
        if (json.containsKey("enQtyLabour")) {
            if(RegexUtil.isNumber(json.getString("enQtyLabour"))) {
                enQtyLabour = json.getDouble("enQtyLabour");
            }
        }
        if (json.containsKey("enPriceLabour")) {
            if(RegexUtil.isNumber(json.getString("enPriceLabour"))) {
                enPriceLabour = json.getDouble("enPriceLabour");
            }
        }
        if (json.containsKey("enMoneyLabour")) {
            if(RegexUtil.isNumber(json.getString("enMoneyLabour"))) {
                enMoneyLabour = json.getDouble("enMoneyLabour");
            }
        }
        if (json.containsKey("enFactor")) {
            if(RegexUtil.isNumber(json.getString("enFactor"))) {
                enFactor = json.getDouble("enFactor");
            }
        }
        if (json.containsKey("enQtyMaterial")) {
            if(RegexUtil.isNumber(json.getString("enQtyMaterial"))) {
                enQtyMaterial = json.getDouble("enQtyMaterial");
            }
        }
        if (json.containsKey("enPriceMaterial")) {
            if(RegexUtil.isNumber(json.getString("enPriceMaterial"))) {
                enPriceMaterial = json.getDouble("enPriceMaterial");
            }
        }
        if (json.containsKey("enMoneyMaterial")) {
            if(RegexUtil.isNumber(json.getString("enMoneyMaterial"))) {
                enMoneyMaterial = json.getDouble("enMoneyMaterial");
            }
        }
        if (json.containsKey("enInfo")) {
            enInfo = json.getString("enInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(enId == null) {
            enId = -1;
        }
        map.put("enId", enId);
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
        if(gdId == null) {
            gdId = -1;
        }
        map.put("gdId", gdId);
        map.put("gdCode", gdCode);
        map.put("guidance", guidance);
        if(clId == null) {
            clId = -1;
        }
        map.put("clId", clId);
        map.put("clCode", clCode);
        map.put("costLayer", costLayer);
        map.put("enCode", enCode);
        map.put("enName", enName);
        if(enName != null) {
            map.put("ctCode", enCode);
            map.put("ctName", enName);
        }
        map.put("enUnit", enUnit);
        if(enQtyLabour == null) {
            enQtyLabour = -1.0;
        }
        map.put("enQtyLabour", enQtyLabour);
        if(enPriceLabour == null) {
            enPriceLabour = -1.0;
        }
        map.put("enPriceLabour", enPriceLabour);
        if(enMoneyLabour == null) {
            enMoneyLabour = -1.0;
        }
        map.put("enMoneyLabour", enMoneyLabour);
        if(enFactor == null) {
            enFactor = -1.0;
        }
        map.put("enFactor", enFactor);
        if(enQtyMaterial == null) {
            enQtyMaterial = -1.0;
        }
        map.put("enQtyMaterial", enQtyMaterial);
        if(enPriceMaterial == null) {
            enPriceMaterial = -1.0;
        }
        map.put("enPriceMaterial", enPriceMaterial);
        if(enMoneyMaterial == null) {
            enMoneyMaterial = -1.0;
        }
        map.put("enMoneyMaterial", enMoneyMaterial);
        map.put("enInfo", enInfo);

        return map;
    }

    public Map toGuidanceMap() {
        Map map = new HashMap<>();
        if(enId == null) {
            enId = -1;
        }
        map.put("enId", enId);
        if(ctId == null) {
            ctId = -1;
        }
        map.put("ctId", ctId);
        map.put("ctPid", 0);
        map.put("gdId", gdId);
        map.put("gdCode", gdCode);
        map.put("ctCode", ctCode);
        map.put("gdName", enName);
        map.put("ctFold", true);

        map.put("contract", contract);
        if(contract != null) {
            map.put("ctId", contract.getCtId());
            map.put("ctPid", contract.getCtPid());
            map.put("ctLevel", contract.getCtLevel());
            map.put("ctCode", contract.getCtCode());
            map.put("ctName", contract.getCtName());
            map.put("ctFold", contract.getCtFold());
            map.put("ctCheck", contract.getCtCheck());
        }

        map.put("guidance", guidance);
        if(guidance != null) {
            map.put("gdLabel", guidance.getGdLabel());
            map.put("gdName", guidance.getGdName());
            map.put("gdUnit", guidance.getGdUnit());
            map.put("gdRate", guidance.getGdRate());
            map.put("gdPrice", guidance.getGdPrice());
            map.put("gdItem", guidance.getGdItem());
            map.put("gdWork", guidance.getGdWork());
            map.put("gdCost", guidance.getGdCost());
            map.put("gdRole", guidance.getGdRole());
            map.put("gdInfo", guidance.getGdInfo());
        }

        return map;
    }

    public Map toCostLayerMap() {
        Map map = new HashMap<>();
        if(enId == null) {
            enId = -1;
        }
        map.put("enId", enId);
        if(ctId == null) {
            ctId = -1;
        }
        map.put("ctId", ctId);
        map.put("ctPid", 0);
        map.put("clId", clId);
        map.put("clCode", clCode);
        map.put("ctCode", ctCode);
        map.put("clName", enName);
        map.put("ctFold", true);

        map.put("contract", contract);
        if(contract != null) {
            map.put("ctId", contract.getCtId());
            map.put("ctPid", contract.getCtPid());
            map.put("ctLevel", contract.getCtLevel());
            map.put("ctCode", contract.getCtCode());
            map.put("ctName", contract.getCtName());
            map.put("ctFold", contract.getCtFold());
            map.put("ctCheck", contract.getCtCheck());
        }

        map.put("costLayer", costLayer);
        if(costLayer != null) {
            map.put("clType", costLayer.getClType());
            map.put("clName", costLayer.getClName());
            map.put("clUnit", costLayer.getClUnit());
            map.put("clBudget", costLayer.getClBudget());
            map.put("clDwgDesign", costLayer.getClDwgDesign());
            map.put("clDwgChange", costLayer.getClDwgChange());
            map.put("clChkDesign", costLayer.getClChkDesign());
            map.put("clChkChange", costLayer.getClChkChange());
            map.put("clActDesign", costLayer.getClActDesign());
            map.put("clActChange", costLayer.getClActChange());
            map.put("clDoDesign", costLayer.getClDoDesign());
            map.put("clDoChange", costLayer.getClDoChange());
            map.put("clUpDesign", costLayer.getClUpDesign());
            map.put("clUpChange", costLayer.getClUpChange());
            map.put("clDownDesign", costLayer.getClDwgDesign());
            map.put("clDownChange", costLayer.getClDownChange());
            map.put("clInfo", costLayer.getClInfo());
        }

        return map;
    }

    public Map toEstimationMap() {
        Map map = new HashMap<>();
        if(enId == null) {
            enId = -1;
        }
        map.put("enId", enId);
        map.put("enName", enName);
        if(ctId == null) {
            ctId = -1;
        }
        map.put("ctId", ctId);
        map.put("ctCode", ctCode);
        map.put("ctPid", 0);
        map.put("ctFold", true);

        if(contract != null) {
            map.put("ctId", contract.getCtId());
            map.put("ctPid", contract.getCtPid());
            map.put("ctLevel", contract.getCtLevel());
            map.put("ctCode", contract.getCtCode());
            map.put("ctName", contract.getCtName());
            map.put("ctFold", contract.getCtFold());
        }

        map.put("clId", -1);
        map.put("clCode", "");
        map.put("clType", "");
        map.put("clName", "");
        map.put("clUnit", "");
        map.put("clEstimationMaterial", "");

        map.put("gdId", -1);
        map.put("gdCode", "");
        map.put("gdName", "");
        map.put("gdPrice", "");
        map.put("gdMoney", "");

        costLayer = getCostLayer();
        guidance = getGuidance();
        if(costLayer != null && guidance != null) {
            map.put("clId", costLayer.getClId());
            map.put("clCode", costLayer.getClCode());
            map.put("clType", costLayer.getClType());
            map.put("clName", costLayer.getClName());
            map.put("clUnit", costLayer.getClUnit());
            Double clBudget = costLayer.getClBudget();
            map.put("clEstimationMaterial", clBudget);

            map.put("gdId", guidance.getGdId());
            map.put("gdCode", guidance.getGdCode());
            map.put("gdName", guidance.getGdName());
            Double gdPrice = guidance.getGdPrice();
            map.put("gdPrice", gdPrice);
            if(clBudget != null || gdPrice != null) {
                map.put("gdMoney", clBudget * gdPrice);
            }
        }

        map.put("enInfo", enInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(enId == null) {
            enId = -1;
        }
        json.put("enId", enId);
        if(ctId == null) {
            ctId = -1;
        }
        json.put("ctId", ctId);
        json.put("ctCode", ctCode);
        json.put("contract", contract);
        if(gdId == null) {
            gdId = -1;
        }
        json.put("gdId", gdId);
        json.put("gdCode", gdCode);
        json.put("guidance", guidance);
        if(clId == null) {
            clId = -1;
        }
        json.put("clId", clId);
        json.put("clCode", clCode);
        json.put("costLayer", costLayer);
        json.put("enCode", enCode);
        json.put("enName", enName);
        json.put("enUnit", enUnit);
        if(enQtyLabour == null) {
            enQtyLabour = -1.0;
        }
        json.put("enQtyLabour", enQtyLabour);
        if(enPriceLabour == null) {
            enPriceLabour = -1.0;
        }
        json.put("enPriceLabour", enPriceLabour);
        if(enMoneyLabour == null) {
            enMoneyLabour = -1.0;
        }
        json.put("enMoneyLabour", enMoneyLabour);
        if(enFactor == null) {
            enFactor = -1.0;
        }
        json.put("enFactor", enFactor);
        if(enQtyMaterial == null) {
            enQtyMaterial = -1.0;
        }
        json.put("enQtyMaterial", enQtyMaterial);
        if(enPriceMaterial == null) {
            enPriceMaterial = -1.0;
        }
        json.put("enPriceMaterial", enPriceMaterial);
        if(enMoneyMaterial == null) {
            enMoneyMaterial = -1.0;
        }
        json.put("enMoneyMaterial", enMoneyMaterial);
        json.put("enInfo", enInfo);

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
        Estimation other = (Estimation) that;
        return (this.getEnId() == null ? other.getEnId() == null : this.getEnId().equals(other.getEnId()))
            && (this.getCtId() == null ? other.getCtId() == null : this.getCtId().equals(other.getCtId()))
            && (this.getGdId() == null ? other.getGdId() == null : this.getGdId().equals(other.getGdId()))
            && (this.getClId() == null ? other.getClId() == null : this.getClId().equals(other.getClId()))
            && (this.getCtCode() == null ? other.getCtCode() == null : this.getCtCode().equals(other.getCtCode()))
            && (this.getContract() == null ? other.getContract() == null : this.getContract().equals(other.getContract()))
            && (this.getGdCode() == null ? other.getGdCode() == null : this.getGdCode().equals(other.getGdCode()))
            && (this.getGuidance() == null ? other.getGuidance() == null : this.getGuidance().equals(other.getGuidance()))
            && (this.getClCode() == null ? other.getClCode() == null : this.getClCode().equals(other.getClCode()))
            && (this.getCostLayer() == null ? other.getCostLayer() == null : this.getCostLayer().equals(other.getCostLayer()))
            && (this.getEnCode() == null ? other.getEnCode() == null : this.getEnCode().equals(other.getEnCode()))
            && (this.getEnName() == null ? other.getEnName() == null : this.getEnName().equals(other.getEnName()))
            && (this.getEnUnit() == null ? other.getEnUnit() == null : this.getEnUnit().equals(other.getEnUnit()))
            && (this.getEnQtyLabour() == null ? other.getEnQtyLabour() == null : this.getEnQtyLabour().equals(other.getEnQtyLabour()))
            && (this.getEnPriceLabour() == null ? other.getEnPriceLabour() == null : this.getEnPriceLabour().equals(other.getEnPriceLabour()))
            && (this.getEnMoneyLabour() == null ? other.getEnMoneyLabour() == null : this.getEnMoneyLabour().equals(other.getEnMoneyLabour()))
            && (this.getEnFactor() == null ? other.getEnFactor() == null : this.getEnFactor().equals(other.getEnFactor()))
            && (this.getEnQtyMaterial() == null ? other.getEnQtyMaterial() == null : this.getEnQtyMaterial().equals(other.getEnQtyMaterial()))
            && (this.getEnPriceMaterial() == null ? other.getEnPriceMaterial() == null : this.getEnPriceMaterial().equals(other.getEnPriceMaterial()))
            && (this.getEnMoneyMaterial() == null ? other.getEnMoneyMaterial() == null : this.getEnMoneyMaterial().equals(other.getEnMoneyMaterial()))
            && (this.getEnInfo() == null ? other.getEnInfo() == null : this.getEnInfo().equals(other.getEnInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEnId() == null) ? 0 : getEnId().hashCode());
        result = prime * result + ((getCtId() == null) ? 0 : getCtId().hashCode());
        result = prime * result + ((getGdId() == null) ? 0 : getGdId().hashCode());
        result = prime * result + ((getClId() == null) ? 0 : getClId().hashCode());
        result = prime * result + ((getCtCode() == null) ? 0 : getCtCode().hashCode());
        result = prime * result + ((getContract() == null) ? 0 : getContract().hashCode());
        result = prime * result + ((getGdCode() == null) ? 0 : getGdCode().hashCode());
        result = prime * result + ((getGuidance() == null) ? 0 : getGuidance().hashCode());
        result = prime * result + ((getClCode() == null) ? 0 : getClCode().hashCode());
        result = prime * result + ((getCostLayer() == null) ? 0 : getCostLayer().hashCode());
        result = prime * result + ((getEnCode() == null) ? 0 : getEnCode().hashCode());
        result = prime * result + ((getEnName() == null) ? 0 : getEnName().hashCode());
        result = prime * result + ((getEnUnit() == null) ? 0 : getEnUnit().hashCode());
        result = prime * result + ((getEnQtyLabour() == null) ? 0 : getEnQtyLabour().hashCode());
        result = prime * result + ((getEnPriceLabour() == null) ? 0 : getEnPriceLabour().hashCode());
        result = prime * result + ((getEnMoneyLabour() == null) ? 0 : getEnMoneyLabour().hashCode());
        result = prime * result + ((getEnFactor() == null) ? 0 : getEnFactor().hashCode());
        result = prime * result + ((getEnQtyMaterial() == null) ? 0 : getEnQtyMaterial().hashCode());
        result = prime * result + ((getEnPriceMaterial() == null) ? 0 : getEnPriceMaterial().hashCode());
        result = prime * result + ((getEnMoneyMaterial() == null) ? 0 : getEnMoneyMaterial().hashCode());
        result = prime * result + ((getEnInfo() == null) ? 0 : getEnInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", enId=").append(enId);
        sb.append(", ctId=").append(ctId);
        sb.append(", gdId=").append(gdId);
        sb.append(", clId=").append(clId);
        sb.append(", ctCode=").append(ctCode);
        sb.append(", contract=").append(contract);
        sb.append(", gdCode=").append(gdCode);
        sb.append(", guidance=").append(guidance);
        sb.append(", clCode=").append(clCode);
        sb.append(", costLayer=").append(costLayer);
        sb.append(", enCode=").append(enCode);
        sb.append(", enName=").append(enName);
        sb.append(", enUnit=").append(enUnit);
        sb.append(", enQtyLabour=").append(enQtyLabour);
        sb.append(", enPriceLabour=").append(enPriceLabour);
        sb.append(", enMoneyLabour=").append(enMoneyLabour);
        sb.append(", enFactor=").append(enFactor);
        sb.append(", enQtyMaterial=").append(enQtyMaterial);
        sb.append(", enPriceMaterial=").append(enPriceMaterial);
        sb.append(", enMoneyMaterial=").append(enMoneyMaterial);
        sb.append(", enInfo=").append(enInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}