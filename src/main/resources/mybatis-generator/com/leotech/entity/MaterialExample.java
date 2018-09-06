package com.leotech.entity;

import java.util.ArrayList;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andSkincolorIsNull() {
            addCriterion("skinColor is null");
            return (Criteria) this;
        }

        public Criteria andSkincolorIsNotNull() {
            addCriterion("skinColor is not null");
            return (Criteria) this;
        }

        public Criteria andSkincolorEqualTo(String value) {
            addCriterion("skinColor =", value, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorNotEqualTo(String value) {
            addCriterion("skinColor <>", value, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorGreaterThan(String value) {
            addCriterion("skinColor >", value, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorGreaterThanOrEqualTo(String value) {
            addCriterion("skinColor >=", value, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorLessThan(String value) {
            addCriterion("skinColor <", value, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorLessThanOrEqualTo(String value) {
            addCriterion("skinColor <=", value, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorLike(String value) {
            addCriterion("skinColor like", value, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorNotLike(String value) {
            addCriterion("skinColor not like", value, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorIn(List<String> values) {
            addCriterion("skinColor in", values, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorNotIn(List<String> values) {
            addCriterion("skinColor not in", values, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorBetween(String value1, String value2) {
            addCriterion("skinColor between", value1, value2, "skincolor");
            return (Criteria) this;
        }

        public Criteria andSkincolorNotBetween(String value1, String value2) {
            addCriterion("skinColor not between", value1, value2, "skincolor");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgurl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgurl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgurl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgurl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgurl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgurl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgurl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgurl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgurl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgurl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgurl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgurl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgurl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andIsrepeatIsNull() {
            addCriterion("isRepeat is null");
            return (Criteria) this;
        }

        public Criteria andIsrepeatIsNotNull() {
            addCriterion("isRepeat is not null");
            return (Criteria) this;
        }

        public Criteria andIsrepeatEqualTo(Integer value) {
            addCriterion("isRepeat =", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatNotEqualTo(Integer value) {
            addCriterion("isRepeat <>", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatGreaterThan(Integer value) {
            addCriterion("isRepeat >", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("isRepeat >=", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatLessThan(Integer value) {
            addCriterion("isRepeat <", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatLessThanOrEqualTo(Integer value) {
            addCriterion("isRepeat <=", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatIn(List<Integer> values) {
            addCriterion("isRepeat in", values, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatNotIn(List<Integer> values) {
            addCriterion("isRepeat not in", values, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatBetween(Integer value1, Integer value2) {
            addCriterion("isRepeat between", value1, value2, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatNotBetween(Integer value1, Integer value2) {
            addCriterion("isRepeat not between", value1, value2, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorIsNull() {
            addCriterion("skin_up_skinColor is null");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorIsNotNull() {
            addCriterion("skin_up_skinColor is not null");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorEqualTo(String value) {
            addCriterion("skin_up_skinColor =", value, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorNotEqualTo(String value) {
            addCriterion("skin_up_skinColor <>", value, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorGreaterThan(String value) {
            addCriterion("skin_up_skinColor >", value, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorGreaterThanOrEqualTo(String value) {
            addCriterion("skin_up_skinColor >=", value, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorLessThan(String value) {
            addCriterion("skin_up_skinColor <", value, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorLessThanOrEqualTo(String value) {
            addCriterion("skin_up_skinColor <=", value, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorLike(String value) {
            addCriterion("skin_up_skinColor like", value, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorNotLike(String value) {
            addCriterion("skin_up_skinColor not like", value, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorIn(List<String> values) {
            addCriterion("skin_up_skinColor in", values, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorNotIn(List<String> values) {
            addCriterion("skin_up_skinColor not in", values, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorBetween(String value1, String value2) {
            addCriterion("skin_up_skinColor between", value1, value2, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpSkincolorNotBetween(String value1, String value2) {
            addCriterion("skin_up_skinColor not between", value1, value2, "skinUpSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlIsNull() {
            addCriterion("skin_up_imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlIsNotNull() {
            addCriterion("skin_up_imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlEqualTo(String value) {
            addCriterion("skin_up_imgUrl =", value, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlNotEqualTo(String value) {
            addCriterion("skin_up_imgUrl <>", value, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlGreaterThan(String value) {
            addCriterion("skin_up_imgUrl >", value, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("skin_up_imgUrl >=", value, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlLessThan(String value) {
            addCriterion("skin_up_imgUrl <", value, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlLessThanOrEqualTo(String value) {
            addCriterion("skin_up_imgUrl <=", value, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlLike(String value) {
            addCriterion("skin_up_imgUrl like", value, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlNotLike(String value) {
            addCriterion("skin_up_imgUrl not like", value, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlIn(List<String> values) {
            addCriterion("skin_up_imgUrl in", values, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlNotIn(List<String> values) {
            addCriterion("skin_up_imgUrl not in", values, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlBetween(String value1, String value2) {
            addCriterion("skin_up_imgUrl between", value1, value2, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinUpImgurlNotBetween(String value1, String value2) {
            addCriterion("skin_up_imgUrl not between", value1, value2, "skinUpImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorIsNull() {
            addCriterion("skin_down_skinColor is null");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorIsNotNull() {
            addCriterion("skin_down_skinColor is not null");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorEqualTo(String value) {
            addCriterion("skin_down_skinColor =", value, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorNotEqualTo(String value) {
            addCriterion("skin_down_skinColor <>", value, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorGreaterThan(String value) {
            addCriterion("skin_down_skinColor >", value, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorGreaterThanOrEqualTo(String value) {
            addCriterion("skin_down_skinColor >=", value, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorLessThan(String value) {
            addCriterion("skin_down_skinColor <", value, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorLessThanOrEqualTo(String value) {
            addCriterion("skin_down_skinColor <=", value, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorLike(String value) {
            addCriterion("skin_down_skinColor like", value, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorNotLike(String value) {
            addCriterion("skin_down_skinColor not like", value, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorIn(List<String> values) {
            addCriterion("skin_down_skinColor in", values, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorNotIn(List<String> values) {
            addCriterion("skin_down_skinColor not in", values, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorBetween(String value1, String value2) {
            addCriterion("skin_down_skinColor between", value1, value2, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownSkincolorNotBetween(String value1, String value2) {
            addCriterion("skin_down_skinColor not between", value1, value2, "skinDownSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlIsNull() {
            addCriterion("skin_down_imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlIsNotNull() {
            addCriterion("skin_down_imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlEqualTo(String value) {
            addCriterion("skin_down_imgUrl =", value, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlNotEqualTo(String value) {
            addCriterion("skin_down_imgUrl <>", value, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlGreaterThan(String value) {
            addCriterion("skin_down_imgUrl >", value, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("skin_down_imgUrl >=", value, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlLessThan(String value) {
            addCriterion("skin_down_imgUrl <", value, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlLessThanOrEqualTo(String value) {
            addCriterion("skin_down_imgUrl <=", value, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlLike(String value) {
            addCriterion("skin_down_imgUrl like", value, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlNotLike(String value) {
            addCriterion("skin_down_imgUrl not like", value, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlIn(List<String> values) {
            addCriterion("skin_down_imgUrl in", values, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlNotIn(List<String> values) {
            addCriterion("skin_down_imgUrl not in", values, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlBetween(String value1, String value2) {
            addCriterion("skin_down_imgUrl between", value1, value2, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinDownImgurlNotBetween(String value1, String value2) {
            addCriterion("skin_down_imgUrl not between", value1, value2, "skinDownImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorIsNull() {
            addCriterion("skin_left_skinColor is null");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorIsNotNull() {
            addCriterion("skin_left_skinColor is not null");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorEqualTo(String value) {
            addCriterion("skin_left_skinColor =", value, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorNotEqualTo(String value) {
            addCriterion("skin_left_skinColor <>", value, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorGreaterThan(String value) {
            addCriterion("skin_left_skinColor >", value, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorGreaterThanOrEqualTo(String value) {
            addCriterion("skin_left_skinColor >=", value, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorLessThan(String value) {
            addCriterion("skin_left_skinColor <", value, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorLessThanOrEqualTo(String value) {
            addCriterion("skin_left_skinColor <=", value, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorLike(String value) {
            addCriterion("skin_left_skinColor like", value, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorNotLike(String value) {
            addCriterion("skin_left_skinColor not like", value, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorIn(List<String> values) {
            addCriterion("skin_left_skinColor in", values, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorNotIn(List<String> values) {
            addCriterion("skin_left_skinColor not in", values, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorBetween(String value1, String value2) {
            addCriterion("skin_left_skinColor between", value1, value2, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftSkincolorNotBetween(String value1, String value2) {
            addCriterion("skin_left_skinColor not between", value1, value2, "skinLeftSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlIsNull() {
            addCriterion("skin_left_imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlIsNotNull() {
            addCriterion("skin_left_imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlEqualTo(String value) {
            addCriterion("skin_left_imgUrl =", value, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlNotEqualTo(String value) {
            addCriterion("skin_left_imgUrl <>", value, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlGreaterThan(String value) {
            addCriterion("skin_left_imgUrl >", value, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("skin_left_imgUrl >=", value, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlLessThan(String value) {
            addCriterion("skin_left_imgUrl <", value, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlLessThanOrEqualTo(String value) {
            addCriterion("skin_left_imgUrl <=", value, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlLike(String value) {
            addCriterion("skin_left_imgUrl like", value, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlNotLike(String value) {
            addCriterion("skin_left_imgUrl not like", value, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlIn(List<String> values) {
            addCriterion("skin_left_imgUrl in", values, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlNotIn(List<String> values) {
            addCriterion("skin_left_imgUrl not in", values, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlBetween(String value1, String value2) {
            addCriterion("skin_left_imgUrl between", value1, value2, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinLeftImgurlNotBetween(String value1, String value2) {
            addCriterion("skin_left_imgUrl not between", value1, value2, "skinLeftImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorIsNull() {
            addCriterion("skin_right_skinColor is null");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorIsNotNull() {
            addCriterion("skin_right_skinColor is not null");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorEqualTo(String value) {
            addCriterion("skin_right_skinColor =", value, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorNotEqualTo(String value) {
            addCriterion("skin_right_skinColor <>", value, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorGreaterThan(String value) {
            addCriterion("skin_right_skinColor >", value, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorGreaterThanOrEqualTo(String value) {
            addCriterion("skin_right_skinColor >=", value, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorLessThan(String value) {
            addCriterion("skin_right_skinColor <", value, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorLessThanOrEqualTo(String value) {
            addCriterion("skin_right_skinColor <=", value, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorLike(String value) {
            addCriterion("skin_right_skinColor like", value, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorNotLike(String value) {
            addCriterion("skin_right_skinColor not like", value, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorIn(List<String> values) {
            addCriterion("skin_right_skinColor in", values, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorNotIn(List<String> values) {
            addCriterion("skin_right_skinColor not in", values, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorBetween(String value1, String value2) {
            addCriterion("skin_right_skinColor between", value1, value2, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightSkincolorNotBetween(String value1, String value2) {
            addCriterion("skin_right_skinColor not between", value1, value2, "skinRightSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlIsNull() {
            addCriterion("skin_right_imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlIsNotNull() {
            addCriterion("skin_right_imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlEqualTo(String value) {
            addCriterion("skin_right_imgUrl =", value, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlNotEqualTo(String value) {
            addCriterion("skin_right_imgUrl <>", value, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlGreaterThan(String value) {
            addCriterion("skin_right_imgUrl >", value, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("skin_right_imgUrl >=", value, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlLessThan(String value) {
            addCriterion("skin_right_imgUrl <", value, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlLessThanOrEqualTo(String value) {
            addCriterion("skin_right_imgUrl <=", value, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlLike(String value) {
            addCriterion("skin_right_imgUrl like", value, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlNotLike(String value) {
            addCriterion("skin_right_imgUrl not like", value, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlIn(List<String> values) {
            addCriterion("skin_right_imgUrl in", values, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlNotIn(List<String> values) {
            addCriterion("skin_right_imgUrl not in", values, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlBetween(String value1, String value2) {
            addCriterion("skin_right_imgUrl between", value1, value2, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinRightImgurlNotBetween(String value1, String value2) {
            addCriterion("skin_right_imgUrl not between", value1, value2, "skinRightImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorIsNull() {
            addCriterion("skin_fore_skinColor is null");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorIsNotNull() {
            addCriterion("skin_fore_skinColor is not null");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorEqualTo(String value) {
            addCriterion("skin_fore_skinColor =", value, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorNotEqualTo(String value) {
            addCriterion("skin_fore_skinColor <>", value, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorGreaterThan(String value) {
            addCriterion("skin_fore_skinColor >", value, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorGreaterThanOrEqualTo(String value) {
            addCriterion("skin_fore_skinColor >=", value, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorLessThan(String value) {
            addCriterion("skin_fore_skinColor <", value, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorLessThanOrEqualTo(String value) {
            addCriterion("skin_fore_skinColor <=", value, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorLike(String value) {
            addCriterion("skin_fore_skinColor like", value, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorNotLike(String value) {
            addCriterion("skin_fore_skinColor not like", value, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorIn(List<String> values) {
            addCriterion("skin_fore_skinColor in", values, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorNotIn(List<String> values) {
            addCriterion("skin_fore_skinColor not in", values, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorBetween(String value1, String value2) {
            addCriterion("skin_fore_skinColor between", value1, value2, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeSkincolorNotBetween(String value1, String value2) {
            addCriterion("skin_fore_skinColor not between", value1, value2, "skinForeSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlIsNull() {
            addCriterion("skin_fore_imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlIsNotNull() {
            addCriterion("skin_fore_imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlEqualTo(String value) {
            addCriterion("skin_fore_imgUrl =", value, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlNotEqualTo(String value) {
            addCriterion("skin_fore_imgUrl <>", value, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlGreaterThan(String value) {
            addCriterion("skin_fore_imgUrl >", value, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("skin_fore_imgUrl >=", value, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlLessThan(String value) {
            addCriterion("skin_fore_imgUrl <", value, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlLessThanOrEqualTo(String value) {
            addCriterion("skin_fore_imgUrl <=", value, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlLike(String value) {
            addCriterion("skin_fore_imgUrl like", value, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlNotLike(String value) {
            addCriterion("skin_fore_imgUrl not like", value, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlIn(List<String> values) {
            addCriterion("skin_fore_imgUrl in", values, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlNotIn(List<String> values) {
            addCriterion("skin_fore_imgUrl not in", values, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlBetween(String value1, String value2) {
            addCriterion("skin_fore_imgUrl between", value1, value2, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinForeImgurlNotBetween(String value1, String value2) {
            addCriterion("skin_fore_imgUrl not between", value1, value2, "skinForeImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorIsNull() {
            addCriterion("skin_back_skinColor is null");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorIsNotNull() {
            addCriterion("skin_back_skinColor is not null");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorEqualTo(String value) {
            addCriterion("skin_back_skinColor =", value, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorNotEqualTo(String value) {
            addCriterion("skin_back_skinColor <>", value, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorGreaterThan(String value) {
            addCriterion("skin_back_skinColor >", value, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorGreaterThanOrEqualTo(String value) {
            addCriterion("skin_back_skinColor >=", value, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorLessThan(String value) {
            addCriterion("skin_back_skinColor <", value, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorLessThanOrEqualTo(String value) {
            addCriterion("skin_back_skinColor <=", value, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorLike(String value) {
            addCriterion("skin_back_skinColor like", value, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorNotLike(String value) {
            addCriterion("skin_back_skinColor not like", value, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorIn(List<String> values) {
            addCriterion("skin_back_skinColor in", values, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorNotIn(List<String> values) {
            addCriterion("skin_back_skinColor not in", values, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorBetween(String value1, String value2) {
            addCriterion("skin_back_skinColor between", value1, value2, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackSkincolorNotBetween(String value1, String value2) {
            addCriterion("skin_back_skinColor not between", value1, value2, "skinBackSkincolor");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlIsNull() {
            addCriterion("skin_back_imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlIsNotNull() {
            addCriterion("skin_back_imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlEqualTo(String value) {
            addCriterion("skin_back_imgUrl =", value, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlNotEqualTo(String value) {
            addCriterion("skin_back_imgUrl <>", value, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlGreaterThan(String value) {
            addCriterion("skin_back_imgUrl >", value, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("skin_back_imgUrl >=", value, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlLessThan(String value) {
            addCriterion("skin_back_imgUrl <", value, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlLessThanOrEqualTo(String value) {
            addCriterion("skin_back_imgUrl <=", value, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlLike(String value) {
            addCriterion("skin_back_imgUrl like", value, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlNotLike(String value) {
            addCriterion("skin_back_imgUrl not like", value, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlIn(List<String> values) {
            addCriterion("skin_back_imgUrl in", values, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlNotIn(List<String> values) {
            addCriterion("skin_back_imgUrl not in", values, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlBetween(String value1, String value2) {
            addCriterion("skin_back_imgUrl between", value1, value2, "skinBackImgurl");
            return (Criteria) this;
        }

        public Criteria andSkinBackImgurlNotBetween(String value1, String value2) {
            addCriterion("skin_back_imgUrl not between", value1, value2, "skinBackImgurl");
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