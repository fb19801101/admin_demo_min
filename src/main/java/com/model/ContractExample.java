package com.model;

import java.util.ArrayList;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ContractExample() {
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

        public Criteria andCtPidIsNull() {
            addCriterion("ct_pid is null");
            return (Criteria) this;
        }

        public Criteria andCtPidIsNotNull() {
            addCriterion("ct_pid is not null");
            return (Criteria) this;
        }

        public Criteria andCtPidEqualTo(Integer value) {
            addCriterion("ct_pid =", value, "ctPid");
            return (Criteria) this;
        }

        public Criteria andCtPidNotEqualTo(Integer value) {
            addCriterion("ct_pid <>", value, "ctPid");
            return (Criteria) this;
        }

        public Criteria andCtPidGreaterThan(Integer value) {
            addCriterion("ct_pid >", value, "ctPid");
            return (Criteria) this;
        }

        public Criteria andCtPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_pid >=", value, "ctPid");
            return (Criteria) this;
        }

        public Criteria andCtPidLessThan(Integer value) {
            addCriterion("ct_pid <", value, "ctPid");
            return (Criteria) this;
        }

        public Criteria andCtPidLessThanOrEqualTo(Integer value) {
            addCriterion("ct_pid <=", value, "ctPid");
            return (Criteria) this;
        }

        public Criteria andCtPidIn(List<Integer> values) {
            addCriterion("ct_pid in", values, "ctPid");
            return (Criteria) this;
        }

        public Criteria andCtPidNotIn(List<Integer> values) {
            addCriterion("ct_pid not in", values, "ctPid");
            return (Criteria) this;
        }

        public Criteria andCtPidBetween(Integer value1, Integer value2) {
            addCriterion("ct_pid between", value1, value2, "ctPid");
            return (Criteria) this;
        }

        public Criteria andCtPidNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_pid not between", value1, value2, "ctPid");
            return (Criteria) this;
        }

        public Criteria andCtLevelIsNull() {
            addCriterion("ct_level is null");
            return (Criteria) this;
        }

        public Criteria andCtLevelIsNotNull() {
            addCriterion("ct_level is not null");
            return (Criteria) this;
        }

        public Criteria andCtLevelEqualTo(Byte value) {
            addCriterion("ct_level =", value, "ctLevel");
            return (Criteria) this;
        }

        public Criteria andCtLevelNotEqualTo(Byte value) {
            addCriterion("ct_level <>", value, "ctLevel");
            return (Criteria) this;
        }

        public Criteria andCtLevelGreaterThan(Byte value) {
            addCriterion("ct_level >", value, "ctLevel");
            return (Criteria) this;
        }

        public Criteria andCtLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("ct_level >=", value, "ctLevel");
            return (Criteria) this;
        }

        public Criteria andCtLevelLessThan(Byte value) {
            addCriterion("ct_level <", value, "ctLevel");
            return (Criteria) this;
        }

        public Criteria andCtLevelLessThanOrEqualTo(Byte value) {
            addCriterion("ct_level <=", value, "ctLevel");
            return (Criteria) this;
        }

        public Criteria andCtLevelIn(List<Byte> values) {
            addCriterion("ct_level in", values, "ctLevel");
            return (Criteria) this;
        }

        public Criteria andCtLevelNotIn(List<Byte> values) {
            addCriterion("ct_level not in", values, "ctLevel");
            return (Criteria) this;
        }

        public Criteria andCtLevelBetween(Byte value1, Byte value2) {
            addCriterion("ct_level between", value1, value2, "ctLevel");
            return (Criteria) this;
        }

        public Criteria andCtLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("ct_level not between", value1, value2, "ctLevel");
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

        public Criteria andCtNameIsNull() {
            addCriterion("ct_name is null");
            return (Criteria) this;
        }

        public Criteria andCtNameIsNotNull() {
            addCriterion("ct_name is not null");
            return (Criteria) this;
        }

        public Criteria andCtNameEqualTo(String value) {
            addCriterion("ct_name =", value, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameNotEqualTo(String value) {
            addCriterion("ct_name <>", value, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameGreaterThan(String value) {
            addCriterion("ct_name >", value, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameGreaterThanOrEqualTo(String value) {
            addCriterion("ct_name >=", value, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameLessThan(String value) {
            addCriterion("ct_name <", value, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameLessThanOrEqualTo(String value) {
            addCriterion("ct_name <=", value, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameLike(String value) {
            addCriterion("ct_name like", value, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameNotLike(String value) {
            addCriterion("ct_name not like", value, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameIn(List<String> values) {
            addCriterion("ct_name in", values, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameNotIn(List<String> values) {
            addCriterion("ct_name not in", values, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameBetween(String value1, String value2) {
            addCriterion("ct_name between", value1, value2, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtNameNotBetween(String value1, String value2) {
            addCriterion("ct_name not between", value1, value2, "ctName");
            return (Criteria) this;
        }

        public Criteria andCtUnitIsNull() {
            addCriterion("ct_unit is null");
            return (Criteria) this;
        }

        public Criteria andCtUnitIsNotNull() {
            addCriterion("ct_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCtUnitEqualTo(String value) {
            addCriterion("ct_unit =", value, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitNotEqualTo(String value) {
            addCriterion("ct_unit <>", value, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitGreaterThan(String value) {
            addCriterion("ct_unit >", value, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ct_unit >=", value, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitLessThan(String value) {
            addCriterion("ct_unit <", value, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitLessThanOrEqualTo(String value) {
            addCriterion("ct_unit <=", value, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitLike(String value) {
            addCriterion("ct_unit like", value, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitNotLike(String value) {
            addCriterion("ct_unit not like", value, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitIn(List<String> values) {
            addCriterion("ct_unit in", values, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitNotIn(List<String> values) {
            addCriterion("ct_unit not in", values, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitBetween(String value1, String value2) {
            addCriterion("ct_unit between", value1, value2, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtUnitNotBetween(String value1, String value2) {
            addCriterion("ct_unit not between", value1, value2, "ctUnit");
            return (Criteria) this;
        }

        public Criteria andCtQtyIsNull() {
            addCriterion("ct_qty is null");
            return (Criteria) this;
        }

        public Criteria andCtQtyIsNotNull() {
            addCriterion("ct_qty is not null");
            return (Criteria) this;
        }

        public Criteria andCtQtyEqualTo(Double value) {
            addCriterion("ct_qty =", value, "ctQty");
            return (Criteria) this;
        }

        public Criteria andCtQtyNotEqualTo(Double value) {
            addCriterion("ct_qty <>", value, "ctQty");
            return (Criteria) this;
        }

        public Criteria andCtQtyGreaterThan(Double value) {
            addCriterion("ct_qty >", value, "ctQty");
            return (Criteria) this;
        }

        public Criteria andCtQtyGreaterThanOrEqualTo(Double value) {
            addCriterion("ct_qty >=", value, "ctQty");
            return (Criteria) this;
        }

        public Criteria andCtQtyLessThan(Double value) {
            addCriterion("ct_qty <", value, "ctQty");
            return (Criteria) this;
        }

        public Criteria andCtQtyLessThanOrEqualTo(Double value) {
            addCriterion("ct_qty <=", value, "ctQty");
            return (Criteria) this;
        }

        public Criteria andCtQtyIn(List<Double> values) {
            addCriterion("ct_qty in", values, "ctQty");
            return (Criteria) this;
        }

        public Criteria andCtQtyNotIn(List<Double> values) {
            addCriterion("ct_qty not in", values, "ctQty");
            return (Criteria) this;
        }

        public Criteria andCtQtyBetween(Double value1, Double value2) {
            addCriterion("ct_qty between", value1, value2, "ctQty");
            return (Criteria) this;
        }

        public Criteria andCtQtyNotBetween(Double value1, Double value2) {
            addCriterion("ct_qty not between", value1, value2, "ctQty");
            return (Criteria) this;
        }

        public Criteria andCtPriceIsNull() {
            addCriterion("ct_price is null");
            return (Criteria) this;
        }

        public Criteria andCtPriceIsNotNull() {
            addCriterion("ct_price is not null");
            return (Criteria) this;
        }

        public Criteria andCtPriceEqualTo(Double value) {
            addCriterion("ct_price =", value, "ctPrice");
            return (Criteria) this;
        }

        public Criteria andCtPriceNotEqualTo(Double value) {
            addCriterion("ct_price <>", value, "ctPrice");
            return (Criteria) this;
        }

        public Criteria andCtPriceGreaterThan(Double value) {
            addCriterion("ct_price >", value, "ctPrice");
            return (Criteria) this;
        }

        public Criteria andCtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ct_price >=", value, "ctPrice");
            return (Criteria) this;
        }

        public Criteria andCtPriceLessThan(Double value) {
            addCriterion("ct_price <", value, "ctPrice");
            return (Criteria) this;
        }

        public Criteria andCtPriceLessThanOrEqualTo(Double value) {
            addCriterion("ct_price <=", value, "ctPrice");
            return (Criteria) this;
        }

        public Criteria andCtPriceIn(List<Double> values) {
            addCriterion("ct_price in", values, "ctPrice");
            return (Criteria) this;
        }

        public Criteria andCtPriceNotIn(List<Double> values) {
            addCriterion("ct_price not in", values, "ctPrice");
            return (Criteria) this;
        }

        public Criteria andCtPriceBetween(Double value1, Double value2) {
            addCriterion("ct_price between", value1, value2, "ctPrice");
            return (Criteria) this;
        }

        public Criteria andCtPriceNotBetween(Double value1, Double value2) {
            addCriterion("ct_price not between", value1, value2, "ctPrice");
            return (Criteria) this;
        }

        public Criteria andCtMoneyIsNull() {
            addCriterion("ct_money is null");
            return (Criteria) this;
        }

        public Criteria andCtMoneyIsNotNull() {
            addCriterion("ct_money is not null");
            return (Criteria) this;
        }

        public Criteria andCtMoneyEqualTo(Double value) {
            addCriterion("ct_money =", value, "ctMoney");
            return (Criteria) this;
        }

        public Criteria andCtMoneyNotEqualTo(Double value) {
            addCriterion("ct_money <>", value, "ctMoney");
            return (Criteria) this;
        }

        public Criteria andCtMoneyGreaterThan(Double value) {
            addCriterion("ct_money >", value, "ctMoney");
            return (Criteria) this;
        }

        public Criteria andCtMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ct_money >=", value, "ctMoney");
            return (Criteria) this;
        }

        public Criteria andCtMoneyLessThan(Double value) {
            addCriterion("ct_money <", value, "ctMoney");
            return (Criteria) this;
        }

        public Criteria andCtMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ct_money <=", value, "ctMoney");
            return (Criteria) this;
        }

        public Criteria andCtMoneyIn(List<Double> values) {
            addCriterion("ct_money in", values, "ctMoney");
            return (Criteria) this;
        }

        public Criteria andCtMoneyNotIn(List<Double> values) {
            addCriterion("ct_money not in", values, "ctMoney");
            return (Criteria) this;
        }

        public Criteria andCtMoneyBetween(Double value1, Double value2) {
            addCriterion("ct_money between", value1, value2, "ctMoney");
            return (Criteria) this;
        }

        public Criteria andCtMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ct_money not between", value1, value2, "ctMoney");
            return (Criteria) this;
        }

        public Criteria andCtCheckIsNull() {
            addCriterion("ct_check is null");
            return (Criteria) this;
        }

        public Criteria andCtCheckIsNotNull() {
            addCriterion("ct_check is not null");
            return (Criteria) this;
        }

        public Criteria andCtCheckEqualTo(Byte value) {
            addCriterion("ct_check =", value, "ctCheck");
            return (Criteria) this;
        }

        public Criteria andCtCheckNotEqualTo(Byte value) {
            addCriterion("ct_check <>", value, "ctCheck");
            return (Criteria) this;
        }

        public Criteria andCtCheckGreaterThan(Byte value) {
            addCriterion("ct_check >", value, "ctCheck");
            return (Criteria) this;
        }

        public Criteria andCtCheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("ct_check >=", value, "ctCheck");
            return (Criteria) this;
        }

        public Criteria andCtCheckLessThan(Byte value) {
            addCriterion("ct_check <", value, "ctCheck");
            return (Criteria) this;
        }

        public Criteria andCtCheckLessThanOrEqualTo(Byte value) {
            addCriterion("ct_check <=", value, "ctCheck");
            return (Criteria) this;
        }

        public Criteria andCtCheckIn(List<Byte> values) {
            addCriterion("ct_check in", values, "ctCheck");
            return (Criteria) this;
        }

        public Criteria andCtCheckNotIn(List<Byte> values) {
            addCriterion("ct_check not in", values, "ctCheck");
            return (Criteria) this;
        }

        public Criteria andCtCheckBetween(Byte value1, Byte value2) {
            addCriterion("ct_check between", value1, value2, "ctCheck");
            return (Criteria) this;
        }

        public Criteria andCtCheckNotBetween(Byte value1, Byte value2) {
            addCriterion("ct_check not between", value1, value2, "ctCheck");
            return (Criteria) this;
        }

        public Criteria andCtFoldIsNull() {
            addCriterion("ct_fold is null");
            return (Criteria) this;
        }

        public Criteria andCtFoldIsNotNull() {
            addCriterion("ct_fold is not null");
            return (Criteria) this;
        }

        public Criteria andCtFoldEqualTo(Boolean value) {
            addCriterion("ct_fold =", value, "ctFold");
            return (Criteria) this;
        }

        public Criteria andCtFoldNotEqualTo(Boolean value) {
            addCriterion("ct_fold <>", value, "ctFold");
            return (Criteria) this;
        }

        public Criteria andCtFoldGreaterThan(Boolean value) {
            addCriterion("ct_fold >", value, "ctFold");
            return (Criteria) this;
        }

        public Criteria andCtFoldGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ct_fold >=", value, "ctFold");
            return (Criteria) this;
        }

        public Criteria andCtFoldLessThan(Boolean value) {
            addCriterion("ct_fold <", value, "ctFold");
            return (Criteria) this;
        }

        public Criteria andCtFoldLessThanOrEqualTo(Boolean value) {
            addCriterion("ct_fold <=", value, "ctFold");
            return (Criteria) this;
        }

        public Criteria andCtFoldIn(List<Boolean> values) {
            addCriterion("ct_fold in", values, "ctFold");
            return (Criteria) this;
        }

        public Criteria andCtFoldNotIn(List<Boolean> values) {
            addCriterion("ct_fold not in", values, "ctFold");
            return (Criteria) this;
        }

        public Criteria andCtFoldBetween(Boolean value1, Boolean value2) {
            addCriterion("ct_fold between", value1, value2, "ctFold");
            return (Criteria) this;
        }

        public Criteria andCtFoldNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ct_fold not between", value1, value2, "ctFold");
            return (Criteria) this;
        }

        public Criteria andCtInfoIsNull() {
            addCriterion("ct_info is null");
            return (Criteria) this;
        }

        public Criteria andCtInfoIsNotNull() {
            addCriterion("ct_info is not null");
            return (Criteria) this;
        }

        public Criteria andCtInfoEqualTo(String value) {
            addCriterion("ct_info =", value, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoNotEqualTo(String value) {
            addCriterion("ct_info <>", value, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoGreaterThan(String value) {
            addCriterion("ct_info >", value, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ct_info >=", value, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoLessThan(String value) {
            addCriterion("ct_info <", value, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoLessThanOrEqualTo(String value) {
            addCriterion("ct_info <=", value, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoLike(String value) {
            addCriterion("ct_info like", value, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoNotLike(String value) {
            addCriterion("ct_info not like", value, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoIn(List<String> values) {
            addCriterion("ct_info in", values, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoNotIn(List<String> values) {
            addCriterion("ct_info not in", values, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoBetween(String value1, String value2) {
            addCriterion("ct_info between", value1, value2, "ctInfo");
            return (Criteria) this;
        }

        public Criteria andCtInfoNotBetween(String value1, String value2) {
            addCriterion("ct_info not between", value1, value2, "ctInfo");
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