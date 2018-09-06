package com.leotech.entity;

import java.util.ArrayList;
import java.util.List;

public class TextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TextExample() {
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

        public Criteria andIsshowIsNull() {
            addCriterion("isShow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Integer value) {
            addCriterion("isShow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Integer value) {
            addCriterion("isShow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Integer value) {
            addCriterion("isShow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Integer value) {
            addCriterion("isShow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Integer value) {
            addCriterion("isShow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Integer> values) {
            addCriterion("isShow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Integer> values) {
            addCriterion("isShow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Integer value1, Integer value2) {
            addCriterion("isShow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Integer value1, Integer value2) {
            addCriterion("isShow not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andFontIsNull() {
            addCriterion("font is null");
            return (Criteria) this;
        }

        public Criteria andFontIsNotNull() {
            addCriterion("font is not null");
            return (Criteria) this;
        }

        public Criteria andFontEqualTo(String value) {
            addCriterion("font =", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotEqualTo(String value) {
            addCriterion("font <>", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontGreaterThan(String value) {
            addCriterion("font >", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontGreaterThanOrEqualTo(String value) {
            addCriterion("font >=", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontLessThan(String value) {
            addCriterion("font <", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontLessThanOrEqualTo(String value) {
            addCriterion("font <=", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontLike(String value) {
            addCriterion("font like", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotLike(String value) {
            addCriterion("font not like", value, "font");
            return (Criteria) this;
        }

        public Criteria andFontIn(List<String> values) {
            addCriterion("font in", values, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotIn(List<String> values) {
            addCriterion("font not in", values, "font");
            return (Criteria) this;
        }

        public Criteria andFontBetween(String value1, String value2) {
            addCriterion("font between", value1, value2, "font");
            return (Criteria) this;
        }

        public Criteria andFontNotBetween(String value1, String value2) {
            addCriterion("font not between", value1, value2, "font");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("text is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("text is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("text =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("text <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("text >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("text >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("text <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("text <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("text like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("text not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("text in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("text not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("text between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("text not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andLabelidsIsNull() {
            addCriterion("labelIds is null");
            return (Criteria) this;
        }

        public Criteria andLabelidsIsNotNull() {
            addCriterion("labelIds is not null");
            return (Criteria) this;
        }

        public Criteria andLabelidsEqualTo(String value) {
            addCriterion("labelIds =", value, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsNotEqualTo(String value) {
            addCriterion("labelIds <>", value, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsGreaterThan(String value) {
            addCriterion("labelIds >", value, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsGreaterThanOrEqualTo(String value) {
            addCriterion("labelIds >=", value, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsLessThan(String value) {
            addCriterion("labelIds <", value, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsLessThanOrEqualTo(String value) {
            addCriterion("labelIds <=", value, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsLike(String value) {
            addCriterion("labelIds like", value, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsNotLike(String value) {
            addCriterion("labelIds not like", value, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsIn(List<String> values) {
            addCriterion("labelIds in", values, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsNotIn(List<String> values) {
            addCriterion("labelIds not in", values, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsBetween(String value1, String value2) {
            addCriterion("labelIds between", value1, value2, "labelids");
            return (Criteria) this;
        }

        public Criteria andLabelidsNotBetween(String value1, String value2) {
            addCriterion("labelIds not between", value1, value2, "labelids");
            return (Criteria) this;
        }

        public Criteria andOffxIsNull() {
            addCriterion("offX is null");
            return (Criteria) this;
        }

        public Criteria andOffxIsNotNull() {
            addCriterion("offX is not null");
            return (Criteria) this;
        }

        public Criteria andOffxEqualTo(Double value) {
            addCriterion("offX =", value, "offx");
            return (Criteria) this;
        }

        public Criteria andOffxNotEqualTo(Double value) {
            addCriterion("offX <>", value, "offx");
            return (Criteria) this;
        }

        public Criteria andOffxGreaterThan(Double value) {
            addCriterion("offX >", value, "offx");
            return (Criteria) this;
        }

        public Criteria andOffxGreaterThanOrEqualTo(Double value) {
            addCriterion("offX >=", value, "offx");
            return (Criteria) this;
        }

        public Criteria andOffxLessThan(Double value) {
            addCriterion("offX <", value, "offx");
            return (Criteria) this;
        }

        public Criteria andOffxLessThanOrEqualTo(Double value) {
            addCriterion("offX <=", value, "offx");
            return (Criteria) this;
        }

        public Criteria andOffxIn(List<Double> values) {
            addCriterion("offX in", values, "offx");
            return (Criteria) this;
        }

        public Criteria andOffxNotIn(List<Double> values) {
            addCriterion("offX not in", values, "offx");
            return (Criteria) this;
        }

        public Criteria andOffxBetween(Double value1, Double value2) {
            addCriterion("offX between", value1, value2, "offx");
            return (Criteria) this;
        }

        public Criteria andOffxNotBetween(Double value1, Double value2) {
            addCriterion("offX not between", value1, value2, "offx");
            return (Criteria) this;
        }

        public Criteria andOffyIsNull() {
            addCriterion("offY is null");
            return (Criteria) this;
        }

        public Criteria andOffyIsNotNull() {
            addCriterion("offY is not null");
            return (Criteria) this;
        }

        public Criteria andOffyEqualTo(Double value) {
            addCriterion("offY =", value, "offy");
            return (Criteria) this;
        }

        public Criteria andOffyNotEqualTo(Double value) {
            addCriterion("offY <>", value, "offy");
            return (Criteria) this;
        }

        public Criteria andOffyGreaterThan(Double value) {
            addCriterion("offY >", value, "offy");
            return (Criteria) this;
        }

        public Criteria andOffyGreaterThanOrEqualTo(Double value) {
            addCriterion("offY >=", value, "offy");
            return (Criteria) this;
        }

        public Criteria andOffyLessThan(Double value) {
            addCriterion("offY <", value, "offy");
            return (Criteria) this;
        }

        public Criteria andOffyLessThanOrEqualTo(Double value) {
            addCriterion("offY <=", value, "offy");
            return (Criteria) this;
        }

        public Criteria andOffyIn(List<Double> values) {
            addCriterion("offY in", values, "offy");
            return (Criteria) this;
        }

        public Criteria andOffyNotIn(List<Double> values) {
            addCriterion("offY not in", values, "offy");
            return (Criteria) this;
        }

        public Criteria andOffyBetween(Double value1, Double value2) {
            addCriterion("offY between", value1, value2, "offy");
            return (Criteria) this;
        }

        public Criteria andOffyNotBetween(Double value1, Double value2) {
            addCriterion("offY not between", value1, value2, "offy");
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