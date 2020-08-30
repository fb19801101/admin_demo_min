package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public LabourExample() {
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

        public Criteria andLbIdIsNull() {
            addCriterion("lb_id is null");
            return (Criteria) this;
        }

        public Criteria andLbIdIsNotNull() {
            addCriterion("lb_id is not null");
            return (Criteria) this;
        }

        public Criteria andLbIdEqualTo(Integer value) {
            addCriterion("lb_id =", value, "lbId");
            return (Criteria) this;
        }

        public Criteria andLbIdNotEqualTo(Integer value) {
            addCriterion("lb_id <>", value, "lbId");
            return (Criteria) this;
        }

        public Criteria andLbIdGreaterThan(Integer value) {
            addCriterion("lb_id >", value, "lbId");
            return (Criteria) this;
        }

        public Criteria andLbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lb_id >=", value, "lbId");
            return (Criteria) this;
        }

        public Criteria andLbIdLessThan(Integer value) {
            addCriterion("lb_id <", value, "lbId");
            return (Criteria) this;
        }

        public Criteria andLbIdLessThanOrEqualTo(Integer value) {
            addCriterion("lb_id <=", value, "lbId");
            return (Criteria) this;
        }

        public Criteria andLbIdIn(List<Integer> values) {
            addCriterion("lb_id in", values, "lbId");
            return (Criteria) this;
        }

        public Criteria andLbIdNotIn(List<Integer> values) {
            addCriterion("lb_id not in", values, "lbId");
            return (Criteria) this;
        }

        public Criteria andLbIdBetween(Integer value1, Integer value2) {
            addCriterion("lb_id between", value1, value2, "lbId");
            return (Criteria) this;
        }

        public Criteria andLbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lb_id not between", value1, value2, "lbId");
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

        public Criteria andLbCodeIsNull() {
            addCriterion("lb_code is null");
            return (Criteria) this;
        }

        public Criteria andLbCodeIsNotNull() {
            addCriterion("lb_code is not null");
            return (Criteria) this;
        }

        public Criteria andLbCodeEqualTo(String value) {
            addCriterion("lb_code =", value, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeNotEqualTo(String value) {
            addCriterion("lb_code <>", value, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeGreaterThan(String value) {
            addCriterion("lb_code >", value, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeGreaterThanOrEqualTo(String value) {
            addCriterion("lb_code >=", value, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeLessThan(String value) {
            addCriterion("lb_code <", value, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeLessThanOrEqualTo(String value) {
            addCriterion("lb_code <=", value, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeLike(String value) {
            addCriterion("lb_code like", value, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeNotLike(String value) {
            addCriterion("lb_code not like", value, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeIn(List<String> values) {
            addCriterion("lb_code in", values, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeNotIn(List<String> values) {
            addCriterion("lb_code not in", values, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeBetween(String value1, String value2) {
            addCriterion("lb_code between", value1, value2, "lbCode");
            return (Criteria) this;
        }

        public Criteria andLbCodeNotBetween(String value1, String value2) {
            addCriterion("lb_code not between", value1, value2, "lbCode");
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

        public Criteria andLbDateIsNull() {
            addCriterion("lb_date is null");
            return (Criteria) this;
        }

        public Criteria andLbDateIsNotNull() {
            addCriterion("lb_date is not null");
            return (Criteria) this;
        }

        public Criteria andLbDateEqualTo(Date value) {
            addCriterion("lb_date =", value, "lbDate");
            return (Criteria) this;
        }

        public Criteria andLbDateNotEqualTo(Date value) {
            addCriterion("lb_date <>", value, "lbDate");
            return (Criteria) this;
        }

        public Criteria andLbDateGreaterThan(Date value) {
            addCriterion("lb_date >", value, "lbDate");
            return (Criteria) this;
        }

        public Criteria andLbDateGreaterThanOrEqualTo(Date value) {
            addCriterion("lb_date >=", value, "lbDate");
            return (Criteria) this;
        }

        public Criteria andLbDateLessThan(Date value) {
            addCriterion("lb_date <", value, "lbDate");
            return (Criteria) this;
        }

        public Criteria andLbDateLessThanOrEqualTo(Date value) {
            addCriterion("lb_date <=", value, "lbDate");
            return (Criteria) this;
        }

        public Criteria andLbDateIn(List<Date> values) {
            addCriterion("lb_date in", values, "lbDate");
            return (Criteria) this;
        }

        public Criteria andLbDateNotIn(List<Date> values) {
            addCriterion("lb_date not in", values, "lbDate");
            return (Criteria) this;
        }

        public Criteria andLbDateBetween(Date value1, Date value2) {
            addCriterion("lb_date between", value1, value2, "lbDate");
            return (Criteria) this;
        }

        public Criteria andLbDateNotBetween(Date value1, Date value2) {
            addCriterion("lb_date not between", value1, value2, "lbDate");
            return (Criteria) this;
        }

        public Criteria andLbNameIsNull() {
            addCriterion("lb_name is null");
            return (Criteria) this;
        }

        public Criteria andLbNameIsNotNull() {
            addCriterion("lb_name is not null");
            return (Criteria) this;
        }

        public Criteria andLbNameEqualTo(String value) {
            addCriterion("lb_name =", value, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameNotEqualTo(String value) {
            addCriterion("lb_name <>", value, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameGreaterThan(String value) {
            addCriterion("lb_name >", value, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameGreaterThanOrEqualTo(String value) {
            addCriterion("lb_name >=", value, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameLessThan(String value) {
            addCriterion("lb_name <", value, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameLessThanOrEqualTo(String value) {
            addCriterion("lb_name <=", value, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameLike(String value) {
            addCriterion("lb_name like", value, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameNotLike(String value) {
            addCriterion("lb_name not like", value, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameIn(List<String> values) {
            addCriterion("lb_name in", values, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameNotIn(List<String> values) {
            addCriterion("lb_name not in", values, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameBetween(String value1, String value2) {
            addCriterion("lb_name between", value1, value2, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbNameNotBetween(String value1, String value2) {
            addCriterion("lb_name not between", value1, value2, "lbName");
            return (Criteria) this;
        }

        public Criteria andLbUnitIsNull() {
            addCriterion("lb_unit is null");
            return (Criteria) this;
        }

        public Criteria andLbUnitIsNotNull() {
            addCriterion("lb_unit is not null");
            return (Criteria) this;
        }

        public Criteria andLbUnitEqualTo(String value) {
            addCriterion("lb_unit =", value, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitNotEqualTo(String value) {
            addCriterion("lb_unit <>", value, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitGreaterThan(String value) {
            addCriterion("lb_unit >", value, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitGreaterThanOrEqualTo(String value) {
            addCriterion("lb_unit >=", value, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitLessThan(String value) {
            addCriterion("lb_unit <", value, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitLessThanOrEqualTo(String value) {
            addCriterion("lb_unit <=", value, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitLike(String value) {
            addCriterion("lb_unit like", value, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitNotLike(String value) {
            addCriterion("lb_unit not like", value, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitIn(List<String> values) {
            addCriterion("lb_unit in", values, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitNotIn(List<String> values) {
            addCriterion("lb_unit not in", values, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitBetween(String value1, String value2) {
            addCriterion("lb_unit between", value1, value2, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbUnitNotBetween(String value1, String value2) {
            addCriterion("lb_unit not between", value1, value2, "lbUnit");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignIsNull() {
            addCriterion("lb_do_design is null");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignIsNotNull() {
            addCriterion("lb_do_design is not null");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignEqualTo(Double value) {
            addCriterion("lb_do_design =", value, "lbDoDesign");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignNotEqualTo(Double value) {
            addCriterion("lb_do_design <>", value, "lbDoDesign");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignGreaterThan(Double value) {
            addCriterion("lb_do_design >", value, "lbDoDesign");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("lb_do_design >=", value, "lbDoDesign");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignLessThan(Double value) {
            addCriterion("lb_do_design <", value, "lbDoDesign");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignLessThanOrEqualTo(Double value) {
            addCriterion("lb_do_design <=", value, "lbDoDesign");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignIn(List<Double> values) {
            addCriterion("lb_do_design in", values, "lbDoDesign");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignNotIn(List<Double> values) {
            addCriterion("lb_do_design not in", values, "lbDoDesign");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignBetween(Double value1, Double value2) {
            addCriterion("lb_do_design between", value1, value2, "lbDoDesign");
            return (Criteria) this;
        }

        public Criteria andLbDoDesignNotBetween(Double value1, Double value2) {
            addCriterion("lb_do_design not between", value1, value2, "lbDoDesign");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeIsNull() {
            addCriterion("lb_do_change is null");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeIsNotNull() {
            addCriterion("lb_do_change is not null");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeEqualTo(Double value) {
            addCriterion("lb_do_change =", value, "lbDoChange");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeNotEqualTo(Double value) {
            addCriterion("lb_do_change <>", value, "lbDoChange");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeGreaterThan(Double value) {
            addCriterion("lb_do_change >", value, "lbDoChange");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("lb_do_change >=", value, "lbDoChange");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeLessThan(Double value) {
            addCriterion("lb_do_change <", value, "lbDoChange");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeLessThanOrEqualTo(Double value) {
            addCriterion("lb_do_change <=", value, "lbDoChange");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeIn(List<Double> values) {
            addCriterion("lb_do_change in", values, "lbDoChange");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeNotIn(List<Double> values) {
            addCriterion("lb_do_change not in", values, "lbDoChange");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeBetween(Double value1, Double value2) {
            addCriterion("lb_do_change between", value1, value2, "lbDoChange");
            return (Criteria) this;
        }

        public Criteria andLbDoChangeNotBetween(Double value1, Double value2) {
            addCriterion("lb_do_change not between", value1, value2, "lbDoChange");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignIsNull() {
            addCriterion("lb_up_design is null");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignIsNotNull() {
            addCriterion("lb_up_design is not null");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignEqualTo(Double value) {
            addCriterion("lb_up_design =", value, "lbUpDesign");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignNotEqualTo(Double value) {
            addCriterion("lb_up_design <>", value, "lbUpDesign");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignGreaterThan(Double value) {
            addCriterion("lb_up_design >", value, "lbUpDesign");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("lb_up_design >=", value, "lbUpDesign");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignLessThan(Double value) {
            addCriterion("lb_up_design <", value, "lbUpDesign");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignLessThanOrEqualTo(Double value) {
            addCriterion("lb_up_design <=", value, "lbUpDesign");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignIn(List<Double> values) {
            addCriterion("lb_up_design in", values, "lbUpDesign");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignNotIn(List<Double> values) {
            addCriterion("lb_up_design not in", values, "lbUpDesign");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignBetween(Double value1, Double value2) {
            addCriterion("lb_up_design between", value1, value2, "lbUpDesign");
            return (Criteria) this;
        }

        public Criteria andLbUpDesignNotBetween(Double value1, Double value2) {
            addCriterion("lb_up_design not between", value1, value2, "lbUpDesign");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeIsNull() {
            addCriterion("lb_up_change is null");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeIsNotNull() {
            addCriterion("lb_up_change is not null");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeEqualTo(Double value) {
            addCriterion("lb_up_change =", value, "lbUpChange");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeNotEqualTo(Double value) {
            addCriterion("lb_up_change <>", value, "lbUpChange");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeGreaterThan(Double value) {
            addCriterion("lb_up_change >", value, "lbUpChange");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("lb_up_change >=", value, "lbUpChange");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeLessThan(Double value) {
            addCriterion("lb_up_change <", value, "lbUpChange");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeLessThanOrEqualTo(Double value) {
            addCriterion("lb_up_change <=", value, "lbUpChange");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeIn(List<Double> values) {
            addCriterion("lb_up_change in", values, "lbUpChange");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeNotIn(List<Double> values) {
            addCriterion("lb_up_change not in", values, "lbUpChange");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeBetween(Double value1, Double value2) {
            addCriterion("lb_up_change between", value1, value2, "lbUpChange");
            return (Criteria) this;
        }

        public Criteria andLbUpChangeNotBetween(Double value1, Double value2) {
            addCriterion("lb_up_change not between", value1, value2, "lbUpChange");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignIsNull() {
            addCriterion("lb_down_design is null");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignIsNotNull() {
            addCriterion("lb_down_design is not null");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignEqualTo(Double value) {
            addCriterion("lb_down_design =", value, "lbDownDesign");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignNotEqualTo(Double value) {
            addCriterion("lb_down_design <>", value, "lbDownDesign");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignGreaterThan(Double value) {
            addCriterion("lb_down_design >", value, "lbDownDesign");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("lb_down_design >=", value, "lbDownDesign");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignLessThan(Double value) {
            addCriterion("lb_down_design <", value, "lbDownDesign");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignLessThanOrEqualTo(Double value) {
            addCriterion("lb_down_design <=", value, "lbDownDesign");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignIn(List<Double> values) {
            addCriterion("lb_down_design in", values, "lbDownDesign");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignNotIn(List<Double> values) {
            addCriterion("lb_down_design not in", values, "lbDownDesign");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignBetween(Double value1, Double value2) {
            addCriterion("lb_down_design between", value1, value2, "lbDownDesign");
            return (Criteria) this;
        }

        public Criteria andLbDownDesignNotBetween(Double value1, Double value2) {
            addCriterion("lb_down_design not between", value1, value2, "lbDownDesign");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeIsNull() {
            addCriterion("lb_down_change is null");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeIsNotNull() {
            addCriterion("lb_down_change is not null");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeEqualTo(Double value) {
            addCriterion("lb_down_change =", value, "lbDownChange");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeNotEqualTo(Double value) {
            addCriterion("lb_down_change <>", value, "lbDownChange");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeGreaterThan(Double value) {
            addCriterion("lb_down_change >", value, "lbDownChange");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("lb_down_change >=", value, "lbDownChange");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeLessThan(Double value) {
            addCriterion("lb_down_change <", value, "lbDownChange");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeLessThanOrEqualTo(Double value) {
            addCriterion("lb_down_change <=", value, "lbDownChange");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeIn(List<Double> values) {
            addCriterion("lb_down_change in", values, "lbDownChange");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeNotIn(List<Double> values) {
            addCriterion("lb_down_change not in", values, "lbDownChange");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeBetween(Double value1, Double value2) {
            addCriterion("lb_down_change between", value1, value2, "lbDownChange");
            return (Criteria) this;
        }

        public Criteria andLbDownChangeNotBetween(Double value1, Double value2) {
            addCriterion("lb_down_change not between", value1, value2, "lbDownChange");
            return (Criteria) this;
        }

        public Criteria andLbInfoIsNull() {
            addCriterion("lb_info is null");
            return (Criteria) this;
        }

        public Criteria andLbInfoIsNotNull() {
            addCriterion("lb_info is not null");
            return (Criteria) this;
        }

        public Criteria andLbInfoEqualTo(String value) {
            addCriterion("lb_info =", value, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoNotEqualTo(String value) {
            addCriterion("lb_info <>", value, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoGreaterThan(String value) {
            addCriterion("lb_info >", value, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoGreaterThanOrEqualTo(String value) {
            addCriterion("lb_info >=", value, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoLessThan(String value) {
            addCriterion("lb_info <", value, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoLessThanOrEqualTo(String value) {
            addCriterion("lb_info <=", value, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoLike(String value) {
            addCriterion("lb_info like", value, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoNotLike(String value) {
            addCriterion("lb_info not like", value, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoIn(List<String> values) {
            addCriterion("lb_info in", values, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoNotIn(List<String> values) {
            addCriterion("lb_info not in", values, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoBetween(String value1, String value2) {
            addCriterion("lb_info between", value1, value2, "lbInfo");
            return (Criteria) this;
        }

        public Criteria andLbInfoNotBetween(String value1, String value2) {
            addCriterion("lb_info not between", value1, value2, "lbInfo");
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