package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class VideopcfmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideopcfmExample() {
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

        public Criteria andVideopcfmidIsNull() {
            addCriterion("videoPCfmid is null");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidIsNotNull() {
            addCriterion("videoPCfmid is not null");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidEqualTo(Integer value) {
            addCriterion("videoPCfmid =", value, "videopcfmid");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidNotEqualTo(Integer value) {
            addCriterion("videoPCfmid <>", value, "videopcfmid");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidGreaterThan(Integer value) {
            addCriterion("videoPCfmid >", value, "videopcfmid");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoPCfmid >=", value, "videopcfmid");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidLessThan(Integer value) {
            addCriterion("videoPCfmid <", value, "videopcfmid");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidLessThanOrEqualTo(Integer value) {
            addCriterion("videoPCfmid <=", value, "videopcfmid");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidIn(List<Integer> values) {
            addCriterion("videoPCfmid in", values, "videopcfmid");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidNotIn(List<Integer> values) {
            addCriterion("videoPCfmid not in", values, "videopcfmid");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidBetween(Integer value1, Integer value2) {
            addCriterion("videoPCfmid between", value1, value2, "videopcfmid");
            return (Criteria) this;
        }

        public Criteria andVideopcfmidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoPCfmid not between", value1, value2, "videopcfmid");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameIsNull() {
            addCriterion("videoPCfmname is null");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameIsNotNull() {
            addCriterion("videoPCfmname is not null");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameEqualTo(String value) {
            addCriterion("videoPCfmname =", value, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameNotEqualTo(String value) {
            addCriterion("videoPCfmname <>", value, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameGreaterThan(String value) {
            addCriterion("videoPCfmname >", value, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameGreaterThanOrEqualTo(String value) {
            addCriterion("videoPCfmname >=", value, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameLessThan(String value) {
            addCriterion("videoPCfmname <", value, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameLessThanOrEqualTo(String value) {
            addCriterion("videoPCfmname <=", value, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameLike(String value) {
            addCriterion("videoPCfmname like", value, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameNotLike(String value) {
            addCriterion("videoPCfmname not like", value, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameIn(List<String> values) {
            addCriterion("videoPCfmname in", values, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameNotIn(List<String> values) {
            addCriterion("videoPCfmname not in", values, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameBetween(String value1, String value2) {
            addCriterion("videoPCfmname between", value1, value2, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmnameNotBetween(String value1, String value2) {
            addCriterion("videoPCfmname not between", value1, value2, "videopcfmname");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressIsNull() {
            addCriterion("videoPCfmaddress is null");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressIsNotNull() {
            addCriterion("videoPCfmaddress is not null");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressEqualTo(String value) {
            addCriterion("videoPCfmaddress =", value, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressNotEqualTo(String value) {
            addCriterion("videoPCfmaddress <>", value, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressGreaterThan(String value) {
            addCriterion("videoPCfmaddress >", value, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressGreaterThanOrEqualTo(String value) {
            addCriterion("videoPCfmaddress >=", value, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressLessThan(String value) {
            addCriterion("videoPCfmaddress <", value, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressLessThanOrEqualTo(String value) {
            addCriterion("videoPCfmaddress <=", value, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressLike(String value) {
            addCriterion("videoPCfmaddress like", value, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressNotLike(String value) {
            addCriterion("videoPCfmaddress not like", value, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressIn(List<String> values) {
            addCriterion("videoPCfmaddress in", values, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressNotIn(List<String> values) {
            addCriterion("videoPCfmaddress not in", values, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressBetween(String value1, String value2) {
            addCriterion("videoPCfmaddress between", value1, value2, "videopcfmaddress");
            return (Criteria) this;
        }

        public Criteria andVideopcfmaddressNotBetween(String value1, String value2) {
            addCriterion("videoPCfmaddress not between", value1, value2, "videopcfmaddress");
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