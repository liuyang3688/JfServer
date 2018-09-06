package com.leotech.entity;

import java.util.ArrayList;
import java.util.List;

public class CloneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CloneExample() {
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

        public Criteria andRefcodeIsNull() {
            addCriterion("refCode is null");
            return (Criteria) this;
        }

        public Criteria andRefcodeIsNotNull() {
            addCriterion("refCode is not null");
            return (Criteria) this;
        }

        public Criteria andRefcodeEqualTo(String value) {
            addCriterion("refCode =", value, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeNotEqualTo(String value) {
            addCriterion("refCode <>", value, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeGreaterThan(String value) {
            addCriterion("refCode >", value, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeGreaterThanOrEqualTo(String value) {
            addCriterion("refCode >=", value, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeLessThan(String value) {
            addCriterion("refCode <", value, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeLessThanOrEqualTo(String value) {
            addCriterion("refCode <=", value, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeLike(String value) {
            addCriterion("refCode like", value, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeNotLike(String value) {
            addCriterion("refCode not like", value, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeIn(List<String> values) {
            addCriterion("refCode in", values, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeNotIn(List<String> values) {
            addCriterion("refCode not in", values, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeBetween(String value1, String value2) {
            addCriterion("refCode between", value1, value2, "refcode");
            return (Criteria) this;
        }

        public Criteria andRefcodeNotBetween(String value1, String value2) {
            addCriterion("refCode not between", value1, value2, "refcode");
            return (Criteria) this;
        }

        public Criteria andCopyfromIsNull() {
            addCriterion("copyfrom is null");
            return (Criteria) this;
        }

        public Criteria andCopyfromIsNotNull() {
            addCriterion("copyfrom is not null");
            return (Criteria) this;
        }

        public Criteria andCopyfromEqualTo(String value) {
            addCriterion("copyfrom =", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotEqualTo(String value) {
            addCriterion("copyfrom <>", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromGreaterThan(String value) {
            addCriterion("copyfrom >", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromGreaterThanOrEqualTo(String value) {
            addCriterion("copyfrom >=", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromLessThan(String value) {
            addCriterion("copyfrom <", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromLessThanOrEqualTo(String value) {
            addCriterion("copyfrom <=", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromLike(String value) {
            addCriterion("copyfrom like", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotLike(String value) {
            addCriterion("copyfrom not like", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromIn(List<String> values) {
            addCriterion("copyfrom in", values, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotIn(List<String> values) {
            addCriterion("copyfrom not in", values, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromBetween(String value1, String value2) {
            addCriterion("copyfrom between", value1, value2, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotBetween(String value1, String value2) {
            addCriterion("copyfrom not between", value1, value2, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andPosXIsNull() {
            addCriterion("pos_x is null");
            return (Criteria) this;
        }

        public Criteria andPosXIsNotNull() {
            addCriterion("pos_x is not null");
            return (Criteria) this;
        }

        public Criteria andPosXEqualTo(Double value) {
            addCriterion("pos_x =", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXNotEqualTo(Double value) {
            addCriterion("pos_x <>", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXGreaterThan(Double value) {
            addCriterion("pos_x >", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXGreaterThanOrEqualTo(Double value) {
            addCriterion("pos_x >=", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXLessThan(Double value) {
            addCriterion("pos_x <", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXLessThanOrEqualTo(Double value) {
            addCriterion("pos_x <=", value, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXIn(List<Double> values) {
            addCriterion("pos_x in", values, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXNotIn(List<Double> values) {
            addCriterion("pos_x not in", values, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXBetween(Double value1, Double value2) {
            addCriterion("pos_x between", value1, value2, "posX");
            return (Criteria) this;
        }

        public Criteria andPosXNotBetween(Double value1, Double value2) {
            addCriterion("pos_x not between", value1, value2, "posX");
            return (Criteria) this;
        }

        public Criteria andPosYIsNull() {
            addCriterion("pos_y is null");
            return (Criteria) this;
        }

        public Criteria andPosYIsNotNull() {
            addCriterion("pos_y is not null");
            return (Criteria) this;
        }

        public Criteria andPosYEqualTo(Double value) {
            addCriterion("pos_y =", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYNotEqualTo(Double value) {
            addCriterion("pos_y <>", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYGreaterThan(Double value) {
            addCriterion("pos_y >", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYGreaterThanOrEqualTo(Double value) {
            addCriterion("pos_y >=", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYLessThan(Double value) {
            addCriterion("pos_y <", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYLessThanOrEqualTo(Double value) {
            addCriterion("pos_y <=", value, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYIn(List<Double> values) {
            addCriterion("pos_y in", values, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYNotIn(List<Double> values) {
            addCriterion("pos_y not in", values, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYBetween(Double value1, Double value2) {
            addCriterion("pos_y between", value1, value2, "posY");
            return (Criteria) this;
        }

        public Criteria andPosYNotBetween(Double value1, Double value2) {
            addCriterion("pos_y not between", value1, value2, "posY");
            return (Criteria) this;
        }

        public Criteria andPosZIsNull() {
            addCriterion("pos_z is null");
            return (Criteria) this;
        }

        public Criteria andPosZIsNotNull() {
            addCriterion("pos_z is not null");
            return (Criteria) this;
        }

        public Criteria andPosZEqualTo(Double value) {
            addCriterion("pos_z =", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZNotEqualTo(Double value) {
            addCriterion("pos_z <>", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZGreaterThan(Double value) {
            addCriterion("pos_z >", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZGreaterThanOrEqualTo(Double value) {
            addCriterion("pos_z >=", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZLessThan(Double value) {
            addCriterion("pos_z <", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZLessThanOrEqualTo(Double value) {
            addCriterion("pos_z <=", value, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZIn(List<Double> values) {
            addCriterion("pos_z in", values, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZNotIn(List<Double> values) {
            addCriterion("pos_z not in", values, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZBetween(Double value1, Double value2) {
            addCriterion("pos_z between", value1, value2, "posZ");
            return (Criteria) this;
        }

        public Criteria andPosZNotBetween(Double value1, Double value2) {
            addCriterion("pos_z not between", value1, value2, "posZ");
            return (Criteria) this;
        }

        public Criteria andRotXIsNull() {
            addCriterion("rot_x is null");
            return (Criteria) this;
        }

        public Criteria andRotXIsNotNull() {
            addCriterion("rot_x is not null");
            return (Criteria) this;
        }

        public Criteria andRotXEqualTo(Double value) {
            addCriterion("rot_x =", value, "rotX");
            return (Criteria) this;
        }

        public Criteria andRotXNotEqualTo(Double value) {
            addCriterion("rot_x <>", value, "rotX");
            return (Criteria) this;
        }

        public Criteria andRotXGreaterThan(Double value) {
            addCriterion("rot_x >", value, "rotX");
            return (Criteria) this;
        }

        public Criteria andRotXGreaterThanOrEqualTo(Double value) {
            addCriterion("rot_x >=", value, "rotX");
            return (Criteria) this;
        }

        public Criteria andRotXLessThan(Double value) {
            addCriterion("rot_x <", value, "rotX");
            return (Criteria) this;
        }

        public Criteria andRotXLessThanOrEqualTo(Double value) {
            addCriterion("rot_x <=", value, "rotX");
            return (Criteria) this;
        }

        public Criteria andRotXIn(List<Double> values) {
            addCriterion("rot_x in", values, "rotX");
            return (Criteria) this;
        }

        public Criteria andRotXNotIn(List<Double> values) {
            addCriterion("rot_x not in", values, "rotX");
            return (Criteria) this;
        }

        public Criteria andRotXBetween(Double value1, Double value2) {
            addCriterion("rot_x between", value1, value2, "rotX");
            return (Criteria) this;
        }

        public Criteria andRotXNotBetween(Double value1, Double value2) {
            addCriterion("rot_x not between", value1, value2, "rotX");
            return (Criteria) this;
        }

        public Criteria andRotYIsNull() {
            addCriterion("rot_y is null");
            return (Criteria) this;
        }

        public Criteria andRotYIsNotNull() {
            addCriterion("rot_y is not null");
            return (Criteria) this;
        }

        public Criteria andRotYEqualTo(Double value) {
            addCriterion("rot_y =", value, "rotY");
            return (Criteria) this;
        }

        public Criteria andRotYNotEqualTo(Double value) {
            addCriterion("rot_y <>", value, "rotY");
            return (Criteria) this;
        }

        public Criteria andRotYGreaterThan(Double value) {
            addCriterion("rot_y >", value, "rotY");
            return (Criteria) this;
        }

        public Criteria andRotYGreaterThanOrEqualTo(Double value) {
            addCriterion("rot_y >=", value, "rotY");
            return (Criteria) this;
        }

        public Criteria andRotYLessThan(Double value) {
            addCriterion("rot_y <", value, "rotY");
            return (Criteria) this;
        }

        public Criteria andRotYLessThanOrEqualTo(Double value) {
            addCriterion("rot_y <=", value, "rotY");
            return (Criteria) this;
        }

        public Criteria andRotYIn(List<Double> values) {
            addCriterion("rot_y in", values, "rotY");
            return (Criteria) this;
        }

        public Criteria andRotYNotIn(List<Double> values) {
            addCriterion("rot_y not in", values, "rotY");
            return (Criteria) this;
        }

        public Criteria andRotYBetween(Double value1, Double value2) {
            addCriterion("rot_y between", value1, value2, "rotY");
            return (Criteria) this;
        }

        public Criteria andRotYNotBetween(Double value1, Double value2) {
            addCriterion("rot_y not between", value1, value2, "rotY");
            return (Criteria) this;
        }

        public Criteria andRotZIsNull() {
            addCriterion("rot_z is null");
            return (Criteria) this;
        }

        public Criteria andRotZIsNotNull() {
            addCriterion("rot_z is not null");
            return (Criteria) this;
        }

        public Criteria andRotZEqualTo(Double value) {
            addCriterion("rot_z =", value, "rotZ");
            return (Criteria) this;
        }

        public Criteria andRotZNotEqualTo(Double value) {
            addCriterion("rot_z <>", value, "rotZ");
            return (Criteria) this;
        }

        public Criteria andRotZGreaterThan(Double value) {
            addCriterion("rot_z >", value, "rotZ");
            return (Criteria) this;
        }

        public Criteria andRotZGreaterThanOrEqualTo(Double value) {
            addCriterion("rot_z >=", value, "rotZ");
            return (Criteria) this;
        }

        public Criteria andRotZLessThan(Double value) {
            addCriterion("rot_z <", value, "rotZ");
            return (Criteria) this;
        }

        public Criteria andRotZLessThanOrEqualTo(Double value) {
            addCriterion("rot_z <=", value, "rotZ");
            return (Criteria) this;
        }

        public Criteria andRotZIn(List<Double> values) {
            addCriterion("rot_z in", values, "rotZ");
            return (Criteria) this;
        }

        public Criteria andRotZNotIn(List<Double> values) {
            addCriterion("rot_z not in", values, "rotZ");
            return (Criteria) this;
        }

        public Criteria andRotZBetween(Double value1, Double value2) {
            addCriterion("rot_z between", value1, value2, "rotZ");
            return (Criteria) this;
        }

        public Criteria andRotZNotBetween(Double value1, Double value2) {
            addCriterion("rot_z not between", value1, value2, "rotZ");
            return (Criteria) this;
        }

        public Criteria andSclXIsNull() {
            addCriterion("scl_x is null");
            return (Criteria) this;
        }

        public Criteria andSclXIsNotNull() {
            addCriterion("scl_x is not null");
            return (Criteria) this;
        }

        public Criteria andSclXEqualTo(Double value) {
            addCriterion("scl_x =", value, "sclX");
            return (Criteria) this;
        }

        public Criteria andSclXNotEqualTo(Double value) {
            addCriterion("scl_x <>", value, "sclX");
            return (Criteria) this;
        }

        public Criteria andSclXGreaterThan(Double value) {
            addCriterion("scl_x >", value, "sclX");
            return (Criteria) this;
        }

        public Criteria andSclXGreaterThanOrEqualTo(Double value) {
            addCriterion("scl_x >=", value, "sclX");
            return (Criteria) this;
        }

        public Criteria andSclXLessThan(Double value) {
            addCriterion("scl_x <", value, "sclX");
            return (Criteria) this;
        }

        public Criteria andSclXLessThanOrEqualTo(Double value) {
            addCriterion("scl_x <=", value, "sclX");
            return (Criteria) this;
        }

        public Criteria andSclXIn(List<Double> values) {
            addCriterion("scl_x in", values, "sclX");
            return (Criteria) this;
        }

        public Criteria andSclXNotIn(List<Double> values) {
            addCriterion("scl_x not in", values, "sclX");
            return (Criteria) this;
        }

        public Criteria andSclXBetween(Double value1, Double value2) {
            addCriterion("scl_x between", value1, value2, "sclX");
            return (Criteria) this;
        }

        public Criteria andSclXNotBetween(Double value1, Double value2) {
            addCriterion("scl_x not between", value1, value2, "sclX");
            return (Criteria) this;
        }

        public Criteria andSclYIsNull() {
            addCriterion("scl_y is null");
            return (Criteria) this;
        }

        public Criteria andSclYIsNotNull() {
            addCriterion("scl_y is not null");
            return (Criteria) this;
        }

        public Criteria andSclYEqualTo(Double value) {
            addCriterion("scl_y =", value, "sclY");
            return (Criteria) this;
        }

        public Criteria andSclYNotEqualTo(Double value) {
            addCriterion("scl_y <>", value, "sclY");
            return (Criteria) this;
        }

        public Criteria andSclYGreaterThan(Double value) {
            addCriterion("scl_y >", value, "sclY");
            return (Criteria) this;
        }

        public Criteria andSclYGreaterThanOrEqualTo(Double value) {
            addCriterion("scl_y >=", value, "sclY");
            return (Criteria) this;
        }

        public Criteria andSclYLessThan(Double value) {
            addCriterion("scl_y <", value, "sclY");
            return (Criteria) this;
        }

        public Criteria andSclYLessThanOrEqualTo(Double value) {
            addCriterion("scl_y <=", value, "sclY");
            return (Criteria) this;
        }

        public Criteria andSclYIn(List<Double> values) {
            addCriterion("scl_y in", values, "sclY");
            return (Criteria) this;
        }

        public Criteria andSclYNotIn(List<Double> values) {
            addCriterion("scl_y not in", values, "sclY");
            return (Criteria) this;
        }

        public Criteria andSclYBetween(Double value1, Double value2) {
            addCriterion("scl_y between", value1, value2, "sclY");
            return (Criteria) this;
        }

        public Criteria andSclYNotBetween(Double value1, Double value2) {
            addCriterion("scl_y not between", value1, value2, "sclY");
            return (Criteria) this;
        }

        public Criteria andSclZIsNull() {
            addCriterion("scl_z is null");
            return (Criteria) this;
        }

        public Criteria andSclZIsNotNull() {
            addCriterion("scl_z is not null");
            return (Criteria) this;
        }

        public Criteria andSclZEqualTo(Double value) {
            addCriterion("scl_z =", value, "sclZ");
            return (Criteria) this;
        }

        public Criteria andSclZNotEqualTo(Double value) {
            addCriterion("scl_z <>", value, "sclZ");
            return (Criteria) this;
        }

        public Criteria andSclZGreaterThan(Double value) {
            addCriterion("scl_z >", value, "sclZ");
            return (Criteria) this;
        }

        public Criteria andSclZGreaterThanOrEqualTo(Double value) {
            addCriterion("scl_z >=", value, "sclZ");
            return (Criteria) this;
        }

        public Criteria andSclZLessThan(Double value) {
            addCriterion("scl_z <", value, "sclZ");
            return (Criteria) this;
        }

        public Criteria andSclZLessThanOrEqualTo(Double value) {
            addCriterion("scl_z <=", value, "sclZ");
            return (Criteria) this;
        }

        public Criteria andSclZIn(List<Double> values) {
            addCriterion("scl_z in", values, "sclZ");
            return (Criteria) this;
        }

        public Criteria andSclZNotIn(List<Double> values) {
            addCriterion("scl_z not in", values, "sclZ");
            return (Criteria) this;
        }

        public Criteria andSclZBetween(Double value1, Double value2) {
            addCriterion("scl_z between", value1, value2, "sclZ");
            return (Criteria) this;
        }

        public Criteria andSclZNotBetween(Double value1, Double value2) {
            addCriterion("scl_z not between", value1, value2, "sclZ");
            return (Criteria) this;
        }

        public Criteria andParentIsNull() {
            addCriterion("parent is null");
            return (Criteria) this;
        }

        public Criteria andParentIsNotNull() {
            addCriterion("parent is not null");
            return (Criteria) this;
        }

        public Criteria andParentEqualTo(String value) {
            addCriterion("parent =", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotEqualTo(String value) {
            addCriterion("parent <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThan(String value) {
            addCriterion("parent >", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThanOrEqualTo(String value) {
            addCriterion("parent >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThan(String value) {
            addCriterion("parent <", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThanOrEqualTo(String value) {
            addCriterion("parent <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLike(String value) {
            addCriterion("parent like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotLike(String value) {
            addCriterion("parent not like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentIn(List<String> values) {
            addCriterion("parent in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotIn(List<String> values) {
            addCriterion("parent not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentBetween(String value1, String value2) {
            addCriterion("parent between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotBetween(String value1, String value2) {
            addCriterion("parent not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andIsdirtyIsNull() {
            addCriterion("isDirty is null");
            return (Criteria) this;
        }

        public Criteria andIsdirtyIsNotNull() {
            addCriterion("isDirty is not null");
            return (Criteria) this;
        }

        public Criteria andIsdirtyEqualTo(Integer value) {
            addCriterion("isDirty =", value, "isdirty");
            return (Criteria) this;
        }

        public Criteria andIsdirtyNotEqualTo(Integer value) {
            addCriterion("isDirty <>", value, "isdirty");
            return (Criteria) this;
        }

        public Criteria andIsdirtyGreaterThan(Integer value) {
            addCriterion("isDirty >", value, "isdirty");
            return (Criteria) this;
        }

        public Criteria andIsdirtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDirty >=", value, "isdirty");
            return (Criteria) this;
        }

        public Criteria andIsdirtyLessThan(Integer value) {
            addCriterion("isDirty <", value, "isdirty");
            return (Criteria) this;
        }

        public Criteria andIsdirtyLessThanOrEqualTo(Integer value) {
            addCriterion("isDirty <=", value, "isdirty");
            return (Criteria) this;
        }

        public Criteria andIsdirtyIn(List<Integer> values) {
            addCriterion("isDirty in", values, "isdirty");
            return (Criteria) this;
        }

        public Criteria andIsdirtyNotIn(List<Integer> values) {
            addCriterion("isDirty not in", values, "isdirty");
            return (Criteria) this;
        }

        public Criteria andIsdirtyBetween(Integer value1, Integer value2) {
            addCriterion("isDirty between", value1, value2, "isdirty");
            return (Criteria) this;
        }

        public Criteria andIsdirtyNotBetween(Integer value1, Integer value2) {
            addCriterion("isDirty not between", value1, value2, "isdirty");
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