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
public class Company implements Serializable {
    /**
     * 队伍ID
     */
    private Integer cyId;

    /**
     * 队伍名称
     */
    private String cyName;

    /**
     * 队伍级别
     */
    private String cyLevel;

    /**
     * 队伍负责人
     */
    private String cyLeader;

    /**
     * 队伍类别
     */
    private String cyType;

    /**
     * 队伍规模
     */
    private Byte cyScale;

    /**
     * 队伍得分
     */
    private Double cyScore;

    /**
     * 参评项目部
     */
    private String cyProject;

    /**
     * 参评个数
     */
    private Byte cyNumber;

    /**
     * 队伍备注
     */
    private String cyInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 默认构造方法
     */
    public Company() {
    }

    /**
     * 完整构造方法
     */
    public Company(Integer cyId, String cyName, String cyLevel, String cyLeader, String cyType,
                   Byte cyScale, Double cyScore, String cyProject, Byte cyNumber, String cyInfo) {
        this.cyId = cyId;
        this.cyName = cyName;
        this.cyLevel = cyLevel;
        this.cyLeader = cyLeader;
        this.cyType = cyType;
        this.cyScale = cyScale;
        this.cyScore = cyScore;
        this.cyProject = cyProject;
        this.cyNumber = cyNumber;
        this.cyInfo = cyInfo;
    }
//
//    @JsonCreator
//    public Labour(@JsonProperty("cyId") Integer cyId, @JsonProperty("cyName") String cyName,
//                  @JsonProperty("cyLevel") String cyLevel, @JsonProperty("cyLeader") String cyLeader,
//                  @JsonProperty("cyType") String cyType, @JsonProperty("cyScale") Byte cyScale,
//                  @JsonProperty("cyScore") Double cyScore, @JsonProperty("cyProject") String cyProject,
//                  @JsonProperty("cyNumber") Byte cyNumber, @JsonProperty("cyInfo") String cyInfo) {
//        this.cyId = cyId;
//        this.cyName = cyName;
//        this.cyLevel = cyLevel;
//        this.cyLeader = cyLeader;
//        this.cyType = cyType;
//        this.cyScale = cyScale;
//        this.cyScore = cyScore;
//        this.cyProject = cyProject;
//        this.cyNumber = cyNumber;
//        this.cyInfo = cyInfo;
//    }

    public Integer getCyId() {
        return cyId;
    }

    public void setCyId(Integer cyId) {
        this.cyId = cyId;
    }

    public String getCyName() {
        return cyName;
    }

    public void setCyName(String cyName) {
        this.cyName = cyName;
    }

    public String getCyLevel() {
        return cyLevel;
    }

    public void setCyLevel(String cyLevel) {
        this.cyLevel = cyLevel;
    }

    public String getCyLeader() {
        return cyLeader;
    }

    public void setCyLeader(String cyLeader) {
        this.cyLeader = cyLeader;
    }

    public String getCyType() {
        return cyType;
    }

    public void setCyType(String cyType) {
        this.cyType = cyType;
    }

    public Byte getCyScale() {
        return cyScale;
    }

    public void setCyScale(Byte cyScale) {
        this.cyScale = cyScale;
    }

    public Double getCyScore() {
        return cyScore;
    }

    public void setCyScore(Double cyScore) {
        this.cyScore = cyScore;
    }

    public String getCyProject() {
        return cyProject;
    }

    public void setCyProject(String cyProject) {
        this.cyProject = cyProject;
    }

    public Byte getCyNumber() {
        return cyNumber;
    }

    public void setCyNumber(Byte cyNumber) {
        this.cyNumber = cyNumber;
    }

    public String getCyInfo() {
        return cyInfo;
    }

    public void setCyInfo(String cyInfo) {
        this.cyInfo = cyInfo;
    }

    public void setField(String field, Object value) {
        String _value = value.toString();
        if (field.equals("cyId")) {
            if(RegexUtil.isNumber(_value)) {
                cyId = Integer.parseInt(_value);
            }
        }
        if (field.equals("cyName")) {
            cyName = _value;
        }
        if (field.equals("cyLevel")) {
            cyLevel = _value;
        }
        if (field.equals("cyLeader")) {
            cyLeader = _value;
        }
        if (field.equals("cyType")) {
            cyType = _value;
        }
        if (field.equals("cyScale")) {
            if(RegexUtil.isNumber(_value) && _value.compareTo("127") <= 0) {
                cyScale = Byte.parseByte(_value);
            }
        }
        if (field.equals("cyScore")) {
            if(RegexUtil.isNumber(_value)) {
                cyScore = Double.parseDouble(_value);
            }
        }
        if (field.equals("cyProject")) {
            cyProject = _value;
        }
        if (field.equals("cyNumber")) {
            if(RegexUtil.isNumber(_value) && _value.compareTo("127") <= 0) {
                cyNumber = Byte.parseByte(_value);
            }
        }
        if (field.equals("cyInfo")) {
            cyInfo = _value;
        }
    }

    public void setMap(Map map) {
        if (map.containsKey("cyId")) {
            String value = map.get("cyId").toString();
            if(RegexUtil.isNumber(value)) {
                cyId = Integer.parseInt(value);
            }
        }
        if (map.containsKey("cyName")) {
            cyName = map.get("cyName").toString();
        }
        if (map.containsKey("cyLevel")) {
            cyLevel = map.get("cyLevel").toString();
        }
        if (map.containsKey("cyLeader")) {
            cyLeader = map.get("cyLeader").toString();
        }
        if (map.containsKey("cyType")) {
            cyType = map.get("cyType").toString();
        }
        if (map.containsKey("cyScale")) {
            String value = map.get("cyScale").toString();
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                cyScale = Byte.parseByte(value);
            }
        }
        if (map.containsKey("cyScore")) {
            String value = map.get("cyScore").toString();
            if(RegexUtil.isNumber(value)) {
                cyScore = Double.parseDouble(value);
            }
        }
        if (map.containsKey("cyProject")) {
            cyProject = map.get("cyProject").toString();
        }
        if (map.containsKey("cyNumber")) {
            String value = map.get("cyNumber").toString();
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                cyNumber = Byte.parseByte(value);
            }
        }
        if (map.containsKey("cyInfo")) {
            cyInfo = map.get("cyInfo").toString();
        }
    }

    public void setJson(JSONObject json) {
        if (json.containsKey("cyId")) {
            if(RegexUtil.isNumber(json.getString("cyId"))) {
                cyId = json.getInteger("cyId");
            }
        }
        if (json.containsKey("cyName")) {
            cyName = json.getString("cyName");
        }
        if (json.containsKey("cyLevel")) {
            cyLevel = json.getString("cyLevel");
        }
        if (json.containsKey("cyLeader")) {
            cyLeader = json.getString("cyLeader");
        }
        if (json.containsKey("cyType")) {
            cyType = json.getString("cyType");
        }
        if (json.containsKey("cyScale")) {
            String value = json.getString("cyScale");
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                cyScale = Byte.parseByte(value);
            }
        }
        if (json.containsKey("cyScore")) {
            if(RegexUtil.isNumber(json.getString("cyScore"))) {
                cyScore = json.getDouble("cyScore");
            }
        }
        if (json.containsKey("cyProject")) {
            cyProject = json.getString("cyProject").toString();
        }
        if (json.containsKey("cyNumber")) {
            String value = json.getString("cyNumber");
            if(RegexUtil.isNumber(value) && value.compareTo("127") <= 0) {
                cyNumber = Byte.parseByte(value);
            }
        }
        if (json.containsKey("cyInfo")) {
            cyInfo = json.getString("cyInfo");
        }
    }

    public Map toMap() {
        Map map = new HashMap<>();
        if(cyId == null) {
            cyId = -1;
        }
        map.put("cyId", cyId);
        map.put("cyName", cyName);
        map.put("cyLevel", cyLevel);
        map.put("cyLeader", cyLeader);
        map.put("cyType", cyType);
        if(cyScale == null) {
            cyScale = 0;
        }
        map.put("cyScale", cyScale);
        if(cyScore == null) {
            cyScore = -1.0;
        }
        map.put("cyScore", cyScore);
        map.put("cyProject", cyProject);
        if(cyNumber == null) {
            cyNumber = 0;
        }
        map.put("cyNumber", cyNumber);
        map.put("cyInfo", cyInfo);

        return map;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if(cyId == null) {
            cyId = -1;
        }
        json.put("cyId", cyId);
        json.put("cyName", cyName);
        json.put("cyLevel", cyLevel);
        json.put("cyLeader", cyLeader);
        json.put("cyType", cyType);
        if(cyScale == null) {
            cyScale = 0;
        }
        json.put("cyScale", cyScale);
        if(cyScore == null) {
            cyScore = -1.0;
        }
        json.put("cyScore", cyScore);
        json.put("cyProject", cyProject);
        if(cyNumber == null) {
            cyNumber = 0;
        }
        json.put("cyNumber", cyNumber);
        json.put("cyInfo", cyInfo);

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
        Company other = (Company) that;
        return (this.getCyId() == null ? other.getCyId() == null : this.getCyId().equals(other.getCyId()))
            && (this.getCyName() == null ? other.getCyName() == null : this.getCyName().equals(other.getCyName()))
            && (this.getCyLevel() == null ? other.getCyLevel() == null : this.getCyLevel().equals(other.getCyLevel()))
            && (this.getCyLeader() == null ? other.getCyLeader() == null : this.getCyLeader().equals(other.getCyLeader()))
            && (this.getCyType() == null ? other.getCyType() == null : this.getCyType().equals(other.getCyType()))
            && (this.getCyScale() == null ? other.getCyScale() == null : this.getCyScale().equals(other.getCyScale()))
            && (this.getCyScore() == null ? other.getCyScore() == null : this.getCyScore().equals(other.getCyScore()))
            && (this.getCyProject() == null ? other.getCyProject() == null : this.getCyProject().equals(other.getCyProject()))
            && (this.getCyNumber() == null ? other.getCyNumber() == null : this.getCyNumber().equals(other.getCyNumber()))
            && (this.getCyInfo() == null ? other.getCyInfo() == null : this.getCyInfo().equals(other.getCyInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCyId() == null) ? 0 : getCyId().hashCode());
        result = prime * result + ((getCyName() == null) ? 0 : getCyName().hashCode());
        result = prime * result + ((getCyLevel() == null) ? 0 : getCyLevel().hashCode());
        result = prime * result + ((getCyLeader() == null) ? 0 : getCyLeader().hashCode());
        result = prime * result + ((getCyType() == null) ? 0 : getCyType().hashCode());
        result = prime * result + ((getCyScale() == null) ? 0 : getCyScale().hashCode());
        result = prime * result + ((getCyScore() == null) ? 0 : getCyScore().hashCode());
        result = prime * result + ((getCyProject() == null) ? 0 : getCyProject().hashCode());
        result = prime * result + ((getCyNumber() == null) ? 0 : getCyNumber().hashCode());
        result = prime * result + ((getCyInfo() == null) ? 0 : getCyInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cyId=").append(cyId);
        sb.append(", cyName=").append(cyName);
        sb.append(", cyLevel=").append(cyLevel);
        sb.append(", cyLeader=").append(cyLeader);
        sb.append(", cyType=").append(cyType);
        sb.append(", cyScale=").append(cyScale);
        sb.append(", cyScore=").append(cyScore);
        sb.append(", cyProject=").append(cyProject);
        sb.append(", cyNumber=").append(cyNumber);
        sb.append(", cyInfo=").append(cyInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}