package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class SourcecodepcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SourcecodepcExample() {
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

        public Criteria andSourcecodepcidIsNull() {
            addCriterion("sourcecodePCid is null");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidIsNotNull() {
            addCriterion("sourcecodePCid is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidEqualTo(Integer value) {
            addCriterion("sourcecodePCid =", value, "sourcecodepcid");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidNotEqualTo(Integer value) {
            addCriterion("sourcecodePCid <>", value, "sourcecodepcid");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidGreaterThan(Integer value) {
            addCriterion("sourcecodePCid >", value, "sourcecodepcid");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sourcecodePCid >=", value, "sourcecodepcid");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidLessThan(Integer value) {
            addCriterion("sourcecodePCid <", value, "sourcecodepcid");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidLessThanOrEqualTo(Integer value) {
            addCriterion("sourcecodePCid <=", value, "sourcecodepcid");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidIn(List<Integer> values) {
            addCriterion("sourcecodePCid in", values, "sourcecodepcid");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidNotIn(List<Integer> values) {
            addCriterion("sourcecodePCid not in", values, "sourcecodepcid");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidBetween(Integer value1, Integer value2) {
            addCriterion("sourcecodePCid between", value1, value2, "sourcecodepcid");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcidNotBetween(Integer value1, Integer value2) {
            addCriterion("sourcecodePCid not between", value1, value2, "sourcecodepcid");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameIsNull() {
            addCriterion("sourcecodePCname is null");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameIsNotNull() {
            addCriterion("sourcecodePCname is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameEqualTo(String value) {
            addCriterion("sourcecodePCname =", value, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameNotEqualTo(String value) {
            addCriterion("sourcecodePCname <>", value, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameGreaterThan(String value) {
            addCriterion("sourcecodePCname >", value, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameGreaterThanOrEqualTo(String value) {
            addCriterion("sourcecodePCname >=", value, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameLessThan(String value) {
            addCriterion("sourcecodePCname <", value, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameLessThanOrEqualTo(String value) {
            addCriterion("sourcecodePCname <=", value, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameLike(String value) {
            addCriterion("sourcecodePCname like", value, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameNotLike(String value) {
            addCriterion("sourcecodePCname not like", value, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameIn(List<String> values) {
            addCriterion("sourcecodePCname in", values, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameNotIn(List<String> values) {
            addCriterion("sourcecodePCname not in", values, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameBetween(String value1, String value2) {
            addCriterion("sourcecodePCname between", value1, value2, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcnameNotBetween(String value1, String value2) {
            addCriterion("sourcecodePCname not between", value1, value2, "sourcecodepcname");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressIsNull() {
            addCriterion("sourcecodePCaddress is null");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressIsNotNull() {
            addCriterion("sourcecodePCaddress is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressEqualTo(String value) {
            addCriterion("sourcecodePCaddress =", value, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressNotEqualTo(String value) {
            addCriterion("sourcecodePCaddress <>", value, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressGreaterThan(String value) {
            addCriterion("sourcecodePCaddress >", value, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressGreaterThanOrEqualTo(String value) {
            addCriterion("sourcecodePCaddress >=", value, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressLessThan(String value) {
            addCriterion("sourcecodePCaddress <", value, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressLessThanOrEqualTo(String value) {
            addCriterion("sourcecodePCaddress <=", value, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressLike(String value) {
            addCriterion("sourcecodePCaddress like", value, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressNotLike(String value) {
            addCriterion("sourcecodePCaddress not like", value, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressIn(List<String> values) {
            addCriterion("sourcecodePCaddress in", values, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressNotIn(List<String> values) {
            addCriterion("sourcecodePCaddress not in", values, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressBetween(String value1, String value2) {
            addCriterion("sourcecodePCaddress between", value1, value2, "sourcecodepcaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodepcaddressNotBetween(String value1, String value2) {
            addCriterion("sourcecodePCaddress not between", value1, value2, "sourcecodepcaddress");
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