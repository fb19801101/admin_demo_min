package com.model;

import com.alibaba.fastjson.JSONObject;
import com.dateutil.RegexUtil;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 *
 */
public class PartItem implements Serializable {
    /**
     * 分项ID
     */
    private Integer piId;

    /**
     * 根分项ID
     */
    private Integer piPid;

    /**
     * 分项级别
     */
    private Byte piLevel;

    /**
     * 分项名称
     */
    private String piName;

    /**
     * 分项备注
     */
    private String piInfo;

    /**
     * 树形选择框
     */
    private Byte piCheck = 0;

    /**
     * 树形类别折叠
     */
    private Boolean piFold = true;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public PartItem() {
    }

    /**
     * 完整构造方法
     */
    @JsonCreator
    public PartItem(Integer piId, Integer piPid, Byte piLevel, String piName, Byte piCheck, Boolean piFold, String piInfo) {
        this.piId = piId;
        this.piPid = piPid;
        this.piLevel = piLevel;
        this.piName = piName;
        this.piCheck = piCheck;
        this.piFold = piFold;
        this.piInfo = piInfo;
    }
//    @JsonCreator
//    public PartItem(@JsonProperty("piId") Integer piId, @JsonProperty("piPid") Integer piPid,
//                    @JsonProperty("piLevel") Byte piLevel, @JsonProperty("piNode") String piNode,
//                    @JsonProperty("piCheck") Byte piCheck, @JsonProperty("piFold") Boolean piFold,
//                    @JsonProperty("piInfo") String piInfo) {
//        this.piId = piId;
//        this.piPid = piPid;
//        this.piLevel = piLevel;
//        this.piName = piName;
//        this.piCheck = piCheck;
//        this.piFold = piFold;
//        this.piInfo = piInfo;
//    }


    public Integer getPiId() {
        return piId;
    }

    public void setPiId(Integer piId) {
        this.piId = piId;
    }

    public Integer getPiPid() {
        return piPid;
    }

    public void setPiPid(Integer piPid) {
        this.piPid = piPid;
    }

    public Byte getPiLevel() {
        return piLevel;
    }

    public void setPiLevel(Byte piLevel) {
        this.piLevel = piLevel;
    }

    public String getPiName() {
        return piName;
    }

    public void setPiName(String piName) {
        this.piName = piName;
    }

    public Byte getPiCheck() {
        return piCheck;
    }

    public void setPiCheck(Byte piCheck) {
        this.piCheck = piCheck;
    }

    public Boolean getPiFold() {
        return piFold;
    }

    public void setPiFold(Boolean piFold) {
        this.piFold = piFold;
    }

    public String getPiInfo() {
        return piInfo;
    }

    public void setPiInfo(String piInfo) {
        this.piInfo = piInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("piId")) {
            if(RegexUtil.isNumber(_value)) {
                piId = Integer.parseInt(_value);
            }
        }
        if (field.equals("piPid")) {
            if(RegexUtil.isNumber(_value)) {
                piPid = Integer.parseInt(_value);
            }
        }
        if (field.equals("piLevel")) {
            if(RegexUtil.isNumber(_value) && _value.compareTo("127") <= 0) {
                piLevel = Byte.parseByte(_value);
            }
        }
        if (field.equals("piName")) {
            piName = _value;
        }
        if (field.equals("piCheck")) {
            if(RegexUtil.isNumber(_value) && _value.compareTo("127") <= 0) {
                piCheck = Byte.parseByte(_value);
            }
        }
        if (field.equals("piFold")) {
            if(RegexUtil.isNumber(_value)) {
                piFold = Boolean.parseBoolean(_value);
            }
        }
        if (field.equals("piInfo")) {
            piInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("piId")) {
            String value = map.get("piId").toString();
            if(RegexUtil.isNumber(value)) {
                piId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("piPid")) {
            String value = map.get("piPid").toString();
            if(RegexUtil.isNumber(value)) {
                piPid = Integer.parseInt(value);
            }
        }
        if (map.containsKey("piLevel")) {
            String value = map.get("piLevel").toString();
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                piLevel = Byte.parseByte(value);
            }
        }
        if (map.containsKey("piName")) {
            piName = map.get("piName").toString();
        }
        if (map.containsKey("piCheck")) {
            String value = map.get("piCheck").toString();
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                piCheck = Byte.parseByte(value);
            }
        }
        if (map.containsKey("piFold")) {
            String value = map.get("piFold").toString();
            if(RegexUtil.isNumber(value)) {
                piFold = Boolean.parseBoolean(value);
            }
        }
        if (map.containsKey("piInfo")) {
            piInfo = map.get("piInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("piId")) {
            if(RegexUtil.isNumber(json.getString("piId"))) {
                piId = json.getInteger("piId");
            }
        }
        if (json.containsKey("piPid")) {
            if(RegexUtil.isNumber(json.getString("piPid"))) {
                piPid = json.getInteger("piPid");
            }
        }
        if (json.containsKey("piLevel")) {
            String value = json.getString("piLevel");
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                piLevel = Byte.parseByte(value);
            }
        }
        if (json.containsKey("piName")) {
            piName = json.getString("piName");
        }
        if (json.containsKey("piCheck")) {
            String value = json.getString("piCheck");
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                piCheck = Byte.parseByte(value);
            }
        }
        if (json.containsKey("piFold")) {
            if(RegexUtil.isNumber(json.getString("piFold"))) {
                piFold = json.getBoolean("piFold");
            }
        }
        if (json.containsKey("piInfo")) {
            piInfo = json.getString("piInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(piId == null) {
            piId = 0;
        }
        map.put("piId", piId);
        if(piPid == null) {
            piPid = 0;
        }
        map.put("piPid", piPid);
        map.put("piName", piName);
        if(piLevel == null) {
            piLevel = 0;
        }
        map.put("level", piLevel);
        if(piCheck == null) {
            piCheck = 0;
        }
        map.put("piCheck", piCheck);
        if(piFold == null) {
            piFold = true;
        }
        map.put("piFold", piFold);
        map.put("piInfo", piInfo);

        //layui-dtree data
        if(piId == null) {
            piId = 0;
        }
        map.put("id", piId);
        if(piPid == null) {
            piPid = 0;
        }
        map.put("parentId", piPid);
        map.put("title", piName);
        map.put("spread", piFold);
        map.put("checkArr", piCheck);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(piId == null) {
            piId = 0;
        }
        json.put("piId", piId);
        if(piPid == null) {
            piPid = 0;
        }
        json.put("piPid", piPid);
        json.put("piName", piName);
        if(piLevel == null) {
            piLevel = 0;
        }
        json.put("level", piLevel);
        if(piCheck == null) {
            piCheck = 0;
        }
        json.put("piCheck", piCheck);
        if(piFold == null) {
            piFold = true;
        }
        json.put("piFold", piFold);
        json.put("piInfo", piInfo);

        //layui-dtree data
        if(piId == null) {
            piId = 0;
        }
        json.put("id", piId);
        if(piPid == null) {
            piPid = 0;
        }
        json.put("parentId", piPid);
        json.put("title", piName);
        json.put("spread", piFold);
        json.put("checkArr", piCheck);

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
        PartItem other = (PartItem) that;
        return (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
                && (this.getPiPid() == null ? other.getPiPid() == null : this.getPiPid().equals(other.getPiPid()))
                && (this.getPiLevel() == null ? other.getPiLevel() == null : this.getPiLevel().equals(other.getPiLevel()))
                && (this.getPiName() == null ? other.getPiName() == null : this.getPiName().equals(other.getPiName()))
                && (this.getPiCheck() == null ? other.getPiCheck() == null : this.getPiCheck().equals(other.getPiCheck()))
                && (this.getPiFold() == null ? other.getPiFold() == null : this.getPiFold().equals(other.getPiFold()))
                && (this.getPiInfo() == null ? other.getPiInfo() == null : this.getPiInfo().equals(other.getPiInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiPid() == null) ? 0 : getPiPid().hashCode());
        result = prime * result + ((getPiLevel() == null) ? 0 : getPiLevel().hashCode());
        result = prime * result + ((getPiName() == null) ? 0 : getPiName().hashCode());
        result = prime * result + ((getPiCheck() == null) ? 0 : getPiCheck().hashCode());
        result = prime * result + ((getPiFold() == null) ? 0 : getPiFold().hashCode());
        result = prime * result + ((getPiInfo() == null) ? 0 : getPiInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", piId=").append(piId);
        sb.append(", piPid=").append(piPid);
        sb.append(", piLevel=").append(piLevel);
        sb.append(", piName=").append(piName);
        sb.append(", piCheck=").append(piCheck);
        sb.append(", piFold=").append(piFold);
        sb.append(", piInfo=").append(piInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}