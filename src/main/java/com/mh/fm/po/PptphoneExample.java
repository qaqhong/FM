package com.mh.fm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PptphoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PptphoneExample() {
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

        public Criteria andPptphoneidIsNull() {
            addCriterion("pptphoneid is null");
            return (Criteria) this;
        }

        public Criteria andPptphoneidIsNotNull() {
            addCriterion("pptphoneid is not null");
            return (Criteria) this;
        }

        public Criteria andPptphoneidEqualTo(Integer value) {
            addCriterion("pptphoneid =", value, "pptphoneid");
            return (Criteria) this;
        }

        public Criteria andPptphoneidNotEqualTo(Integer value) {
            addCriterion("pptphoneid <>", value, "pptphoneid");
            return (Criteria) this;
        }

        public Criteria andPptphoneidGreaterThan(Integer value) {
            addCriterion("pptphoneid >", value, "pptphoneid");
            return (Criteria) this;
        }

        public Criteria andPptphoneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pptphoneid >=", value, "pptphoneid");
            return (Criteria) this;
        }

        public Criteria andPptphoneidLessThan(Integer value) {
            addCriterion("pptphoneid <", value, "pptphoneid");
            return (Criteria) this;
        }

        public Criteria andPptphoneidLessThanOrEqualTo(Integer value) {
            addCriterion("pptphoneid <=", value, "pptphoneid");
            return (Criteria) this;
        }

        public Criteria andPptphoneidIn(List<Integer> values) {
            addCriterion("pptphoneid in", values, "pptphoneid");
            return (Criteria) this;
        }

        public Criteria andPptphoneidNotIn(List<Integer> values) {
            addCriterion("pptphoneid not in", values, "pptphoneid");
            return (Criteria) this;
        }

        public Criteria andPptphoneidBetween(Integer value1, Integer value2) {
            addCriterion("pptphoneid between", value1, value2, "pptphoneid");
            return (Criteria) this;
        }

        public Criteria andPptphoneidNotBetween(Integer value1, Integer value2) {
            addCriterion("pptphoneid not between", value1, value2, "pptphoneid");
            return (Criteria) this;
        }

        public Criteria andPptphonenameIsNull() {
            addCriterion("pptphonename is null");
            return (Criteria) this;
        }

        public Criteria andPptphonenameIsNotNull() {
            addCriterion("pptphonename is not null");
            return (Criteria) this;
        }

        public Criteria andPptphonenameEqualTo(String value) {
            addCriterion("pptphonename =", value, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameNotEqualTo(String value) {
            addCriterion("pptphonename <>", value, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameGreaterThan(String value) {
            addCriterion("pptphonename >", value, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameGreaterThanOrEqualTo(String value) {
            addCriterion("pptphonename >=", value, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameLessThan(String value) {
            addCriterion("pptphonename <", value, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameLessThanOrEqualTo(String value) {
            addCriterion("pptphonename <=", value, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameLike(String value) {
            addCriterion("pptphonename like", value, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameNotLike(String value) {
            addCriterion("pptphonename not like", value, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameIn(List<String> values) {
            addCriterion("pptphonename in", values, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameNotIn(List<String> values) {
            addCriterion("pptphonename not in", values, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameBetween(String value1, String value2) {
            addCriterion("pptphonename between", value1, value2, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphonenameNotBetween(String value1, String value2) {
            addCriterion("pptphonename not between", value1, value2, "pptphonename");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressIsNull() {
            addCriterion("pptphoneaddress is null");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressIsNotNull() {
            addCriterion("pptphoneaddress is not null");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressEqualTo(String value) {
            addCriterion("pptphoneaddress =", value, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressNotEqualTo(String value) {
            addCriterion("pptphoneaddress <>", value, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressGreaterThan(String value) {
            addCriterion("pptphoneaddress >", value, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressGreaterThanOrEqualTo(String value) {
            addCriterion("pptphoneaddress >=", value, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressLessThan(String value) {
            addCriterion("pptphoneaddress <", value, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressLessThanOrEqualTo(String value) {
            addCriterion("pptphoneaddress <=", value, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressLike(String value) {
            addCriterion("pptphoneaddress like", value, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressNotLike(String value) {
            addCriterion("pptphoneaddress not like", value, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressIn(List<String> values) {
            addCriterion("pptphoneaddress in", values, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressNotIn(List<String> values) {
            addCriterion("pptphoneaddress not in", values, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressBetween(String value1, String value2) {
            addCriterion("pptphoneaddress between", value1, value2, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneaddressNotBetween(String value1, String value2) {
            addCriterion("pptphoneaddress not between", value1, value2, "pptphoneaddress");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameIsNull() {
            addCriterion("pptPhoneuuidname is null");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameIsNotNull() {
            addCriterion("pptPhoneuuidname is not null");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameEqualTo(String value) {
            addCriterion("pptPhoneuuidname =", value, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameNotEqualTo(String value) {
            addCriterion("pptPhoneuuidname <>", value, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameGreaterThan(String value) {
            addCriterion("pptPhoneuuidname >", value, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameGreaterThanOrEqualTo(String value) {
            addCriterion("pptPhoneuuidname >=", value, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameLessThan(String value) {
            addCriterion("pptPhoneuuidname <", value, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameLessThanOrEqualTo(String value) {
            addCriterion("pptPhoneuuidname <=", value, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameLike(String value) {
            addCriterion("pptPhoneuuidname like", value, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameNotLike(String value) {
            addCriterion("pptPhoneuuidname not like", value, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameIn(List<String> values) {
            addCriterion("pptPhoneuuidname in", values, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameNotIn(List<String> values) {
            addCriterion("pptPhoneuuidname not in", values, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameBetween(String value1, String value2) {
            addCriterion("pptPhoneuuidname between", value1, value2, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuuidnameNotBetween(String value1, String value2) {
            addCriterion("pptPhoneuuidname not between", value1, value2, "pptphoneuuidname");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeIsNull() {
            addCriterion("pptPhoneuploadtime is null");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeIsNotNull() {
            addCriterion("pptPhoneuploadtime is not null");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeEqualTo(Date value) {
            addCriterion("pptPhoneuploadtime =", value, "pptphoneuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeNotEqualTo(Date value) {
            addCriterion("pptPhoneuploadtime <>", value, "pptphoneuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeGreaterThan(Date value) {
            addCriterion("pptPhoneuploadtime >", value, "pptphoneuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pptPhoneuploadtime >=", value, "pptphoneuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeLessThan(Date value) {
            addCriterion("pptPhoneuploadtime <", value, "pptphoneuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("pptPhoneuploadtime <=", value, "pptphoneuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeIn(List<Date> values) {
            addCriterion("pptPhoneuploadtime in", values, "pptphoneuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeNotIn(List<Date> values) {
            addCriterion("pptPhoneuploadtime not in", values, "pptphoneuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeBetween(Date value1, Date value2) {
            addCriterion("pptPhoneuploadtime between", value1, value2, "pptphoneuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptphoneuploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("pptPhoneuploadtime not between", value1, value2, "pptphoneuploadtime");
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