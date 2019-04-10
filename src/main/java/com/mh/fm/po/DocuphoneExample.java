package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class DocuphoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocuphoneExample() {
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

        public Criteria andDocuphoneidIsNull() {
            addCriterion("docuPhoneid is null");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidIsNotNull() {
            addCriterion("docuPhoneid is not null");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidEqualTo(Integer value) {
            addCriterion("docuPhoneid =", value, "docuphoneid");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidNotEqualTo(Integer value) {
            addCriterion("docuPhoneid <>", value, "docuphoneid");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidGreaterThan(Integer value) {
            addCriterion("docuPhoneid >", value, "docuphoneid");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docuPhoneid >=", value, "docuphoneid");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidLessThan(Integer value) {
            addCriterion("docuPhoneid <", value, "docuphoneid");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidLessThanOrEqualTo(Integer value) {
            addCriterion("docuPhoneid <=", value, "docuphoneid");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidIn(List<Integer> values) {
            addCriterion("docuPhoneid in", values, "docuphoneid");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidNotIn(List<Integer> values) {
            addCriterion("docuPhoneid not in", values, "docuphoneid");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidBetween(Integer value1, Integer value2) {
            addCriterion("docuPhoneid between", value1, value2, "docuphoneid");
            return (Criteria) this;
        }

        public Criteria andDocuphoneidNotBetween(Integer value1, Integer value2) {
            addCriterion("docuPhoneid not between", value1, value2, "docuphoneid");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameIsNull() {
            addCriterion("docuPhonename is null");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameIsNotNull() {
            addCriterion("docuPhonename is not null");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameEqualTo(String value) {
            addCriterion("docuPhonename =", value, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameNotEqualTo(String value) {
            addCriterion("docuPhonename <>", value, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameGreaterThan(String value) {
            addCriterion("docuPhonename >", value, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameGreaterThanOrEqualTo(String value) {
            addCriterion("docuPhonename >=", value, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameLessThan(String value) {
            addCriterion("docuPhonename <", value, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameLessThanOrEqualTo(String value) {
            addCriterion("docuPhonename <=", value, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameLike(String value) {
            addCriterion("docuPhonename like", value, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameNotLike(String value) {
            addCriterion("docuPhonename not like", value, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameIn(List<String> values) {
            addCriterion("docuPhonename in", values, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameNotIn(List<String> values) {
            addCriterion("docuPhonename not in", values, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameBetween(String value1, String value2) {
            addCriterion("docuPhonename between", value1, value2, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphonenameNotBetween(String value1, String value2) {
            addCriterion("docuPhonename not between", value1, value2, "docuphonename");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressIsNull() {
            addCriterion("docuPhoneaddress is null");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressIsNotNull() {
            addCriterion("docuPhoneaddress is not null");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressEqualTo(String value) {
            addCriterion("docuPhoneaddress =", value, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressNotEqualTo(String value) {
            addCriterion("docuPhoneaddress <>", value, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressGreaterThan(String value) {
            addCriterion("docuPhoneaddress >", value, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressGreaterThanOrEqualTo(String value) {
            addCriterion("docuPhoneaddress >=", value, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressLessThan(String value) {
            addCriterion("docuPhoneaddress <", value, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressLessThanOrEqualTo(String value) {
            addCriterion("docuPhoneaddress <=", value, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressLike(String value) {
            addCriterion("docuPhoneaddress like", value, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressNotLike(String value) {
            addCriterion("docuPhoneaddress not like", value, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressIn(List<String> values) {
            addCriterion("docuPhoneaddress in", values, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressNotIn(List<String> values) {
            addCriterion("docuPhoneaddress not in", values, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressBetween(String value1, String value2) {
            addCriterion("docuPhoneaddress between", value1, value2, "docuphoneaddress");
            return (Criteria) this;
        }

        public Criteria andDocuphoneaddressNotBetween(String value1, String value2) {
            addCriterion("docuPhoneaddress not between", value1, value2, "docuphoneaddress");
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