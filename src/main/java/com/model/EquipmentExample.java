package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public EquipmentExample() {
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

        public Criteria andEtIdIsNull() {
            addCriterion("et_id is null");
            return (Criteria) this;
        }

        public Criteria andEtIdIsNotNull() {
            addCriterion("et_id is not null");
            return (Criteria) this;
        }

        public Criteria andEtIdEqualTo(Integer value) {
            addCriterion("et_id =", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdNotEqualTo(Integer value) {
            addCriterion("et_id <>", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdGreaterThan(Integer value) {
            addCriterion("et_id >", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("et_id >=", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdLessThan(Integer value) {
            addCriterion("et_id <", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdLessThanOrEqualTo(Integer value) {
            addCriterion("et_id <=", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdIn(List<Integer> values) {
            addCriterion("et_id in", values, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdNotIn(List<Integer> values) {
            addCriterion("et_id not in", values, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdBetween(Integer value1, Integer value2) {
            addCriterion("et_id between", value1, value2, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("et_id not between", value1, value2, "etId");
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

        public Criteria andEtCodeIsNull() {
            addCriterion("et_code is null");
            return (Criteria) this;
        }

        public Criteria andEtCodeIsNotNull() {
            addCriterion("et_code is not null");
            return (Criteria) this;
        }

        public Criteria andEtCodeEqualTo(String value) {
            addCriterion("et_code =", value, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeNotEqualTo(String value) {
            addCriterion("et_code <>", value, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeGreaterThan(String value) {
            addCriterion("et_code >", value, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeGreaterThanOrEqualTo(String value) {
            addCriterion("et_code >=", value, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeLessThan(String value) {
            addCriterion("et_code <", value, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeLessThanOrEqualTo(String value) {
            addCriterion("et_code <=", value, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeLike(String value) {
            addCriterion("et_code like", value, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeNotLike(String value) {
            addCriterion("et_code not like", value, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeIn(List<String> values) {
            addCriterion("et_code in", values, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeNotIn(List<String> values) {
            addCriterion("et_code not in", values, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeBetween(String value1, String value2) {
            addCriterion("et_code between", value1, value2, "etCode");
            return (Criteria) this;
        }

        public Criteria andEtCodeNotBetween(String value1, String value2) {
            addCriterion("et_code not between", value1, value2, "etCode");
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

        public Criteria andEtDateIsNull() {
            addCriterion("et_date is null");
            return (Criteria) this;
        }

        public Criteria andEtDateIsNotNull() {
            addCriterion("et_date is not null");
            return (Criteria) this;
        }

        public Criteria andEtDateEqualTo(Date value) {
            addCriterion("et_date =", value, "etDate");
            return (Criteria) this;
        }

        public Criteria andEtDateNotEqualTo(Date value) {
            addCriterion("et_date <>", value, "etDate");
            return (Criteria) this;
        }

        public Criteria andEtDateGreaterThan(Date value) {
            addCriterion("et_date >", value, "etDate");
            return (Criteria) this;
        }

        public Criteria andEtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("et_date >=", value, "etDate");
            return (Criteria) this;
        }

        public Criteria andEtDateLessThan(Date value) {
            addCriterion("et_date <", value, "etDate");
            return (Criteria) this;
        }

        public Criteria andEtDateLessThanOrEqualTo(Date value) {
            addCriterion("et_date <=", value, "etDate");
            return (Criteria) this;
        }

        public Criteria andEtDateIn(List<Date> values) {
            addCriterion("et_date in", values, "etDate");
            return (Criteria) this;
        }

        public Criteria andEtDateNotIn(List<Date> values) {
            addCriterion("et_date not in", values, "etDate");
            return (Criteria) this;
        }

        public Criteria andEtDateBetween(Date value1, Date value2) {
            addCriterion("et_date between", value1, value2, "etDate");
            return (Criteria) this;
        }

        public Criteria andEtDateNotBetween(Date value1, Date value2) {
            addCriterion("et_date not between", value1, value2, "etDate");
            return (Criteria) this;
        }

        public Criteria andEtNameIsNull() {
            addCriterion("et_name is null");
            return (Criteria) this;
        }

        public Criteria andEtNameIsNotNull() {
            addCriterion("et_name is not null");
            return (Criteria) this;
        }

        public Criteria andEtNameEqualTo(String value) {
            addCriterion("et_name =", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameNotEqualTo(String value) {
            addCriterion("et_name <>", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameGreaterThan(String value) {
            addCriterion("et_name >", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameGreaterThanOrEqualTo(String value) {
            addCriterion("et_name >=", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameLessThan(String value) {
            addCriterion("et_name <", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameLessThanOrEqualTo(String value) {
            addCriterion("et_name <=", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameLike(String value) {
            addCriterion("et_name like", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameNotLike(String value) {
            addCriterion("et_name not like", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameIn(List<String> values) {
            addCriterion("et_name in", values, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameNotIn(List<String> values) {
            addCriterion("et_name not in", values, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameBetween(String value1, String value2) {
            addCriterion("et_name between", value1, value2, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameNotBetween(String value1, String value2) {
            addCriterion("et_name not between", value1, value2, "etName");
            return (Criteria) this;
        }

        public Criteria andEtUnitIsNull() {
            addCriterion("et_unit is null");
            return (Criteria) this;
        }

        public Criteria andEtUnitIsNotNull() {
            addCriterion("et_unit is not null");
            return (Criteria) this;
        }

        public Criteria andEtUnitEqualTo(String value) {
            addCriterion("et_unit =", value, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitNotEqualTo(String value) {
            addCriterion("et_unit <>", value, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitGreaterThan(String value) {
            addCriterion("et_unit >", value, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitGreaterThanOrEqualTo(String value) {
            addCriterion("et_unit >=", value, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitLessThan(String value) {
            addCriterion("et_unit <", value, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitLessThanOrEqualTo(String value) {
            addCriterion("et_unit <=", value, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitLike(String value) {
            addCriterion("et_unit like", value, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitNotLike(String value) {
            addCriterion("et_unit not like", value, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitIn(List<String> values) {
            addCriterion("et_unit in", values, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitNotIn(List<String> values) {
            addCriterion("et_unit not in", values, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitBetween(String value1, String value2) {
            addCriterion("et_unit between", value1, value2, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtUnitNotBetween(String value1, String value2) {
            addCriterion("et_unit not between", value1, value2, "etUnit");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignIsNull() {
            addCriterion("et_do_design is null");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignIsNotNull() {
            addCriterion("et_do_design is not null");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignEqualTo(Double value) {
            addCriterion("et_do_design =", value, "etDoDesign");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignNotEqualTo(Double value) {
            addCriterion("et_do_design <>", value, "etDoDesign");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignGreaterThan(Double value) {
            addCriterion("et_do_design >", value, "etDoDesign");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("et_do_design >=", value, "etDoDesign");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignLessThan(Double value) {
            addCriterion("et_do_design <", value, "etDoDesign");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignLessThanOrEqualTo(Double value) {
            addCriterion("et_do_design <=", value, "etDoDesign");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignIn(List<Double> values) {
            addCriterion("et_do_design in", values, "etDoDesign");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignNotIn(List<Double> values) {
            addCriterion("et_do_design not in", values, "etDoDesign");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignBetween(Double value1, Double value2) {
            addCriterion("et_do_design between", value1, value2, "etDoDesign");
            return (Criteria) this;
        }

        public Criteria andEtDoDesignNotBetween(Double value1, Double value2) {
            addCriterion("et_do_design not between", value1, value2, "etDoDesign");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeIsNull() {
            addCriterion("et_do_change is null");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeIsNotNull() {
            addCriterion("et_do_change is not null");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeEqualTo(Double value) {
            addCriterion("et_do_change =", value, "etDoChange");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeNotEqualTo(Double value) {
            addCriterion("et_do_change <>", value, "etDoChange");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeGreaterThan(Double value) {
            addCriterion("et_do_change >", value, "etDoChange");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("et_do_change >=", value, "etDoChange");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeLessThan(Double value) {
            addCriterion("et_do_change <", value, "etDoChange");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeLessThanOrEqualTo(Double value) {
            addCriterion("et_do_change <=", value, "etDoChange");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeIn(List<Double> values) {
            addCriterion("et_do_change in", values, "etDoChange");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeNotIn(List<Double> values) {
            addCriterion("et_do_change not in", values, "etDoChange");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeBetween(Double value1, Double value2) {
            addCriterion("et_do_change between", value1, value2, "etDoChange");
            return (Criteria) this;
        }

        public Criteria andEtDoChangeNotBetween(Double value1, Double value2) {
            addCriterion("et_do_change not between", value1, value2, "etDoChange");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignIsNull() {
            addCriterion("et_up_design is null");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignIsNotNull() {
            addCriterion("et_up_design is not null");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignEqualTo(Double value) {
            addCriterion("et_up_design =", value, "etUpDesign");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignNotEqualTo(Double value) {
            addCriterion("et_up_design <>", value, "etUpDesign");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignGreaterThan(Double value) {
            addCriterion("et_up_design >", value, "etUpDesign");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("et_up_design >=", value, "etUpDesign");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignLessThan(Double value) {
            addCriterion("et_up_design <", value, "etUpDesign");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignLessThanOrEqualTo(Double value) {
            addCriterion("et_up_design <=", value, "etUpDesign");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignIn(List<Double> values) {
            addCriterion("et_up_design in", values, "etUpDesign");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignNotIn(List<Double> values) {
            addCriterion("et_up_design not in", values, "etUpDesign");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignBetween(Double value1, Double value2) {
            addCriterion("et_up_design between", value1, value2, "etUpDesign");
            return (Criteria) this;
        }

        public Criteria andEtUpDesignNotBetween(Double value1, Double value2) {
            addCriterion("et_up_design not between", value1, value2, "etUpDesign");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeIsNull() {
            addCriterion("et_up_change is null");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeIsNotNull() {
            addCriterion("et_up_change is not null");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeEqualTo(Double value) {
            addCriterion("et_up_change =", value, "etUpChange");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeNotEqualTo(Double value) {
            addCriterion("et_up_change <>", value, "etUpChange");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeGreaterThan(Double value) {
            addCriterion("et_up_change >", value, "etUpChange");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("et_up_change >=", value, "etUpChange");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeLessThan(Double value) {
            addCriterion("et_up_change <", value, "etUpChange");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeLessThanOrEqualTo(Double value) {
            addCriterion("et_up_change <=", value, "etUpChange");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeIn(List<Double> values) {
            addCriterion("et_up_change in", values, "etUpChange");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeNotIn(List<Double> values) {
            addCriterion("et_up_change not in", values, "etUpChange");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeBetween(Double value1, Double value2) {
            addCriterion("et_up_change between", value1, value2, "etUpChange");
            return (Criteria) this;
        }

        public Criteria andEtUpChangeNotBetween(Double value1, Double value2) {
            addCriterion("et_up_change not between", value1, value2, "etUpChange");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignIsNull() {
            addCriterion("et_down_design is null");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignIsNotNull() {
            addCriterion("et_down_design is not null");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignEqualTo(Double value) {
            addCriterion("et_down_design =", value, "etDownDesign");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignNotEqualTo(Double value) {
            addCriterion("et_down_design <>", value, "etDownDesign");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignGreaterThan(Double value) {
            addCriterion("et_down_design >", value, "etDownDesign");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("et_down_design >=", value, "etDownDesign");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignLessThan(Double value) {
            addCriterion("et_down_design <", value, "etDownDesign");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignLessThanOrEqualTo(Double value) {
            addCriterion("et_down_design <=", value, "etDownDesign");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignIn(List<Double> values) {
            addCriterion("et_down_design in", values, "etDownDesign");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignNotIn(List<Double> values) {
            addCriterion("et_down_design not in", values, "etDownDesign");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignBetween(Double value1, Double value2) {
            addCriterion("et_down_design between", value1, value2, "etDownDesign");
            return (Criteria) this;
        }

        public Criteria andEtDownDesignNotBetween(Double value1, Double value2) {
            addCriterion("et_down_design not between", value1, value2, "etDownDesign");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeIsNull() {
            addCriterion("et_down_change is null");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeIsNotNull() {
            addCriterion("et_down_change is not null");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeEqualTo(Double value) {
            addCriterion("et_down_change =", value, "etDownChange");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeNotEqualTo(Double value) {
            addCriterion("et_down_change <>", value, "etDownChange");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeGreaterThan(Double value) {
            addCriterion("et_down_change >", value, "etDownChange");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("et_down_change >=", value, "etDownChange");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeLessThan(Double value) {
            addCriterion("et_down_change <", value, "etDownChange");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeLessThanOrEqualTo(Double value) {
            addCriterion("et_down_change <=", value, "etDownChange");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeIn(List<Double> values) {
            addCriterion("et_down_change in", values, "etDownChange");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeNotIn(List<Double> values) {
            addCriterion("et_down_change not in", values, "etDownChange");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeBetween(Double value1, Double value2) {
            addCriterion("et_down_change between", value1, value2, "etDownChange");
            return (Criteria) this;
        }

        public Criteria andEtDownChangeNotBetween(Double value1, Double value2) {
            addCriterion("et_down_change not between", value1, value2, "etDownChange");
            return (Criteria) this;
        }

        public Criteria andEtInfoIsNull() {
            addCriterion("et_info is null");
            return (Criteria) this;
        }

        public Criteria andEtInfoIsNotNull() {
            addCriterion("et_info is not null");
            return (Criteria) this;
        }

        public Criteria andEtInfoEqualTo(String value) {
            addCriterion("et_info =", value, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoNotEqualTo(String value) {
            addCriterion("et_info <>", value, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoGreaterThan(String value) {
            addCriterion("et_info >", value, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoGreaterThanOrEqualTo(String value) {
            addCriterion("et_info >=", value, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoLessThan(String value) {
            addCriterion("et_info <", value, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoLessThanOrEqualTo(String value) {
            addCriterion("et_info <=", value, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoLike(String value) {
            addCriterion("et_info like", value, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoNotLike(String value) {
            addCriterion("et_info not like", value, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoIn(List<String> values) {
            addCriterion("et_info in", values, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoNotIn(List<String> values) {
            addCriterion("et_info not in", values, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoBetween(String value1, String value2) {
            addCriterion("et_info between", value1, value2, "etInfo");
            return (Criteria) this;
        }

        public Criteria andEtInfoNotBetween(String value1, String value2) {
            addCriterion("et_info not between", value1, value2, "etInfo");
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