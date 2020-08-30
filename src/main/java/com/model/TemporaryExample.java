package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TemporaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TemporaryExample() {
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

        public Criteria andTyIdIsNull() {
            addCriterion("ty_id is null");
            return (Criteria) this;
        }

        public Criteria andTyIdIsNotNull() {
            addCriterion("ty_id is not null");
            return (Criteria) this;
        }

        public Criteria andTyIdEqualTo(Integer value) {
            addCriterion("ty_id =", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdNotEqualTo(Integer value) {
            addCriterion("ty_id <>", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdGreaterThan(Integer value) {
            addCriterion("ty_id >", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ty_id >=", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdLessThan(Integer value) {
            addCriterion("ty_id <", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ty_id <=", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdIn(List<Integer> values) {
            addCriterion("ty_id in", values, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdNotIn(List<Integer> values) {
            addCriterion("ty_id not in", values, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdBetween(Integer value1, Integer value2) {
            addCriterion("ty_id between", value1, value2, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ty_id not between", value1, value2, "tyId");
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

        public Criteria andTyCodeIsNull() {
            addCriterion("ty_code is null");
            return (Criteria) this;
        }

        public Criteria andTyCodeIsNotNull() {
            addCriterion("ty_code is not null");
            return (Criteria) this;
        }

        public Criteria andTyCodeEqualTo(String value) {
            addCriterion("ty_code =", value, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeNotEqualTo(String value) {
            addCriterion("ty_code <>", value, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeGreaterThan(String value) {
            addCriterion("ty_code >", value, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ty_code >=", value, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeLessThan(String value) {
            addCriterion("ty_code <", value, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeLessThanOrEqualTo(String value) {
            addCriterion("ty_code <=", value, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeLike(String value) {
            addCriterion("ty_code like", value, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeNotLike(String value) {
            addCriterion("ty_code not like", value, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeIn(List<String> values) {
            addCriterion("ty_code in", values, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeNotIn(List<String> values) {
            addCriterion("ty_code not in", values, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeBetween(String value1, String value2) {
            addCriterion("ty_code between", value1, value2, "tyCode");
            return (Criteria) this;
        }

        public Criteria andTyCodeNotBetween(String value1, String value2) {
            addCriterion("ty_code not between", value1, value2, "tyCode");
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

        public Criteria andTyDateIsNull() {
            addCriterion("ty_date is null");
            return (Criteria) this;
        }

        public Criteria andTyDateIsNotNull() {
            addCriterion("ty_date is not null");
            return (Criteria) this;
        }

        public Criteria andTyDateEqualTo(Date value) {
            addCriterion("ty_date =", value, "tyDate");
            return (Criteria) this;
        }

        public Criteria andTyDateNotEqualTo(Date value) {
            addCriterion("ty_date <>", value, "tyDate");
            return (Criteria) this;
        }

        public Criteria andTyDateGreaterThan(Date value) {
            addCriterion("ty_date >", value, "tyDate");
            return (Criteria) this;
        }

        public Criteria andTyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ty_date >=", value, "tyDate");
            return (Criteria) this;
        }

        public Criteria andTyDateLessThan(Date value) {
            addCriterion("ty_date <", value, "tyDate");
            return (Criteria) this;
        }

        public Criteria andTyDateLessThanOrEqualTo(Date value) {
            addCriterion("ty_date <=", value, "tyDate");
            return (Criteria) this;
        }

        public Criteria andTyDateIn(List<Date> values) {
            addCriterion("ty_date in", values, "tyDate");
            return (Criteria) this;
        }

        public Criteria andTyDateNotIn(List<Date> values) {
            addCriterion("ty_date not in", values, "tyDate");
            return (Criteria) this;
        }

        public Criteria andTyDateBetween(Date value1, Date value2) {
            addCriterion("ty_date between", value1, value2, "tyDate");
            return (Criteria) this;
        }

        public Criteria andTyDateNotBetween(Date value1, Date value2) {
            addCriterion("ty_date not between", value1, value2, "tyDate");
            return (Criteria) this;
        }

        public Criteria andTyNameIsNull() {
            addCriterion("ty_name is null");
            return (Criteria) this;
        }

        public Criteria andTyNameIsNotNull() {
            addCriterion("ty_name is not null");
            return (Criteria) this;
        }

        public Criteria andTyNameEqualTo(String value) {
            addCriterion("ty_name =", value, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameNotEqualTo(String value) {
            addCriterion("ty_name <>", value, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameGreaterThan(String value) {
            addCriterion("ty_name >", value, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameGreaterThanOrEqualTo(String value) {
            addCriterion("ty_name >=", value, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameLessThan(String value) {
            addCriterion("ty_name <", value, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameLessThanOrEqualTo(String value) {
            addCriterion("ty_name <=", value, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameLike(String value) {
            addCriterion("ty_name like", value, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameNotLike(String value) {
            addCriterion("ty_name not like", value, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameIn(List<String> values) {
            addCriterion("ty_name in", values, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameNotIn(List<String> values) {
            addCriterion("ty_name not in", values, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameBetween(String value1, String value2) {
            addCriterion("ty_name between", value1, value2, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyNameNotBetween(String value1, String value2) {
            addCriterion("ty_name not between", value1, value2, "tyName");
            return (Criteria) this;
        }

        public Criteria andTyUnitIsNull() {
            addCriterion("ty_unit is null");
            return (Criteria) this;
        }

        public Criteria andTyUnitIsNotNull() {
            addCriterion("ty_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTyUnitEqualTo(String value) {
            addCriterion("ty_unit =", value, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitNotEqualTo(String value) {
            addCriterion("ty_unit <>", value, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitGreaterThan(String value) {
            addCriterion("ty_unit >", value, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ty_unit >=", value, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitLessThan(String value) {
            addCriterion("ty_unit <", value, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitLessThanOrEqualTo(String value) {
            addCriterion("ty_unit <=", value, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitLike(String value) {
            addCriterion("ty_unit like", value, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitNotLike(String value) {
            addCriterion("ty_unit not like", value, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitIn(List<String> values) {
            addCriterion("ty_unit in", values, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitNotIn(List<String> values) {
            addCriterion("ty_unit not in", values, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitBetween(String value1, String value2) {
            addCriterion("ty_unit between", value1, value2, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyUnitNotBetween(String value1, String value2) {
            addCriterion("ty_unit not between", value1, value2, "tyUnit");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignIsNull() {
            addCriterion("ty_do_design is null");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignIsNotNull() {
            addCriterion("ty_do_design is not null");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignEqualTo(Double value) {
            addCriterion("ty_do_design =", value, "tyDoDesign");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignNotEqualTo(Double value) {
            addCriterion("ty_do_design <>", value, "tyDoDesign");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignGreaterThan(Double value) {
            addCriterion("ty_do_design >", value, "tyDoDesign");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("ty_do_design >=", value, "tyDoDesign");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignLessThan(Double value) {
            addCriterion("ty_do_design <", value, "tyDoDesign");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignLessThanOrEqualTo(Double value) {
            addCriterion("ty_do_design <=", value, "tyDoDesign");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignIn(List<Double> values) {
            addCriterion("ty_do_design in", values, "tyDoDesign");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignNotIn(List<Double> values) {
            addCriterion("ty_do_design not in", values, "tyDoDesign");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignBetween(Double value1, Double value2) {
            addCriterion("ty_do_design between", value1, value2, "tyDoDesign");
            return (Criteria) this;
        }

        public Criteria andTyDoDesignNotBetween(Double value1, Double value2) {
            addCriterion("ty_do_design not between", value1, value2, "tyDoDesign");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeIsNull() {
            addCriterion("ty_do_change is null");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeIsNotNull() {
            addCriterion("ty_do_change is not null");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeEqualTo(Double value) {
            addCriterion("ty_do_change =", value, "tyDoChange");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeNotEqualTo(Double value) {
            addCriterion("ty_do_change <>", value, "tyDoChange");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeGreaterThan(Double value) {
            addCriterion("ty_do_change >", value, "tyDoChange");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("ty_do_change >=", value, "tyDoChange");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeLessThan(Double value) {
            addCriterion("ty_do_change <", value, "tyDoChange");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeLessThanOrEqualTo(Double value) {
            addCriterion("ty_do_change <=", value, "tyDoChange");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeIn(List<Double> values) {
            addCriterion("ty_do_change in", values, "tyDoChange");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeNotIn(List<Double> values) {
            addCriterion("ty_do_change not in", values, "tyDoChange");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeBetween(Double value1, Double value2) {
            addCriterion("ty_do_change between", value1, value2, "tyDoChange");
            return (Criteria) this;
        }

        public Criteria andTyDoChangeNotBetween(Double value1, Double value2) {
            addCriterion("ty_do_change not between", value1, value2, "tyDoChange");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignIsNull() {
            addCriterion("ty_up_design is null");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignIsNotNull() {
            addCriterion("ty_up_design is not null");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignEqualTo(Double value) {
            addCriterion("ty_up_design =", value, "tyUpDesign");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignNotEqualTo(Double value) {
            addCriterion("ty_up_design <>", value, "tyUpDesign");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignGreaterThan(Double value) {
            addCriterion("ty_up_design >", value, "tyUpDesign");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("ty_up_design >=", value, "tyUpDesign");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignLessThan(Double value) {
            addCriterion("ty_up_design <", value, "tyUpDesign");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignLessThanOrEqualTo(Double value) {
            addCriterion("ty_up_design <=", value, "tyUpDesign");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignIn(List<Double> values) {
            addCriterion("ty_up_design in", values, "tyUpDesign");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignNotIn(List<Double> values) {
            addCriterion("ty_up_design not in", values, "tyUpDesign");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignBetween(Double value1, Double value2) {
            addCriterion("ty_up_design between", value1, value2, "tyUpDesign");
            return (Criteria) this;
        }

        public Criteria andTyUpDesignNotBetween(Double value1, Double value2) {
            addCriterion("ty_up_design not between", value1, value2, "tyUpDesign");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeIsNull() {
            addCriterion("ty_up_change is null");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeIsNotNull() {
            addCriterion("ty_up_change is not null");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeEqualTo(Double value) {
            addCriterion("ty_up_change =", value, "tyUpChange");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeNotEqualTo(Double value) {
            addCriterion("ty_up_change <>", value, "tyUpChange");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeGreaterThan(Double value) {
            addCriterion("ty_up_change >", value, "tyUpChange");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("ty_up_change >=", value, "tyUpChange");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeLessThan(Double value) {
            addCriterion("ty_up_change <", value, "tyUpChange");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeLessThanOrEqualTo(Double value) {
            addCriterion("ty_up_change <=", value, "tyUpChange");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeIn(List<Double> values) {
            addCriterion("ty_up_change in", values, "tyUpChange");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeNotIn(List<Double> values) {
            addCriterion("ty_up_change not in", values, "tyUpChange");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeBetween(Double value1, Double value2) {
            addCriterion("ty_up_change between", value1, value2, "tyUpChange");
            return (Criteria) this;
        }

        public Criteria andTyUpChangeNotBetween(Double value1, Double value2) {
            addCriterion("ty_up_change not between", value1, value2, "tyUpChange");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignIsNull() {
            addCriterion("ty_down_design is null");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignIsNotNull() {
            addCriterion("ty_down_design is not null");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignEqualTo(Double value) {
            addCriterion("ty_down_design =", value, "tyDownDesign");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignNotEqualTo(Double value) {
            addCriterion("ty_down_design <>", value, "tyDownDesign");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignGreaterThan(Double value) {
            addCriterion("ty_down_design >", value, "tyDownDesign");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("ty_down_design >=", value, "tyDownDesign");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignLessThan(Double value) {
            addCriterion("ty_down_design <", value, "tyDownDesign");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignLessThanOrEqualTo(Double value) {
            addCriterion("ty_down_design <=", value, "tyDownDesign");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignIn(List<Double> values) {
            addCriterion("ty_down_design in", values, "tyDownDesign");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignNotIn(List<Double> values) {
            addCriterion("ty_down_design not in", values, "tyDownDesign");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignBetween(Double value1, Double value2) {
            addCriterion("ty_down_design between", value1, value2, "tyDownDesign");
            return (Criteria) this;
        }

        public Criteria andTyDownDesignNotBetween(Double value1, Double value2) {
            addCriterion("ty_down_design not between", value1, value2, "tyDownDesign");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeIsNull() {
            addCriterion("ty_down_change is null");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeIsNotNull() {
            addCriterion("ty_down_change is not null");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeEqualTo(Double value) {
            addCriterion("ty_down_change =", value, "tyDownChange");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeNotEqualTo(Double value) {
            addCriterion("ty_down_change <>", value, "tyDownChange");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeGreaterThan(Double value) {
            addCriterion("ty_down_change >", value, "tyDownChange");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("ty_down_change >=", value, "tyDownChange");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeLessThan(Double value) {
            addCriterion("ty_down_change <", value, "tyDownChange");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeLessThanOrEqualTo(Double value) {
            addCriterion("ty_down_change <=", value, "tyDownChange");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeIn(List<Double> values) {
            addCriterion("ty_down_change in", values, "tyDownChange");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeNotIn(List<Double> values) {
            addCriterion("ty_down_change not in", values, "tyDownChange");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeBetween(Double value1, Double value2) {
            addCriterion("ty_down_change between", value1, value2, "tyDownChange");
            return (Criteria) this;
        }

        public Criteria andTyDownChangeNotBetween(Double value1, Double value2) {
            addCriterion("ty_down_change not between", value1, value2, "tyDownChange");
            return (Criteria) this;
        }

        public Criteria andTyInfoIsNull() {
            addCriterion("ty_info is null");
            return (Criteria) this;
        }

        public Criteria andTyInfoIsNotNull() {
            addCriterion("ty_info is not null");
            return (Criteria) this;
        }

        public Criteria andTyInfoEqualTo(String value) {
            addCriterion("ty_info =", value, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoNotEqualTo(String value) {
            addCriterion("ty_info <>", value, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoGreaterThan(String value) {
            addCriterion("ty_info >", value, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ty_info >=", value, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoLessThan(String value) {
            addCriterion("ty_info <", value, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoLessThanOrEqualTo(String value) {
            addCriterion("ty_info <=", value, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoLike(String value) {
            addCriterion("ty_info like", value, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoNotLike(String value) {
            addCriterion("ty_info not like", value, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoIn(List<String> values) {
            addCriterion("ty_info in", values, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoNotIn(List<String> values) {
            addCriterion("ty_info not in", values, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoBetween(String value1, String value2) {
            addCriterion("ty_info between", value1, value2, "tyInfo");
            return (Criteria) this;
        }

        public Criteria andTyInfoNotBetween(String value1, String value2) {
            addCriterion("ty_info not between", value1, value2, "tyInfo");
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