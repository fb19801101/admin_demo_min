package com.model;

import java.util.ArrayList;
import java.util.List;

public class EstimationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public EstimationExample() {
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

        public Criteria andEnIdIsNull() {
            addCriterion("en_id is null");
            return (Criteria) this;
        }

        public Criteria andEnIdIsNotNull() {
            addCriterion("en_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnIdEqualTo(Integer value) {
            addCriterion("en_id =", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotEqualTo(Integer value) {
            addCriterion("en_id <>", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdGreaterThan(Integer value) {
            addCriterion("en_id >", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("en_id >=", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLessThan(Integer value) {
            addCriterion("en_id <", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLessThanOrEqualTo(Integer value) {
            addCriterion("en_id <=", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdIn(List<Integer> values) {
            addCriterion("en_id in", values, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotIn(List<Integer> values) {
            addCriterion("en_id not in", values, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdBetween(Integer value1, Integer value2) {
            addCriterion("en_id between", value1, value2, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("en_id not between", value1, value2, "enId");
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

        public Criteria andEnCodeIsNull() {
            addCriterion("en_code is null");
            return (Criteria) this;
        }

        public Criteria andEnCodeIsNotNull() {
            addCriterion("en_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnCodeEqualTo(String value) {
            addCriterion("en_code =", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotEqualTo(String value) {
            addCriterion("en_code <>", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeGreaterThan(String value) {
            addCriterion("en_code >", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("en_code >=", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeLessThan(String value) {
            addCriterion("en_code <", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeLessThanOrEqualTo(String value) {
            addCriterion("en_code <=", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeLike(String value) {
            addCriterion("en_code like", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotLike(String value) {
            addCriterion("en_code not like", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeIn(List<String> values) {
            addCriterion("en_code in", values, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotIn(List<String> values) {
            addCriterion("en_code not in", values, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeBetween(String value1, String value2) {
            addCriterion("en_code between", value1, value2, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotBetween(String value1, String value2) {
            addCriterion("en_code not between", value1, value2, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("en_name is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("en_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("en_name =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("en_name <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("en_name >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("en_name >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("en_name <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("en_name <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("en_name like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("en_name not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("en_name in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("en_name not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("en_name between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("en_name not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnUnitIsNull() {
            addCriterion("en_unit is null");
            return (Criteria) this;
        }

        public Criteria andEnUnitIsNotNull() {
            addCriterion("en_unit is not null");
            return (Criteria) this;
        }

        public Criteria andEnUnitEqualTo(String value) {
            addCriterion("en_unit =", value, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitNotEqualTo(String value) {
            addCriterion("en_unit <>", value, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitGreaterThan(String value) {
            addCriterion("en_unit >", value, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitGreaterThanOrEqualTo(String value) {
            addCriterion("en_unit >=", value, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitLessThan(String value) {
            addCriterion("en_unit <", value, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitLessThanOrEqualTo(String value) {
            addCriterion("en_unit <=", value, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitLike(String value) {
            addCriterion("en_unit like", value, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitNotLike(String value) {
            addCriterion("en_unit not like", value, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitIn(List<String> values) {
            addCriterion("en_unit in", values, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitNotIn(List<String> values) {
            addCriterion("en_unit not in", values, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitBetween(String value1, String value2) {
            addCriterion("en_unit between", value1, value2, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnUnitNotBetween(String value1, String value2) {
            addCriterion("en_unit not between", value1, value2, "enUnit");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourIsNull() {
            addCriterion("en_qty_labour is null");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourIsNotNull() {
            addCriterion("en_qty_labour is not null");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourEqualTo(Double value) {
            addCriterion("en_qty_labour =", value, "enQtyLabour");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourNotEqualTo(Double value) {
            addCriterion("en_qty_labour <>", value, "enQtyLabour");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourGreaterThan(Double value) {
            addCriterion("en_qty_labour >", value, "enQtyLabour");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourGreaterThanOrEqualTo(Double value) {
            addCriterion("en_qty_labour >=", value, "enQtyLabour");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourLessThan(Double value) {
            addCriterion("en_qty_labour <", value, "enQtyLabour");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourLessThanOrEqualTo(Double value) {
            addCriterion("en_qty_labour <=", value, "enQtyLabour");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourIn(List<Double> values) {
            addCriterion("en_qty_labour in", values, "enQtyLabour");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourNotIn(List<Double> values) {
            addCriterion("en_qty_labour not in", values, "enQtyLabour");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourBetween(Double value1, Double value2) {
            addCriterion("en_qty_labour between", value1, value2, "enQtyLabour");
            return (Criteria) this;
        }

        public Criteria andEnQtyLabourNotBetween(Double value1, Double value2) {
            addCriterion("en_qty_labour not between", value1, value2, "enQtyLabour");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourIsNull() {
            addCriterion("en_price_labour is null");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourIsNotNull() {
            addCriterion("en_price_labour is not null");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourEqualTo(Double value) {
            addCriterion("en_price_labour =", value, "enPriceLabour");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourNotEqualTo(Double value) {
            addCriterion("en_price_labour <>", value, "enPriceLabour");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourGreaterThan(Double value) {
            addCriterion("en_price_labour >", value, "enPriceLabour");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourGreaterThanOrEqualTo(Double value) {
            addCriterion("en_price_labour >=", value, "enPriceLabour");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourLessThan(Double value) {
            addCriterion("en_price_labour <", value, "enPriceLabour");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourLessThanOrEqualTo(Double value) {
            addCriterion("en_price_labour <=", value, "enPriceLabour");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourIn(List<Double> values) {
            addCriterion("en_price_labour in", values, "enPriceLabour");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourNotIn(List<Double> values) {
            addCriterion("en_price_labour not in", values, "enPriceLabour");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourBetween(Double value1, Double value2) {
            addCriterion("en_price_labour between", value1, value2, "enPriceLabour");
            return (Criteria) this;
        }

        public Criteria andEnPriceLabourNotBetween(Double value1, Double value2) {
            addCriterion("en_price_labour not between", value1, value2, "enPriceLabour");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourIsNull() {
            addCriterion("en_money_labour is null");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourIsNotNull() {
            addCriterion("en_money_labour is not null");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourEqualTo(Double value) {
            addCriterion("en_money_labour =", value, "enMoneyLabour");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourNotEqualTo(Double value) {
            addCriterion("en_money_labour <>", value, "enMoneyLabour");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourGreaterThan(Double value) {
            addCriterion("en_money_labour >", value, "enMoneyLabour");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourGreaterThanOrEqualTo(Double value) {
            addCriterion("en_money_labour >=", value, "enMoneyLabour");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourLessThan(Double value) {
            addCriterion("en_money_labour <", value, "enMoneyLabour");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourLessThanOrEqualTo(Double value) {
            addCriterion("en_money_labour <=", value, "enMoneyLabour");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourIn(List<Double> values) {
            addCriterion("en_money_labour in", values, "enMoneyLabour");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourNotIn(List<Double> values) {
            addCriterion("en_money_labour not in", values, "enMoneyLabour");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourBetween(Double value1, Double value2) {
            addCriterion("en_money_labour between", value1, value2, "enMoneyLabour");
            return (Criteria) this;
        }

        public Criteria andEnMoneyLabourNotBetween(Double value1, Double value2) {
            addCriterion("en_money_labour not between", value1, value2, "enMoneyLabour");
            return (Criteria) this;
        }

        public Criteria andEnFactorIsNull() {
            addCriterion("en_factor is null");
            return (Criteria) this;
        }

        public Criteria andEnFactorIsNotNull() {
            addCriterion("en_factor is not null");
            return (Criteria) this;
        }

        public Criteria andEnFactorEqualTo(Double value) {
            addCriterion("en_factor =", value, "enFactor");
            return (Criteria) this;
        }

        public Criteria andEnFactorNotEqualTo(Double value) {
            addCriterion("en_factor <>", value, "enFactor");
            return (Criteria) this;
        }

        public Criteria andEnFactorGreaterThan(Double value) {
            addCriterion("en_factor >", value, "enFactor");
            return (Criteria) this;
        }

        public Criteria andEnFactorGreaterThanOrEqualTo(Double value) {
            addCriterion("en_factor >=", value, "enFactor");
            return (Criteria) this;
        }

        public Criteria andEnFactorLessThan(Double value) {
            addCriterion("en_factor <", value, "enFactor");
            return (Criteria) this;
        }

        public Criteria andEnFactorLessThanOrEqualTo(Double value) {
            addCriterion("en_factor <=", value, "enFactor");
            return (Criteria) this;
        }

        public Criteria andEnFactorIn(List<Double> values) {
            addCriterion("en_factor in", values, "enFactor");
            return (Criteria) this;
        }

        public Criteria andEnFactorNotIn(List<Double> values) {
            addCriterion("en_factor not in", values, "enFactor");
            return (Criteria) this;
        }

        public Criteria andEnFactorBetween(Double value1, Double value2) {
            addCriterion("en_factor between", value1, value2, "enFactor");
            return (Criteria) this;
        }

        public Criteria andEnFactorNotBetween(Double value1, Double value2) {
            addCriterion("en_factor not between", value1, value2, "enFactor");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialIsNull() {
            addCriterion("en_qty_material is null");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialIsNotNull() {
            addCriterion("en_qty_material is not null");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialEqualTo(Double value) {
            addCriterion("en_qty_material =", value, "enQtyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialNotEqualTo(Double value) {
            addCriterion("en_qty_material <>", value, "enQtyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialGreaterThan(Double value) {
            addCriterion("en_qty_material >", value, "enQtyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialGreaterThanOrEqualTo(Double value) {
            addCriterion("en_qty_material >=", value, "enQtyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialLessThan(Double value) {
            addCriterion("en_qty_material <", value, "enQtyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialLessThanOrEqualTo(Double value) {
            addCriterion("en_qty_material <=", value, "enQtyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialIn(List<Double> values) {
            addCriterion("en_qty_material in", values, "enQtyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialNotIn(List<Double> values) {
            addCriterion("en_qty_material not in", values, "enQtyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialBetween(Double value1, Double value2) {
            addCriterion("en_qty_material between", value1, value2, "enQtyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnQtyMaterialNotBetween(Double value1, Double value2) {
            addCriterion("en_qty_material not between", value1, value2, "enQtyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialIsNull() {
            addCriterion("en_price_material is null");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialIsNotNull() {
            addCriterion("en_price_material is not null");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialEqualTo(Double value) {
            addCriterion("en_price_material =", value, "enPriceMaterial");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialNotEqualTo(Double value) {
            addCriterion("en_price_material <>", value, "enPriceMaterial");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialGreaterThan(Double value) {
            addCriterion("en_price_material >", value, "enPriceMaterial");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialGreaterThanOrEqualTo(Double value) {
            addCriterion("en_price_material >=", value, "enPriceMaterial");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialLessThan(Double value) {
            addCriterion("en_price_material <", value, "enPriceMaterial");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialLessThanOrEqualTo(Double value) {
            addCriterion("en_price_material <=", value, "enPriceMaterial");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialIn(List<Double> values) {
            addCriterion("en_price_material in", values, "enPriceMaterial");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialNotIn(List<Double> values) {
            addCriterion("en_price_material not in", values, "enPriceMaterial");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialBetween(Double value1, Double value2) {
            addCriterion("en_price_material between", value1, value2, "enPriceMaterial");
            return (Criteria) this;
        }

        public Criteria andEnPriceMaterialNotBetween(Double value1, Double value2) {
            addCriterion("en_price_material not between", value1, value2, "enPriceMaterial");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialIsNull() {
            addCriterion("en_money_material is null");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialIsNotNull() {
            addCriterion("en_money_material is not null");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialEqualTo(Double value) {
            addCriterion("en_money_material =", value, "enMoneyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialNotEqualTo(Double value) {
            addCriterion("en_money_material <>", value, "enMoneyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialGreaterThan(Double value) {
            addCriterion("en_money_material >", value, "enMoneyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialGreaterThanOrEqualTo(Double value) {
            addCriterion("en_money_material >=", value, "enMoneyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialLessThan(Double value) {
            addCriterion("en_money_material <", value, "enMoneyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialLessThanOrEqualTo(Double value) {
            addCriterion("en_money_material <=", value, "enMoneyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialIn(List<Double> values) {
            addCriterion("en_money_material in", values, "enMoneyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialNotIn(List<Double> values) {
            addCriterion("en_money_material not in", values, "enMoneyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialBetween(Double value1, Double value2) {
            addCriterion("en_money_material between", value1, value2, "enMoneyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnMoneyMaterialNotBetween(Double value1, Double value2) {
            addCriterion("en_money_material not between", value1, value2, "enMoneyMaterial");
            return (Criteria) this;
        }

        public Criteria andEnInfoIsNull() {
            addCriterion("en_info is null");
            return (Criteria) this;
        }

        public Criteria andEnInfoIsNotNull() {
            addCriterion("en_info is not null");
            return (Criteria) this;
        }

        public Criteria andEnInfoEqualTo(String value) {
            addCriterion("en_info =", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoNotEqualTo(String value) {
            addCriterion("en_info <>", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoGreaterThan(String value) {
            addCriterion("en_info >", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoGreaterThanOrEqualTo(String value) {
            addCriterion("en_info >=", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoLessThan(String value) {
            addCriterion("en_info <", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoLessThanOrEqualTo(String value) {
            addCriterion("en_info <=", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoLike(String value) {
            addCriterion("en_info like", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoNotLike(String value) {
            addCriterion("en_info not like", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoIn(List<String> values) {
            addCriterion("en_info in", values, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoNotIn(List<String> values) {
            addCriterion("en_info not in", values, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoBetween(String value1, String value2) {
            addCriterion("en_info between", value1, value2, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoNotBetween(String value1, String value2) {
            addCriterion("en_info not between", value1, value2, "enInfo");
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