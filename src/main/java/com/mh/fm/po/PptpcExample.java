package com.mh.fm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PptpcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PptpcExample() {
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

        public Criteria andPptpcidIsNull() {
            addCriterion("pptPCid is null");
            return (Criteria) this;
        }

        public Criteria andPptpcidIsNotNull() {
            addCriterion("pptPCid is not null");
            return (Criteria) this;
        }

        public Criteria andPptpcidEqualTo(Integer value) {
            addCriterion("pptPCid =", value, "pptpcid");
            return (Criteria) this;
        }

        public Criteria andPptpcidNotEqualTo(Integer value) {
            addCriterion("pptPCid <>", value, "pptpcid");
            return (Criteria) this;
        }

        public Criteria andPptpcidGreaterThan(Integer value) {
            addCriterion("pptPCid >", value, "pptpcid");
            return (Criteria) this;
        }

        public Criteria andPptpcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pptPCid >=", value, "pptpcid");
            return (Criteria) this;
        }

        public Criteria andPptpcidLessThan(Integer value) {
            addCriterion("pptPCid <", value, "pptpcid");
            return (Criteria) this;
        }

        public Criteria andPptpcidLessThanOrEqualTo(Integer value) {
            addCriterion("pptPCid <=", value, "pptpcid");
            return (Criteria) this;
        }

        public Criteria andPptpcidIn(List<Integer> values) {
            addCriterion("pptPCid in", values, "pptpcid");
            return (Criteria) this;
        }

        public Criteria andPptpcidNotIn(List<Integer> values) {
            addCriterion("pptPCid not in", values, "pptpcid");
            return (Criteria) this;
        }

        public Criteria andPptpcidBetween(Integer value1, Integer value2) {
            addCriterion("pptPCid between", value1, value2, "pptpcid");
            return (Criteria) this;
        }

        public Criteria andPptpcidNotBetween(Integer value1, Integer value2) {
            addCriterion("pptPCid not between", value1, value2, "pptpcid");
            return (Criteria) this;
        }

        public Criteria andPptpcnameIsNull() {
            addCriterion("pptPCname is null");
            return (Criteria) this;
        }

        public Criteria andPptpcnameIsNotNull() {
            addCriterion("pptPCname is not null");
            return (Criteria) this;
        }

        public Criteria andPptpcnameEqualTo(String value) {
            addCriterion("pptPCname =", value, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameNotEqualTo(String value) {
            addCriterion("pptPCname <>", value, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameGreaterThan(String value) {
            addCriterion("pptPCname >", value, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameGreaterThanOrEqualTo(String value) {
            addCriterion("pptPCname >=", value, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameLessThan(String value) {
            addCriterion("pptPCname <", value, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameLessThanOrEqualTo(String value) {
            addCriterion("pptPCname <=", value, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameLike(String value) {
            addCriterion("pptPCname like", value, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameNotLike(String value) {
            addCriterion("pptPCname not like", value, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameIn(List<String> values) {
            addCriterion("pptPCname in", values, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameNotIn(List<String> values) {
            addCriterion("pptPCname not in", values, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameBetween(String value1, String value2) {
            addCriterion("pptPCname between", value1, value2, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcnameNotBetween(String value1, String value2) {
            addCriterion("pptPCname not between", value1, value2, "pptpcname");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressIsNull() {
            addCriterion("pptPCaddress is null");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressIsNotNull() {
            addCriterion("pptPCaddress is not null");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressEqualTo(String value) {
            addCriterion("pptPCaddress =", value, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressNotEqualTo(String value) {
            addCriterion("pptPCaddress <>", value, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressGreaterThan(String value) {
            addCriterion("pptPCaddress >", value, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressGreaterThanOrEqualTo(String value) {
            addCriterion("pptPCaddress >=", value, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressLessThan(String value) {
            addCriterion("pptPCaddress <", value, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressLessThanOrEqualTo(String value) {
            addCriterion("pptPCaddress <=", value, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressLike(String value) {
            addCriterion("pptPCaddress like", value, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressNotLike(String value) {
            addCriterion("pptPCaddress not like", value, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressIn(List<String> values) {
            addCriterion("pptPCaddress in", values, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressNotIn(List<String> values) {
            addCriterion("pptPCaddress not in", values, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressBetween(String value1, String value2) {
            addCriterion("pptPCaddress between", value1, value2, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcaddressNotBetween(String value1, String value2) {
            addCriterion("pptPCaddress not between", value1, value2, "pptpcaddress");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameIsNull() {
            addCriterion("pptPCuuidname is null");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameIsNotNull() {
            addCriterion("pptPCuuidname is not null");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameEqualTo(String value) {
            addCriterion("pptPCuuidname =", value, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameNotEqualTo(String value) {
            addCriterion("pptPCuuidname <>", value, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameGreaterThan(String value) {
            addCriterion("pptPCuuidname >", value, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameGreaterThanOrEqualTo(String value) {
            addCriterion("pptPCuuidname >=", value, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameLessThan(String value) {
            addCriterion("pptPCuuidname <", value, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameLessThanOrEqualTo(String value) {
            addCriterion("pptPCuuidname <=", value, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameLike(String value) {
            addCriterion("pptPCuuidname like", value, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameNotLike(String value) {
            addCriterion("pptPCuuidname not like", value, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameIn(List<String> values) {
            addCriterion("pptPCuuidname in", values, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameNotIn(List<String> values) {
            addCriterion("pptPCuuidname not in", values, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameBetween(String value1, String value2) {
            addCriterion("pptPCuuidname between", value1, value2, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuuidnameNotBetween(String value1, String value2) {
            addCriterion("pptPCuuidname not between", value1, value2, "pptpcuuidname");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeIsNull() {
            addCriterion("pptPCuploadtime is null");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeIsNotNull() {
            addCriterion("pptPCuploadtime is not null");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeEqualTo(Date value) {
            addCriterion("pptPCuploadtime =", value, "pptpcuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeNotEqualTo(Date value) {
            addCriterion("pptPCuploadtime <>", value, "pptpcuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeGreaterThan(Date value) {
            addCriterion("pptPCuploadtime >", value, "pptpcuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pptPCuploadtime >=", value, "pptpcuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeLessThan(Date value) {
            addCriterion("pptPCuploadtime <", value, "pptpcuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("pptPCuploadtime <=", value, "pptpcuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeIn(List<Date> values) {
            addCriterion("pptPCuploadtime in", values, "pptpcuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeNotIn(List<Date> values) {
            addCriterion("pptPCuploadtime not in", values, "pptpcuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeBetween(Date value1, Date value2) {
            addCriterion("pptPCuploadtime between", value1, value2, "pptpcuploadtime");
            return (Criteria) this;
        }

        public Criteria andPptpcuploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("pptPCuploadtime not between", value1, value2, "pptpcuploadtime");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
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