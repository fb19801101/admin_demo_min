package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuantityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public QuantityExample() {
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

        public Criteria andQyIdIsNull() {
            addCriterion("qy_id is null");
            return (Criteria) this;
        }

        public Criteria andQyIdIsNotNull() {
            addCriterion("qy_id is not null");
            return (Criteria) this;
        }

        public Criteria andQyIdEqualTo(Integer value) {
            addCriterion("qy_id =", value, "qyId");
            return (Criteria) this;
        }

        public Criteria andQyIdNotEqualTo(Integer value) {
            addCriterion("qy_id <>", value, "qyId");
            return (Criteria) this;
        }

        public Criteria andQyIdGreaterThan(Integer value) {
            addCriterion("qy_id >", value, "qyId");
            return (Criteria) this;
        }

        public Criteria andQyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qy_id >=", value, "qyId");
            return (Criteria) this;
        }

        public Criteria andQyIdLessThan(Integer value) {
            addCriterion("qy_id <", value, "qyId");
            return (Criteria) this;
        }

        public Criteria andQyIdLessThanOrEqualTo(Integer value) {
            addCriterion("qy_id <=", value, "qyId");
            return (Criteria) this;
        }

        public Criteria andQyIdIn(List<Integer> values) {
            addCriterion("qy_id in", values, "qyId");
            return (Criteria) this;
        }

        public Criteria andQyIdNotIn(List<Integer> values) {
            addCriterion("qy_id not in", values, "qyId");
            return (Criteria) this;
        }

        public Criteria andQyIdBetween(Integer value1, Integer value2) {
            addCriterion("qy_id between", value1, value2, "qyId");
            return (Criteria) this;
        }

        public Criteria andQyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qy_id not between", value1, value2, "qyId");
            return (Criteria) this;
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

        public Criteria andClIdIsNull() {
            addCriterion("cl_id is null");
            return (Criteria) this;
        }

        public Criteria andClIdIsNotNull() {
            addCriterion("cl_id is not null");
            return (Criteria) this;
        }

        public Criteria andClIdEqualTo(Integer value) {
            addCriterion("cl_id =", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotEqualTo(Integer value) {
            addCriterion("cl_id <>", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdGreaterThan(Integer value) {
            addCriterion("cl_id >", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cl_id >=", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdLessThan(Integer value) {
            addCriterion("cl_id <", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdLessThanOrEqualTo(Integer value) {
            addCriterion("cl_id <=", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdIn(List<Integer> values) {
            addCriterion("cl_id in", values, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotIn(List<Integer> values) {
            addCriterion("cl_id not in", values, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdBetween(Integer value1, Integer value2) {
            addCriterion("cl_id between", value1, value2, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cl_id not between", value1, value2, "clId");
            return (Criteria) this;
        }

        public Criteria andQyCodeIsNull() {
            addCriterion("qy_code is null");
            return (Criteria) this;
        }

        public Criteria andQyCodeIsNotNull() {
            addCriterion("qy_code is not null");
            return (Criteria) this;
        }

        public Criteria andQyCodeEqualTo(String value) {
            addCriterion("qy_code =", value, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeNotEqualTo(String value) {
            addCriterion("qy_code <>", value, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeGreaterThan(String value) {
            addCriterion("qy_code >", value, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qy_code >=", value, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeLessThan(String value) {
            addCriterion("qy_code <", value, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeLessThanOrEqualTo(String value) {
            addCriterion("qy_code <=", value, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeLike(String value) {
            addCriterion("qy_code like", value, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeNotLike(String value) {
            addCriterion("qy_code not like", value, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeIn(List<String> values) {
            addCriterion("qy_code in", values, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeNotIn(List<String> values) {
            addCriterion("qy_code not in", values, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeBetween(String value1, String value2) {
            addCriterion("qy_code between", value1, value2, "qyCode");
            return (Criteria) this;
        }

        public Criteria andQyCodeNotBetween(String value1, String value2) {
            addCriterion("qy_code not between", value1, value2, "qyCode");
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

        public Criteria andClCodeIsNull() {
            addCriterion("cl_code is null");
            return (Criteria) this;
        }

        public Criteria andClCodeIsNotNull() {
            addCriterion("cl_code is not null");
            return (Criteria) this;
        }

        public Criteria andClCodeEqualTo(String value) {
            addCriterion("cl_code =", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeNotEqualTo(String value) {
            addCriterion("cl_code <>", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeGreaterThan(String value) {
            addCriterion("cl_code >", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cl_code >=", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeLessThan(String value) {
            addCriterion("cl_code <", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeLessThanOrEqualTo(String value) {
            addCriterion("cl_code <=", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeLike(String value) {
            addCriterion("cl_code like", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeNotLike(String value) {
            addCriterion("cl_code not like", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeIn(List<String> values) {
            addCriterion("cl_code in", values, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeNotIn(List<String> values) {
            addCriterion("cl_code not in", values, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeBetween(String value1, String value2) {
            addCriterion("cl_code between", value1, value2, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeNotBetween(String value1, String value2) {
            addCriterion("cl_code not between", value1, value2, "clCode");
            return (Criteria) this;
        }

        public Criteria andQyDateIsNull() {
            addCriterion("qy_date is null");
            return (Criteria) this;
        }

        public Criteria andQyDateIsNotNull() {
            addCriterion("qy_date is not null");
            return (Criteria) this;
        }

        public Criteria andQyDateEqualTo(Date value) {
            addCriterion("qy_date =", value, "qyDate");
            return (Criteria) this;
        }

        public Criteria andQyDateNotEqualTo(Date value) {
            addCriterion("qy_date <>", value, "qyDate");
            return (Criteria) this;
        }

        public Criteria andQyDateGreaterThan(Date value) {
            addCriterion("qy_date >", value, "qyDate");
            return (Criteria) this;
        }

        public Criteria andQyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("qy_date >=", value, "qyDate");
            return (Criteria) this;
        }

        public Criteria andQyDateLessThan(Date value) {
            addCriterion("qy_date <", value, "qyDate");
            return (Criteria) this;
        }

        public Criteria andQyDateLessThanOrEqualTo(Date value) {
            addCriterion("qy_date <=", value, "qyDate");
            return (Criteria) this;
        }

        public Criteria andQyDateIn(List<Date> values) {
            addCriterion("qy_date in", values, "qyDate");
            return (Criteria) this;
        }

        public Criteria andQyDateNotIn(List<Date> values) {
            addCriterion("qy_date not in", values, "qyDate");
            return (Criteria) this;
        }

        public Criteria andQyDateBetween(Date value1, Date value2) {
            addCriterion("qy_date between", value1, value2, "qyDate");
            return (Criteria) this;
        }

        public Criteria andQyDateNotBetween(Date value1, Date value2) {
            addCriterion("qy_date not between", value1, value2, "qyDate");
            return (Criteria) this;
        }

        public Criteria andQyNameIsNull() {
            addCriterion("qy_name is null");
            return (Criteria) this;
        }

        public Criteria andQyNameIsNotNull() {
            addCriterion("qy_name is not null");
            return (Criteria) this;
        }

        public Criteria andQyNameEqualTo(String value) {
            addCriterion("qy_name =", value, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameNotEqualTo(String value) {
            addCriterion("qy_name <>", value, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameGreaterThan(String value) {
            addCriterion("qy_name >", value, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameGreaterThanOrEqualTo(String value) {
            addCriterion("qy_name >=", value, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameLessThan(String value) {
            addCriterion("qy_name <", value, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameLessThanOrEqualTo(String value) {
            addCriterion("qy_name <=", value, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameLike(String value) {
            addCriterion("qy_name like", value, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameNotLike(String value) {
            addCriterion("qy_name not like", value, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameIn(List<String> values) {
            addCriterion("qy_name in", values, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameNotIn(List<String> values) {
            addCriterion("qy_name not in", values, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameBetween(String value1, String value2) {
            addCriterion("qy_name between", value1, value2, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyNameNotBetween(String value1, String value2) {
            addCriterion("qy_name not between", value1, value2, "qyName");
            return (Criteria) this;
        }

        public Criteria andQyUnitIsNull() {
            addCriterion("qy_unit is null");
            return (Criteria) this;
        }

        public Criteria andQyUnitIsNotNull() {
            addCriterion("qy_unit is not null");
            return (Criteria) this;
        }

        public Criteria andQyUnitEqualTo(String value) {
            addCriterion("qy_unit =", value, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitNotEqualTo(String value) {
            addCriterion("qy_unit <>", value, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitGreaterThan(String value) {
            addCriterion("qy_unit >", value, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitGreaterThanOrEqualTo(String value) {
            addCriterion("qy_unit >=", value, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitLessThan(String value) {
            addCriterion("qy_unit <", value, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitLessThanOrEqualTo(String value) {
            addCriterion("qy_unit <=", value, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitLike(String value) {
            addCriterion("qy_unit like", value, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitNotLike(String value) {
            addCriterion("qy_unit not like", value, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitIn(List<String> values) {
            addCriterion("qy_unit in", values, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitNotIn(List<String> values) {
            addCriterion("qy_unit not in", values, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitBetween(String value1, String value2) {
            addCriterion("qy_unit between", value1, value2, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyUnitNotBetween(String value1, String value2) {
            addCriterion("qy_unit not between", value1, value2, "qyUnit");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignIsNull() {
            addCriterion("qy_do_design is null");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignIsNotNull() {
            addCriterion("qy_do_design is not null");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignEqualTo(Double value) {
            addCriterion("qy_do_design =", value, "qyDoDesign");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignNotEqualTo(Double value) {
            addCriterion("qy_do_design <>", value, "qyDoDesign");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignGreaterThan(Double value) {
            addCriterion("qy_do_design >", value, "qyDoDesign");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("qy_do_design >=", value, "qyDoDesign");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignLessThan(Double value) {
            addCriterion("qy_do_design <", value, "qyDoDesign");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignLessThanOrEqualTo(Double value) {
            addCriterion("qy_do_design <=", value, "qyDoDesign");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignIn(List<Double> values) {
            addCriterion("qy_do_design in", values, "qyDoDesign");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignNotIn(List<Double> values) {
            addCriterion("qy_do_design not in", values, "qyDoDesign");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignBetween(Double value1, Double value2) {
            addCriterion("qy_do_design between", value1, value2, "qyDoDesign");
            return (Criteria) this;
        }

        public Criteria andQyDoDesignNotBetween(Double value1, Double value2) {
            addCriterion("qy_do_design not between", value1, value2, "qyDoDesign");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeIsNull() {
            addCriterion("qy_do_change is null");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeIsNotNull() {
            addCriterion("qy_do_change is not null");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeEqualTo(Double value) {
            addCriterion("qy_do_change =", value, "qyDoChange");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeNotEqualTo(Double value) {
            addCriterion("qy_do_change <>", value, "qyDoChange");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeGreaterThan(Double value) {
            addCriterion("qy_do_change >", value, "qyDoChange");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("qy_do_change >=", value, "qyDoChange");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeLessThan(Double value) {
            addCriterion("qy_do_change <", value, "qyDoChange");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeLessThanOrEqualTo(Double value) {
            addCriterion("qy_do_change <=", value, "qyDoChange");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeIn(List<Double> values) {
            addCriterion("qy_do_change in", values, "qyDoChange");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeNotIn(List<Double> values) {
            addCriterion("qy_do_change not in", values, "qyDoChange");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeBetween(Double value1, Double value2) {
            addCriterion("qy_do_change between", value1, value2, "qyDoChange");
            return (Criteria) this;
        }

        public Criteria andQyDoChangeNotBetween(Double value1, Double value2) {
            addCriterion("qy_do_change not between", value1, value2, "qyDoChange");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignIsNull() {
            addCriterion("qy_up_design is null");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignIsNotNull() {
            addCriterion("qy_up_design is not null");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignEqualTo(Double value) {
            addCriterion("qy_up_design =", value, "qyUpDesign");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignNotEqualTo(Double value) {
            addCriterion("qy_up_design <>", value, "qyUpDesign");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignGreaterThan(Double value) {
            addCriterion("qy_up_design >", value, "qyUpDesign");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("qy_up_design >=", value, "qyUpDesign");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignLessThan(Double value) {
            addCriterion("qy_up_design <", value, "qyUpDesign");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignLessThanOrEqualTo(Double value) {
            addCriterion("qy_up_design <=", value, "qyUpDesign");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignIn(List<Double> values) {
            addCriterion("qy_up_design in", values, "qyUpDesign");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignNotIn(List<Double> values) {
            addCriterion("qy_up_design not in", values, "qyUpDesign");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignBetween(Double value1, Double value2) {
            addCriterion("qy_up_design between", value1, value2, "qyUpDesign");
            return (Criteria) this;
        }

        public Criteria andQyUpDesignNotBetween(Double value1, Double value2) {
            addCriterion("qy_up_design not between", value1, value2, "qyUpDesign");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeIsNull() {
            addCriterion("qy_up_change is null");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeIsNotNull() {
            addCriterion("qy_up_change is not null");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeEqualTo(Double value) {
            addCriterion("qy_up_change =", value, "qyUpChange");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeNotEqualTo(Double value) {
            addCriterion("qy_up_change <>", value, "qyUpChange");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeGreaterThan(Double value) {
            addCriterion("qy_up_change >", value, "qyUpChange");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("qy_up_change >=", value, "qyUpChange");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeLessThan(Double value) {
            addCriterion("qy_up_change <", value, "qyUpChange");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeLessThanOrEqualTo(Double value) {
            addCriterion("qy_up_change <=", value, "qyUpChange");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeIn(List<Double> values) {
            addCriterion("qy_up_change in", values, "qyUpChange");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeNotIn(List<Double> values) {
            addCriterion("qy_up_change not in", values, "qyUpChange");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeBetween(Double value1, Double value2) {
            addCriterion("qy_up_change between", value1, value2, "qyUpChange");
            return (Criteria) this;
        }

        public Criteria andQyUpChangeNotBetween(Double value1, Double value2) {
            addCriterion("qy_up_change not between", value1, value2, "qyUpChange");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignIsNull() {
            addCriterion("qy_down_design is null");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignIsNotNull() {
            addCriterion("qy_down_design is not null");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignEqualTo(Double value) {
            addCriterion("qy_down_design =", value, "qyDownDesign");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignNotEqualTo(Double value) {
            addCriterion("qy_down_design <>", value, "qyDownDesign");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignGreaterThan(Double value) {
            addCriterion("qy_down_design >", value, "qyDownDesign");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("qy_down_design >=", value, "qyDownDesign");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignLessThan(Double value) {
            addCriterion("qy_down_design <", value, "qyDownDesign");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignLessThanOrEqualTo(Double value) {
            addCriterion("qy_down_design <=", value, "qyDownDesign");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignIn(List<Double> values) {
            addCriterion("qy_down_design in", values, "qyDownDesign");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignNotIn(List<Double> values) {
            addCriterion("qy_down_design not in", values, "qyDownDesign");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignBetween(Double value1, Double value2) {
            addCriterion("qy_down_design between", value1, value2, "qyDownDesign");
            return (Criteria) this;
        }

        public Criteria andQyDownDesignNotBetween(Double value1, Double value2) {
            addCriterion("qy_down_design not between", value1, value2, "qyDownDesign");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeIsNull() {
            addCriterion("qy_down_change is null");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeIsNotNull() {
            addCriterion("qy_down_change is not null");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeEqualTo(Double value) {
            addCriterion("qy_down_change =", value, "qyDownChange");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeNotEqualTo(Double value) {
            addCriterion("qy_down_change <>", value, "qyDownChange");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeGreaterThan(Double value) {
            addCriterion("qy_down_change >", value, "qyDownChange");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("qy_down_change >=", value, "qyDownChange");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeLessThan(Double value) {
            addCriterion("qy_down_change <", value, "qyDownChange");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeLessThanOrEqualTo(Double value) {
            addCriterion("qy_down_change <=", value, "qyDownChange");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeIn(List<Double> values) {
            addCriterion("qy_down_change in", values, "qyDownChange");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeNotIn(List<Double> values) {
            addCriterion("qy_down_change not in", values, "qyDownChange");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeBetween(Double value1, Double value2) {
            addCriterion("qy_down_change between", value1, value2, "qyDownChange");
            return (Criteria) this;
        }

        public Criteria andQyDownChangeNotBetween(Double value1, Double value2) {
            addCriterion("qy_down_change not between", value1, value2, "qyDownChange");
            return (Criteria) this;
        }

        public Criteria andQyInfoIsNull() {
            addCriterion("qy_info is null");
            return (Criteria) this;
        }

        public Criteria andQyInfoIsNotNull() {
            addCriterion("qy_info is not null");
            return (Criteria) this;
        }

        public Criteria andQyInfoEqualTo(String value) {
            addCriterion("qy_info =", value, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoNotEqualTo(String value) {
            addCriterion("qy_info <>", value, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoGreaterThan(String value) {
            addCriterion("qy_info >", value, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("qy_info >=", value, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoLessThan(String value) {
            addCriterion("qy_info <", value, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoLessThanOrEqualTo(String value) {
            addCriterion("qy_info <=", value, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoLike(String value) {
            addCriterion("qy_info like", value, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoNotLike(String value) {
            addCriterion("qy_info not like", value, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoIn(List<String> values) {
            addCriterion("qy_info in", values, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoNotIn(List<String> values) {
            addCriterion("qy_info not in", values, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoBetween(String value1, String value2) {
            addCriterion("qy_info between", value1, value2, "qyInfo");
            return (Criteria) this;
        }

        public Criteria andQyInfoNotBetween(String value1, String value2) {
            addCriterion("qy_info not between", value1, value2, "qyInfo");
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