package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class DocupcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocupcExample() {
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

        public Criteria andDocupcidIsNull() {
            addCriterion("docuPCid is null");
            return (Criteria) this;
        }

        public Criteria andDocupcidIsNotNull() {
            addCriterion("docuPCid is not null");
            return (Criteria) this;
        }

        public Criteria andDocupcidEqualTo(Integer value) {
            addCriterion("docuPCid =", value, "docupcid");
            return (Criteria) this;
        }

        public Criteria andDocupcidNotEqualTo(Integer value) {
            addCriterion("docuPCid <>", value, "docupcid");
            return (Criteria) this;
        }

        public Criteria andDocupcidGreaterThan(Integer value) {
            addCriterion("docuPCid >", value, "docupcid");
            return (Criteria) this;
        }

        public Criteria andDocupcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docuPCid >=", value, "docupcid");
            return (Criteria) this;
        }

        public Criteria andDocupcidLessThan(Integer value) {
            addCriterion("docuPCid <", value, "docupcid");
            return (Criteria) this;
        }

        public Criteria andDocupcidLessThanOrEqualTo(Integer value) {
            addCriterion("docuPCid <=", value, "docupcid");
            return (Criteria) this;
        }

        public Criteria andDocupcidIn(List<Integer> values) {
            addCriterion("docuPCid in", values, "docupcid");
            return (Criteria) this;
        }

        public Criteria andDocupcidNotIn(List<Integer> values) {
            addCriterion("docuPCid not in", values, "docupcid");
            return (Criteria) this;
        }

        public Criteria andDocupcidBetween(Integer value1, Integer value2) {
            addCriterion("docuPCid between", value1, value2, "docupcid");
            return (Criteria) this;
        }

        public Criteria andDocupcidNotBetween(Integer value1, Integer value2) {
            addCriterion("docuPCid not between", value1, value2, "docupcid");
            return (Criteria) this;
        }

        public Criteria andDocupcnameIsNull() {
            addCriterion("docuPCname is null");
            return (Criteria) this;
        }

        public Criteria andDocupcnameIsNotNull() {
            addCriterion("docuPCname is not null");
            return (Criteria) this;
        }

        public Criteria andDocupcnameEqualTo(String value) {
            addCriterion("docuPCname =", value, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameNotEqualTo(String value) {
            addCriterion("docuPCname <>", value, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameGreaterThan(String value) {
            addCriterion("docuPCname >", value, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameGreaterThanOrEqualTo(String value) {
            addCriterion("docuPCname >=", value, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameLessThan(String value) {
            addCriterion("docuPCname <", value, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameLessThanOrEqualTo(String value) {
            addCriterion("docuPCname <=", value, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameLike(String value) {
            addCriterion("docuPCname like", value, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameNotLike(String value) {
            addCriterion("docuPCname not like", value, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameIn(List<String> values) {
            addCriterion("docuPCname in", values, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameNotIn(List<String> values) {
            addCriterion("docuPCname not in", values, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameBetween(String value1, String value2) {
            addCriterion("docuPCname between", value1, value2, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcnameNotBetween(String value1, String value2) {
            addCriterion("docuPCname not between", value1, value2, "docupcname");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressIsNull() {
            addCriterion("docuPCaddress is null");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressIsNotNull() {
            addCriterion("docuPCaddress is not null");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressEqualTo(String value) {
            addCriterion("docuPCaddress =", value, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressNotEqualTo(String value) {
            addCriterion("docuPCaddress <>", value, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressGreaterThan(String value) {
            addCriterion("docuPCaddress >", value, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressGreaterThanOrEqualTo(String value) {
            addCriterion("docuPCaddress >=", value, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressLessThan(String value) {
            addCriterion("docuPCaddress <", value, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressLessThanOrEqualTo(String value) {
            addCriterion("docuPCaddress <=", value, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressLike(String value) {
            addCriterion("docuPCaddress like", value, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressNotLike(String value) {
            addCriterion("docuPCaddress not like", value, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressIn(List<String> values) {
            addCriterion("docuPCaddress in", values, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressNotIn(List<String> values) {
            addCriterion("docuPCaddress not in", values, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressBetween(String value1, String value2) {
            addCriterion("docuPCaddress between", value1, value2, "docupcaddress");
            return (Criteria) this;
        }

        public Criteria andDocupcaddressNotBetween(String value1, String value2) {
            addCriterion("docuPCaddress not between", value1, value2, "docupcaddress");
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