package com.model;

import java.util.ArrayList;
import java.util.List;

public class CostLayerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CostLayerExample() {
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

        public Criteria andClNameIsNull() {
            addCriterion("cl_name is null");
            return (Criteria) this;
        }

        public Criteria andClNameIsNotNull() {
            addCriterion("cl_name is not null");
            return (Criteria) this;
        }

        public Criteria andClNameEqualTo(String value) {
            addCriterion("cl_name =", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameNotEqualTo(String value) {
            addCriterion("cl_name <>", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameGreaterThan(String value) {
            addCriterion("cl_name >", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameGreaterThanOrEqualTo(String value) {
            addCriterion("cl_name >=", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameLessThan(String value) {
            addCriterion("cl_name <", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameLessThanOrEqualTo(String value) {
            addCriterion("cl_name <=", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameLike(String value) {
            addCriterion("cl_name like", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameNotLike(String value) {
            addCriterion("cl_name not like", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameIn(List<String> values) {
            addCriterion("cl_name in", values, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameNotIn(List<String> values) {
            addCriterion("cl_name not in", values, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameBetween(String value1, String value2) {
            addCriterion("cl_name between", value1, value2, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameNotBetween(String value1, String value2) {
            addCriterion("cl_name not between", value1, value2, "clName");
            return (Criteria) this;
        }

        public Criteria andClUnitIsNull() {
            addCriterion("cl_unit is null");
            return (Criteria) this;
        }

        public Criteria andClUnitIsNotNull() {
            addCriterion("cl_unit is not null");
            return (Criteria) this;
        }

        public Criteria andClUnitEqualTo(String value) {
            addCriterion("cl_unit =", value, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitNotEqualTo(String value) {
            addCriterion("cl_unit <>", value, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitGreaterThan(String value) {
            addCriterion("cl_unit >", value, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitGreaterThanOrEqualTo(String value) {
            addCriterion("cl_unit >=", value, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitLessThan(String value) {
            addCriterion("cl_unit <", value, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitLessThanOrEqualTo(String value) {
            addCriterion("cl_unit <=", value, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitLike(String value) {
            addCriterion("cl_unit like", value, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitNotLike(String value) {
            addCriterion("cl_unit not like", value, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitIn(List<String> values) {
            addCriterion("cl_unit in", values, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitNotIn(List<String> values) {
            addCriterion("cl_unit not in", values, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitBetween(String value1, String value2) {
            addCriterion("cl_unit between", value1, value2, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClUnitNotBetween(String value1, String value2) {
            addCriterion("cl_unit not between", value1, value2, "clUnit");
            return (Criteria) this;
        }

        public Criteria andClBudgetIsNull() {
            addCriterion("cl_budget is null");
            return (Criteria) this;
        }

        public Criteria andClBudgetIsNotNull() {
            addCriterion("cl_budget is not null");
            return (Criteria) this;
        }

        public Criteria andClBudgetEqualTo(Double value) {
            addCriterion("cl_budget =", value, "clBudget");
            return (Criteria) this;
        }

        public Criteria andClBudgetNotEqualTo(Double value) {
            addCriterion("cl_budget <>", value, "clBudget");
            return (Criteria) this;
        }

        public Criteria andClBudgetGreaterThan(Double value) {
            addCriterion("cl_budget >", value, "clBudget");
            return (Criteria) this;
        }

        public Criteria andClBudgetGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_budget >=", value, "clBudget");
            return (Criteria) this;
        }

        public Criteria andClBudgetLessThan(Double value) {
            addCriterion("cl_budget <", value, "clBudget");
            return (Criteria) this;
        }

        public Criteria andClBudgetLessThanOrEqualTo(Double value) {
            addCriterion("cl_budget <=", value, "clBudget");
            return (Criteria) this;
        }

        public Criteria andClBudgetIn(List<Double> values) {
            addCriterion("cl_budget in", values, "clBudget");
            return (Criteria) this;
        }

        public Criteria andClBudgetNotIn(List<Double> values) {
            addCriterion("cl_budget not in", values, "clBudget");
            return (Criteria) this;
        }

        public Criteria andClBudgetBetween(Double value1, Double value2) {
            addCriterion("cl_budget between", value1, value2, "clBudget");
            return (Criteria) this;
        }

        public Criteria andClBudgetNotBetween(Double value1, Double value2) {
            addCriterion("cl_budget not between", value1, value2, "clBudget");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignIsNull() {
            addCriterion("cl_dwg_design is null");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignIsNotNull() {
            addCriterion("cl_dwg_design is not null");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignEqualTo(Double value) {
            addCriterion("cl_dwg_design =", value, "clDwgDesign");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignNotEqualTo(Double value) {
            addCriterion("cl_dwg_design <>", value, "clDwgDesign");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignGreaterThan(Double value) {
            addCriterion("cl_dwg_design >", value, "clDwgDesign");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_dwg_design >=", value, "clDwgDesign");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignLessThan(Double value) {
            addCriterion("cl_dwg_design <", value, "clDwgDesign");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignLessThanOrEqualTo(Double value) {
            addCriterion("cl_dwg_design <=", value, "clDwgDesign");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignIn(List<Double> values) {
            addCriterion("cl_dwg_design in", values, "clDwgDesign");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignNotIn(List<Double> values) {
            addCriterion("cl_dwg_design not in", values, "clDwgDesign");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignBetween(Double value1, Double value2) {
            addCriterion("cl_dwg_design between", value1, value2, "clDwgDesign");
            return (Criteria) this;
        }

        public Criteria andClDwgDesignNotBetween(Double value1, Double value2) {
            addCriterion("cl_dwg_design not between", value1, value2, "clDwgDesign");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeIsNull() {
            addCriterion("cl_dwg_change is null");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeIsNotNull() {
            addCriterion("cl_dwg_change is not null");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeEqualTo(Double value) {
            addCriterion("cl_dwg_change =", value, "clDwgChange");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeNotEqualTo(Double value) {
            addCriterion("cl_dwg_change <>", value, "clDwgChange");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeGreaterThan(Double value) {
            addCriterion("cl_dwg_change >", value, "clDwgChange");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_dwg_change >=", value, "clDwgChange");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeLessThan(Double value) {
            addCriterion("cl_dwg_change <", value, "clDwgChange");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeLessThanOrEqualTo(Double value) {
            addCriterion("cl_dwg_change <=", value, "clDwgChange");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeIn(List<Double> values) {
            addCriterion("cl_dwg_change in", values, "clDwgChange");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeNotIn(List<Double> values) {
            addCriterion("cl_dwg_change not in", values, "clDwgChange");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeBetween(Double value1, Double value2) {
            addCriterion("cl_dwg_change between", value1, value2, "clDwgChange");
            return (Criteria) this;
        }

        public Criteria andClDwgChangeNotBetween(Double value1, Double value2) {
            addCriterion("cl_dwg_change not between", value1, value2, "clDwgChange");
            return (Criteria) this;
        }

        public Criteria andClChkDesignIsNull() {
            addCriterion("cl_chk_design is null");
            return (Criteria) this;
        }

        public Criteria andClChkDesignIsNotNull() {
            addCriterion("cl_chk_design is not null");
            return (Criteria) this;
        }

        public Criteria andClChkDesignEqualTo(Double value) {
            addCriterion("cl_chk_design =", value, "clChkDesign");
            return (Criteria) this;
        }

        public Criteria andClChkDesignNotEqualTo(Double value) {
            addCriterion("cl_chk_design <>", value, "clChkDesign");
            return (Criteria) this;
        }

        public Criteria andClChkDesignGreaterThan(Double value) {
            addCriterion("cl_chk_design >", value, "clChkDesign");
            return (Criteria) this;
        }

        public Criteria andClChkDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_chk_design >=", value, "clChkDesign");
            return (Criteria) this;
        }

        public Criteria andClChkDesignLessThan(Double value) {
            addCriterion("cl_chk_design <", value, "clChkDesign");
            return (Criteria) this;
        }

        public Criteria andClChkDesignLessThanOrEqualTo(Double value) {
            addCriterion("cl_chk_design <=", value, "clChkDesign");
            return (Criteria) this;
        }

        public Criteria andClChkDesignIn(List<Double> values) {
            addCriterion("cl_chk_design in", values, "clChkDesign");
            return (Criteria) this;
        }

        public Criteria andClChkDesignNotIn(List<Double> values) {
            addCriterion("cl_chk_design not in", values, "clChkDesign");
            return (Criteria) this;
        }

        public Criteria andClChkDesignBetween(Double value1, Double value2) {
            addCriterion("cl_chk_design between", value1, value2, "clChkDesign");
            return (Criteria) this;
        }

        public Criteria andClChkDesignNotBetween(Double value1, Double value2) {
            addCriterion("cl_chk_design not between", value1, value2, "clChkDesign");
            return (Criteria) this;
        }

        public Criteria andClChkChangeIsNull() {
            addCriterion("cl_chk_change is null");
            return (Criteria) this;
        }

        public Criteria andClChkChangeIsNotNull() {
            addCriterion("cl_chk_change is not null");
            return (Criteria) this;
        }

        public Criteria andClChkChangeEqualTo(Double value) {
            addCriterion("cl_chk_change =", value, "clChkChange");
            return (Criteria) this;
        }

        public Criteria andClChkChangeNotEqualTo(Double value) {
            addCriterion("cl_chk_change <>", value, "clChkChange");
            return (Criteria) this;
        }

        public Criteria andClChkChangeGreaterThan(Double value) {
            addCriterion("cl_chk_change >", value, "clChkChange");
            return (Criteria) this;
        }

        public Criteria andClChkChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_chk_change >=", value, "clChkChange");
            return (Criteria) this;
        }

        public Criteria andClChkChangeLessThan(Double value) {
            addCriterion("cl_chk_change <", value, "clChkChange");
            return (Criteria) this;
        }

        public Criteria andClChkChangeLessThanOrEqualTo(Double value) {
            addCriterion("cl_chk_change <=", value, "clChkChange");
            return (Criteria) this;
        }

        public Criteria andClChkChangeIn(List<Double> values) {
            addCriterion("cl_chk_change in", values, "clChkChange");
            return (Criteria) this;
        }

        public Criteria andClChkChangeNotIn(List<Double> values) {
            addCriterion("cl_chk_change not in", values, "clChkChange");
            return (Criteria) this;
        }

        public Criteria andClChkChangeBetween(Double value1, Double value2) {
            addCriterion("cl_chk_change between", value1, value2, "clChkChange");
            return (Criteria) this;
        }

        public Criteria andClChkChangeNotBetween(Double value1, Double value2) {
            addCriterion("cl_chk_change not between", value1, value2, "clChkChange");
            return (Criteria) this;
        }

        public Criteria andClActDesignIsNull() {
            addCriterion("cl_act_design is null");
            return (Criteria) this;
        }

        public Criteria andClActDesignIsNotNull() {
            addCriterion("cl_act_design is not null");
            return (Criteria) this;
        }

        public Criteria andClActDesignEqualTo(Double value) {
            addCriterion("cl_act_design =", value, "clActDesign");
            return (Criteria) this;
        }

        public Criteria andClActDesignNotEqualTo(Double value) {
            addCriterion("cl_act_design <>", value, "clActDesign");
            return (Criteria) this;
        }

        public Criteria andClActDesignGreaterThan(Double value) {
            addCriterion("cl_act_design >", value, "clActDesign");
            return (Criteria) this;
        }

        public Criteria andClActDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_act_design >=", value, "clActDesign");
            return (Criteria) this;
        }

        public Criteria andClActDesignLessThan(Double value) {
            addCriterion("cl_act_design <", value, "clActDesign");
            return (Criteria) this;
        }

        public Criteria andClActDesignLessThanOrEqualTo(Double value) {
            addCriterion("cl_act_design <=", value, "clActDesign");
            return (Criteria) this;
        }

        public Criteria andClActDesignIn(List<Double> values) {
            addCriterion("cl_act_design in", values, "clActDesign");
            return (Criteria) this;
        }

        public Criteria andClActDesignNotIn(List<Double> values) {
            addCriterion("cl_act_design not in", values, "clActDesign");
            return (Criteria) this;
        }

        public Criteria andClActDesignBetween(Double value1, Double value2) {
            addCriterion("cl_act_design between", value1, value2, "clActDesign");
            return (Criteria) this;
        }

        public Criteria andClActDesignNotBetween(Double value1, Double value2) {
            addCriterion("cl_act_design not between", value1, value2, "clActDesign");
            return (Criteria) this;
        }

        public Criteria andClActChangeIsNull() {
            addCriterion("cl_act_change is null");
            return (Criteria) this;
        }

        public Criteria andClActChangeIsNotNull() {
            addCriterion("cl_act_change is not null");
            return (Criteria) this;
        }

        public Criteria andClActChangeEqualTo(Double value) {
            addCriterion("cl_act_change =", value, "clActChange");
            return (Criteria) this;
        }

        public Criteria andClActChangeNotEqualTo(Double value) {
            addCriterion("cl_act_change <>", value, "clActChange");
            return (Criteria) this;
        }

        public Criteria andClActChangeGreaterThan(Double value) {
            addCriterion("cl_act_change >", value, "clActChange");
            return (Criteria) this;
        }

        public Criteria andClActChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_act_change >=", value, "clActChange");
            return (Criteria) this;
        }

        public Criteria andClActChangeLessThan(Double value) {
            addCriterion("cl_act_change <", value, "clActChange");
            return (Criteria) this;
        }

        public Criteria andClActChangeLessThanOrEqualTo(Double value) {
            addCriterion("cl_act_change <=", value, "clActChange");
            return (Criteria) this;
        }

        public Criteria andClActChangeIn(List<Double> values) {
            addCriterion("cl_act_change in", values, "clActChange");
            return (Criteria) this;
        }

        public Criteria andClActChangeNotIn(List<Double> values) {
            addCriterion("cl_act_change not in", values, "clActChange");
            return (Criteria) this;
        }

        public Criteria andClActChangeBetween(Double value1, Double value2) {
            addCriterion("cl_act_change between", value1, value2, "clActChange");
            return (Criteria) this;
        }

        public Criteria andClActChangeNotBetween(Double value1, Double value2) {
            addCriterion("cl_act_change not between", value1, value2, "clActChange");
            return (Criteria) this;
        }

        public Criteria andClDoDesignIsNull() {
            addCriterion("cl_do_design is null");
            return (Criteria) this;
        }

        public Criteria andClDoDesignIsNotNull() {
            addCriterion("cl_do_design is not null");
            return (Criteria) this;
        }

        public Criteria andClDoDesignEqualTo(Double value) {
            addCriterion("cl_do_design =", value, "clDoDesign");
            return (Criteria) this;
        }

        public Criteria andClDoDesignNotEqualTo(Double value) {
            addCriterion("cl_do_design <>", value, "clDoDesign");
            return (Criteria) this;
        }

        public Criteria andClDoDesignGreaterThan(Double value) {
            addCriterion("cl_do_design >", value, "clDoDesign");
            return (Criteria) this;
        }

        public Criteria andClDoDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_do_design >=", value, "clDoDesign");
            return (Criteria) this;
        }

        public Criteria andClDoDesignLessThan(Double value) {
            addCriterion("cl_do_design <", value, "clDoDesign");
            return (Criteria) this;
        }

        public Criteria andClDoDesignLessThanOrEqualTo(Double value) {
            addCriterion("cl_do_design <=", value, "clDoDesign");
            return (Criteria) this;
        }

        public Criteria andClDoDesignIn(List<Double> values) {
            addCriterion("cl_do_design in", values, "clDoDesign");
            return (Criteria) this;
        }

        public Criteria andClDoDesignNotIn(List<Double> values) {
            addCriterion("cl_do_design not in", values, "clDoDesign");
            return (Criteria) this;
        }

        public Criteria andClDoDesignBetween(Double value1, Double value2) {
            addCriterion("cl_do_design between", value1, value2, "clDoDesign");
            return (Criteria) this;
        }

        public Criteria andClDoDesignNotBetween(Double value1, Double value2) {
            addCriterion("cl_do_design not between", value1, value2, "clDoDesign");
            return (Criteria) this;
        }

        public Criteria andClDoChangeIsNull() {
            addCriterion("cl_do_change is null");
            return (Criteria) this;
        }

        public Criteria andClDoChangeIsNotNull() {
            addCriterion("cl_do_change is not null");
            return (Criteria) this;
        }

        public Criteria andClDoChangeEqualTo(Double value) {
            addCriterion("cl_do_change =", value, "clDoChange");
            return (Criteria) this;
        }

        public Criteria andClDoChangeNotEqualTo(Double value) {
            addCriterion("cl_do_change <>", value, "clDoChange");
            return (Criteria) this;
        }

        public Criteria andClDoChangeGreaterThan(Double value) {
            addCriterion("cl_do_change >", value, "clDoChange");
            return (Criteria) this;
        }

        public Criteria andClDoChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_do_change >=", value, "clDoChange");
            return (Criteria) this;
        }

        public Criteria andClDoChangeLessThan(Double value) {
            addCriterion("cl_do_change <", value, "clDoChange");
            return (Criteria) this;
        }

        public Criteria andClDoChangeLessThanOrEqualTo(Double value) {
            addCriterion("cl_do_change <=", value, "clDoChange");
            return (Criteria) this;
        }

        public Criteria andClDoChangeIn(List<Double> values) {
            addCriterion("cl_do_change in", values, "clDoChange");
            return (Criteria) this;
        }

        public Criteria andClDoChangeNotIn(List<Double> values) {
            addCriterion("cl_do_change not in", values, "clDoChange");
            return (Criteria) this;
        }

        public Criteria andClDoChangeBetween(Double value1, Double value2) {
            addCriterion("cl_do_change between", value1, value2, "clDoChange");
            return (Criteria) this;
        }

        public Criteria andClDoChangeNotBetween(Double value1, Double value2) {
            addCriterion("cl_do_change not between", value1, value2, "clDoChange");
            return (Criteria) this;
        }

        public Criteria andClUpDesignIsNull() {
            addCriterion("cl_up_design is null");
            return (Criteria) this;
        }

        public Criteria andClUpDesignIsNotNull() {
            addCriterion("cl_up_design is not null");
            return (Criteria) this;
        }

        public Criteria andClUpDesignEqualTo(Double value) {
            addCriterion("cl_up_design =", value, "clUpDesign");
            return (Criteria) this;
        }

        public Criteria andClUpDesignNotEqualTo(Double value) {
            addCriterion("cl_up_design <>", value, "clUpDesign");
            return (Criteria) this;
        }

        public Criteria andClUpDesignGreaterThan(Double value) {
            addCriterion("cl_up_design >", value, "clUpDesign");
            return (Criteria) this;
        }

        public Criteria andClUpDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_up_design >=", value, "clUpDesign");
            return (Criteria) this;
        }

        public Criteria andClUpDesignLessThan(Double value) {
            addCriterion("cl_up_design <", value, "clUpDesign");
            return (Criteria) this;
        }

        public Criteria andClUpDesignLessThanOrEqualTo(Double value) {
            addCriterion("cl_up_design <=", value, "clUpDesign");
            return (Criteria) this;
        }

        public Criteria andClUpDesignIn(List<Double> values) {
            addCriterion("cl_up_design in", values, "clUpDesign");
            return (Criteria) this;
        }

        public Criteria andClUpDesignNotIn(List<Double> values) {
            addCriterion("cl_up_design not in", values, "clUpDesign");
            return (Criteria) this;
        }

        public Criteria andClUpDesignBetween(Double value1, Double value2) {
            addCriterion("cl_up_design between", value1, value2, "clUpDesign");
            return (Criteria) this;
        }

        public Criteria andClUpDesignNotBetween(Double value1, Double value2) {
            addCriterion("cl_up_design not between", value1, value2, "clUpDesign");
            return (Criteria) this;
        }

        public Criteria andClUpChangeIsNull() {
            addCriterion("cl_up_change is null");
            return (Criteria) this;
        }

        public Criteria andClUpChangeIsNotNull() {
            addCriterion("cl_up_change is not null");
            return (Criteria) this;
        }

        public Criteria andClUpChangeEqualTo(Double value) {
            addCriterion("cl_up_change =", value, "clUpChange");
            return (Criteria) this;
        }

        public Criteria andClUpChangeNotEqualTo(Double value) {
            addCriterion("cl_up_change <>", value, "clUpChange");
            return (Criteria) this;
        }

        public Criteria andClUpChangeGreaterThan(Double value) {
            addCriterion("cl_up_change >", value, "clUpChange");
            return (Criteria) this;
        }

        public Criteria andClUpChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_up_change >=", value, "clUpChange");
            return (Criteria) this;
        }

        public Criteria andClUpChangeLessThan(Double value) {
            addCriterion("cl_up_change <", value, "clUpChange");
            return (Criteria) this;
        }

        public Criteria andClUpChangeLessThanOrEqualTo(Double value) {
            addCriterion("cl_up_change <=", value, "clUpChange");
            return (Criteria) this;
        }

        public Criteria andClUpChangeIn(List<Double> values) {
            addCriterion("cl_up_change in", values, "clUpChange");
            return (Criteria) this;
        }

        public Criteria andClUpChangeNotIn(List<Double> values) {
            addCriterion("cl_up_change not in", values, "clUpChange");
            return (Criteria) this;
        }

        public Criteria andClUpChangeBetween(Double value1, Double value2) {
            addCriterion("cl_up_change between", value1, value2, "clUpChange");
            return (Criteria) this;
        }

        public Criteria andClUpChangeNotBetween(Double value1, Double value2) {
            addCriterion("cl_up_change not between", value1, value2, "clUpChange");
            return (Criteria) this;
        }

        public Criteria andClDownDesignIsNull() {
            addCriterion("cl_down_design is null");
            return (Criteria) this;
        }

        public Criteria andClDownDesignIsNotNull() {
            addCriterion("cl_down_design is not null");
            return (Criteria) this;
        }

        public Criteria andClDownDesignEqualTo(Double value) {
            addCriterion("cl_down_design =", value, "clDownDesign");
            return (Criteria) this;
        }

        public Criteria andClDownDesignNotEqualTo(Double value) {
            addCriterion("cl_down_design <>", value, "clDownDesign");
            return (Criteria) this;
        }

        public Criteria andClDownDesignGreaterThan(Double value) {
            addCriterion("cl_down_design >", value, "clDownDesign");
            return (Criteria) this;
        }

        public Criteria andClDownDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_down_design >=", value, "clDownDesign");
            return (Criteria) this;
        }

        public Criteria andClDownDesignLessThan(Double value) {
            addCriterion("cl_down_design <", value, "clDownDesign");
            return (Criteria) this;
        }

        public Criteria andClDownDesignLessThanOrEqualTo(Double value) {
            addCriterion("cl_down_design <=", value, "clDownDesign");
            return (Criteria) this;
        }

        public Criteria andClDownDesignIn(List<Double> values) {
            addCriterion("cl_down_design in", values, "clDownDesign");
            return (Criteria) this;
        }

        public Criteria andClDownDesignNotIn(List<Double> values) {
            addCriterion("cl_down_design not in", values, "clDownDesign");
            return (Criteria) this;
        }

        public Criteria andClDownDesignBetween(Double value1, Double value2) {
            addCriterion("cl_down_design between", value1, value2, "clDownDesign");
            return (Criteria) this;
        }

        public Criteria andClDownDesignNotBetween(Double value1, Double value2) {
            addCriterion("cl_down_design not between", value1, value2, "clDownDesign");
            return (Criteria) this;
        }

        public Criteria andClDownChangeIsNull() {
            addCriterion("cl_down_change is null");
            return (Criteria) this;
        }

        public Criteria andClDownChangeIsNotNull() {
            addCriterion("cl_down_change is not null");
            return (Criteria) this;
        }

        public Criteria andClDownChangeEqualTo(Double value) {
            addCriterion("cl_down_change =", value, "clDownChange");
            return (Criteria) this;
        }

        public Criteria andClDownChangeNotEqualTo(Double value) {
            addCriterion("cl_down_change <>", value, "clDownChange");
            return (Criteria) this;
        }

        public Criteria andClDownChangeGreaterThan(Double value) {
            addCriterion("cl_down_change >", value, "clDownChange");
            return (Criteria) this;
        }

        public Criteria andClDownChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("cl_down_change >=", value, "clDownChange");
            return (Criteria) this;
        }

        public Criteria andClDownChangeLessThan(Double value) {
            addCriterion("cl_down_change <", value, "clDownChange");
            return (Criteria) this;
        }

        public Criteria andClDownChangeLessThanOrEqualTo(Double value) {
            addCriterion("cl_down_change <=", value, "clDownChange");
            return (Criteria) this;
        }

        public Criteria andClDownChangeIn(List<Double> values) {
            addCriterion("cl_down_change in", values, "clDownChange");
            return (Criteria) this;
        }

        public Criteria andClDownChangeNotIn(List<Double> values) {
            addCriterion("cl_down_change not in", values, "clDownChange");
            return (Criteria) this;
        }

        public Criteria andClDownChangeBetween(Double value1, Double value2) {
            addCriterion("cl_down_change between", value1, value2, "clDownChange");
            return (Criteria) this;
        }

        public Criteria andClDownChangeNotBetween(Double value1, Double value2) {
            addCriterion("cl_down_change not between", value1, value2, "clDownChange");
            return (Criteria) this;
        }

        public Criteria andClInfoIsNull() {
            addCriterion("cl_info is null");
            return (Criteria) this;
        }

        public Criteria andClInfoIsNotNull() {
            addCriterion("cl_info is not null");
            return (Criteria) this;
        }

        public Criteria andClInfoEqualTo(String value) {
            addCriterion("cl_info =", value, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoNotEqualTo(String value) {
            addCriterion("cl_info <>", value, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoGreaterThan(String value) {
            addCriterion("cl_info >", value, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoGreaterThanOrEqualTo(String value) {
            addCriterion("cl_info >=", value, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoLessThan(String value) {
            addCriterion("cl_info <", value, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoLessThanOrEqualTo(String value) {
            addCriterion("cl_info <=", value, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoLike(String value) {
            addCriterion("cl_info like", value, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoNotLike(String value) {
            addCriterion("cl_info not like", value, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoIn(List<String> values) {
            addCriterion("cl_info in", values, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoNotIn(List<String> values) {
            addCriterion("cl_info not in", values, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoBetween(String value1, String value2) {
            addCriterion("cl_info between", value1, value2, "clInfo");
            return (Criteria) this;
        }

        public Criteria andClInfoNotBetween(String value1, String value2) {
            addCriterion("cl_info not between", value1, value2, "clInfo");
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