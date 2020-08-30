package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DemolitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DemolitionExample() {
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

        public Criteria andDnIdIsNull() {
            addCriterion("dn_id is null");
            return (Criteria) this;
        }

        public Criteria andDnIdIsNotNull() {
            addCriterion("dn_id is not null");
            return (Criteria) this;
        }

        public Criteria andDnIdEqualTo(Integer value) {
            addCriterion("dn_id =", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdNotEqualTo(Integer value) {
            addCriterion("dn_id <>", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdGreaterThan(Integer value) {
            addCriterion("dn_id >", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dn_id >=", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdLessThan(Integer value) {
            addCriterion("dn_id <", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdLessThanOrEqualTo(Integer value) {
            addCriterion("dn_id <=", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdIn(List<Integer> values) {
            addCriterion("dn_id in", values, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdNotIn(List<Integer> values) {
            addCriterion("dn_id not in", values, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdBetween(Integer value1, Integer value2) {
            addCriterion("dn_id between", value1, value2, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dn_id not between", value1, value2, "dnId");
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

        public Criteria andDnCodeIsNull() {
            addCriterion("dn_code is null");
            return (Criteria) this;
        }

        public Criteria andDnCodeIsNotNull() {
            addCriterion("dn_code is not null");
            return (Criteria) this;
        }

        public Criteria andDnCodeEqualTo(String value) {
            addCriterion("dn_code =", value, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeNotEqualTo(String value) {
            addCriterion("dn_code <>", value, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeGreaterThan(String value) {
            addCriterion("dn_code >", value, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dn_code >=", value, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeLessThan(String value) {
            addCriterion("dn_code <", value, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeLessThanOrEqualTo(String value) {
            addCriterion("dn_code <=", value, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeLike(String value) {
            addCriterion("dn_code like", value, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeNotLike(String value) {
            addCriterion("dn_code not like", value, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeIn(List<String> values) {
            addCriterion("dn_code in", values, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeNotIn(List<String> values) {
            addCriterion("dn_code not in", values, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeBetween(String value1, String value2) {
            addCriterion("dn_code between", value1, value2, "dnCode");
            return (Criteria) this;
        }

        public Criteria andDnCodeNotBetween(String value1, String value2) {
            addCriterion("dn_code not between", value1, value2, "dnCode");
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

        public Criteria andDnDateIsNull() {
            addCriterion("dn_date is null");
            return (Criteria) this;
        }

        public Criteria andDnDateIsNotNull() {
            addCriterion("dn_date is not null");
            return (Criteria) this;
        }

        public Criteria andDnDateEqualTo(Date value) {
            addCriterion("dn_date =", value, "dnDate");
            return (Criteria) this;
        }

        public Criteria andDnDateNotEqualTo(Date value) {
            addCriterion("dn_date <>", value, "dnDate");
            return (Criteria) this;
        }

        public Criteria andDnDateGreaterThan(Date value) {
            addCriterion("dn_date >", value, "dnDate");
            return (Criteria) this;
        }

        public Criteria andDnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("dn_date >=", value, "dnDate");
            return (Criteria) this;
        }

        public Criteria andDnDateLessThan(Date value) {
            addCriterion("dn_date <", value, "dnDate");
            return (Criteria) this;
        }

        public Criteria andDnDateLessThanOrEqualTo(Date value) {
            addCriterion("dn_date <=", value, "dnDate");
            return (Criteria) this;
        }

        public Criteria andDnDateIn(List<Date> values) {
            addCriterion("dn_date in", values, "dnDate");
            return (Criteria) this;
        }

        public Criteria andDnDateNotIn(List<Date> values) {
            addCriterion("dn_date not in", values, "dnDate");
            return (Criteria) this;
        }

        public Criteria andDnDateBetween(Date value1, Date value2) {
            addCriterion("dn_date between", value1, value2, "dnDate");
            return (Criteria) this;
        }

        public Criteria andDnDateNotBetween(Date value1, Date value2) {
            addCriterion("dn_date not between", value1, value2, "dnDate");
            return (Criteria) this;
        }

        public Criteria andDnNameIsNull() {
            addCriterion("dn_name is null");
            return (Criteria) this;
        }

        public Criteria andDnNameIsNotNull() {
            addCriterion("dn_name is not null");
            return (Criteria) this;
        }

        public Criteria andDnNameEqualTo(String value) {
            addCriterion("dn_name =", value, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameNotEqualTo(String value) {
            addCriterion("dn_name <>", value, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameGreaterThan(String value) {
            addCriterion("dn_name >", value, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameGreaterThanOrEqualTo(String value) {
            addCriterion("dn_name >=", value, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameLessThan(String value) {
            addCriterion("dn_name <", value, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameLessThanOrEqualTo(String value) {
            addCriterion("dn_name <=", value, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameLike(String value) {
            addCriterion("dn_name like", value, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameNotLike(String value) {
            addCriterion("dn_name not like", value, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameIn(List<String> values) {
            addCriterion("dn_name in", values, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameNotIn(List<String> values) {
            addCriterion("dn_name not in", values, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameBetween(String value1, String value2) {
            addCriterion("dn_name between", value1, value2, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnNameNotBetween(String value1, String value2) {
            addCriterion("dn_name not between", value1, value2, "dnName");
            return (Criteria) this;
        }

        public Criteria andDnUnitIsNull() {
            addCriterion("dn_unit is null");
            return (Criteria) this;
        }

        public Criteria andDnUnitIsNotNull() {
            addCriterion("dn_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDnUnitEqualTo(String value) {
            addCriterion("dn_unit =", value, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitNotEqualTo(String value) {
            addCriterion("dn_unit <>", value, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitGreaterThan(String value) {
            addCriterion("dn_unit >", value, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitGreaterThanOrEqualTo(String value) {
            addCriterion("dn_unit >=", value, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitLessThan(String value) {
            addCriterion("dn_unit <", value, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitLessThanOrEqualTo(String value) {
            addCriterion("dn_unit <=", value, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitLike(String value) {
            addCriterion("dn_unit like", value, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitNotLike(String value) {
            addCriterion("dn_unit not like", value, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitIn(List<String> values) {
            addCriterion("dn_unit in", values, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitNotIn(List<String> values) {
            addCriterion("dn_unit not in", values, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitBetween(String value1, String value2) {
            addCriterion("dn_unit between", value1, value2, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnUnitNotBetween(String value1, String value2) {
            addCriterion("dn_unit not between", value1, value2, "dnUnit");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignIsNull() {
            addCriterion("dn_do_design is null");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignIsNotNull() {
            addCriterion("dn_do_design is not null");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignEqualTo(Double value) {
            addCriterion("dn_do_design =", value, "dnDoDesign");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignNotEqualTo(Double value) {
            addCriterion("dn_do_design <>", value, "dnDoDesign");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignGreaterThan(Double value) {
            addCriterion("dn_do_design >", value, "dnDoDesign");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("dn_do_design >=", value, "dnDoDesign");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignLessThan(Double value) {
            addCriterion("dn_do_design <", value, "dnDoDesign");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignLessThanOrEqualTo(Double value) {
            addCriterion("dn_do_design <=", value, "dnDoDesign");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignIn(List<Double> values) {
            addCriterion("dn_do_design in", values, "dnDoDesign");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignNotIn(List<Double> values) {
            addCriterion("dn_do_design not in", values, "dnDoDesign");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignBetween(Double value1, Double value2) {
            addCriterion("dn_do_design between", value1, value2, "dnDoDesign");
            return (Criteria) this;
        }

        public Criteria andDnDoDesignNotBetween(Double value1, Double value2) {
            addCriterion("dn_do_design not between", value1, value2, "dnDoDesign");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeIsNull() {
            addCriterion("dn_do_change is null");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeIsNotNull() {
            addCriterion("dn_do_change is not null");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeEqualTo(Double value) {
            addCriterion("dn_do_change =", value, "dnDoChange");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeNotEqualTo(Double value) {
            addCriterion("dn_do_change <>", value, "dnDoChange");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeGreaterThan(Double value) {
            addCriterion("dn_do_change >", value, "dnDoChange");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("dn_do_change >=", value, "dnDoChange");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeLessThan(Double value) {
            addCriterion("dn_do_change <", value, "dnDoChange");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeLessThanOrEqualTo(Double value) {
            addCriterion("dn_do_change <=", value, "dnDoChange");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeIn(List<Double> values) {
            addCriterion("dn_do_change in", values, "dnDoChange");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeNotIn(List<Double> values) {
            addCriterion("dn_do_change not in", values, "dnDoChange");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeBetween(Double value1, Double value2) {
            addCriterion("dn_do_change between", value1, value2, "dnDoChange");
            return (Criteria) this;
        }

        public Criteria andDnDoChangeNotBetween(Double value1, Double value2) {
            addCriterion("dn_do_change not between", value1, value2, "dnDoChange");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignIsNull() {
            addCriterion("dn_up_design is null");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignIsNotNull() {
            addCriterion("dn_up_design is not null");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignEqualTo(Double value) {
            addCriterion("dn_up_design =", value, "dnUpDesign");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignNotEqualTo(Double value) {
            addCriterion("dn_up_design <>", value, "dnUpDesign");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignGreaterThan(Double value) {
            addCriterion("dn_up_design >", value, "dnUpDesign");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("dn_up_design >=", value, "dnUpDesign");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignLessThan(Double value) {
            addCriterion("dn_up_design <", value, "dnUpDesign");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignLessThanOrEqualTo(Double value) {
            addCriterion("dn_up_design <=", value, "dnUpDesign");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignIn(List<Double> values) {
            addCriterion("dn_up_design in", values, "dnUpDesign");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignNotIn(List<Double> values) {
            addCriterion("dn_up_design not in", values, "dnUpDesign");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignBetween(Double value1, Double value2) {
            addCriterion("dn_up_design between", value1, value2, "dnUpDesign");
            return (Criteria) this;
        }

        public Criteria andDnUpDesignNotBetween(Double value1, Double value2) {
            addCriterion("dn_up_design not between", value1, value2, "dnUpDesign");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeIsNull() {
            addCriterion("dn_up_change is null");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeIsNotNull() {
            addCriterion("dn_up_change is not null");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeEqualTo(Double value) {
            addCriterion("dn_up_change =", value, "dnUpChange");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeNotEqualTo(Double value) {
            addCriterion("dn_up_change <>", value, "dnUpChange");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeGreaterThan(Double value) {
            addCriterion("dn_up_change >", value, "dnUpChange");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("dn_up_change >=", value, "dnUpChange");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeLessThan(Double value) {
            addCriterion("dn_up_change <", value, "dnUpChange");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeLessThanOrEqualTo(Double value) {
            addCriterion("dn_up_change <=", value, "dnUpChange");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeIn(List<Double> values) {
            addCriterion("dn_up_change in", values, "dnUpChange");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeNotIn(List<Double> values) {
            addCriterion("dn_up_change not in", values, "dnUpChange");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeBetween(Double value1, Double value2) {
            addCriterion("dn_up_change between", value1, value2, "dnUpChange");
            return (Criteria) this;
        }

        public Criteria andDnUpChangeNotBetween(Double value1, Double value2) {
            addCriterion("dn_up_change not between", value1, value2, "dnUpChange");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignIsNull() {
            addCriterion("dn_down_design is null");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignIsNotNull() {
            addCriterion("dn_down_design is not null");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignEqualTo(Double value) {
            addCriterion("dn_down_design =", value, "dnDownDesign");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignNotEqualTo(Double value) {
            addCriterion("dn_down_design <>", value, "dnDownDesign");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignGreaterThan(Double value) {
            addCriterion("dn_down_design >", value, "dnDownDesign");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("dn_down_design >=", value, "dnDownDesign");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignLessThan(Double value) {
            addCriterion("dn_down_design <", value, "dnDownDesign");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignLessThanOrEqualTo(Double value) {
            addCriterion("dn_down_design <=", value, "dnDownDesign");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignIn(List<Double> values) {
            addCriterion("dn_down_design in", values, "dnDownDesign");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignNotIn(List<Double> values) {
            addCriterion("dn_down_design not in", values, "dnDownDesign");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignBetween(Double value1, Double value2) {
            addCriterion("dn_down_design between", value1, value2, "dnDownDesign");
            return (Criteria) this;
        }

        public Criteria andDnDownDesignNotBetween(Double value1, Double value2) {
            addCriterion("dn_down_design not between", value1, value2, "dnDownDesign");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeIsNull() {
            addCriterion("dn_down_change is null");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeIsNotNull() {
            addCriterion("dn_down_change is not null");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeEqualTo(Double value) {
            addCriterion("dn_down_change =", value, "dnDownChange");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeNotEqualTo(Double value) {
            addCriterion("dn_down_change <>", value, "dnDownChange");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeGreaterThan(Double value) {
            addCriterion("dn_down_change >", value, "dnDownChange");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("dn_down_change >=", value, "dnDownChange");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeLessThan(Double value) {
            addCriterion("dn_down_change <", value, "dnDownChange");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeLessThanOrEqualTo(Double value) {
            addCriterion("dn_down_change <=", value, "dnDownChange");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeIn(List<Double> values) {
            addCriterion("dn_down_change in", values, "dnDownChange");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeNotIn(List<Double> values) {
            addCriterion("dn_down_change not in", values, "dnDownChange");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeBetween(Double value1, Double value2) {
            addCriterion("dn_down_change between", value1, value2, "dnDownChange");
            return (Criteria) this;
        }

        public Criteria andDnDownChangeNotBetween(Double value1, Double value2) {
            addCriterion("dn_down_change not between", value1, value2, "dnDownChange");
            return (Criteria) this;
        }

        public Criteria andDnInfoIsNull() {
            addCriterion("dn_info is null");
            return (Criteria) this;
        }

        public Criteria andDnInfoIsNotNull() {
            addCriterion("dn_info is not null");
            return (Criteria) this;
        }

        public Criteria andDnInfoEqualTo(String value) {
            addCriterion("dn_info =", value, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoNotEqualTo(String value) {
            addCriterion("dn_info <>", value, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoGreaterThan(String value) {
            addCriterion("dn_info >", value, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoGreaterThanOrEqualTo(String value) {
            addCriterion("dn_info >=", value, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoLessThan(String value) {
            addCriterion("dn_info <", value, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoLessThanOrEqualTo(String value) {
            addCriterion("dn_info <=", value, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoLike(String value) {
            addCriterion("dn_info like", value, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoNotLike(String value) {
            addCriterion("dn_info not like", value, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoIn(List<String> values) {
            addCriterion("dn_info in", values, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoNotIn(List<String> values) {
            addCriterion("dn_info not in", values, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoBetween(String value1, String value2) {
            addCriterion("dn_info between", value1, value2, "dnInfo");
            return (Criteria) this;
        }

        public Criteria andDnInfoNotBetween(String value1, String value2) {
            addCriterion("dn_info not between", value1, value2, "dnInfo");
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