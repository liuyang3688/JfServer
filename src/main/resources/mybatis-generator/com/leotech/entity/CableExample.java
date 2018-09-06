package com.leotech.entity;

import java.util.ArrayList;
import java.util.List;

public class CableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFmcodeIsNull() {
            addCriterion("fmCode is null");
            return (Criteria) this;
        }

        public Criteria andFmcodeIsNotNull() {
            addCriterion("fmCode is not null");
            return (Criteria) this;
        }

        public Criteria andFmcodeEqualTo(String value) {
            addCriterion("fmCode =", value, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeNotEqualTo(String value) {
            addCriterion("fmCode <>", value, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeGreaterThan(String value) {
            addCriterion("fmCode >", value, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fmCode >=", value, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeLessThan(String value) {
            addCriterion("fmCode <", value, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeLessThanOrEqualTo(String value) {
            addCriterion("fmCode <=", value, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeLike(String value) {
            addCriterion("fmCode like", value, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeNotLike(String value) {
            addCriterion("fmCode not like", value, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeIn(List<String> values) {
            addCriterion("fmCode in", values, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeNotIn(List<String> values) {
            addCriterion("fmCode not in", values, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeBetween(String value1, String value2) {
            addCriterion("fmCode between", value1, value2, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmcodeNotBetween(String value1, String value2) {
            addCriterion("fmCode not between", value1, value2, "fmcode");
            return (Criteria) this;
        }

        public Criteria andFmdeviceIsNull() {
            addCriterion("fmDevice is null");
            return (Criteria) this;
        }

        public Criteria andFmdeviceIsNotNull() {
            addCriterion("fmDevice is not null");
            return (Criteria) this;
        }

        public Criteria andFmdeviceEqualTo(String value) {
            addCriterion("fmDevice =", value, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceNotEqualTo(String value) {
            addCriterion("fmDevice <>", value, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceGreaterThan(String value) {
            addCriterion("fmDevice >", value, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceGreaterThanOrEqualTo(String value) {
            addCriterion("fmDevice >=", value, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceLessThan(String value) {
            addCriterion("fmDevice <", value, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceLessThanOrEqualTo(String value) {
            addCriterion("fmDevice <=", value, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceLike(String value) {
            addCriterion("fmDevice like", value, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceNotLike(String value) {
            addCriterion("fmDevice not like", value, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceIn(List<String> values) {
            addCriterion("fmDevice in", values, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceNotIn(List<String> values) {
            addCriterion("fmDevice not in", values, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceBetween(String value1, String value2) {
            addCriterion("fmDevice between", value1, value2, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andFmdeviceNotBetween(String value1, String value2) {
            addCriterion("fmDevice not between", value1, value2, "fmdevice");
            return (Criteria) this;
        }

        public Criteria andTocodeIsNull() {
            addCriterion("toCode is null");
            return (Criteria) this;
        }

        public Criteria andTocodeIsNotNull() {
            addCriterion("toCode is not null");
            return (Criteria) this;
        }

        public Criteria andTocodeEqualTo(String value) {
            addCriterion("toCode =", value, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeNotEqualTo(String value) {
            addCriterion("toCode <>", value, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeGreaterThan(String value) {
            addCriterion("toCode >", value, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeGreaterThanOrEqualTo(String value) {
            addCriterion("toCode >=", value, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeLessThan(String value) {
            addCriterion("toCode <", value, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeLessThanOrEqualTo(String value) {
            addCriterion("toCode <=", value, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeLike(String value) {
            addCriterion("toCode like", value, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeNotLike(String value) {
            addCriterion("toCode not like", value, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeIn(List<String> values) {
            addCriterion("toCode in", values, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeNotIn(List<String> values) {
            addCriterion("toCode not in", values, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeBetween(String value1, String value2) {
            addCriterion("toCode between", value1, value2, "tocode");
            return (Criteria) this;
        }

        public Criteria andTocodeNotBetween(String value1, String value2) {
            addCriterion("toCode not between", value1, value2, "tocode");
            return (Criteria) this;
        }

        public Criteria andTodeviceIsNull() {
            addCriterion("toDevice is null");
            return (Criteria) this;
        }

        public Criteria andTodeviceIsNotNull() {
            addCriterion("toDevice is not null");
            return (Criteria) this;
        }

        public Criteria andTodeviceEqualTo(String value) {
            addCriterion("toDevice =", value, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceNotEqualTo(String value) {
            addCriterion("toDevice <>", value, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceGreaterThan(String value) {
            addCriterion("toDevice >", value, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceGreaterThanOrEqualTo(String value) {
            addCriterion("toDevice >=", value, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceLessThan(String value) {
            addCriterion("toDevice <", value, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceLessThanOrEqualTo(String value) {
            addCriterion("toDevice <=", value, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceLike(String value) {
            addCriterion("toDevice like", value, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceNotLike(String value) {
            addCriterion("toDevice not like", value, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceIn(List<String> values) {
            addCriterion("toDevice in", values, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceNotIn(List<String> values) {
            addCriterion("toDevice not in", values, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceBetween(String value1, String value2) {
            addCriterion("toDevice between", value1, value2, "todevice");
            return (Criteria) this;
        }

        public Criteria andTodeviceNotBetween(String value1, String value2) {
            addCriterion("toDevice not between", value1, value2, "todevice");
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