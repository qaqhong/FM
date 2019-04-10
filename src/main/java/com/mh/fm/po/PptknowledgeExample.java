package com.mh.fm.po;

import java.util.ArrayList;
import java.util.List;

public class PptknowledgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PptknowledgeExample() {
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

        public Criteria andPptknowledgeidIsNull() {
            addCriterion("pptKnowledgeid is null");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidIsNotNull() {
            addCriterion("pptKnowledgeid is not null");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidEqualTo(Integer value) {
            addCriterion("pptKnowledgeid =", value, "pptknowledgeid");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidNotEqualTo(Integer value) {
            addCriterion("pptKnowledgeid <>", value, "pptknowledgeid");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidGreaterThan(Integer value) {
            addCriterion("pptKnowledgeid >", value, "pptknowledgeid");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pptKnowledgeid >=", value, "pptknowledgeid");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidLessThan(Integer value) {
            addCriterion("pptKnowledgeid <", value, "pptknowledgeid");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidLessThanOrEqualTo(Integer value) {
            addCriterion("pptKnowledgeid <=", value, "pptknowledgeid");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidIn(List<Integer> values) {
            addCriterion("pptKnowledgeid in", values, "pptknowledgeid");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidNotIn(List<Integer> values) {
            addCriterion("pptKnowledgeid not in", values, "pptknowledgeid");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidBetween(Integer value1, Integer value2) {
            addCriterion("pptKnowledgeid between", value1, value2, "pptknowledgeid");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeidNotBetween(Integer value1, Integer value2) {
            addCriterion("pptKnowledgeid not between", value1, value2, "pptknowledgeid");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameIsNull() {
            addCriterion("pptKnowledgename is null");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameIsNotNull() {
            addCriterion("pptKnowledgename is not null");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameEqualTo(String value) {
            addCriterion("pptKnowledgename =", value, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameNotEqualTo(String value) {
            addCriterion("pptKnowledgename <>", value, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameGreaterThan(String value) {
            addCriterion("pptKnowledgename >", value, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameGreaterThanOrEqualTo(String value) {
            addCriterion("pptKnowledgename >=", value, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameLessThan(String value) {
            addCriterion("pptKnowledgename <", value, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameLessThanOrEqualTo(String value) {
            addCriterion("pptKnowledgename <=", value, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameLike(String value) {
            addCriterion("pptKnowledgename like", value, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameNotLike(String value) {
            addCriterion("pptKnowledgename not like", value, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameIn(List<String> values) {
            addCriterion("pptKnowledgename in", values, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameNotIn(List<String> values) {
            addCriterion("pptKnowledgename not in", values, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameBetween(String value1, String value2) {
            addCriterion("pptKnowledgename between", value1, value2, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgenameNotBetween(String value1, String value2) {
            addCriterion("pptKnowledgename not between", value1, value2, "pptknowledgename");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressIsNull() {
            addCriterion("pptKnowledgeaddress is null");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressIsNotNull() {
            addCriterion("pptKnowledgeaddress is not null");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressEqualTo(String value) {
            addCriterion("pptKnowledgeaddress =", value, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressNotEqualTo(String value) {
            addCriterion("pptKnowledgeaddress <>", value, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressGreaterThan(String value) {
            addCriterion("pptKnowledgeaddress >", value, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("pptKnowledgeaddress >=", value, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressLessThan(String value) {
            addCriterion("pptKnowledgeaddress <", value, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressLessThanOrEqualTo(String value) {
            addCriterion("pptKnowledgeaddress <=", value, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressLike(String value) {
            addCriterion("pptKnowledgeaddress like", value, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressNotLike(String value) {
            addCriterion("pptKnowledgeaddress not like", value, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressIn(List<String> values) {
            addCriterion("pptKnowledgeaddress in", values, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressNotIn(List<String> values) {
            addCriterion("pptKnowledgeaddress not in", values, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressBetween(String value1, String value2) {
            addCriterion("pptKnowledgeaddress between", value1, value2, "pptknowledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPptknowledgeaddressNotBetween(String value1, String value2) {
            addCriterion("pptKnowledgeaddress not between", value1, value2, "pptknowledgeaddress");
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