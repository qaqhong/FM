package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class SourcecodephoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SourcecodephoneExample() {
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

        public Criteria andSourcecodephoneidIsNull() {
            addCriterion("sourcecodePhoneid is null");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidIsNotNull() {
            addCriterion("sourcecodePhoneid is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidEqualTo(Integer value) {
            addCriterion("sourcecodePhoneid =", value, "sourcecodephoneid");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidNotEqualTo(Integer value) {
            addCriterion("sourcecodePhoneid <>", value, "sourcecodephoneid");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidGreaterThan(Integer value) {
            addCriterion("sourcecodePhoneid >", value, "sourcecodephoneid");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sourcecodePhoneid >=", value, "sourcecodephoneid");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidLessThan(Integer value) {
            addCriterion("sourcecodePhoneid <", value, "sourcecodephoneid");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidLessThanOrEqualTo(Integer value) {
            addCriterion("sourcecodePhoneid <=", value, "sourcecodephoneid");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidIn(List<Integer> values) {
            addCriterion("sourcecodePhoneid in", values, "sourcecodephoneid");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidNotIn(List<Integer> values) {
            addCriterion("sourcecodePhoneid not in", values, "sourcecodephoneid");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidBetween(Integer value1, Integer value2) {
            addCriterion("sourcecodePhoneid between", value1, value2, "sourcecodephoneid");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneidNotBetween(Integer value1, Integer value2) {
            addCriterion("sourcecodePhoneid not between", value1, value2, "sourcecodephoneid");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameIsNull() {
            addCriterion("sourcecodePhonename is null");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameIsNotNull() {
            addCriterion("sourcecodePhonename is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameEqualTo(String value) {
            addCriterion("sourcecodePhonename =", value, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameNotEqualTo(String value) {
            addCriterion("sourcecodePhonename <>", value, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameGreaterThan(String value) {
            addCriterion("sourcecodePhonename >", value, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameGreaterThanOrEqualTo(String value) {
            addCriterion("sourcecodePhonename >=", value, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameLessThan(String value) {
            addCriterion("sourcecodePhonename <", value, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameLessThanOrEqualTo(String value) {
            addCriterion("sourcecodePhonename <=", value, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameLike(String value) {
            addCriterion("sourcecodePhonename like", value, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameNotLike(String value) {
            addCriterion("sourcecodePhonename not like", value, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameIn(List<String> values) {
            addCriterion("sourcecodePhonename in", values, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameNotIn(List<String> values) {
            addCriterion("sourcecodePhonename not in", values, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameBetween(String value1, String value2) {
            addCriterion("sourcecodePhonename between", value1, value2, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephonenameNotBetween(String value1, String value2) {
            addCriterion("sourcecodePhonename not between", value1, value2, "sourcecodephonename");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressIsNull() {
            addCriterion("sourcecodePhoneaddress is null");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressIsNotNull() {
            addCriterion("sourcecodePhoneaddress is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressEqualTo(String value) {
            addCriterion("sourcecodePhoneaddress =", value, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressNotEqualTo(String value) {
            addCriterion("sourcecodePhoneaddress <>", value, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressGreaterThan(String value) {
            addCriterion("sourcecodePhoneaddress >", value, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressGreaterThanOrEqualTo(String value) {
            addCriterion("sourcecodePhoneaddress >=", value, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressLessThan(String value) {
            addCriterion("sourcecodePhoneaddress <", value, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressLessThanOrEqualTo(String value) {
            addCriterion("sourcecodePhoneaddress <=", value, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressLike(String value) {
            addCriterion("sourcecodePhoneaddress like", value, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressNotLike(String value) {
            addCriterion("sourcecodePhoneaddress not like", value, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressIn(List<String> values) {
            addCriterion("sourcecodePhoneaddress in", values, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressNotIn(List<String> values) {
            addCriterion("sourcecodePhoneaddress not in", values, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressBetween(String value1, String value2) {
            addCriterion("sourcecodePhoneaddress between", value1, value2, "sourcecodephoneaddress");
            return (Criteria) this;
        }

        public Criteria andSourcecodephoneaddressNotBetween(String value1, String value2) {
            addCriterion("sourcecodePhoneaddress not between", value1, value2, "sourcecodephoneaddress");
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