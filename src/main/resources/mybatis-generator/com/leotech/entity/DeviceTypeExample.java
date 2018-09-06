package com.leotech.entity;

import java.util.ArrayList;
import java.util.List;

public class DeviceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceTypeExample() {
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

        public Criteria andTplIsNull() {
            addCriterion("tpl is null");
            return (Criteria) this;
        }

        public Criteria andTplIsNotNull() {
            addCriterion("tpl is not null");
            return (Criteria) this;
        }

        public Criteria andTplEqualTo(String value) {
            addCriterion("tpl =", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotEqualTo(String value) {
            addCriterion("tpl <>", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplGreaterThan(String value) {
            addCriterion("tpl >", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplGreaterThanOrEqualTo(String value) {
            addCriterion("tpl >=", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLessThan(String value) {
            addCriterion("tpl <", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLessThanOrEqualTo(String value) {
            addCriterion("tpl <=", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLike(String value) {
            addCriterion("tpl like", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotLike(String value) {
            addCriterion("tpl not like", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplIn(List<String> values) {
            addCriterion("tpl in", values, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotIn(List<String> values) {
            addCriterion("tpl not in", values, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplBetween(String value1, String value2) {
            addCriterion("tpl between", value1, value2, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotBetween(String value1, String value2) {
            addCriterion("tpl not between", value1, value2, "tpl");
            return (Criteria) this;
        }

        public Criteria andEthrowcountIsNull() {
            addCriterion("ethRowCount is null");
            return (Criteria) this;
        }

        public Criteria andEthrowcountIsNotNull() {
            addCriterion("ethRowCount is not null");
            return (Criteria) this;
        }

        public Criteria andEthrowcountEqualTo(Integer value) {
            addCriterion("ethRowCount =", value, "ethrowcount");
            return (Criteria) this;
        }

        public Criteria andEthrowcountNotEqualTo(Integer value) {
            addCriterion("ethRowCount <>", value, "ethrowcount");
            return (Criteria) this;
        }

        public Criteria andEthrowcountGreaterThan(Integer value) {
            addCriterion("ethRowCount >", value, "ethrowcount");
            return (Criteria) this;
        }

        public Criteria andEthrowcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ethRowCount >=", value, "ethrowcount");
            return (Criteria) this;
        }

        public Criteria andEthrowcountLessThan(Integer value) {
            addCriterion("ethRowCount <", value, "ethrowcount");
            return (Criteria) this;
        }

        public Criteria andEthrowcountLessThanOrEqualTo(Integer value) {
            addCriterion("ethRowCount <=", value, "ethrowcount");
            return (Criteria) this;
        }

        public Criteria andEthrowcountIn(List<Integer> values) {
            addCriterion("ethRowCount in", values, "ethrowcount");
            return (Criteria) this;
        }

        public Criteria andEthrowcountNotIn(List<Integer> values) {
            addCriterion("ethRowCount not in", values, "ethrowcount");
            return (Criteria) this;
        }

        public Criteria andEthrowcountBetween(Integer value1, Integer value2) {
            addCriterion("ethRowCount between", value1, value2, "ethrowcount");
            return (Criteria) this;
        }

        public Criteria andEthrowcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ethRowCount not between", value1, value2, "ethrowcount");
            return (Criteria) this;
        }

        public Criteria andEthcolcountIsNull() {
            addCriterion("ethColCount is null");
            return (Criteria) this;
        }

        public Criteria andEthcolcountIsNotNull() {
            addCriterion("ethColCount is not null");
            return (Criteria) this;
        }

        public Criteria andEthcolcountEqualTo(Integer value) {
            addCriterion("ethColCount =", value, "ethcolcount");
            return (Criteria) this;
        }

        public Criteria andEthcolcountNotEqualTo(Integer value) {
            addCriterion("ethColCount <>", value, "ethcolcount");
            return (Criteria) this;
        }

        public Criteria andEthcolcountGreaterThan(Integer value) {
            addCriterion("ethColCount >", value, "ethcolcount");
            return (Criteria) this;
        }

        public Criteria andEthcolcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ethColCount >=", value, "ethcolcount");
            return (Criteria) this;
        }

        public Criteria andEthcolcountLessThan(Integer value) {
            addCriterion("ethColCount <", value, "ethcolcount");
            return (Criteria) this;
        }

        public Criteria andEthcolcountLessThanOrEqualTo(Integer value) {
            addCriterion("ethColCount <=", value, "ethcolcount");
            return (Criteria) this;
        }

        public Criteria andEthcolcountIn(List<Integer> values) {
            addCriterion("ethColCount in", values, "ethcolcount");
            return (Criteria) this;
        }

        public Criteria andEthcolcountNotIn(List<Integer> values) {
            addCriterion("ethColCount not in", values, "ethcolcount");
            return (Criteria) this;
        }

        public Criteria andEthcolcountBetween(Integer value1, Integer value2) {
            addCriterion("ethColCount between", value1, value2, "ethcolcount");
            return (Criteria) this;
        }

        public Criteria andEthcolcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ethColCount not between", value1, value2, "ethcolcount");
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