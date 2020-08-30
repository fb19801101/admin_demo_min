package com.model;

import java.util.ArrayList;
import java.util.List;

public class PartItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PartItemExample() {
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

        public Criteria andPiIdIsNull() {
            addCriterion("pi_id is null");
            return (Criteria) this;
        }

        public Criteria andPiIdIsNotNull() {
            addCriterion("pi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPiIdEqualTo(Integer value) {
            addCriterion("pi_id =", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotEqualTo(Integer value) {
            addCriterion("pi_id <>", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThan(Integer value) {
            addCriterion("pi_id >", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_id >=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThan(Integer value) {
            addCriterion("pi_id <", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThanOrEqualTo(Integer value) {
            addCriterion("pi_id <=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdIn(List<Integer> values) {
            addCriterion("pi_id in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotIn(List<Integer> values) {
            addCriterion("pi_id not in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdBetween(Integer value1, Integer value2) {
            addCriterion("pi_id between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_id not between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiPidIsNull() {
            addCriterion("pi_pid is null");
            return (Criteria) this;
        }

        public Criteria andPiPidIsNotNull() {
            addCriterion("pi_pid is not null");
            return (Criteria) this;
        }

        public Criteria andPiPidEqualTo(Integer value) {
            addCriterion("pi_pid =", value, "piPid");
            return (Criteria) this;
        }

        public Criteria andPiPidNotEqualTo(Integer value) {
            addCriterion("pi_pid <>", value, "piPid");
            return (Criteria) this;
        }

        public Criteria andPiPidGreaterThan(Integer value) {
            addCriterion("pi_pid >", value, "piPid");
            return (Criteria) this;
        }

        public Criteria andPiPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_pid >=", value, "piPid");
            return (Criteria) this;
        }

        public Criteria andPiPidLessThan(Integer value) {
            addCriterion("pi_pid <", value, "piPid");
            return (Criteria) this;
        }

        public Criteria andPiPidLessThanOrEqualTo(Integer value) {
            addCriterion("pi_pid <=", value, "piPid");
            return (Criteria) this;
        }

        public Criteria andPiPidIn(List<Integer> values) {
            addCriterion("pi_pid in", values, "piPid");
            return (Criteria) this;
        }

        public Criteria andPiPidNotIn(List<Integer> values) {
            addCriterion("pi_pid not in", values, "piPid");
            return (Criteria) this;
        }

        public Criteria andPiPidBetween(Integer value1, Integer value2) {
            addCriterion("pi_pid between", value1, value2, "piPid");
            return (Criteria) this;
        }

        public Criteria andPiPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_pid not between", value1, value2, "piPid");
            return (Criteria) this;
        }

        public Criteria andPiLevelIsNull() {
            addCriterion("pi_level is null");
            return (Criteria) this;
        }

        public Criteria andPiLevelIsNotNull() {
            addCriterion("pi_level is not null");
            return (Criteria) this;
        }

        public Criteria andPiLevelEqualTo(Byte value) {
            addCriterion("pi_level =", value, "piLevel");
            return (Criteria) this;
        }

        public Criteria andPiLevelNotEqualTo(Byte value) {
            addCriterion("pi_level <>", value, "piLevel");
            return (Criteria) this;
        }

        public Criteria andPiLevelGreaterThan(Byte value) {
            addCriterion("pi_level >", value, "piLevel");
            return (Criteria) this;
        }

        public Criteria andPiLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("pi_level >=", value, "piLevel");
            return (Criteria) this;
        }

        public Criteria andPiLevelLessThan(Byte value) {
            addCriterion("pi_level <", value, "piLevel");
            return (Criteria) this;
        }

        public Criteria andPiLevelLessThanOrEqualTo(Byte value) {
            addCriterion("pi_level <=", value, "piLevel");
            return (Criteria) this;
        }

        public Criteria andPiLevelIn(List<Byte> values) {
            addCriterion("pi_level in", values, "piLevel");
            return (Criteria) this;
        }

        public Criteria andPiLevelNotIn(List<Byte> values) {
            addCriterion("pi_level not in", values, "piLevel");
            return (Criteria) this;
        }

        public Criteria andPiLevelBetween(Byte value1, Byte value2) {
            addCriterion("pi_level between", value1, value2, "piLevel");
            return (Criteria) this;
        }

        public Criteria andPiLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("pi_level not between", value1, value2, "piLevel");
            return (Criteria) this;
        }

        public Criteria andPiNameIsNull() {
            addCriterion("pi_name is null");
            return (Criteria) this;
        }

        public Criteria andPiNameIsNotNull() {
            addCriterion("pi_name is not null");
            return (Criteria) this;
        }

        public Criteria andPiNameEqualTo(String value) {
            addCriterion("pi_name =", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotEqualTo(String value) {
            addCriterion("pi_name <>", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameGreaterThan(String value) {
            addCriterion("pi_name >", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameGreaterThanOrEqualTo(String value) {
            addCriterion("pi_name >=", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameLessThan(String value) {
            addCriterion("pi_name <", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameLessThanOrEqualTo(String value) {
            addCriterion("pi_name <=", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameLike(String value) {
            addCriterion("pi_name like", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotLike(String value) {
            addCriterion("pi_name not like", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameIn(List<String> values) {
            addCriterion("pi_name in", values, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotIn(List<String> values) {
            addCriterion("pi_name not in", values, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameBetween(String value1, String value2) {
            addCriterion("pi_name between", value1, value2, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotBetween(String value1, String value2) {
            addCriterion("pi_name not between", value1, value2, "piName");
            return (Criteria) this;
        }

        public Criteria andPiCheckIsNull() {
            addCriterion("pi_check is null");
            return (Criteria) this;
        }

        public Criteria andPiCheckIsNotNull() {
            addCriterion("pi_check is not null");
            return (Criteria) this;
        }

        public Criteria andPiCheckEqualTo(Byte value) {
            addCriterion("pi_check =", value, "piCheck");
            return (Criteria) this;
        }

        public Criteria andPiCheckNotEqualTo(Byte value) {
            addCriterion("pi_check <>", value, "piCheck");
            return (Criteria) this;
        }

        public Criteria andPiCheckGreaterThan(Byte value) {
            addCriterion("pi_check >", value, "piCheck");
            return (Criteria) this;
        }

        public Criteria andPiCheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("pi_check >=", value, "piCheck");
            return (Criteria) this;
        }

        public Criteria andPiCheckLessThan(Byte value) {
            addCriterion("pi_check <", value, "piCheck");
            return (Criteria) this;
        }

        public Criteria andPiCheckLessThanOrEqualTo(Byte value) {
            addCriterion("pi_check <=", value, "piCheck");
            return (Criteria) this;
        }

        public Criteria andPiCheckIn(List<Byte> values) {
            addCriterion("pi_check in", values, "piCheck");
            return (Criteria) this;
        }

        public Criteria andPiCheckNotIn(List<Byte> values) {
            addCriterion("pi_check not in", values, "piCheck");
            return (Criteria) this;
        }

        public Criteria andPiCheckBetween(Byte value1, Byte value2) {
            addCriterion("pi_check between", value1, value2, "piCheck");
            return (Criteria) this;
        }

        public Criteria andPiCheckNotBetween(Byte value1, Byte value2) {
            addCriterion("pi_check not between", value1, value2, "piCheck");
            return (Criteria) this;
        }

        public Criteria andPiFoldIsNull() {
            addCriterion("pi_fold is null");
            return (Criteria) this;
        }

        public Criteria andPiFoldIsNotNull() {
            addCriterion("pi_fold is not null");
            return (Criteria) this;
        }

        public Criteria andPiFoldEqualTo(Boolean value) {
            addCriterion("pi_fold =", value, "piFold");
            return (Criteria) this;
        }

        public Criteria andPiFoldNotEqualTo(Boolean value) {
            addCriterion("pi_fold <>", value, "piFold");
            return (Criteria) this;
        }

        public Criteria andPiFoldGreaterThan(Boolean value) {
            addCriterion("pi_fold >", value, "piFold");
            return (Criteria) this;
        }

        public Criteria andPiFoldGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pi_fold >=", value, "piFold");
            return (Criteria) this;
        }

        public Criteria andPiFoldLessThan(Boolean value) {
            addCriterion("pi_fold <", value, "piFold");
            return (Criteria) this;
        }

        public Criteria andPiFoldLessThanOrEqualTo(Boolean value) {
            addCriterion("pi_fold <=", value, "piFold");
            return (Criteria) this;
        }

        public Criteria andPiFoldIn(List<Boolean> values) {
            addCriterion("pi_fold in", values, "piFold");
            return (Criteria) this;
        }

        public Criteria andPiFoldNotIn(List<Boolean> values) {
            addCriterion("pi_fold not in", values, "piFold");
            return (Criteria) this;
        }

        public Criteria andPiFoldBetween(Boolean value1, Boolean value2) {
            addCriterion("pi_fold between", value1, value2, "piFold");
            return (Criteria) this;
        }

        public Criteria andPiFoldNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pi_fold not between", value1, value2, "piFold");
            return (Criteria) this;
        }

        public Criteria andPiInfoIsNull() {
            addCriterion("pi_info is null");
            return (Criteria) this;
        }

        public Criteria andPiInfoIsNotNull() {
            addCriterion("pi_info is not null");
            return (Criteria) this;
        }

        public Criteria andPiInfoEqualTo(String value) {
            addCriterion("pi_info =", value, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoNotEqualTo(String value) {
            addCriterion("pi_info <>", value, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoGreaterThan(String value) {
            addCriterion("pi_info >", value, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoGreaterThanOrEqualTo(String value) {
            addCriterion("pi_info >=", value, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoLessThan(String value) {
            addCriterion("pi_info <", value, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoLessThanOrEqualTo(String value) {
            addCriterion("pi_info <=", value, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoLike(String value) {
            addCriterion("pi_info like", value, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoNotLike(String value) {
            addCriterion("pi_info not like", value, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoIn(List<String> values) {
            addCriterion("pi_info in", values, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoNotIn(List<String> values) {
            addCriterion("pi_info not in", values, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoBetween(String value1, String value2) {
            addCriterion("pi_info between", value1, value2, "piInfo");
            return (Criteria) this;
        }

        public Criteria andPiInfoNotBetween(String value1, String value2) {
            addCriterion("pi_info not between", value1, value2, "piInfo");
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