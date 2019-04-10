package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class VideopcknExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideopcknExample() {
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

        public Criteria andVideopcknidIsNull() {
            addCriterion("videoPCknid is null");
            return (Criteria) this;
        }

        public Criteria andVideopcknidIsNotNull() {
            addCriterion("videoPCknid is not null");
            return (Criteria) this;
        }

        public Criteria andVideopcknidEqualTo(Integer value) {
            addCriterion("videoPCknid =", value, "videopcknid");
            return (Criteria) this;
        }

        public Criteria andVideopcknidNotEqualTo(Integer value) {
            addCriterion("videoPCknid <>", value, "videopcknid");
            return (Criteria) this;
        }

        public Criteria andVideopcknidGreaterThan(Integer value) {
            addCriterion("videoPCknid >", value, "videopcknid");
            return (Criteria) this;
        }

        public Criteria andVideopcknidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoPCknid >=", value, "videopcknid");
            return (Criteria) this;
        }

        public Criteria andVideopcknidLessThan(Integer value) {
            addCriterion("videoPCknid <", value, "videopcknid");
            return (Criteria) this;
        }

        public Criteria andVideopcknidLessThanOrEqualTo(Integer value) {
            addCriterion("videoPCknid <=", value, "videopcknid");
            return (Criteria) this;
        }

        public Criteria andVideopcknidIn(List<Integer> values) {
            addCriterion("videoPCknid in", values, "videopcknid");
            return (Criteria) this;
        }

        public Criteria andVideopcknidNotIn(List<Integer> values) {
            addCriterion("videoPCknid not in", values, "videopcknid");
            return (Criteria) this;
        }

        public Criteria andVideopcknidBetween(Integer value1, Integer value2) {
            addCriterion("videoPCknid between", value1, value2, "videopcknid");
            return (Criteria) this;
        }

        public Criteria andVideopcknidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoPCknid not between", value1, value2, "videopcknid");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameIsNull() {
            addCriterion("videoPCknname is null");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameIsNotNull() {
            addCriterion("videoPCknname is not null");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameEqualTo(String value) {
            addCriterion("videoPCknname =", value, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameNotEqualTo(String value) {
            addCriterion("videoPCknname <>", value, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameGreaterThan(String value) {
            addCriterion("videoPCknname >", value, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameGreaterThanOrEqualTo(String value) {
            addCriterion("videoPCknname >=", value, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameLessThan(String value) {
            addCriterion("videoPCknname <", value, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameLessThanOrEqualTo(String value) {
            addCriterion("videoPCknname <=", value, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameLike(String value) {
            addCriterion("videoPCknname like", value, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameNotLike(String value) {
            addCriterion("videoPCknname not like", value, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameIn(List<String> values) {
            addCriterion("videoPCknname in", values, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameNotIn(List<String> values) {
            addCriterion("videoPCknname not in", values, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameBetween(String value1, String value2) {
            addCriterion("videoPCknname between", value1, value2, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknnameNotBetween(String value1, String value2) {
            addCriterion("videoPCknname not between", value1, value2, "videopcknname");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressIsNull() {
            addCriterion("videoPCknaddress is null");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressIsNotNull() {
            addCriterion("videoPCknaddress is not null");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressEqualTo(String value) {
            addCriterion("videoPCknaddress =", value, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressNotEqualTo(String value) {
            addCriterion("videoPCknaddress <>", value, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressGreaterThan(String value) {
            addCriterion("videoPCknaddress >", value, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressGreaterThanOrEqualTo(String value) {
            addCriterion("videoPCknaddress >=", value, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressLessThan(String value) {
            addCriterion("videoPCknaddress <", value, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressLessThanOrEqualTo(String value) {
            addCriterion("videoPCknaddress <=", value, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressLike(String value) {
            addCriterion("videoPCknaddress like", value, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressNotLike(String value) {
            addCriterion("videoPCknaddress not like", value, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressIn(List<String> values) {
            addCriterion("videoPCknaddress in", values, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressNotIn(List<String> values) {
            addCriterion("videoPCknaddress not in", values, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressBetween(String value1, String value2) {
            addCriterion("videoPCknaddress between", value1, value2, "videopcknaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcknaddressNotBetween(String value1, String value2) {
            addCriterion("videoPCknaddress not between", value1, value2, "videopcknaddress");
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