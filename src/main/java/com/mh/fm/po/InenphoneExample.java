package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class InenphoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InenphoneExample() {
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

        public Criteria andInenphoneidIsNull() {
            addCriterion("inenPhoneid is null");
            return (Criteria) this;
        }

        public Criteria andInenphoneidIsNotNull() {
            addCriterion("inenPhoneid is not null");
            return (Criteria) this;
        }

        public Criteria andInenphoneidEqualTo(Integer value) {
            addCriterion("inenPhoneid =", value, "inenphoneid");
            return (Criteria) this;
        }

        public Criteria andInenphoneidNotEqualTo(Integer value) {
            addCriterion("inenPhoneid <>", value, "inenphoneid");
            return (Criteria) this;
        }

        public Criteria andInenphoneidGreaterThan(Integer value) {
            addCriterion("inenPhoneid >", value, "inenphoneid");
            return (Criteria) this;
        }

        public Criteria andInenphoneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inenPhoneid >=", value, "inenphoneid");
            return (Criteria) this;
        }

        public Criteria andInenphoneidLessThan(Integer value) {
            addCriterion("inenPhoneid <", value, "inenphoneid");
            return (Criteria) this;
        }

        public Criteria andInenphoneidLessThanOrEqualTo(Integer value) {
            addCriterion("inenPhoneid <=", value, "inenphoneid");
            return (Criteria) this;
        }

        public Criteria andInenphoneidIn(List<Integer> values) {
            addCriterion("inenPhoneid in", values, "inenphoneid");
            return (Criteria) this;
        }

        public Criteria andInenphoneidNotIn(List<Integer> values) {
            addCriterion("inenPhoneid not in", values, "inenphoneid");
            return (Criteria) this;
        }

        public Criteria andInenphoneidBetween(Integer value1, Integer value2) {
            addCriterion("inenPhoneid between", value1, value2, "inenphoneid");
            return (Criteria) this;
        }

        public Criteria andInenphoneidNotBetween(Integer value1, Integer value2) {
            addCriterion("inenPhoneid not between", value1, value2, "inenphoneid");
            return (Criteria) this;
        }

        public Criteria andInenphonenameIsNull() {
            addCriterion("inenPhonename is null");
            return (Criteria) this;
        }

        public Criteria andInenphonenameIsNotNull() {
            addCriterion("inenPhonename is not null");
            return (Criteria) this;
        }

        public Criteria andInenphonenameEqualTo(String value) {
            addCriterion("inenPhonename =", value, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameNotEqualTo(String value) {
            addCriterion("inenPhonename <>", value, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameGreaterThan(String value) {
            addCriterion("inenPhonename >", value, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameGreaterThanOrEqualTo(String value) {
            addCriterion("inenPhonename >=", value, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameLessThan(String value) {
            addCriterion("inenPhonename <", value, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameLessThanOrEqualTo(String value) {
            addCriterion("inenPhonename <=", value, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameLike(String value) {
            addCriterion("inenPhonename like", value, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameNotLike(String value) {
            addCriterion("inenPhonename not like", value, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameIn(List<String> values) {
            addCriterion("inenPhonename in", values, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameNotIn(List<String> values) {
            addCriterion("inenPhonename not in", values, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameBetween(String value1, String value2) {
            addCriterion("inenPhonename between", value1, value2, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphonenameNotBetween(String value1, String value2) {
            addCriterion("inenPhonename not between", value1, value2, "inenphonename");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressIsNull() {
            addCriterion("inenPhoneaddress is null");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressIsNotNull() {
            addCriterion("inenPhoneaddress is not null");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressEqualTo(String value) {
            addCriterion("inenPhoneaddress =", value, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressNotEqualTo(String value) {
            addCriterion("inenPhoneaddress <>", value, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressGreaterThan(String value) {
            addCriterion("inenPhoneaddress >", value, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressGreaterThanOrEqualTo(String value) {
            addCriterion("inenPhoneaddress >=", value, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressLessThan(String value) {
            addCriterion("inenPhoneaddress <", value, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressLessThanOrEqualTo(String value) {
            addCriterion("inenPhoneaddress <=", value, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressLike(String value) {
            addCriterion("inenPhoneaddress like", value, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressNotLike(String value) {
            addCriterion("inenPhoneaddress not like", value, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressIn(List<String> values) {
            addCriterion("inenPhoneaddress in", values, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressNotIn(List<String> values) {
            addCriterion("inenPhoneaddress not in", values, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressBetween(String value1, String value2) {
            addCriterion("inenPhoneaddress between", value1, value2, "inenphoneaddress");
            return (Criteria) this;
        }

        public Criteria andInenphoneaddressNotBetween(String value1, String value2) {
            addCriterion("inenPhoneaddress not between", value1, value2, "inenphoneaddress");
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