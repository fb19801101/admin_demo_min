package com.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CompanyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCyIdIsNull() {
            addCriterion("cy_id is null");
            return (Criteria) this;
        }

        public Criteria andCyIdIsNotNull() {
            addCriterion("cy_id is not null");
            return (Criteria) this;
        }

        public Criteria andCyIdEqualTo(Integer value) {
            addCriterion("cy_id =", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdNotEqualTo(Integer value) {
            addCriterion("cy_id <>", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdGreaterThan(Integer value) {
            addCriterion("cy_id >", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cy_id >=", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdLessThan(Integer value) {
            addCriterion("cy_id <", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdLessThanOrEqualTo(Integer value) {
            addCriterion("cy_id <=", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdIn(List<Integer> values) {
            addCriterion("cy_id in", values, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdNotIn(List<Integer> values) {
            addCriterion("cy_id not in", values, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdBetween(Integer value1, Integer value2) {
            addCriterion("cy_id between", value1, value2, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cy_id not between", value1, value2, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyNameIsNull() {
            addCriterion("cy_name is null");
            return (Criteria) this;
        }

        public Criteria andCyNameIsNotNull() {
            addCriterion("cy_name is not null");
            return (Criteria) this;
        }

        public Criteria andCyNameEqualTo(String value) {
            addCriterion("cy_name =", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameNotEqualTo(String value) {
            addCriterion("cy_name <>", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameGreaterThan(String value) {
            addCriterion("cy_name >", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_name >=", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameLessThan(String value) {
            addCriterion("cy_name <", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameLessThanOrEqualTo(String value) {
            addCriterion("cy_name <=", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameLike(String value) {
            addCriterion("cy_name like", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameNotLike(String value) {
            addCriterion("cy_name not like", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameIn(List<String> values) {
            addCriterion("cy_name in", values, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameNotIn(List<String> values) {
            addCriterion("cy_name not in", values, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameBetween(String value1, String value2) {
            addCriterion("cy_name between", value1, value2, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameNotBetween(String value1, String value2) {
            addCriterion("cy_name not between", value1, value2, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyLevelIsNull() {
            addCriterion("cy_level is null");
            return (Criteria) this;
        }

        public Criteria andCyLevelIsNotNull() {
            addCriterion("cy_level is not null");
            return (Criteria) this;
        }

        public Criteria andCyLevelEqualTo(String value) {
            addCriterion("cy_level =", value, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelNotEqualTo(String value) {
            addCriterion("cy_level <>", value, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelGreaterThan(String value) {
            addCriterion("cy_level >", value, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("cy_level >=", value, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelLessThan(String value) {
            addCriterion("cy_level <", value, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelLessThanOrEqualTo(String value) {
            addCriterion("cy_level <=", value, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelLike(String value) {
            addCriterion("cy_level like", value, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelNotLike(String value) {
            addCriterion("cy_level not like", value, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelIn(List<String> values) {
            addCriterion("cy_level in", values, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelNotIn(List<String> values) {
            addCriterion("cy_level not in", values, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelBetween(String value1, String value2) {
            addCriterion("cy_level between", value1, value2, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLevelNotBetween(String value1, String value2) {
            addCriterion("cy_level not between", value1, value2, "cyLevel");
            return (Criteria) this;
        }

        public Criteria andCyLeaderIsNull() {
            addCriterion("cy_leader is null");
            return (Criteria) this;
        }

        public Criteria andCyLeaderIsNotNull() {
            addCriterion("cy_leader is not null");
            return (Criteria) this;
        }

        public Criteria andCyLeaderEqualTo(String value) {
            addCriterion("cy_leader =", value, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderNotEqualTo(String value) {
            addCriterion("cy_leader <>", value, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderGreaterThan(String value) {
            addCriterion("cy_leader >", value, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("cy_leader >=", value, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderLessThan(String value) {
            addCriterion("cy_leader <", value, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderLessThanOrEqualTo(String value) {
            addCriterion("cy_leader <=", value, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderLike(String value) {
            addCriterion("cy_leader like", value, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderNotLike(String value) {
            addCriterion("cy_leader not like", value, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderIn(List<String> values) {
            addCriterion("cy_leader in", values, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderNotIn(List<String> values) {
            addCriterion("cy_leader not in", values, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderBetween(String value1, String value2) {
            addCriterion("cy_leader between", value1, value2, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyLeaderNotBetween(String value1, String value2) {
            addCriterion("cy_leader not between", value1, value2, "cyLeader");
            return (Criteria) this;
        }

        public Criteria andCyTypeIsNull() {
            addCriterion("cy_type is null");
            return (Criteria) this;
        }

        public Criteria andCyTypeIsNotNull() {
            addCriterion("cy_type is not null");
            return (Criteria) this;
        }

        public Criteria andCyTypeEqualTo(String value) {
            addCriterion("cy_type =", value, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeNotEqualTo(String value) {
            addCriterion("cy_type <>", value, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeGreaterThan(String value) {
            addCriterion("cy_type >", value, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_type >=", value, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeLessThan(String value) {
            addCriterion("cy_type <", value, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeLessThanOrEqualTo(String value) {
            addCriterion("cy_type <=", value, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeLike(String value) {
            addCriterion("cy_type like", value, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeNotLike(String value) {
            addCriterion("cy_type not like", value, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeIn(List<String> values) {
            addCriterion("cy_type in", values, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeNotIn(List<String> values) {
            addCriterion("cy_type not in", values, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeBetween(String value1, String value2) {
            addCriterion("cy_type between", value1, value2, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyTypeNotBetween(String value1, String value2) {
            addCriterion("cy_type not between", value1, value2, "cyType");
            return (Criteria) this;
        }

        public Criteria andCyScaleIsNull() {
            addCriterion("cy_scale is null");
            return (Criteria) this;
        }

        public Criteria andCyScaleIsNotNull() {
            addCriterion("cy_scale is not null");
            return (Criteria) this;
        }

        public Criteria andCyScaleEqualTo(Byte value) {
            addCriterion("cy_scale =", value, "cyScale");
            return (Criteria) this;
        }

        public Criteria andCyScaleNotEqualTo(Byte value) {
            addCriterion("cy_scale <>", value, "cyScale");
            return (Criteria) this;
        }

        public Criteria andCyScaleGreaterThan(Byte value) {
            addCriterion("cy_scale >", value, "cyScale");
            return (Criteria) this;
        }

        public Criteria andCyScaleGreaterThanOrEqualTo(Byte value) {
            addCriterion("cy_scale >=", value, "cyScale");
            return (Criteria) this;
        }

        public Criteria andCyScaleLessThan(Byte value) {
            addCriterion("cy_scale <", value, "cyScale");
            return (Criteria) this;
        }

        public Criteria andCyScaleLessThanOrEqualTo(Byte value) {
            addCriterion("cy_scale <=", value, "cyScale");
            return (Criteria) this;
        }

        public Criteria andCyScaleIn(List<Byte> values) {
            addCriterion("cy_scale in", values, "cyScale");
            return (Criteria) this;
        }

        public Criteria andCyScaleNotIn(List<Byte> values) {
            addCriterion("cy_scale not in", values, "cyScale");
            return (Criteria) this;
        }

        public Criteria andCyScaleBetween(Byte value1, Byte value2) {
            addCriterion("cy_scale between", value1, value2, "cyScale");
            return (Criteria) this;
        }

        public Criteria andCyScaleNotBetween(Byte value1, Byte value2) {
            addCriterion("cy_scale not between", value1, value2, "cyScale");
            return (Criteria) this;
        }

        public Criteria andCyScoreIsNull() {
            addCriterion("cy_score is null");
            return (Criteria) this;
        }

        public Criteria andCyScoreIsNotNull() {
            addCriterion("cy_score is not null");
            return (Criteria) this;
        }

        public Criteria andCyScoreEqualTo(Double value) {
            addCriterion("cy_score =", value, "cyScore");
            return (Criteria) this;
        }

        public Criteria andCyScoreNotEqualTo(Double value) {
            addCriterion("cy_score <>", value, "cyScore");
            return (Criteria) this;
        }

        public Criteria andCyScoreGreaterThan(Double value) {
            addCriterion("cy_score >", value, "cyScore");
            return (Criteria) this;
        }

        public Criteria andCyScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("cy_score >=", value, "cyScore");
            return (Criteria) this;
        }

        public Criteria andCyScoreLessThan(Double value) {
            addCriterion("cy_score <", value, "cyScore");
            return (Criteria) this;
        }

        public Criteria andCyScoreLessThanOrEqualTo(Double value) {
            addCriterion("cy_score <=", value, "cyScore");
            return (Criteria) this;
        }

        public Criteria andCyScoreIn(List<Double> values) {
            addCriterion("cy_score in", values, "cyScore");
            return (Criteria) this;
        }

        public Criteria andCyScoreNotIn(List<Double> values) {
            addCriterion("cy_score not in", values, "cyScore");
            return (Criteria) this;
        }

        public Criteria andCyScoreBetween(Double value1, Double value2) {
            addCriterion("cy_score between", value1, value2, "cyScore");
            return (Criteria) this;
        }

        public Criteria andCyScoreNotBetween(Double value1, Double value2) {
            addCriterion("cy_score not between", value1, value2, "cyScore");
            return (Criteria) this;
        }

        public Criteria andCyProjectIsNull() {
            addCriterion("cy_project is null");
            return (Criteria) this;
        }

        public Criteria andCyProjectIsNotNull() {
            addCriterion("cy_project is not null");
            return (Criteria) this;
        }

        public Criteria andCyProjectEqualTo(String value) {
            addCriterion("cy_project =", value, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectNotEqualTo(String value) {
            addCriterion("cy_project <>", value, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectGreaterThan(String value) {
            addCriterion("cy_project >", value, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectGreaterThanOrEqualTo(String value) {
            addCriterion("cy_project >=", value, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectLessThan(String value) {
            addCriterion("cy_project <", value, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectLessThanOrEqualTo(String value) {
            addCriterion("cy_project <=", value, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectLike(String value) {
            addCriterion("cy_project like", value, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectNotLike(String value) {
            addCriterion("cy_project not like", value, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectIn(List<String> values) {
            addCriterion("cy_project in", values, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectNotIn(List<String> values) {
            addCriterion("cy_project not in", values, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectBetween(String value1, String value2) {
            addCriterion("cy_project between", value1, value2, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyProjectNotBetween(String value1, String value2) {
            addCriterion("cy_project not between", value1, value2, "cyProject");
            return (Criteria) this;
        }

        public Criteria andCyNumberIsNull() {
            addCriterion("cy_number is null");
            return (Criteria) this;
        }

        public Criteria andCyNumberIsNotNull() {
            addCriterion("cy_number is not null");
            return (Criteria) this;
        }

        public Criteria andCyNumberEqualTo(Byte value) {
            addCriterion("cy_number =", value, "cyNumber");
            return (Criteria) this;
        }

        public Criteria andCyNumberNotEqualTo(Byte value) {
            addCriterion("cy_number <>", value, "cyNumber");
            return (Criteria) this;
        }

        public Criteria andCyNumberGreaterThan(Byte value) {
            addCriterion("cy_number >", value, "cyNumber");
            return (Criteria) this;
        }

        public Criteria andCyNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("cy_number >=", value, "cyNumber");
            return (Criteria) this;
        }

        public Criteria andCyNumberLessThan(Byte value) {
            addCriterion("cy_number <", value, "cyNumber");
            return (Criteria) this;
        }

        public Criteria andCyNumberLessThanOrEqualTo(Byte value) {
            addCriterion("cy_number <=", value, "cyNumber");
            return (Criteria) this;
        }

        public Criteria andCyNumberIn(List<Byte> values) {
            addCriterion("cy_number in", values, "cyNumber");
            return (Criteria) this;
        }

        public Criteria andCyNumberNotIn(List<Byte> values) {
            addCriterion("cy_number not in", values, "cyNumber");
            return (Criteria) this;
        }

        public Criteria andCyNumberBetween(Byte value1, Byte value2) {
            addCriterion("cy_number between", value1, value2, "cyNumber");
            return (Criteria) this;
        }

        public Criteria andCyNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("cy_number not between", value1, value2, "cyNumber");
            return (Criteria) this;
        }

        public Criteria andCyInfoIsNull() {
            addCriterion("cy_info is null");
            return (Criteria) this;
        }

        public Criteria andCyInfoIsNotNull() {
            addCriterion("cy_info is not null");
            return (Criteria) this;
        }

        public Criteria andCyInfoEqualTo(String value) {
            addCriterion("cy_info =", value, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoNotEqualTo(String value) {
            addCriterion("cy_info <>", value, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoGreaterThan(String value) {
            addCriterion("cy_info >", value, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("cy_info >=", value, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoLessThan(String value) {
            addCriterion("cy_info <", value, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoLessThanOrEqualTo(String value) {
            addCriterion("cy_info <=", value, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoLike(String value) {
            addCriterion("cy_info like", value, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoNotLike(String value) {
            addCriterion("cy_info not like", value, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoIn(List<String> values) {
            addCriterion("cy_info in", values, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoNotIn(List<String> values) {
            addCriterion("cy_info not in", values, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoBetween(String value1, String value2) {
            addCriterion("cy_info between", value1, value2, "cyInfo");
            return (Criteria) this;
        }

        public Criteria andCyInfoNotBetween(String value1, String value2) {
            addCriterion("cy_info not between", value1, value2, "cyInfo");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}