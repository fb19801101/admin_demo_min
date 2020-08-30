package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NetPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public NetPlanExample() {
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

        public Criteria andNpIdIsNull() {
            addCriterion("np_id is null");
            return (Criteria) this;
        }

        public Criteria andNpIdIsNotNull() {
            addCriterion("np_id is not null");
            return (Criteria) this;
        }

        public Criteria andNpIdEqualTo(Integer value) {
            addCriterion("np_id =", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdNotEqualTo(Integer value) {
            addCriterion("np_id <>", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdGreaterThan(Integer value) {
            addCriterion("np_id >", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("np_id >=", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdLessThan(Integer value) {
            addCriterion("np_id <", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdLessThanOrEqualTo(Integer value) {
            addCriterion("np_id <=", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdIn(List<Integer> values) {
            addCriterion("np_id in", values, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdNotIn(List<Integer> values) {
            addCriterion("np_id not in", values, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdBetween(Integer value1, Integer value2) {
            addCriterion("np_id between", value1, value2, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("np_id not between", value1, value2, "npId");
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

        public Criteria andCyIdIsNull() {
            addCriterion("cy_id is null");
            return (Criteria) this;
        }

        public Criteria andCyIdIsNotNull() {
            addCriterion("cy_id is not null");
            return (Criteria) this;
        }

        public Criteria andCyIdEqualTo(Integer value) {
            addCriterion("cy_id =", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdNotEqualTo(Integer value) {
            addCriterion("cy_id <>", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdGreaterThan(Integer value) {
            addCriterion("cy_id >", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cy_id >=", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdLessThan(Integer value) {
            addCriterion("cy_id <", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdLessThanOrEqualTo(Integer value) {
            addCriterion("cy_id <=", value, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdIn(List<Integer> values) {
            addCriterion("cy_id in", values, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdNotIn(List<Integer> values) {
            addCriterion("cy_id not in", values, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdBetween(Integer value1, Integer value2) {
            addCriterion("cy_id between", value1, value2, "cyId");
            return (Criteria) this;
        }

        public Criteria andCyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cy_id not between", value1, value2, "cyId");
            return (Criteria) this;
        }

        public Criteria andPiNameIsNull() {
            addCriterion("pi_Name is null");
            return (Criteria) this;
        }

        public Criteria andPiNameIsNotNull() {
            addCriterion("pi_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPiNameEqualTo(String value) {
            addCriterion("pi_Name =", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotEqualTo(String value) {
            addCriterion("pi_Name <>", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameGreaterThan(String value) {
            addCriterion("pi_Name >", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameGreaterThanOrEqualTo(String value) {
            addCriterion("pi_Name >=", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameLessThan(String value) {
            addCriterion("pi_Name <", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameLessThanOrEqualTo(String value) {
            addCriterion("pi_Name <=", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameLike(String value) {
            addCriterion("pi_Name like", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotLike(String value) {
            addCriterion("pi_Name not like", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameIn(List<String> values) {
            addCriterion("pi_Name in", values, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotIn(List<String> values) {
            addCriterion("pi_Name not in", values, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameBetween(String value1, String value2) {
            addCriterion("pi_Name between", value1, value2, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotBetween(String value1, String value2) {
            addCriterion("pi_Name not between", value1, value2, "piName");
            return (Criteria) this;
        }

        public Criteria andCyNameIsNull() {
            addCriterion("cy_name is null");
            return (Criteria) this;
        }

        public Criteria andCyNameIsNotNull() {
            addCriterion("cy_name is not null");
            return (Criteria) this;
        }

        public Criteria andCyNameEqualTo(String value) {
            addCriterion("cy_name =", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameNotEqualTo(String value) {
            addCriterion("cy_name <>", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameGreaterThan(String value) {
            addCriterion("cy_name >", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameGreaterThanOrEqualTo(String value) {
            addCriterion("cy_name >=", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameLessThan(String value) {
            addCriterion("cy_name <", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameLessThanOrEqualTo(String value) {
            addCriterion("cy_name <=", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameLike(String value) {
            addCriterion("cy_name like", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameNotLike(String value) {
            addCriterion("cy_name not like", value, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameIn(List<String> values) {
            addCriterion("cy_name in", values, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameNotIn(List<String> values) {
            addCriterion("cy_name not in", values, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameBetween(String value1, String value2) {
            addCriterion("cy_name between", value1, value2, "cyName");
            return (Criteria) this;
        }

        public Criteria andCyNameNotBetween(String value1, String value2) {
            addCriterion("cy_name not between", value1, value2, "cyName");
            return (Criteria) this;
        }

        public Criteria andNpWorkIsNull() {
            addCriterion("np_work is null");
            return (Criteria) this;
        }

        public Criteria andNpWorkIsNotNull() {
            addCriterion("np_work is not null");
            return (Criteria) this;
        }

        public Criteria andNpWorkEqualTo(String value) {
            addCriterion("np_work =", value, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkNotEqualTo(String value) {
            addCriterion("np_work <>", value, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkGreaterThan(String value) {
            addCriterion("np_work >", value, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkGreaterThanOrEqualTo(String value) {
            addCriterion("np_work >=", value, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkLessThan(String value) {
            addCriterion("np_work <", value, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkLessThanOrEqualTo(String value) {
            addCriterion("np_work <=", value, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkLike(String value) {
            addCriterion("np_work like", value, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkNotLike(String value) {
            addCriterion("np_work not like", value, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkIn(List<String> values) {
            addCriterion("np_work in", values, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkNotIn(List<String> values) {
            addCriterion("np_work not in", values, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkBetween(String value1, String value2) {
            addCriterion("np_work between", value1, value2, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpWorkNotBetween(String value1, String value2) {
            addCriterion("np_work not between", value1, value2, "npWork");
            return (Criteria) this;
        }

        public Criteria andNpEsIsNull() {
            addCriterion("np_es is null");
            return (Criteria) this;
        }

        public Criteria andNpEsIsNotNull() {
            addCriterion("np_es is not null");
            return (Criteria) this;
        }

        public Criteria andNpEsEqualTo(Date value) {
            addCriterion("np_es =", value, "npEs");
            return (Criteria) this;
        }

        public Criteria andNpEsNotEqualTo(Date value) {
            addCriterion("np_es <>", value, "npEs");
            return (Criteria) this;
        }

        public Criteria andNpEsGreaterThan(Date value) {
            addCriterion("np_es >", value, "npEs");
            return (Criteria) this;
        }

        public Criteria andNpEsGreaterThanOrEqualTo(Date value) {
            addCriterion("np_es >=", value, "npEs");
            return (Criteria) this;
        }

        public Criteria andNpEsLessThan(Date value) {
            addCriterion("np_es <", value, "npEs");
            return (Criteria) this;
        }

        public Criteria andNpEsLessThanOrEqualTo(Date value) {
            addCriterion("np_es <=", value, "npEs");
            return (Criteria) this;
        }

        public Criteria andNpEsIn(List<Date> values) {
            addCriterion("np_es in", values, "npEs");
            return (Criteria) this;
        }

        public Criteria andNpEsNotIn(List<Date> values) {
            addCriterion("np_es not in", values, "npEs");
            return (Criteria) this;
        }

        public Criteria andNpEsBetween(Date value1, Date value2) {
            addCriterion("np_es between", value1, value2, "npEs");
            return (Criteria) this;
        }

        public Criteria andNpEsNotBetween(Date value1, Date value2) {
            addCriterion("np_es not between", value1, value2, "npEs");
            return (Criteria) this;
        }

        public Criteria andNpEfIsNull() {
            addCriterion("np_ef is null");
            return (Criteria) this;
        }

        public Criteria andNpEfIsNotNull() {
            addCriterion("np_ef is not null");
            return (Criteria) this;
        }

        public Criteria andNpEfEqualTo(Date value) {
            addCriterion("np_ef =", value, "npEf");
            return (Criteria) this;
        }

        public Criteria andNpEfNotEqualTo(Date value) {
            addCriterion("np_ef <>", value, "npEf");
            return (Criteria) this;
        }

        public Criteria andNpEfGreaterThan(Date value) {
            addCriterion("np_ef >", value, "npEf");
            return (Criteria) this;
        }

        public Criteria andNpEfGreaterThanOrEqualTo(Date value) {
            addCriterion("np_ef >=", value, "npEf");
            return (Criteria) this;
        }

        public Criteria andNpEfLessThan(Date value) {
            addCriterion("np_ef <", value, "npEf");
            return (Criteria) this;
        }

        public Criteria andNpEfLessThanOrEqualTo(Date value) {
            addCriterion("np_ef <=", value, "npEf");
            return (Criteria) this;
        }

        public Criteria andNpEfIn(List<Date> values) {
            addCriterion("np_ef in", values, "npEf");
            return (Criteria) this;
        }

        public Criteria andNpEfNotIn(List<Date> values) {
            addCriterion("np_ef not in", values, "npEf");
            return (Criteria) this;
        }

        public Criteria andNpEfBetween(Date value1, Date value2) {
            addCriterion("np_ef between", value1, value2, "npEf");
            return (Criteria) this;
        }

        public Criteria andNpEfNotBetween(Date value1, Date value2) {
            addCriterion("np_ef not between", value1, value2, "npEf");
            return (Criteria) this;
        }

        public Criteria andNpLsIsNull() {
            addCriterion("np_ls is null");
            return (Criteria) this;
        }

        public Criteria andNpLsIsNotNull() {
            addCriterion("np_ls is not null");
            return (Criteria) this;
        }

        public Criteria andNpLsEqualTo(Date value) {
            addCriterion("np_ls =", value, "npLs");
            return (Criteria) this;
        }

        public Criteria andNpLsNotEqualTo(Date value) {
            addCriterion("np_ls <>", value, "npLs");
            return (Criteria) this;
        }

        public Criteria andNpLsGreaterThan(Date value) {
            addCriterion("np_ls >", value, "npLs");
            return (Criteria) this;
        }

        public Criteria andNpLsGreaterThanOrEqualTo(Date value) {
            addCriterion("np_ls >=", value, "npLs");
            return (Criteria) this;
        }

        public Criteria andNpLsLessThan(Date value) {
            addCriterion("np_ls <", value, "npLs");
            return (Criteria) this;
        }

        public Criteria andNpLsLessThanOrEqualTo(Date value) {
            addCriterion("np_ls <=", value, "npLs");
            return (Criteria) this;
        }

        public Criteria andNpLsIn(List<Date> values) {
            addCriterion("np_ls in", values, "npLs");
            return (Criteria) this;
        }

        public Criteria andNpLsNotIn(List<Date> values) {
            addCriterion("np_ls not in", values, "npLs");
            return (Criteria) this;
        }

        public Criteria andNpLsBetween(Date value1, Date value2) {
            addCriterion("np_ls between", value1, value2, "npLs");
            return (Criteria) this;
        }

        public Criteria andNpLsNotBetween(Date value1, Date value2) {
            addCriterion("np_ls not between", value1, value2, "npLs");
            return (Criteria) this;
        }

        public Criteria andNpLfIsNull() {
            addCriterion("np_lf is null");
            return (Criteria) this;
        }

        public Criteria andNpLfIsNotNull() {
            addCriterion("np_lf is not null");
            return (Criteria) this;
        }

        public Criteria andNpLfEqualTo(Date value) {
            addCriterion("np_lf =", value, "npLf");
            return (Criteria) this;
        }

        public Criteria andNpLfNotEqualTo(Date value) {
            addCriterion("np_lf <>", value, "npLf");
            return (Criteria) this;
        }

        public Criteria andNpLfGreaterThan(Date value) {
            addCriterion("np_lf >", value, "npLf");
            return (Criteria) this;
        }

        public Criteria andNpLfGreaterThanOrEqualTo(Date value) {
            addCriterion("np_lf >=", value, "npLf");
            return (Criteria) this;
        }

        public Criteria andNpLfLessThan(Date value) {
            addCriterion("np_lf <", value, "npLf");
            return (Criteria) this;
        }

        public Criteria andNpLfLessThanOrEqualTo(Date value) {
            addCriterion("np_lf <=", value, "npLf");
            return (Criteria) this;
        }

        public Criteria andNpLfIn(List<Date> values) {
            addCriterion("np_lf in", values, "npLf");
            return (Criteria) this;
        }

        public Criteria andNpLfNotIn(List<Date> values) {
            addCriterion("np_lf not in", values, "npLf");
            return (Criteria) this;
        }

        public Criteria andNpLfBetween(Date value1, Date value2) {
            addCriterion("np_lf between", value1, value2, "npLf");
            return (Criteria) this;
        }

        public Criteria andNpLfNotBetween(Date value1, Date value2) {
            addCriterion("np_lf not between", value1, value2, "npLf");
            return (Criteria) this;
        }

        public Criteria andNpRsIsNull() {
            addCriterion("np_rs is null");
            return (Criteria) this;
        }

        public Criteria andNpRsIsNotNull() {
            addCriterion("np_rs is not null");
            return (Criteria) this;
        }

        public Criteria andNpRsEqualTo(Date value) {
            addCriterion("np_rs =", value, "npRs");
            return (Criteria) this;
        }

        public Criteria andNpRsNotEqualTo(Date value) {
            addCriterion("np_rs <>", value, "npRs");
            return (Criteria) this;
        }

        public Criteria andNpRsGreaterThan(Date value) {
            addCriterion("np_rs >", value, "npRs");
            return (Criteria) this;
        }

        public Criteria andNpRsGreaterThanOrEqualTo(Date value) {
            addCriterion("np_rs >=", value, "npRs");
            return (Criteria) this;
        }

        public Criteria andNpRsLessThan(Date value) {
            addCriterion("np_rs <", value, "npRs");
            return (Criteria) this;
        }

        public Criteria andNpRsLessThanOrEqualTo(Date value) {
            addCriterion("np_rs <=", value, "npRs");
            return (Criteria) this;
        }

        public Criteria andNpRsIn(List<Date> values) {
            addCriterion("np_rs in", values, "npRs");
            return (Criteria) this;
        }

        public Criteria andNpRsNotIn(List<Date> values) {
            addCriterion("np_rs not in", values, "npRs");
            return (Criteria) this;
        }

        public Criteria andNpRsBetween(Date value1, Date value2) {
            addCriterion("np_rs between", value1, value2, "npRs");
            return (Criteria) this;
        }

        public Criteria andNpRsNotBetween(Date value1, Date value2) {
            addCriterion("np_rs not between", value1, value2, "npRs");
            return (Criteria) this;
        }

        public Criteria andNpRfIsNull() {
            addCriterion("np_rf is null");
            return (Criteria) this;
        }

        public Criteria andNpRfIsNotNull() {
            addCriterion("np_rf is not null");
            return (Criteria) this;
        }

        public Criteria andNpRfEqualTo(Date value) {
            addCriterion("np_rf =", value, "npRf");
            return (Criteria) this;
        }

        public Criteria andNpRfNotEqualTo(Date value) {
            addCriterion("np_rf <>", value, "npRf");
            return (Criteria) this;
        }

        public Criteria andNpRfGreaterThan(Date value) {
            addCriterion("np_rf >", value, "npRf");
            return (Criteria) this;
        }

        public Criteria andNpRfGreaterThanOrEqualTo(Date value) {
            addCriterion("np_rf >=", value, "npRf");
            return (Criteria) this;
        }

        public Criteria andNpRfLessThan(Date value) {
            addCriterion("np_rf <", value, "npRf");
            return (Criteria) this;
        }

        public Criteria andNpRfLessThanOrEqualTo(Date value) {
            addCriterion("np_rf <=", value, "npRf");
            return (Criteria) this;
        }

        public Criteria andNpRfIn(List<Date> values) {
            addCriterion("np_rf in", values, "npRf");
            return (Criteria) this;
        }

        public Criteria andNpRfNotIn(List<Date> values) {
            addCriterion("np_rf not in", values, "npRf");
            return (Criteria) this;
        }

        public Criteria andNpRfBetween(Date value1, Date value2) {
            addCriterion("np_rf between", value1, value2, "npRf");
            return (Criteria) this;
        }

        public Criteria andNpRfNotBetween(Date value1, Date value2) {
            addCriterion("np_rf not between", value1, value2, "npRf");
            return (Criteria) this;
        }

        public Criteria andNpInfoIsNull() {
            addCriterion("np_info is null");
            return (Criteria) this;
        }

        public Criteria andNpInfoIsNotNull() {
            addCriterion("np_info is not null");
            return (Criteria) this;
        }

        public Criteria andNpInfoEqualTo(String value) {
            addCriterion("np_info =", value, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoNotEqualTo(String value) {
            addCriterion("np_info <>", value, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoGreaterThan(String value) {
            addCriterion("np_info >", value, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoGreaterThanOrEqualTo(String value) {
            addCriterion("np_info >=", value, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoLessThan(String value) {
            addCriterion("np_info <", value, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoLessThanOrEqualTo(String value) {
            addCriterion("np_info <=", value, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoLike(String value) {
            addCriterion("np_info like", value, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoNotLike(String value) {
            addCriterion("np_info not like", value, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoIn(List<String> values) {
            addCriterion("np_info in", values, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoNotIn(List<String> values) {
            addCriterion("np_info not in", values, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoBetween(String value1, String value2) {
            addCriterion("np_info between", value1, value2, "npInfo");
            return (Criteria) this;
        }

        public Criteria andNpInfoNotBetween(String value1, String value2) {
            addCriterion("np_info not between", value1, value2, "npInfo");
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