package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class InenpcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InenpcExample() {
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

        public Criteria andInenpcidIsNull() {
            addCriterion("inenPCid is null");
            return (Criteria) this;
        }

        public Criteria andInenpcidIsNotNull() {
            addCriterion("inenPCid is not null");
            return (Criteria) this;
        }

        public Criteria andInenpcidEqualTo(Integer value) {
            addCriterion("inenPCid =", value, "inenpcid");
            return (Criteria) this;
        }

        public Criteria andInenpcidNotEqualTo(Integer value) {
            addCriterion("inenPCid <>", value, "inenpcid");
            return (Criteria) this;
        }

        public Criteria andInenpcidGreaterThan(Integer value) {
            addCriterion("inenPCid >", value, "inenpcid");
            return (Criteria) this;
        }

        public Criteria andInenpcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inenPCid >=", value, "inenpcid");
            return (Criteria) this;
        }

        public Criteria andInenpcidLessThan(Integer value) {
            addCriterion("inenPCid <", value, "inenpcid");
            return (Criteria) this;
        }

        public Criteria andInenpcidLessThanOrEqualTo(Integer value) {
            addCriterion("inenPCid <=", value, "inenpcid");
            return (Criteria) this;
        }

        public Criteria andInenpcidIn(List<Integer> values) {
            addCriterion("inenPCid in", values, "inenpcid");
            return (Criteria) this;
        }

        public Criteria andInenpcidNotIn(List<Integer> values) {
            addCriterion("inenPCid not in", values, "inenpcid");
            return (Criteria) this;
        }

        public Criteria andInenpcidBetween(Integer value1, Integer value2) {
            addCriterion("inenPCid between", value1, value2, "inenpcid");
            return (Criteria) this;
        }

        public Criteria andInenpcidNotBetween(Integer value1, Integer value2) {
            addCriterion("inenPCid not between", value1, value2, "inenpcid");
            return (Criteria) this;
        }

        public Criteria andInenpcnameIsNull() {
            addCriterion("inenPCname is null");
            return (Criteria) this;
        }

        public Criteria andInenpcnameIsNotNull() {
            addCriterion("inenPCname is not null");
            return (Criteria) this;
        }

        public Criteria andInenpcnameEqualTo(String value) {
            addCriterion("inenPCname =", value, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameNotEqualTo(String value) {
            addCriterion("inenPCname <>", value, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameGreaterThan(String value) {
            addCriterion("inenPCname >", value, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameGreaterThanOrEqualTo(String value) {
            addCriterion("inenPCname >=", value, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameLessThan(String value) {
            addCriterion("inenPCname <", value, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameLessThanOrEqualTo(String value) {
            addCriterion("inenPCname <=", value, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameLike(String value) {
            addCriterion("inenPCname like", value, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameNotLike(String value) {
            addCriterion("inenPCname not like", value, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameIn(List<String> values) {
            addCriterion("inenPCname in", values, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameNotIn(List<String> values) {
            addCriterion("inenPCname not in", values, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameBetween(String value1, String value2) {
            addCriterion("inenPCname between", value1, value2, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcnameNotBetween(String value1, String value2) {
            addCriterion("inenPCname not between", value1, value2, "inenpcname");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressIsNull() {
            addCriterion("inenPCaddress is null");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressIsNotNull() {
            addCriterion("inenPCaddress is not null");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressEqualTo(String value) {
            addCriterion("inenPCaddress =", value, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressNotEqualTo(String value) {
            addCriterion("inenPCaddress <>", value, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressGreaterThan(String value) {
            addCriterion("inenPCaddress >", value, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressGreaterThanOrEqualTo(String value) {
            addCriterion("inenPCaddress >=", value, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressLessThan(String value) {
            addCriterion("inenPCaddress <", value, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressLessThanOrEqualTo(String value) {
            addCriterion("inenPCaddress <=", value, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressLike(String value) {
            addCriterion("inenPCaddress like", value, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressNotLike(String value) {
            addCriterion("inenPCaddress not like", value, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressIn(List<String> values) {
            addCriterion("inenPCaddress in", values, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressNotIn(List<String> values) {
            addCriterion("inenPCaddress not in", values, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressBetween(String value1, String value2) {
            addCriterion("inenPCaddress between", value1, value2, "inenpcaddress");
            return (Criteria) this;
        }

        public Criteria andInenpcaddressNotBetween(String value1, String value2) {
            addCriterion("inenPCaddress not between", value1, value2, "inenpcaddress");
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