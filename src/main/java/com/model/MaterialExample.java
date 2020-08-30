package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MaterialExample() {
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

        public Criteria andMlIdIsNull() {
            addCriterion("ml_id is null");
            return (Criteria) this;
        }

        public Criteria andMlIdIsNotNull() {
            addCriterion("ml_id is not null");
            return (Criteria) this;
        }

        public Criteria andMlIdEqualTo(Integer value) {
            addCriterion("ml_id =", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdNotEqualTo(Integer value) {
            addCriterion("ml_id <>", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdGreaterThan(Integer value) {
            addCriterion("ml_id >", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ml_id >=", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdLessThan(Integer value) {
            addCriterion("ml_id <", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdLessThanOrEqualTo(Integer value) {
            addCriterion("ml_id <=", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdIn(List<Integer> values) {
            addCriterion("ml_id in", values, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdNotIn(List<Integer> values) {
            addCriterion("ml_id not in", values, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdBetween(Integer value1, Integer value2) {
            addCriterion("ml_id between", value1, value2, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ml_id not between", value1, value2, "mlId");
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

        public Criteria andMlCodeIsNull() {
            addCriterion("ml_code is null");
            return (Criteria) this;
        }

        public Criteria andMlCodeIsNotNull() {
            addCriterion("ml_code is not null");
            return (Criteria) this;
        }

        public Criteria andMlCodeEqualTo(String value) {
            addCriterion("ml_code =", value, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeNotEqualTo(String value) {
            addCriterion("ml_code <>", value, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeGreaterThan(String value) {
            addCriterion("ml_code >", value, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ml_code >=", value, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeLessThan(String value) {
            addCriterion("ml_code <", value, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeLessThanOrEqualTo(String value) {
            addCriterion("ml_code <=", value, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeLike(String value) {
            addCriterion("ml_code like", value, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeNotLike(String value) {
            addCriterion("ml_code not like", value, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeIn(List<String> values) {
            addCriterion("ml_code in", values, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeNotIn(List<String> values) {
            addCriterion("ml_code not in", values, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeBetween(String value1, String value2) {
            addCriterion("ml_code between", value1, value2, "mlCode");
            return (Criteria) this;
        }

        public Criteria andMlCodeNotBetween(String value1, String value2) {
            addCriterion("ml_code not between", value1, value2, "mlCode");
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

        public Criteria andMlDateIsNull() {
            addCriterion("ml_date is null");
            return (Criteria) this;
        }

        public Criteria andMlDateIsNotNull() {
            addCriterion("ml_date is not null");
            return (Criteria) this;
        }

        public Criteria andMlDateEqualTo(Date value) {
            addCriterion("ml_date =", value, "mlDate");
            return (Criteria) this;
        }

        public Criteria andMlDateNotEqualTo(Date value) {
            addCriterion("ml_date <>", value, "mlDate");
            return (Criteria) this;
        }

        public Criteria andMlDateGreaterThan(Date value) {
            addCriterion("ml_date >", value, "mlDate");
            return (Criteria) this;
        }

        public Criteria andMlDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ml_date >=", value, "mlDate");
            return (Criteria) this;
        }

        public Criteria andMlDateLessThan(Date value) {
            addCriterion("ml_date <", value, "mlDate");
            return (Criteria) this;
        }

        public Criteria andMlDateLessThanOrEqualTo(Date value) {
            addCriterion("ml_date <=", value, "mlDate");
            return (Criteria) this;
        }

        public Criteria andMlDateIn(List<Date> values) {
            addCriterion("ml_date in", values, "mlDate");
            return (Criteria) this;
        }

        public Criteria andMlDateNotIn(List<Date> values) {
            addCriterion("ml_date not in", values, "mlDate");
            return (Criteria) this;
        }

        public Criteria andMlDateBetween(Date value1, Date value2) {
            addCriterion("ml_date between", value1, value2, "mlDate");
            return (Criteria) this;
        }

        public Criteria andMlDateNotBetween(Date value1, Date value2) {
            addCriterion("ml_date not between", value1, value2, "mlDate");
            return (Criteria) this;
        }

        public Criteria andMlNameIsNull() {
            addCriterion("ml_name is null");
            return (Criteria) this;
        }

        public Criteria andMlNameIsNotNull() {
            addCriterion("ml_name is not null");
            return (Criteria) this;
        }

        public Criteria andMlNameEqualTo(String value) {
            addCriterion("ml_name =", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameNotEqualTo(String value) {
            addCriterion("ml_name <>", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameGreaterThan(String value) {
            addCriterion("ml_name >", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameGreaterThanOrEqualTo(String value) {
            addCriterion("ml_name >=", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameLessThan(String value) {
            addCriterion("ml_name <", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameLessThanOrEqualTo(String value) {
            addCriterion("ml_name <=", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameLike(String value) {
            addCriterion("ml_name like", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameNotLike(String value) {
            addCriterion("ml_name not like", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameIn(List<String> values) {
            addCriterion("ml_name in", values, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameNotIn(List<String> values) {
            addCriterion("ml_name not in", values, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameBetween(String value1, String value2) {
            addCriterion("ml_name between", value1, value2, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameNotBetween(String value1, String value2) {
            addCriterion("ml_name not between", value1, value2, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlUnitIsNull() {
            addCriterion("ml_unit is null");
            return (Criteria) this;
        }

        public Criteria andMlUnitIsNotNull() {
            addCriterion("ml_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMlUnitEqualTo(String value) {
            addCriterion("ml_unit =", value, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitNotEqualTo(String value) {
            addCriterion("ml_unit <>", value, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitGreaterThan(String value) {
            addCriterion("ml_unit >", value, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ml_unit >=", value, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitLessThan(String value) {
            addCriterion("ml_unit <", value, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitLessThanOrEqualTo(String value) {
            addCriterion("ml_unit <=", value, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitLike(String value) {
            addCriterion("ml_unit like", value, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitNotLike(String value) {
            addCriterion("ml_unit not like", value, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitIn(List<String> values) {
            addCriterion("ml_unit in", values, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitNotIn(List<String> values) {
            addCriterion("ml_unit not in", values, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitBetween(String value1, String value2) {
            addCriterion("ml_unit between", value1, value2, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlUnitNotBetween(String value1, String value2) {
            addCriterion("ml_unit not between", value1, value2, "mlUnit");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignIsNull() {
            addCriterion("ml_do_design is null");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignIsNotNull() {
            addCriterion("ml_do_design is not null");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignEqualTo(Double value) {
            addCriterion("ml_do_design =", value, "mlDoDesign");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignNotEqualTo(Double value) {
            addCriterion("ml_do_design <>", value, "mlDoDesign");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignGreaterThan(Double value) {
            addCriterion("ml_do_design >", value, "mlDoDesign");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("ml_do_design >=", value, "mlDoDesign");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignLessThan(Double value) {
            addCriterion("ml_do_design <", value, "mlDoDesign");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignLessThanOrEqualTo(Double value) {
            addCriterion("ml_do_design <=", value, "mlDoDesign");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignIn(List<Double> values) {
            addCriterion("ml_do_design in", values, "mlDoDesign");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignNotIn(List<Double> values) {
            addCriterion("ml_do_design not in", values, "mlDoDesign");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignBetween(Double value1, Double value2) {
            addCriterion("ml_do_design between", value1, value2, "mlDoDesign");
            return (Criteria) this;
        }

        public Criteria andMlDoDesignNotBetween(Double value1, Double value2) {
            addCriterion("ml_do_design not between", value1, value2, "mlDoDesign");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeIsNull() {
            addCriterion("ml_do_change is null");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeIsNotNull() {
            addCriterion("ml_do_change is not null");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeEqualTo(Double value) {
            addCriterion("ml_do_change =", value, "mlDoChange");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeNotEqualTo(Double value) {
            addCriterion("ml_do_change <>", value, "mlDoChange");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeGreaterThan(Double value) {
            addCriterion("ml_do_change >", value, "mlDoChange");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("ml_do_change >=", value, "mlDoChange");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeLessThan(Double value) {
            addCriterion("ml_do_change <", value, "mlDoChange");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeLessThanOrEqualTo(Double value) {
            addCriterion("ml_do_change <=", value, "mlDoChange");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeIn(List<Double> values) {
            addCriterion("ml_do_change in", values, "mlDoChange");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeNotIn(List<Double> values) {
            addCriterion("ml_do_change not in", values, "mlDoChange");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeBetween(Double value1, Double value2) {
            addCriterion("ml_do_change between", value1, value2, "mlDoChange");
            return (Criteria) this;
        }

        public Criteria andMlDoChangeNotBetween(Double value1, Double value2) {
            addCriterion("ml_do_change not between", value1, value2, "mlDoChange");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignIsNull() {
            addCriterion("ml_up_design is null");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignIsNotNull() {
            addCriterion("ml_up_design is not null");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignEqualTo(Double value) {
            addCriterion("ml_up_design =", value, "mlUpDesign");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignNotEqualTo(Double value) {
            addCriterion("ml_up_design <>", value, "mlUpDesign");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignGreaterThan(Double value) {
            addCriterion("ml_up_design >", value, "mlUpDesign");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("ml_up_design >=", value, "mlUpDesign");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignLessThan(Double value) {
            addCriterion("ml_up_design <", value, "mlUpDesign");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignLessThanOrEqualTo(Double value) {
            addCriterion("ml_up_design <=", value, "mlUpDesign");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignIn(List<Double> values) {
            addCriterion("ml_up_design in", values, "mlUpDesign");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignNotIn(List<Double> values) {
            addCriterion("ml_up_design not in", values, "mlUpDesign");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignBetween(Double value1, Double value2) {
            addCriterion("ml_up_design between", value1, value2, "mlUpDesign");
            return (Criteria) this;
        }

        public Criteria andMlUpDesignNotBetween(Double value1, Double value2) {
            addCriterion("ml_up_design not between", value1, value2, "mlUpDesign");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeIsNull() {
            addCriterion("ml_up_change is null");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeIsNotNull() {
            addCriterion("ml_up_change is not null");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeEqualTo(Double value) {
            addCriterion("ml_up_change =", value, "mlUpChange");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeNotEqualTo(Double value) {
            addCriterion("ml_up_change <>", value, "mlUpChange");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeGreaterThan(Double value) {
            addCriterion("ml_up_change >", value, "mlUpChange");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("ml_up_change >=", value, "mlUpChange");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeLessThan(Double value) {
            addCriterion("ml_up_change <", value, "mlUpChange");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeLessThanOrEqualTo(Double value) {
            addCriterion("ml_up_change <=", value, "mlUpChange");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeIn(List<Double> values) {
            addCriterion("ml_up_change in", values, "mlUpChange");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeNotIn(List<Double> values) {
            addCriterion("ml_up_change not in", values, "mlUpChange");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeBetween(Double value1, Double value2) {
            addCriterion("ml_up_change between", value1, value2, "mlUpChange");
            return (Criteria) this;
        }

        public Criteria andMlUpChangeNotBetween(Double value1, Double value2) {
            addCriterion("ml_up_change not between", value1, value2, "mlUpChange");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignIsNull() {
            addCriterion("ml_down_design is null");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignIsNotNull() {
            addCriterion("ml_down_design is not null");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignEqualTo(Double value) {
            addCriterion("ml_down_design =", value, "mlDownDesign");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignNotEqualTo(Double value) {
            addCriterion("ml_down_design <>", value, "mlDownDesign");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignGreaterThan(Double value) {
            addCriterion("ml_down_design >", value, "mlDownDesign");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("ml_down_design >=", value, "mlDownDesign");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignLessThan(Double value) {
            addCriterion("ml_down_design <", value, "mlDownDesign");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignLessThanOrEqualTo(Double value) {
            addCriterion("ml_down_design <=", value, "mlDownDesign");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignIn(List<Double> values) {
            addCriterion("ml_down_design in", values, "mlDownDesign");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignNotIn(List<Double> values) {
            addCriterion("ml_down_design not in", values, "mlDownDesign");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignBetween(Double value1, Double value2) {
            addCriterion("ml_down_design between", value1, value2, "mlDownDesign");
            return (Criteria) this;
        }

        public Criteria andMlDownDesignNotBetween(Double value1, Double value2) {
            addCriterion("ml_down_design not between", value1, value2, "mlDownDesign");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeIsNull() {
            addCriterion("ml_down_change is null");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeIsNotNull() {
            addCriterion("ml_down_change is not null");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeEqualTo(Double value) {
            addCriterion("ml_down_change =", value, "mlDownChange");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeNotEqualTo(Double value) {
            addCriterion("ml_down_change <>", value, "mlDownChange");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeGreaterThan(Double value) {
            addCriterion("ml_down_change >", value, "mlDownChange");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("ml_down_change >=", value, "mlDownChange");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeLessThan(Double value) {
            addCriterion("ml_down_change <", value, "mlDownChange");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeLessThanOrEqualTo(Double value) {
            addCriterion("ml_down_change <=", value, "mlDownChange");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeIn(List<Double> values) {
            addCriterion("ml_down_change in", values, "mlDownChange");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeNotIn(List<Double> values) {
            addCriterion("ml_down_change not in", values, "mlDownChange");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeBetween(Double value1, Double value2) {
            addCriterion("ml_down_change between", value1, value2, "mlDownChange");
            return (Criteria) this;
        }

        public Criteria andMlDownChangeNotBetween(Double value1, Double value2) {
            addCriterion("ml_down_change not between", value1, value2, "mlDownChange");
            return (Criteria) this;
        }

        public Criteria andMlInfoIsNull() {
            addCriterion("ml_info is null");
            return (Criteria) this;
        }

        public Criteria andMlInfoIsNotNull() {
            addCriterion("ml_info is not null");
            return (Criteria) this;
        }

        public Criteria andMlInfoEqualTo(String value) {
            addCriterion("ml_info =", value, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoNotEqualTo(String value) {
            addCriterion("ml_info <>", value, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoGreaterThan(String value) {
            addCriterion("ml_info >", value, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ml_info >=", value, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoLessThan(String value) {
            addCriterion("ml_info <", value, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoLessThanOrEqualTo(String value) {
            addCriterion("ml_info <=", value, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoLike(String value) {
            addCriterion("ml_info like", value, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoNotLike(String value) {
            addCriterion("ml_info not like", value, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoIn(List<String> values) {
            addCriterion("ml_info in", values, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoNotIn(List<String> values) {
            addCriterion("ml_info not in", values, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoBetween(String value1, String value2) {
            addCriterion("ml_info between", value1, value2, "mlInfo");
            return (Criteria) this;
        }

        public Criteria andMlInfoNotBetween(String value1, String value2) {
            addCriterion("ml_info not between", value1, value2, "mlInfo");
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