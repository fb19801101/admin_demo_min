package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndirectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public IndirectExample() {
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

        public Criteria andItIdIsNull() {
            addCriterion("it_id is null");
            return (Criteria) this;
        }

        public Criteria andItIdIsNotNull() {
            addCriterion("it_id is not null");
            return (Criteria) this;
        }

        public Criteria andItIdEqualTo(Integer value) {
            addCriterion("it_id =", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotEqualTo(Integer value) {
            addCriterion("it_id <>", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdGreaterThan(Integer value) {
            addCriterion("it_id >", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("it_id >=", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdLessThan(Integer value) {
            addCriterion("it_id <", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdLessThanOrEqualTo(Integer value) {
            addCriterion("it_id <=", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdIn(List<Integer> values) {
            addCriterion("it_id in", values, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotIn(List<Integer> values) {
            addCriterion("it_id not in", values, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdBetween(Integer value1, Integer value2) {
            addCriterion("it_id between", value1, value2, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotBetween(Integer value1, Integer value2) {
            addCriterion("it_id not between", value1, value2, "itId");
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

        public Criteria andItCodeIsNull() {
            addCriterion("it_code is null");
            return (Criteria) this;
        }

        public Criteria andItCodeIsNotNull() {
            addCriterion("it_code is not null");
            return (Criteria) this;
        }

        public Criteria andItCodeEqualTo(String value) {
            addCriterion("it_code =", value, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeNotEqualTo(String value) {
            addCriterion("it_code <>", value, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeGreaterThan(String value) {
            addCriterion("it_code >", value, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeGreaterThanOrEqualTo(String value) {
            addCriterion("it_code >=", value, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeLessThan(String value) {
            addCriterion("it_code <", value, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeLessThanOrEqualTo(String value) {
            addCriterion("it_code <=", value, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeLike(String value) {
            addCriterion("it_code like", value, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeNotLike(String value) {
            addCriterion("it_code not like", value, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeIn(List<String> values) {
            addCriterion("it_code in", values, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeNotIn(List<String> values) {
            addCriterion("it_code not in", values, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeBetween(String value1, String value2) {
            addCriterion("it_code between", value1, value2, "itCode");
            return (Criteria) this;
        }

        public Criteria andItCodeNotBetween(String value1, String value2) {
            addCriterion("it_code not between", value1, value2, "itCode");
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

        public Criteria andItDateIsNull() {
            addCriterion("it_date is null");
            return (Criteria) this;
        }

        public Criteria andItDateIsNotNull() {
            addCriterion("it_date is not null");
            return (Criteria) this;
        }

        public Criteria andItDateEqualTo(Date value) {
            addCriterion("it_date =", value, "itDate");
            return (Criteria) this;
        }

        public Criteria andItDateNotEqualTo(Date value) {
            addCriterion("it_date <>", value, "itDate");
            return (Criteria) this;
        }

        public Criteria andItDateGreaterThan(Date value) {
            addCriterion("it_date >", value, "itDate");
            return (Criteria) this;
        }

        public Criteria andItDateGreaterThanOrEqualTo(Date value) {
            addCriterion("it_date >=", value, "itDate");
            return (Criteria) this;
        }

        public Criteria andItDateLessThan(Date value) {
            addCriterion("it_date <", value, "itDate");
            return (Criteria) this;
        }

        public Criteria andItDateLessThanOrEqualTo(Date value) {
            addCriterion("it_date <=", value, "itDate");
            return (Criteria) this;
        }

        public Criteria andItDateIn(List<Date> values) {
            addCriterion("it_date in", values, "itDate");
            return (Criteria) this;
        }

        public Criteria andItDateNotIn(List<Date> values) {
            addCriterion("it_date not in", values, "itDate");
            return (Criteria) this;
        }

        public Criteria andItDateBetween(Date value1, Date value2) {
            addCriterion("it_date between", value1, value2, "itDate");
            return (Criteria) this;
        }

        public Criteria andItDateNotBetween(Date value1, Date value2) {
            addCriterion("it_date not between", value1, value2, "itDate");
            return (Criteria) this;
        }

        public Criteria andItNameIsNull() {
            addCriterion("it_name is null");
            return (Criteria) this;
        }

        public Criteria andItNameIsNotNull() {
            addCriterion("it_name is not null");
            return (Criteria) this;
        }

        public Criteria andItNameEqualTo(String value) {
            addCriterion("it_name =", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotEqualTo(String value) {
            addCriterion("it_name <>", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameGreaterThan(String value) {
            addCriterion("it_name >", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameGreaterThanOrEqualTo(String value) {
            addCriterion("it_name >=", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameLessThan(String value) {
            addCriterion("it_name <", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameLessThanOrEqualTo(String value) {
            addCriterion("it_name <=", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameLike(String value) {
            addCriterion("it_name like", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotLike(String value) {
            addCriterion("it_name not like", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameIn(List<String> values) {
            addCriterion("it_name in", values, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotIn(List<String> values) {
            addCriterion("it_name not in", values, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameBetween(String value1, String value2) {
            addCriterion("it_name between", value1, value2, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotBetween(String value1, String value2) {
            addCriterion("it_name not between", value1, value2, "itName");
            return (Criteria) this;
        }

        public Criteria andItUnitIsNull() {
            addCriterion("it_unit is null");
            return (Criteria) this;
        }

        public Criteria andItUnitIsNotNull() {
            addCriterion("it_unit is not null");
            return (Criteria) this;
        }

        public Criteria andItUnitEqualTo(String value) {
            addCriterion("it_unit =", value, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitNotEqualTo(String value) {
            addCriterion("it_unit <>", value, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitGreaterThan(String value) {
            addCriterion("it_unit >", value, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitGreaterThanOrEqualTo(String value) {
            addCriterion("it_unit >=", value, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitLessThan(String value) {
            addCriterion("it_unit <", value, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitLessThanOrEqualTo(String value) {
            addCriterion("it_unit <=", value, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitLike(String value) {
            addCriterion("it_unit like", value, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitNotLike(String value) {
            addCriterion("it_unit not like", value, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitIn(List<String> values) {
            addCriterion("it_unit in", values, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitNotIn(List<String> values) {
            addCriterion("it_unit not in", values, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitBetween(String value1, String value2) {
            addCriterion("it_unit between", value1, value2, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItUnitNotBetween(String value1, String value2) {
            addCriterion("it_unit not between", value1, value2, "itUnit");
            return (Criteria) this;
        }

        public Criteria andItDoDesignIsNull() {
            addCriterion("it_do_design is null");
            return (Criteria) this;
        }

        public Criteria andItDoDesignIsNotNull() {
            addCriterion("it_do_design is not null");
            return (Criteria) this;
        }

        public Criteria andItDoDesignEqualTo(Double value) {
            addCriterion("it_do_design =", value, "itDoDesign");
            return (Criteria) this;
        }

        public Criteria andItDoDesignNotEqualTo(Double value) {
            addCriterion("it_do_design <>", value, "itDoDesign");
            return (Criteria) this;
        }

        public Criteria andItDoDesignGreaterThan(Double value) {
            addCriterion("it_do_design >", value, "itDoDesign");
            return (Criteria) this;
        }

        public Criteria andItDoDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("it_do_design >=", value, "itDoDesign");
            return (Criteria) this;
        }

        public Criteria andItDoDesignLessThan(Double value) {
            addCriterion("it_do_design <", value, "itDoDesign");
            return (Criteria) this;
        }

        public Criteria andItDoDesignLessThanOrEqualTo(Double value) {
            addCriterion("it_do_design <=", value, "itDoDesign");
            return (Criteria) this;
        }

        public Criteria andItDoDesignIn(List<Double> values) {
            addCriterion("it_do_design in", values, "itDoDesign");
            return (Criteria) this;
        }

        public Criteria andItDoDesignNotIn(List<Double> values) {
            addCriterion("it_do_design not in", values, "itDoDesign");
            return (Criteria) this;
        }

        public Criteria andItDoDesignBetween(Double value1, Double value2) {
            addCriterion("it_do_design between", value1, value2, "itDoDesign");
            return (Criteria) this;
        }

        public Criteria andItDoDesignNotBetween(Double value1, Double value2) {
            addCriterion("it_do_design not between", value1, value2, "itDoDesign");
            return (Criteria) this;
        }

        public Criteria andItDoChangeIsNull() {
            addCriterion("it_do_change is null");
            return (Criteria) this;
        }

        public Criteria andItDoChangeIsNotNull() {
            addCriterion("it_do_change is not null");
            return (Criteria) this;
        }

        public Criteria andItDoChangeEqualTo(Double value) {
            addCriterion("it_do_change =", value, "itDoChange");
            return (Criteria) this;
        }

        public Criteria andItDoChangeNotEqualTo(Double value) {
            addCriterion("it_do_change <>", value, "itDoChange");
            return (Criteria) this;
        }

        public Criteria andItDoChangeGreaterThan(Double value) {
            addCriterion("it_do_change >", value, "itDoChange");
            return (Criteria) this;
        }

        public Criteria andItDoChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("it_do_change >=", value, "itDoChange");
            return (Criteria) this;
        }

        public Criteria andItDoChangeLessThan(Double value) {
            addCriterion("it_do_change <", value, "itDoChange");
            return (Criteria) this;
        }

        public Criteria andItDoChangeLessThanOrEqualTo(Double value) {
            addCriterion("it_do_change <=", value, "itDoChange");
            return (Criteria) this;
        }

        public Criteria andItDoChangeIn(List<Double> values) {
            addCriterion("it_do_change in", values, "itDoChange");
            return (Criteria) this;
        }

        public Criteria andItDoChangeNotIn(List<Double> values) {
            addCriterion("it_do_change not in", values, "itDoChange");
            return (Criteria) this;
        }

        public Criteria andItDoChangeBetween(Double value1, Double value2) {
            addCriterion("it_do_change between", value1, value2, "itDoChange");
            return (Criteria) this;
        }

        public Criteria andItDoChangeNotBetween(Double value1, Double value2) {
            addCriterion("it_do_change not between", value1, value2, "itDoChange");
            return (Criteria) this;
        }

        public Criteria andItUpDesignIsNull() {
            addCriterion("it_up_design is null");
            return (Criteria) this;
        }

        public Criteria andItUpDesignIsNotNull() {
            addCriterion("it_up_design is not null");
            return (Criteria) this;
        }

        public Criteria andItUpDesignEqualTo(Double value) {
            addCriterion("it_up_design =", value, "itUpDesign");
            return (Criteria) this;
        }

        public Criteria andItUpDesignNotEqualTo(Double value) {
            addCriterion("it_up_design <>", value, "itUpDesign");
            return (Criteria) this;
        }

        public Criteria andItUpDesignGreaterThan(Double value) {
            addCriterion("it_up_design >", value, "itUpDesign");
            return (Criteria) this;
        }

        public Criteria andItUpDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("it_up_design >=", value, "itUpDesign");
            return (Criteria) this;
        }

        public Criteria andItUpDesignLessThan(Double value) {
            addCriterion("it_up_design <", value, "itUpDesign");
            return (Criteria) this;
        }

        public Criteria andItUpDesignLessThanOrEqualTo(Double value) {
            addCriterion("it_up_design <=", value, "itUpDesign");
            return (Criteria) this;
        }

        public Criteria andItUpDesignIn(List<Double> values) {
            addCriterion("it_up_design in", values, "itUpDesign");
            return (Criteria) this;
        }

        public Criteria andItUpDesignNotIn(List<Double> values) {
            addCriterion("it_up_design not in", values, "itUpDesign");
            return (Criteria) this;
        }

        public Criteria andItUpDesignBetween(Double value1, Double value2) {
            addCriterion("it_up_design between", value1, value2, "itUpDesign");
            return (Criteria) this;
        }

        public Criteria andItUpDesignNotBetween(Double value1, Double value2) {
            addCriterion("it_up_design not between", value1, value2, "itUpDesign");
            return (Criteria) this;
        }

        public Criteria andItUpChangeIsNull() {
            addCriterion("it_up_change is null");
            return (Criteria) this;
        }

        public Criteria andItUpChangeIsNotNull() {
            addCriterion("it_up_change is not null");
            return (Criteria) this;
        }

        public Criteria andItUpChangeEqualTo(Double value) {
            addCriterion("it_up_change =", value, "itUpChange");
            return (Criteria) this;
        }

        public Criteria andItUpChangeNotEqualTo(Double value) {
            addCriterion("it_up_change <>", value, "itUpChange");
            return (Criteria) this;
        }

        public Criteria andItUpChangeGreaterThan(Double value) {
            addCriterion("it_up_change >", value, "itUpChange");
            return (Criteria) this;
        }

        public Criteria andItUpChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("it_up_change >=", value, "itUpChange");
            return (Criteria) this;
        }

        public Criteria andItUpChangeLessThan(Double value) {
            addCriterion("it_up_change <", value, "itUpChange");
            return (Criteria) this;
        }

        public Criteria andItUpChangeLessThanOrEqualTo(Double value) {
            addCriterion("it_up_change <=", value, "itUpChange");
            return (Criteria) this;
        }

        public Criteria andItUpChangeIn(List<Double> values) {
            addCriterion("it_up_change in", values, "itUpChange");
            return (Criteria) this;
        }

        public Criteria andItUpChangeNotIn(List<Double> values) {
            addCriterion("it_up_change not in", values, "itUpChange");
            return (Criteria) this;
        }

        public Criteria andItUpChangeBetween(Double value1, Double value2) {
            addCriterion("it_up_change between", value1, value2, "itUpChange");
            return (Criteria) this;
        }

        public Criteria andItUpChangeNotBetween(Double value1, Double value2) {
            addCriterion("it_up_change not between", value1, value2, "itUpChange");
            return (Criteria) this;
        }

        public Criteria andItDownDesignIsNull() {
            addCriterion("it_down_design is null");
            return (Criteria) this;
        }

        public Criteria andItDownDesignIsNotNull() {
            addCriterion("it_down_design is not null");
            return (Criteria) this;
        }

        public Criteria andItDownDesignEqualTo(Double value) {
            addCriterion("it_down_design =", value, "itDownDesign");
            return (Criteria) this;
        }

        public Criteria andItDownDesignNotEqualTo(Double value) {
            addCriterion("it_down_design <>", value, "itDownDesign");
            return (Criteria) this;
        }

        public Criteria andItDownDesignGreaterThan(Double value) {
            addCriterion("it_down_design >", value, "itDownDesign");
            return (Criteria) this;
        }

        public Criteria andItDownDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("it_down_design >=", value, "itDownDesign");
            return (Criteria) this;
        }

        public Criteria andItDownDesignLessThan(Double value) {
            addCriterion("it_down_design <", value, "itDownDesign");
            return (Criteria) this;
        }

        public Criteria andItDownDesignLessThanOrEqualTo(Double value) {
            addCriterion("it_down_design <=", value, "itDownDesign");
            return (Criteria) this;
        }

        public Criteria andItDownDesignIn(List<Double> values) {
            addCriterion("it_down_design in", values, "itDownDesign");
            return (Criteria) this;
        }

        public Criteria andItDownDesignNotIn(List<Double> values) {
            addCriterion("it_down_design not in", values, "itDownDesign");
            return (Criteria) this;
        }

        public Criteria andItDownDesignBetween(Double value1, Double value2) {
            addCriterion("it_down_design between", value1, value2, "itDownDesign");
            return (Criteria) this;
        }

        public Criteria andItDownDesignNotBetween(Double value1, Double value2) {
            addCriterion("it_down_design not between", value1, value2, "itDownDesign");
            return (Criteria) this;
        }

        public Criteria andItDownChangeIsNull() {
            addCriterion("it_down_change is null");
            return (Criteria) this;
        }

        public Criteria andItDownChangeIsNotNull() {
            addCriterion("it_down_change is not null");
            return (Criteria) this;
        }

        public Criteria andItDownChangeEqualTo(Double value) {
            addCriterion("it_down_change =", value, "itDownChange");
            return (Criteria) this;
        }

        public Criteria andItDownChangeNotEqualTo(Double value) {
            addCriterion("it_down_change <>", value, "itDownChange");
            return (Criteria) this;
        }

        public Criteria andItDownChangeGreaterThan(Double value) {
            addCriterion("it_down_change >", value, "itDownChange");
            return (Criteria) this;
        }

        public Criteria andItDownChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("it_down_change >=", value, "itDownChange");
            return (Criteria) this;
        }

        public Criteria andItDownChangeLessThan(Double value) {
            addCriterion("it_down_change <", value, "itDownChange");
            return (Criteria) this;
        }

        public Criteria andItDownChangeLessThanOrEqualTo(Double value) {
            addCriterion("it_down_change <=", value, "itDownChange");
            return (Criteria) this;
        }

        public Criteria andItDownChangeIn(List<Double> values) {
            addCriterion("it_down_change in", values, "itDownChange");
            return (Criteria) this;
        }

        public Criteria andItDownChangeNotIn(List<Double> values) {
            addCriterion("it_down_change not in", values, "itDownChange");
            return (Criteria) this;
        }

        public Criteria andItDownChangeBetween(Double value1, Double value2) {
            addCriterion("it_down_change between", value1, value2, "itDownChange");
            return (Criteria) this;
        }

        public Criteria andItDownChangeNotBetween(Double value1, Double value2) {
            addCriterion("it_down_change not between", value1, value2, "itDownChange");
            return (Criteria) this;
        }

        public Criteria andItInfoIsNull() {
            addCriterion("it_info is null");
            return (Criteria) this;
        }

        public Criteria andItInfoIsNotNull() {
            addCriterion("it_info is not null");
            return (Criteria) this;
        }

        public Criteria andItInfoEqualTo(String value) {
            addCriterion("it_info =", value, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoNotEqualTo(String value) {
            addCriterion("it_info <>", value, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoGreaterThan(String value) {
            addCriterion("it_info >", value, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoGreaterThanOrEqualTo(String value) {
            addCriterion("it_info >=", value, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoLessThan(String value) {
            addCriterion("it_info <", value, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoLessThanOrEqualTo(String value) {
            addCriterion("it_info <=", value, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoLike(String value) {
            addCriterion("it_info like", value, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoNotLike(String value) {
            addCriterion("it_info not like", value, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoIn(List<String> values) {
            addCriterion("it_info in", values, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoNotIn(List<String> values) {
            addCriterion("it_info not in", values, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoBetween(String value1, String value2) {
            addCriterion("it_info between", value1, value2, "itInfo");
            return (Criteria) this;
        }

        public Criteria andItInfoNotBetween(String value1, String value2) {
            addCriterion("it_info not between", value1, value2, "itInfo");
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