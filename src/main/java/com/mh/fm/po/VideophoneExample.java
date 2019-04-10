package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class VideophoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideophoneExample() {
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

        public Criteria andVideophoneidIsNull() {
            addCriterion("videoPhoneid is null");
            return (Criteria) this;
        }

        public Criteria andVideophoneidIsNotNull() {
            addCriterion("videoPhoneid is not null");
            return (Criteria) this;
        }

        public Criteria andVideophoneidEqualTo(Integer value) {
            addCriterion("videoPhoneid =", value, "videophoneid");
            return (Criteria) this;
        }

        public Criteria andVideophoneidNotEqualTo(Integer value) {
            addCriterion("videoPhoneid <>", value, "videophoneid");
            return (Criteria) this;
        }

        public Criteria andVideophoneidGreaterThan(Integer value) {
            addCriterion("videoPhoneid >", value, "videophoneid");
            return (Criteria) this;
        }

        public Criteria andVideophoneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoPhoneid >=", value, "videophoneid");
            return (Criteria) this;
        }

        public Criteria andVideophoneidLessThan(Integer value) {
            addCriterion("videoPhoneid <", value, "videophoneid");
            return (Criteria) this;
        }

        public Criteria andVideophoneidLessThanOrEqualTo(Integer value) {
            addCriterion("videoPhoneid <=", value, "videophoneid");
            return (Criteria) this;
        }

        public Criteria andVideophoneidIn(List<Integer> values) {
            addCriterion("videoPhoneid in", values, "videophoneid");
            return (Criteria) this;
        }

        public Criteria andVideophoneidNotIn(List<Integer> values) {
            addCriterion("videoPhoneid not in", values, "videophoneid");
            return (Criteria) this;
        }

        public Criteria andVideophoneidBetween(Integer value1, Integer value2) {
            addCriterion("videoPhoneid between", value1, value2, "videophoneid");
            return (Criteria) this;
        }

        public Criteria andVideophoneidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoPhoneid not between", value1, value2, "videophoneid");
            return (Criteria) this;
        }

        public Criteria andVideophonenameIsNull() {
            addCriterion("videoPhonename is null");
            return (Criteria) this;
        }

        public Criteria andVideophonenameIsNotNull() {
            addCriterion("videoPhonename is not null");
            return (Criteria) this;
        }

        public Criteria andVideophonenameEqualTo(String value) {
            addCriterion("videoPhonename =", value, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameNotEqualTo(String value) {
            addCriterion("videoPhonename <>", value, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameGreaterThan(String value) {
            addCriterion("videoPhonename >", value, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameGreaterThanOrEqualTo(String value) {
            addCriterion("videoPhonename >=", value, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameLessThan(String value) {
            addCriterion("videoPhonename <", value, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameLessThanOrEqualTo(String value) {
            addCriterion("videoPhonename <=", value, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameLike(String value) {
            addCriterion("videoPhonename like", value, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameNotLike(String value) {
            addCriterion("videoPhonename not like", value, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameIn(List<String> values) {
            addCriterion("videoPhonename in", values, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameNotIn(List<String> values) {
            addCriterion("videoPhonename not in", values, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameBetween(String value1, String value2) {
            addCriterion("videoPhonename between", value1, value2, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophonenameNotBetween(String value1, String value2) {
            addCriterion("videoPhonename not between", value1, value2, "videophonename");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressIsNull() {
            addCriterion("videoPhoneaddress is null");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressIsNotNull() {
            addCriterion("videoPhoneaddress is not null");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressEqualTo(String value) {
            addCriterion("videoPhoneaddress =", value, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressNotEqualTo(String value) {
            addCriterion("videoPhoneaddress <>", value, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressGreaterThan(String value) {
            addCriterion("videoPhoneaddress >", value, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressGreaterThanOrEqualTo(String value) {
            addCriterion("videoPhoneaddress >=", value, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressLessThan(String value) {
            addCriterion("videoPhoneaddress <", value, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressLessThanOrEqualTo(String value) {
            addCriterion("videoPhoneaddress <=", value, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressLike(String value) {
            addCriterion("videoPhoneaddress like", value, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressNotLike(String value) {
            addCriterion("videoPhoneaddress not like", value, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressIn(List<String> values) {
            addCriterion("videoPhoneaddress in", values, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressNotIn(List<String> values) {
            addCriterion("videoPhoneaddress not in", values, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressBetween(String value1, String value2) {
            addCriterion("videoPhoneaddress between", value1, value2, "videophoneaddress");
            return (Criteria) this;
        }

        public Criteria andVideophoneaddressNotBetween(String value1, String value2) {
            addCriterion("videoPhoneaddress not between", value1, value2, "videophoneaddress");
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