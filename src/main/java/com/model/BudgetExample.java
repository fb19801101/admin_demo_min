package com.model;

import java.util.ArrayList;
import java.util.List;

public class BudgetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public BudgetExample() {
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

        public Criteria andBgIdIsNull() {
            addCriterion("bg_id is null");
            return (Criteria) this;
        }

        public Criteria andBgIdIsNotNull() {
            addCriterion("bg_id is not null");
            return (Criteria) this;
        }

        public Criteria andBgIdEqualTo(Integer value) {
            addCriterion("bg_id =", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdNotEqualTo(Integer value) {
            addCriterion("bg_id <>", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdGreaterThan(Integer value) {
            addCriterion("bg_id >", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bg_id >=", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdLessThan(Integer value) {
            addCriterion("bg_id <", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdLessThanOrEqualTo(Integer value) {
            addCriterion("bg_id <=", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdIn(List<Integer> values) {
            addCriterion("bg_id in", values, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdNotIn(List<Integer> values) {
            addCriterion("bg_id not in", values, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdBetween(Integer value1, Integer value2) {
            addCriterion("bg_id between", value1, value2, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bg_id not between", value1, value2, "bgId");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNull() {
            addCriterion("ct_id is null");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNotNull() {
            addCriterion("ct_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtIdEqualTo(Integer value) {
            addCriterion("ct_id =", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotEqualTo(Integer value) {
            addCriterion("ct_id <>", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThan(Integer value) {
            addCriterion("ct_id >", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_id >=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThan(Integer value) {
            addCriterion("ct_id <", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ct_id <=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdIn(List<Integer> values) {
            addCriterion("ct_id in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotIn(List<Integer> values) {
            addCriterion("ct_id not in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdBetween(Integer value1, Integer value2) {
            addCriterion("ct_id between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_id not between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtCodeIsNull() {
            addCriterion("ct_code is null");
            return (Criteria) this;
        }

        public Criteria andCtCodeIsNotNull() {
            addCriterion("ct_code is not null");
            return (Criteria) this;
        }

        public Criteria andCtCodeEqualTo(String value) {
            addCriterion("ct_code =", value, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeNotEqualTo(String value) {
            addCriterion("ct_code <>", value, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeGreaterThan(String value) {
            addCriterion("ct_code >", value, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ct_code >=", value, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeLessThan(String value) {
            addCriterion("ct_code <", value, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeLessThanOrEqualTo(String value) {
            addCriterion("ct_code <=", value, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeLike(String value) {
            addCriterion("ct_code like", value, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeNotLike(String value) {
            addCriterion("ct_code not like", value, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeIn(List<String> values) {
            addCriterion("ct_code in", values, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeNotIn(List<String> values) {
            addCriterion("ct_code not in", values, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeBetween(String value1, String value2) {
            addCriterion("ct_code between", value1, value2, "ctCode");
            return (Criteria) this;
        }

        public Criteria andCtCodeNotBetween(String value1, String value2) {
            addCriterion("ct_code not between", value1, value2, "ctCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeIsNull() {
            addCriterion("bg_code is null");
            return (Criteria) this;
        }

        public Criteria andBgCodeIsNotNull() {
            addCriterion("bg_code is not null");
            return (Criteria) this;
        }

        public Criteria andBgCodeEqualTo(String value) {
            addCriterion("bg_code =", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeNotEqualTo(String value) {
            addCriterion("bg_code <>", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeGreaterThan(String value) {
            addCriterion("bg_code >", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bg_code >=", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeLessThan(String value) {
            addCriterion("bg_code <", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeLessThanOrEqualTo(String value) {
            addCriterion("bg_code <=", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeLike(String value) {
            addCriterion("bg_code like", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeNotLike(String value) {
            addCriterion("bg_code not like", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeIn(List<String> values) {
            addCriterion("bg_code in", values, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeNotIn(List<String> values) {
            addCriterion("bg_code not in", values, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeBetween(String value1, String value2) {
            addCriterion("bg_code between", value1, value2, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeNotBetween(String value1, String value2) {
            addCriterion("bg_code not between", value1, value2, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgNameIsNull() {
            addCriterion("bg_name is null");
            return (Criteria) this;
        }

        public Criteria andBgNameIsNotNull() {
            addCriterion("bg_name is not null");
            return (Criteria) this;
        }

        public Criteria andBgNameEqualTo(String value) {
            addCriterion("bg_name =", value, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameNotEqualTo(String value) {
            addCriterion("bg_name <>", value, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameGreaterThan(String value) {
            addCriterion("bg_name >", value, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameGreaterThanOrEqualTo(String value) {
            addCriterion("bg_name >=", value, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameLessThan(String value) {
            addCriterion("bg_name <", value, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameLessThanOrEqualTo(String value) {
            addCriterion("bg_name <=", value, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameLike(String value) {
            addCriterion("bg_name like", value, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameNotLike(String value) {
            addCriterion("bg_name not like", value, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameIn(List<String> values) {
            addCriterion("bg_name in", values, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameNotIn(List<String> values) {
            addCriterion("bg_name not in", values, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameBetween(String value1, String value2) {
            addCriterion("bg_name between", value1, value2, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgNameNotBetween(String value1, String value2) {
            addCriterion("bg_name not between", value1, value2, "bgName");
            return (Criteria) this;
        }

        public Criteria andBgUnitIsNull() {
            addCriterion("bg_unit is null");
            return (Criteria) this;
        }

        public Criteria andBgUnitIsNotNull() {
            addCriterion("bg_unit is not null");
            return (Criteria) this;
        }

        public Criteria andBgUnitEqualTo(String value) {
            addCriterion("bg_unit =", value, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitNotEqualTo(String value) {
            addCriterion("bg_unit <>", value, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitGreaterThan(String value) {
            addCriterion("bg_unit >", value, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitGreaterThanOrEqualTo(String value) {
            addCriterion("bg_unit >=", value, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitLessThan(String value) {
            addCriterion("bg_unit <", value, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitLessThanOrEqualTo(String value) {
            addCriterion("bg_unit <=", value, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitLike(String value) {
            addCriterion("bg_unit like", value, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitNotLike(String value) {
            addCriterion("bg_unit not like", value, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitIn(List<String> values) {
            addCriterion("bg_unit in", values, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitNotIn(List<String> values) {
            addCriterion("bg_unit not in", values, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitBetween(String value1, String value2) {
            addCriterion("bg_unit between", value1, value2, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgUnitNotBetween(String value1, String value2) {
            addCriterion("bg_unit not between", value1, value2, "bgUnit");
            return (Criteria) this;
        }

        public Criteria andBgRateIsNull() {
            addCriterion("bg_rate is null");
            return (Criteria) this;
        }

        public Criteria andBgRateIsNotNull() {
            addCriterion("bg_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBgRateEqualTo(Double value) {
            addCriterion("bg_rate =", value, "bgRate");
            return (Criteria) this;
        }

        public Criteria andBgRateNotEqualTo(Double value) {
            addCriterion("bg_rate <>", value, "bgRate");
            return (Criteria) this;
        }

        public Criteria andBgRateGreaterThan(Double value) {
            addCriterion("bg_rate >", value, "bgRate");
            return (Criteria) this;
        }

        public Criteria andBgRateGreaterThanOrEqualTo(Double value) {
            addCriterion("bg_rate >=", value, "bgRate");
            return (Criteria) this;
        }

        public Criteria andBgRateLessThan(Double value) {
            addCriterion("bg_rate <", value, "bgRate");
            return (Criteria) this;
        }

        public Criteria andBgRateLessThanOrEqualTo(Double value) {
            addCriterion("bg_rate <=", value, "bgRate");
            return (Criteria) this;
        }

        public Criteria andBgRateIn(List<Double> values) {
            addCriterion("bg_rate in", values, "bgRate");
            return (Criteria) this;
        }

        public Criteria andBgRateNotIn(List<Double> values) {
            addCriterion("bg_rate not in", values, "bgRate");
            return (Criteria) this;
        }

        public Criteria andBgRateBetween(Double value1, Double value2) {
            addCriterion("bg_rate between", value1, value2, "bgRate");
            return (Criteria) this;
        }

        public Criteria andBgRateNotBetween(Double value1, Double value2) {
            addCriterion("bg_rate not between", value1, value2, "bgRate");
            return (Criteria) this;
        }

        public Criteria andBgQtyIsNull() {
            addCriterion("bg_qty is null");
            return (Criteria) this;
        }

        public Criteria andBgQtyIsNotNull() {
            addCriterion("bg_qty is not null");
            return (Criteria) this;
        }

        public Criteria andBgQtyEqualTo(Double value) {
            addCriterion("bg_qty =", value, "bgQty");
            return (Criteria) this;
        }

        public Criteria andBgQtyNotEqualTo(Double value) {
            addCriterion("bg_qty <>", value, "bgQty");
            return (Criteria) this;
        }

        public Criteria andBgQtyGreaterThan(Double value) {
            addCriterion("bg_qty >", value, "bgQty");
            return (Criteria) this;
        }

        public Criteria andBgQtyGreaterThanOrEqualTo(Double value) {
            addCriterion("bg_qty >=", value, "bgQty");
            return (Criteria) this;
        }

        public Criteria andBgQtyLessThan(Double value) {
            addCriterion("bg_qty <", value, "bgQty");
            return (Criteria) this;
        }

        public Criteria andBgQtyLessThanOrEqualTo(Double value) {
            addCriterion("bg_qty <=", value, "bgQty");
            return (Criteria) this;
        }

        public Criteria andBgQtyIn(List<Double> values) {
            addCriterion("bg_qty in", values, "bgQty");
            return (Criteria) this;
        }

        public Criteria andBgQtyNotIn(List<Double> values) {
            addCriterion("bg_qty not in", values, "bgQty");
            return (Criteria) this;
        }

        public Criteria andBgQtyBetween(Double value1, Double value2) {
            addCriterion("bg_qty between", value1, value2, "bgQty");
            return (Criteria) this;
        }

        public Criteria andBgQtyNotBetween(Double value1, Double value2) {
            addCriterion("bg_qty not between", value1, value2, "bgQty");
            return (Criteria) this;
        }

        public Criteria andBgPriceIsNull() {
            addCriterion("bg_price is null");
            return (Criteria) this;
        }

        public Criteria andBgPriceIsNotNull() {
            addCriterion("bg_price is not null");
            return (Criteria) this;
        }

        public Criteria andBgPriceEqualTo(Double value) {
            addCriterion("bg_price =", value, "bgPrice");
            return (Criteria) this;
        }

        public Criteria andBgPriceNotEqualTo(Double value) {
            addCriterion("bg_price <>", value, "bgPrice");
            return (Criteria) this;
        }

        public Criteria andBgPriceGreaterThan(Double value) {
            addCriterion("bg_price >", value, "bgPrice");
            return (Criteria) this;
        }

        public Criteria andBgPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("bg_price >=", value, "bgPrice");
            return (Criteria) this;
        }

        public Criteria andBgPriceLessThan(Double value) {
            addCriterion("bg_price <", value, "bgPrice");
            return (Criteria) this;
        }

        public Criteria andBgPriceLessThanOrEqualTo(Double value) {
            addCriterion("bg_price <=", value, "bgPrice");
            return (Criteria) this;
        }

        public Criteria andBgPriceIn(List<Double> values) {
            addCriterion("bg_price in", values, "bgPrice");
            return (Criteria) this;
        }

        public Criteria andBgPriceNotIn(List<Double> values) {
            addCriterion("bg_price not in", values, "bgPrice");
            return (Criteria) this;
        }

        public Criteria andBgPriceBetween(Double value1, Double value2) {
            addCriterion("bg_price between", value1, value2, "bgPrice");
            return (Criteria) this;
        }

        public Criteria andBgPriceNotBetween(Double value1, Double value2) {
            addCriterion("bg_price not between", value1, value2, "bgPrice");
            return (Criteria) this;
        }

        public Criteria andBgMoneyIsNull() {
            addCriterion("bg_money is null");
            return (Criteria) this;
        }

        public Criteria andBgMoneyIsNotNull() {
            addCriterion("bg_money is not null");
            return (Criteria) this;
        }

        public Criteria andBgMoneyEqualTo(Double value) {
            addCriterion("bg_money =", value, "bgMoney");
            return (Criteria) this;
        }

        public Criteria andBgMoneyNotEqualTo(Double value) {
            addCriterion("bg_money <>", value, "bgMoney");
            return (Criteria) this;
        }

        public Criteria andBgMoneyGreaterThan(Double value) {
            addCriterion("bg_money >", value, "bgMoney");
            return (Criteria) this;
        }

        public Criteria andBgMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("bg_money >=", value, "bgMoney");
            return (Criteria) this;
        }

        public Criteria andBgMoneyLessThan(Double value) {
            addCriterion("bg_money <", value, "bgMoney");
            return (Criteria) this;
        }

        public Criteria andBgMoneyLessThanOrEqualTo(Double value) {
            addCriterion("bg_money <=", value, "bgMoney");
            return (Criteria) this;
        }

        public Criteria andBgMoneyIn(List<Double> values) {
            addCriterion("bg_money in", values, "bgMoney");
            return (Criteria) this;
        }

        public Criteria andBgMoneyNotIn(List<Double> values) {
            addCriterion("bg_money not in", values, "bgMoney");
            return (Criteria) this;
        }

        public Criteria andBgMoneyBetween(Double value1, Double value2) {
            addCriterion("bg_money between", value1, value2, "bgMoney");
            return (Criteria) this;
        }

        public Criteria andBgMoneyNotBetween(Double value1, Double value2) {
            addCriterion("bg_money not between", value1, value2, "bgMoney");
            return (Criteria) this;
        }

        public Criteria andBgInfoIsNull() {
            addCriterion("bg_info is null");
            return (Criteria) this;
        }

        public Criteria andBgInfoIsNotNull() {
            addCriterion("bg_info is not null");
            return (Criteria) this;
        }

        public Criteria andBgInfoEqualTo(String value) {
            addCriterion("bg_info =", value, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoNotEqualTo(String value) {
            addCriterion("bg_info <>", value, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoGreaterThan(String value) {
            addCriterion("bg_info >", value, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoGreaterThanOrEqualTo(String value) {
            addCriterion("bg_info >=", value, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoLessThan(String value) {
            addCriterion("bg_info <", value, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoLessThanOrEqualTo(String value) {
            addCriterion("bg_info <=", value, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoLike(String value) {
            addCriterion("bg_info like", value, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoNotLike(String value) {
            addCriterion("bg_info not like", value, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoIn(List<String> values) {
            addCriterion("bg_info in", values, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoNotIn(List<String> values) {
            addCriterion("bg_info not in", values, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoBetween(String value1, String value2) {
            addCriterion("bg_info between", value1, value2, "bgInfo");
            return (Criteria) this;
        }

        public Criteria andBgInfoNotBetween(String value1, String value2) {
            addCriterion("bg_info not between", value1, value2, "bgInfo");
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