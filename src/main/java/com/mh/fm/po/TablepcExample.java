package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class TablepcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TablepcExample() {
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

        public Criteria andTablepcidIsNull() {
            addCriterion("tablePCid is null");
            return (Criteria) this;
        }

        public Criteria andTablepcidIsNotNull() {
            addCriterion("tablePCid is not null");
            return (Criteria) this;
        }

        public Criteria andTablepcidEqualTo(Integer value) {
            addCriterion("tablePCid =", value, "tablepcid");
            return (Criteria) this;
        }

        public Criteria andTablepcidNotEqualTo(Integer value) {
            addCriterion("tablePCid <>", value, "tablepcid");
            return (Criteria) this;
        }

        public Criteria andTablepcidGreaterThan(Integer value) {
            addCriterion("tablePCid >", value, "tablepcid");
            return (Criteria) this;
        }

        public Criteria andTablepcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tablePCid >=", value, "tablepcid");
            return (Criteria) this;
        }

        public Criteria andTablepcidLessThan(Integer value) {
            addCriterion("tablePCid <", value, "tablepcid");
            return (Criteria) this;
        }

        public Criteria andTablepcidLessThanOrEqualTo(Integer value) {
            addCriterion("tablePCid <=", value, "tablepcid");
            return (Criteria) this;
        }

        public Criteria andTablepcidIn(List<Integer> values) {
            addCriterion("tablePCid in", values, "tablepcid");
            return (Criteria) this;
        }

        public Criteria andTablepcidNotIn(List<Integer> values) {
            addCriterion("tablePCid not in", values, "tablepcid");
            return (Criteria) this;
        }

        public Criteria andTablepcidBetween(Integer value1, Integer value2) {
            addCriterion("tablePCid between", value1, value2, "tablepcid");
            return (Criteria) this;
        }

        public Criteria andTablepcidNotBetween(Integer value1, Integer value2) {
            addCriterion("tablePCid not between", value1, value2, "tablepcid");
            return (Criteria) this;
        }

        public Criteria andTablepcnameIsNull() {
            addCriterion("tablePCname is null");
            return (Criteria) this;
        }

        public Criteria andTablepcnameIsNotNull() {
            addCriterion("tablePCname is not null");
            return (Criteria) this;
        }

        public Criteria andTablepcnameEqualTo(String value) {
            addCriterion("tablePCname =", value, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameNotEqualTo(String value) {
            addCriterion("tablePCname <>", value, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameGreaterThan(String value) {
            addCriterion("tablePCname >", value, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameGreaterThanOrEqualTo(String value) {
            addCriterion("tablePCname >=", value, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameLessThan(String value) {
            addCriterion("tablePCname <", value, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameLessThanOrEqualTo(String value) {
            addCriterion("tablePCname <=", value, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameLike(String value) {
            addCriterion("tablePCname like", value, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameNotLike(String value) {
            addCriterion("tablePCname not like", value, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameIn(List<String> values) {
            addCriterion("tablePCname in", values, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameNotIn(List<String> values) {
            addCriterion("tablePCname not in", values, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameBetween(String value1, String value2) {
            addCriterion("tablePCname between", value1, value2, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcnameNotBetween(String value1, String value2) {
            addCriterion("tablePCname not between", value1, value2, "tablepcname");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressIsNull() {
            addCriterion("tablePCaddress is null");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressIsNotNull() {
            addCriterion("tablePCaddress is not null");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressEqualTo(String value) {
            addCriterion("tablePCaddress =", value, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressNotEqualTo(String value) {
            addCriterion("tablePCaddress <>", value, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressGreaterThan(String value) {
            addCriterion("tablePCaddress >", value, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressGreaterThanOrEqualTo(String value) {
            addCriterion("tablePCaddress >=", value, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressLessThan(String value) {
            addCriterion("tablePCaddress <", value, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressLessThanOrEqualTo(String value) {
            addCriterion("tablePCaddress <=", value, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressLike(String value) {
            addCriterion("tablePCaddress like", value, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressNotLike(String value) {
            addCriterion("tablePCaddress not like", value, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressIn(List<String> values) {
            addCriterion("tablePCaddress in", values, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressNotIn(List<String> values) {
            addCriterion("tablePCaddress not in", values, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressBetween(String value1, String value2) {
            addCriterion("tablePCaddress between", value1, value2, "tablepcaddress");
            return (Criteria) this;
        }

        public Criteria andTablepcaddressNotBetween(String value1, String value2) {
            addCriterion("tablePCaddress not between", value1, value2, "tablepcaddress");
            return (Criteria) this;
        }
    }

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