package com.model;

import java.util.ArrayList;
import java.util.List;

public class GuidanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public GuidanceExample() {
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

        public Criteria andGdIdIsNull() {
            addCriterion("gd_id is null");
            return (Criteria) this;
        }

        public Criteria andGdIdIsNotNull() {
            addCriterion("gd_id is not null");
            return (Criteria) this;
        }

        public Criteria andGdIdEqualTo(Integer value) {
            addCriterion("gd_id =", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdNotEqualTo(Integer value) {
            addCriterion("gd_id <>", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdGreaterThan(Integer value) {
            addCriterion("gd_id >", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gd_id >=", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdLessThan(Integer value) {
            addCriterion("gd_id <", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdLessThanOrEqualTo(Integer value) {
            addCriterion("gd_id <=", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdIn(List<Integer> values) {
            addCriterion("gd_id in", values, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdNotIn(List<Integer> values) {
            addCriterion("gd_id not in", values, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdBetween(Integer value1, Integer value2) {
            addCriterion("gd_id between", value1, value2, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gd_id not between", value1, value2, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdCodeIsNull() {
            addCriterion("gd_code is null");
            return (Criteria) this;
        }

        public Criteria andGdCodeIsNotNull() {
            addCriterion("gd_code is not null");
            return (Criteria) this;
        }

        public Criteria andGdCodeEqualTo(String value) {
            addCriterion("gd_code =", value, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeNotEqualTo(String value) {
            addCriterion("gd_code <>", value, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeGreaterThan(String value) {
            addCriterion("gd_code >", value, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gd_code >=", value, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeLessThan(String value) {
            addCriterion("gd_code <", value, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeLessThanOrEqualTo(String value) {
            addCriterion("gd_code <=", value, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeLike(String value) {
            addCriterion("gd_code like", value, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeNotLike(String value) {
            addCriterion("gd_code not like", value, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeIn(List<String> values) {
            addCriterion("gd_code in", values, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeNotIn(List<String> values) {
            addCriterion("gd_code not in", values, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeBetween(String value1, String value2) {
            addCriterion("gd_code between", value1, value2, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdCodeNotBetween(String value1, String value2) {
            addCriterion("gd_code not between", value1, value2, "gdCode");
            return (Criteria) this;
        }

        public Criteria andGdLabelIsNull() {
            addCriterion("gd_label is null");
            return (Criteria) this;
        }

        public Criteria andGdLabelIsNotNull() {
            addCriterion("gd_label is not null");
            return (Criteria) this;
        }

        public Criteria andGdLabelEqualTo(String value) {
            addCriterion("gd_label =", value, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelNotEqualTo(String value) {
            addCriterion("gd_label <>", value, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelGreaterThan(String value) {
            addCriterion("gd_label >", value, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelGreaterThanOrEqualTo(String value) {
            addCriterion("gd_label >=", value, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelLessThan(String value) {
            addCriterion("gd_label <", value, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelLessThanOrEqualTo(String value) {
            addCriterion("gd_label <=", value, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelLike(String value) {
            addCriterion("gd_label like", value, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelNotLike(String value) {
            addCriterion("gd_label not like", value, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelIn(List<String> values) {
            addCriterion("gd_label in", values, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelNotIn(List<String> values) {
            addCriterion("gd_label not in", values, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelBetween(String value1, String value2) {
            addCriterion("gd_label between", value1, value2, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdLabelNotBetween(String value1, String value2) {
            addCriterion("gd_label not between", value1, value2, "gdLabel");
            return (Criteria) this;
        }

        public Criteria andGdNameIsNull() {
            addCriterion("gd_name is null");
            return (Criteria) this;
        }

        public Criteria andGdNameIsNotNull() {
            addCriterion("gd_name is not null");
            return (Criteria) this;
        }

        public Criteria andGdNameEqualTo(String value) {
            addCriterion("gd_name =", value, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameNotEqualTo(String value) {
            addCriterion("gd_name <>", value, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameGreaterThan(String value) {
            addCriterion("gd_name >", value, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameGreaterThanOrEqualTo(String value) {
            addCriterion("gd_name >=", value, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameLessThan(String value) {
            addCriterion("gd_name <", value, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameLessThanOrEqualTo(String value) {
            addCriterion("gd_name <=", value, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameLike(String value) {
            addCriterion("gd_name like", value, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameNotLike(String value) {
            addCriterion("gd_name not like", value, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameIn(List<String> values) {
            addCriterion("gd_name in", values, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameNotIn(List<String> values) {
            addCriterion("gd_name not in", values, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameBetween(String value1, String value2) {
            addCriterion("gd_name between", value1, value2, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdNameNotBetween(String value1, String value2) {
            addCriterion("gd_name not between", value1, value2, "gdName");
            return (Criteria) this;
        }

        public Criteria andGdUnitIsNull() {
            addCriterion("gd_unit is null");
            return (Criteria) this;
        }

        public Criteria andGdUnitIsNotNull() {
            addCriterion("gd_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGdUnitEqualTo(String value) {
            addCriterion("gd_unit =", value, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitNotEqualTo(String value) {
            addCriterion("gd_unit <>", value, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitGreaterThan(String value) {
            addCriterion("gd_unit >", value, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitGreaterThanOrEqualTo(String value) {
            addCriterion("gd_unit >=", value, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitLessThan(String value) {
            addCriterion("gd_unit <", value, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitLessThanOrEqualTo(String value) {
            addCriterion("gd_unit <=", value, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitLike(String value) {
            addCriterion("gd_unit like", value, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitNotLike(String value) {
            addCriterion("gd_unit not like", value, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitIn(List<String> values) {
            addCriterion("gd_unit in", values, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitNotIn(List<String> values) {
            addCriterion("gd_unit not in", values, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitBetween(String value1, String value2) {
            addCriterion("gd_unit between", value1, value2, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdUnitNotBetween(String value1, String value2) {
            addCriterion("gd_unit not between", value1, value2, "gdUnit");
            return (Criteria) this;
        }

        public Criteria andGdRateIsNull() {
            addCriterion("gd_rate is null");
            return (Criteria) this;
        }

        public Criteria andGdRateIsNotNull() {
            addCriterion("gd_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGdRateEqualTo(Double value) {
            addCriterion("gd_rate =", value, "gdRate");
            return (Criteria) this;
        }

        public Criteria andGdRateNotEqualTo(Double value) {
            addCriterion("gd_rate <>", value, "gdRate");
            return (Criteria) this;
        }

        public Criteria andGdRateGreaterThan(Double value) {
            addCriterion("gd_rate >", value, "gdRate");
            return (Criteria) this;
        }

        public Criteria andGdRateGreaterThanOrEqualTo(Double value) {
            addCriterion("gd_rate >=", value, "gdRate");
            return (Criteria) this;
        }

        public Criteria andGdRateLessThan(Double value) {
            addCriterion("gd_rate <", value, "gdRate");
            return (Criteria) this;
        }

        public Criteria andGdRateLessThanOrEqualTo(Double value) {
            addCriterion("gd_rate <=", value, "gdRate");
            return (Criteria) this;
        }

        public Criteria andGdRateIn(List<Double> values) {
            addCriterion("gd_rate in", values, "gdRate");
            return (Criteria) this;
        }

        public Criteria andGdRateNotIn(List<Double> values) {
            addCriterion("gd_rate not in", values, "gdRate");
            return (Criteria) this;
        }

        public Criteria andGdRateBetween(Double value1, Double value2) {
            addCriterion("gd_rate between", value1, value2, "gdRate");
            return (Criteria) this;
        }

        public Criteria andGdRateNotBetween(Double value1, Double value2) {
            addCriterion("gd_rate not between", value1, value2, "gdRate");
            return (Criteria) this;
        }

        public Criteria andGdPriceIsNull() {
            addCriterion("gd_price is null");
            return (Criteria) this;
        }

        public Criteria andGdPriceIsNotNull() {
            addCriterion("gd_price is not null");
            return (Criteria) this;
        }

        public Criteria andGdPriceEqualTo(Double value) {
            addCriterion("gd_price =", value, "gdPrice");
            return (Criteria) this;
        }

        public Criteria andGdPriceNotEqualTo(Double value) {
            addCriterion("gd_price <>", value, "gdPrice");
            return (Criteria) this;
        }

        public Criteria andGdPriceGreaterThan(Double value) {
            addCriterion("gd_price >", value, "gdPrice");
            return (Criteria) this;
        }

        public Criteria andGdPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gd_price >=", value, "gdPrice");
            return (Criteria) this;
        }

        public Criteria andGdPriceLessThan(Double value) {
            addCriterion("gd_price <", value, "gdPrice");
            return (Criteria) this;
        }

        public Criteria andGdPriceLessThanOrEqualTo(Double value) {
            addCriterion("gd_price <=", value, "gdPrice");
            return (Criteria) this;
        }

        public Criteria andGdPriceIn(List<Double> values) {
            addCriterion("gd_price in", values, "gdPrice");
            return (Criteria) this;
        }

        public Criteria andGdPriceNotIn(List<Double> values) {
            addCriterion("gd_price not in", values, "gdPrice");
            return (Criteria) this;
        }

        public Criteria andGdPriceBetween(Double value1, Double value2) {
            addCriterion("gd_price between", value1, value2, "gdPrice");
            return (Criteria) this;
        }

        public Criteria andGdPriceNotBetween(Double value1, Double value2) {
            addCriterion("gd_price not between", value1, value2, "gdPrice");
            return (Criteria) this;
        }

        public Criteria andGdItemIsNull() {
            addCriterion("gd_item is null");
            return (Criteria) this;
        }

        public Criteria andGdItemIsNotNull() {
            addCriterion("gd_item is not null");
            return (Criteria) this;
        }

        public Criteria andGdItemEqualTo(Double value) {
            addCriterion("gd_item =", value, "gdItem");
            return (Criteria) this;
        }

        public Criteria andGdItemNotEqualTo(Double value) {
            addCriterion("gd_item <>", value, "gdItem");
            return (Criteria) this;
        }

        public Criteria andGdItemGreaterThan(Double value) {
            addCriterion("gd_item >", value, "gdItem");
            return (Criteria) this;
        }

        public Criteria andGdItemGreaterThanOrEqualTo(Double value) {
            addCriterion("gd_item >=", value, "gdItem");
            return (Criteria) this;
        }

        public Criteria andGdItemLessThan(Double value) {
            addCriterion("gd_item <", value, "gdItem");
            return (Criteria) this;
        }

        public Criteria andGdItemLessThanOrEqualTo(Double value) {
            addCriterion("gd_item <=", value, "gdItem");
            return (Criteria) this;
        }

        public Criteria andGdItemIn(List<Double> values) {
            addCriterion("gd_item in", values, "gdItem");
            return (Criteria) this;
        }

        public Criteria andGdItemNotIn(List<Double> values) {
            addCriterion("gd_item not in", values, "gdItem");
            return (Criteria) this;
        }

        public Criteria andGdItemBetween(Double value1, Double value2) {
            addCriterion("gd_item between", value1, value2, "gdItem");
            return (Criteria) this;
        }

        public Criteria andGdItemNotBetween(Double value1, Double value2) {
            addCriterion("gd_item not between", value1, value2, "gdItem");
            return (Criteria) this;
        }

        public Criteria andGdWorkIsNull() {
            addCriterion("gd_work is null");
            return (Criteria) this;
        }

        public Criteria andGdWorkIsNotNull() {
            addCriterion("gd_work is not null");
            return (Criteria) this;
        }

        public Criteria andGdWorkEqualTo(String value) {
            addCriterion("gd_work =", value, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkNotEqualTo(String value) {
            addCriterion("gd_work <>", value, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkGreaterThan(String value) {
            addCriterion("gd_work >", value, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkGreaterThanOrEqualTo(String value) {
            addCriterion("gd_work >=", value, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkLessThan(String value) {
            addCriterion("gd_work <", value, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkLessThanOrEqualTo(String value) {
            addCriterion("gd_work <=", value, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkLike(String value) {
            addCriterion("gd_work like", value, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkNotLike(String value) {
            addCriterion("gd_work not like", value, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkIn(List<String> values) {
            addCriterion("gd_work in", values, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkNotIn(List<String> values) {
            addCriterion("gd_work not in", values, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkBetween(String value1, String value2) {
            addCriterion("gd_work between", value1, value2, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdWorkNotBetween(String value1, String value2) {
            addCriterion("gd_work not between", value1, value2, "gdWork");
            return (Criteria) this;
        }

        public Criteria andGdCostIsNull() {
            addCriterion("gd_cost is null");
            return (Criteria) this;
        }

        public Criteria andGdCostIsNotNull() {
            addCriterion("gd_cost is not null");
            return (Criteria) this;
        }

        public Criteria andGdCostEqualTo(String value) {
            addCriterion("gd_cost =", value, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostNotEqualTo(String value) {
            addCriterion("gd_cost <>", value, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostGreaterThan(String value) {
            addCriterion("gd_cost >", value, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostGreaterThanOrEqualTo(String value) {
            addCriterion("gd_cost >=", value, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostLessThan(String value) {
            addCriterion("gd_cost <", value, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostLessThanOrEqualTo(String value) {
            addCriterion("gd_cost <=", value, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostLike(String value) {
            addCriterion("gd_cost like", value, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostNotLike(String value) {
            addCriterion("gd_cost not like", value, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostIn(List<String> values) {
            addCriterion("gd_cost in", values, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostNotIn(List<String> values) {
            addCriterion("gd_cost not in", values, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostBetween(String value1, String value2) {
            addCriterion("gd_cost between", value1, value2, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdCostNotBetween(String value1, String value2) {
            addCriterion("gd_cost not between", value1, value2, "gdCost");
            return (Criteria) this;
        }

        public Criteria andGdRoleIsNull() {
            addCriterion("gd_role is null");
            return (Criteria) this;
        }

        public Criteria andGdRoleIsNotNull() {
            addCriterion("gd_role is not null");
            return (Criteria) this;
        }

        public Criteria andGdRoleEqualTo(String value) {
            addCriterion("gd_role =", value, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleNotEqualTo(String value) {
            addCriterion("gd_role <>", value, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleGreaterThan(String value) {
            addCriterion("gd_role >", value, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleGreaterThanOrEqualTo(String value) {
            addCriterion("gd_role >=", value, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleLessThan(String value) {
            addCriterion("gd_role <", value, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleLessThanOrEqualTo(String value) {
            addCriterion("gd_role <=", value, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleLike(String value) {
            addCriterion("gd_role like", value, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleNotLike(String value) {
            addCriterion("gd_role not like", value, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleIn(List<String> values) {
            addCriterion("gd_role in", values, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleNotIn(List<String> values) {
            addCriterion("gd_role not in", values, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleBetween(String value1, String value2) {
            addCriterion("gd_role between", value1, value2, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdRoleNotBetween(String value1, String value2) {
            addCriterion("gd_role not between", value1, value2, "gdRole");
            return (Criteria) this;
        }

        public Criteria andGdInfoIsNull() {
            addCriterion("gd_info is null");
            return (Criteria) this;
        }

        public Criteria andGdInfoIsNotNull() {
            addCriterion("gd_info is not null");
            return (Criteria) this;
        }

        public Criteria andGdInfoEqualTo(String value) {
            addCriterion("gd_info =", value, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoNotEqualTo(String value) {
            addCriterion("gd_info <>", value, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoGreaterThan(String value) {
            addCriterion("gd_info >", value, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoGreaterThanOrEqualTo(String value) {
            addCriterion("gd_info >=", value, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoLessThan(String value) {
            addCriterion("gd_info <", value, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoLessThanOrEqualTo(String value) {
            addCriterion("gd_info <=", value, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoLike(String value) {
            addCriterion("gd_info like", value, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoNotLike(String value) {
            addCriterion("gd_info not like", value, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoIn(List<String> values) {
            addCriterion("gd_info in", values, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoNotIn(List<String> values) {
            addCriterion("gd_info not in", values, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoBetween(String value1, String value2) {
            addCriterion("gd_info between", value1, value2, "gdInfo");
            return (Criteria) this;
        }

        public Criteria andGdInfoNotBetween(String value1, String value2) {
            addCriterion("gd_info not between", value1, value2, "gdInfo");
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