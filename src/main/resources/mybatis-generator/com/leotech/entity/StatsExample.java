package com.leotech.entity;

import java.util.ArrayList;
import java.util.List;

public class StatsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatsExample() {
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

        public Criteria andTotaluIsNull() {
            addCriterion("totalU is null");
            return (Criteria) this;
        }

        public Criteria andTotaluIsNotNull() {
            addCriterion("totalU is not null");
            return (Criteria) this;
        }

        public Criteria andTotaluEqualTo(Integer value) {
            addCriterion("totalU =", value, "totalu");
            return (Criteria) this;
        }

        public Criteria andTotaluNotEqualTo(Integer value) {
            addCriterion("totalU <>", value, "totalu");
            return (Criteria) this;
        }

        public Criteria andTotaluGreaterThan(Integer value) {
            addCriterion("totalU >", value, "totalu");
            return (Criteria) this;
        }

        public Criteria andTotaluGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalU >=", value, "totalu");
            return (Criteria) this;
        }

        public Criteria andTotaluLessThan(Integer value) {
            addCriterion("totalU <", value, "totalu");
            return (Criteria) this;
        }

        public Criteria andTotaluLessThanOrEqualTo(Integer value) {
            addCriterion("totalU <=", value, "totalu");
            return (Criteria) this;
        }

        public Criteria andTotaluIn(List<Integer> values) {
            addCriterion("totalU in", values, "totalu");
            return (Criteria) this;
        }

        public Criteria andTotaluNotIn(List<Integer> values) {
            addCriterion("totalU not in", values, "totalu");
            return (Criteria) this;
        }

        public Criteria andTotaluBetween(Integer value1, Integer value2) {
            addCriterion("totalU between", value1, value2, "totalu");
            return (Criteria) this;
        }

        public Criteria andTotaluNotBetween(Integer value1, Integer value2) {
            addCriterion("totalU not between", value1, value2, "totalu");
            return (Criteria) this;
        }

        public Criteria andUseduIsNull() {
            addCriterion("usedU is null");
            return (Criteria) this;
        }

        public Criteria andUseduIsNotNull() {
            addCriterion("usedU is not null");
            return (Criteria) this;
        }

        public Criteria andUseduEqualTo(Integer value) {
            addCriterion("usedU =", value, "usedu");
            return (Criteria) this;
        }

        public Criteria andUseduNotEqualTo(Integer value) {
            addCriterion("usedU <>", value, "usedu");
            return (Criteria) this;
        }

        public Criteria andUseduGreaterThan(Integer value) {
            addCriterion("usedU >", value, "usedu");
            return (Criteria) this;
        }

        public Criteria andUseduGreaterThanOrEqualTo(Integer value) {
            addCriterion("usedU >=", value, "usedu");
            return (Criteria) this;
        }

        public Criteria andUseduLessThan(Integer value) {
            addCriterion("usedU <", value, "usedu");
            return (Criteria) this;
        }

        public Criteria andUseduLessThanOrEqualTo(Integer value) {
            addCriterion("usedU <=", value, "usedu");
            return (Criteria) this;
        }

        public Criteria andUseduIn(List<Integer> values) {
            addCriterion("usedU in", values, "usedu");
            return (Criteria) this;
        }

        public Criteria andUseduNotIn(List<Integer> values) {
            addCriterion("usedU not in", values, "usedu");
            return (Criteria) this;
        }

        public Criteria andUseduBetween(Integer value1, Integer value2) {
            addCriterion("usedU between", value1, value2, "usedu");
            return (Criteria) this;
        }

        public Criteria andUseduNotBetween(Integer value1, Integer value2) {
            addCriterion("usedU not between", value1, value2, "usedu");
            return (Criteria) this;
        }

        public Criteria andRemainuIsNull() {
            addCriterion("remainU is null");
            return (Criteria) this;
        }

        public Criteria andRemainuIsNotNull() {
            addCriterion("remainU is not null");
            return (Criteria) this;
        }

        public Criteria andRemainuEqualTo(Integer value) {
            addCriterion("remainU =", value, "remainu");
            return (Criteria) this;
        }

        public Criteria andRemainuNotEqualTo(Integer value) {
            addCriterion("remainU <>", value, "remainu");
            return (Criteria) this;
        }

        public Criteria andRemainuGreaterThan(Integer value) {
            addCriterion("remainU >", value, "remainu");
            return (Criteria) this;
        }

        public Criteria andRemainuGreaterThanOrEqualTo(Integer value) {
            addCriterion("remainU >=", value, "remainu");
            return (Criteria) this;
        }

        public Criteria andRemainuLessThan(Integer value) {
            addCriterion("remainU <", value, "remainu");
            return (Criteria) this;
        }

        public Criteria andRemainuLessThanOrEqualTo(Integer value) {
            addCriterion("remainU <=", value, "remainu");
            return (Criteria) this;
        }

        public Criteria andRemainuIn(List<Integer> values) {
            addCriterion("remainU in", values, "remainu");
            return (Criteria) this;
        }

        public Criteria andRemainuNotIn(List<Integer> values) {
            addCriterion("remainU not in", values, "remainu");
            return (Criteria) this;
        }

        public Criteria andRemainuBetween(Integer value1, Integer value2) {
            addCriterion("remainU between", value1, value2, "remainu");
            return (Criteria) this;
        }

        public Criteria andRemainuNotBetween(Integer value1, Integer value2) {
            addCriterion("remainU not between", value1, value2, "remainu");
            return (Criteria) this;
        }

        public Criteria andSpaceratioIsNull() {
            addCriterion("spaceRatio is null");
            return (Criteria) this;
        }

        public Criteria andSpaceratioIsNotNull() {
            addCriterion("spaceRatio is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceratioEqualTo(Double value) {
            addCriterion("spaceRatio =", value, "spaceratio");
            return (Criteria) this;
        }

        public Criteria andSpaceratioNotEqualTo(Double value) {
            addCriterion("spaceRatio <>", value, "spaceratio");
            return (Criteria) this;
        }

        public Criteria andSpaceratioGreaterThan(Double value) {
            addCriterion("spaceRatio >", value, "spaceratio");
            return (Criteria) this;
        }

        public Criteria andSpaceratioGreaterThanOrEqualTo(Double value) {
            addCriterion("spaceRatio >=", value, "spaceratio");
            return (Criteria) this;
        }

        public Criteria andSpaceratioLessThan(Double value) {
            addCriterion("spaceRatio <", value, "spaceratio");
            return (Criteria) this;
        }

        public Criteria andSpaceratioLessThanOrEqualTo(Double value) {
            addCriterion("spaceRatio <=", value, "spaceratio");
            return (Criteria) this;
        }

        public Criteria andSpaceratioIn(List<Double> values) {
            addCriterion("spaceRatio in", values, "spaceratio");
            return (Criteria) this;
        }

        public Criteria andSpaceratioNotIn(List<Double> values) {
            addCriterion("spaceRatio not in", values, "spaceratio");
            return (Criteria) this;
        }

        public Criteria andSpaceratioBetween(Double value1, Double value2) {
            addCriterion("spaceRatio between", value1, value2, "spaceratio");
            return (Criteria) this;
        }

        public Criteria andSpaceratioNotBetween(Double value1, Double value2) {
            addCriterion("spaceRatio not between", value1, value2, "spaceratio");
            return (Criteria) this;
        }

        public Criteria andMaxconsuIsNull() {
            addCriterion("maxConsU is null");
            return (Criteria) this;
        }

        public Criteria andMaxconsuIsNotNull() {
            addCriterion("maxConsU is not null");
            return (Criteria) this;
        }

        public Criteria andMaxconsuEqualTo(Integer value) {
            addCriterion("maxConsU =", value, "maxconsu");
            return (Criteria) this;
        }

        public Criteria andMaxconsuNotEqualTo(Integer value) {
            addCriterion("maxConsU <>", value, "maxconsu");
            return (Criteria) this;
        }

        public Criteria andMaxconsuGreaterThan(Integer value) {
            addCriterion("maxConsU >", value, "maxconsu");
            return (Criteria) this;
        }

        public Criteria andMaxconsuGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxConsU >=", value, "maxconsu");
            return (Criteria) this;
        }

        public Criteria andMaxconsuLessThan(Integer value) {
            addCriterion("maxConsU <", value, "maxconsu");
            return (Criteria) this;
        }

        public Criteria andMaxconsuLessThanOrEqualTo(Integer value) {
            addCriterion("maxConsU <=", value, "maxconsu");
            return (Criteria) this;
        }

        public Criteria andMaxconsuIn(List<Integer> values) {
            addCriterion("maxConsU in", values, "maxconsu");
            return (Criteria) this;
        }

        public Criteria andMaxconsuNotIn(List<Integer> values) {
            addCriterion("maxConsU not in", values, "maxconsu");
            return (Criteria) this;
        }

        public Criteria andMaxconsuBetween(Integer value1, Integer value2) {
            addCriterion("maxConsU between", value1, value2, "maxconsu");
            return (Criteria) this;
        }

        public Criteria andMaxconsuNotBetween(Integer value1, Integer value2) {
            addCriterion("maxConsU not between", value1, value2, "maxconsu");
            return (Criteria) this;
        }

        public Criteria andTotalcapIsNull() {
            addCriterion("totalCap is null");
            return (Criteria) this;
        }

        public Criteria andTotalcapIsNotNull() {
            addCriterion("totalCap is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcapEqualTo(Double value) {
            addCriterion("totalCap =", value, "totalcap");
            return (Criteria) this;
        }

        public Criteria andTotalcapNotEqualTo(Double value) {
            addCriterion("totalCap <>", value, "totalcap");
            return (Criteria) this;
        }

        public Criteria andTotalcapGreaterThan(Double value) {
            addCriterion("totalCap >", value, "totalcap");
            return (Criteria) this;
        }

        public Criteria andTotalcapGreaterThanOrEqualTo(Double value) {
            addCriterion("totalCap >=", value, "totalcap");
            return (Criteria) this;
        }

        public Criteria andTotalcapLessThan(Double value) {
            addCriterion("totalCap <", value, "totalcap");
            return (Criteria) this;
        }

        public Criteria andTotalcapLessThanOrEqualTo(Double value) {
            addCriterion("totalCap <=", value, "totalcap");
            return (Criteria) this;
        }

        public Criteria andTotalcapIn(List<Double> values) {
            addCriterion("totalCap in", values, "totalcap");
            return (Criteria) this;
        }

        public Criteria andTotalcapNotIn(List<Double> values) {
            addCriterion("totalCap not in", values, "totalcap");
            return (Criteria) this;
        }

        public Criteria andTotalcapBetween(Double value1, Double value2) {
            addCriterion("totalCap between", value1, value2, "totalcap");
            return (Criteria) this;
        }

        public Criteria andTotalcapNotBetween(Double value1, Double value2) {
            addCriterion("totalCap not between", value1, value2, "totalcap");
            return (Criteria) this;
        }

        public Criteria andUsedcapIsNull() {
            addCriterion("usedCap is null");
            return (Criteria) this;
        }

        public Criteria andUsedcapIsNotNull() {
            addCriterion("usedCap is not null");
            return (Criteria) this;
        }

        public Criteria andUsedcapEqualTo(Double value) {
            addCriterion("usedCap =", value, "usedcap");
            return (Criteria) this;
        }

        public Criteria andUsedcapNotEqualTo(Double value) {
            addCriterion("usedCap <>", value, "usedcap");
            return (Criteria) this;
        }

        public Criteria andUsedcapGreaterThan(Double value) {
            addCriterion("usedCap >", value, "usedcap");
            return (Criteria) this;
        }

        public Criteria andUsedcapGreaterThanOrEqualTo(Double value) {
            addCriterion("usedCap >=", value, "usedcap");
            return (Criteria) this;
        }

        public Criteria andUsedcapLessThan(Double value) {
            addCriterion("usedCap <", value, "usedcap");
            return (Criteria) this;
        }

        public Criteria andUsedcapLessThanOrEqualTo(Double value) {
            addCriterion("usedCap <=", value, "usedcap");
            return (Criteria) this;
        }

        public Criteria andUsedcapIn(List<Double> values) {
            addCriterion("usedCap in", values, "usedcap");
            return (Criteria) this;
        }

        public Criteria andUsedcapNotIn(List<Double> values) {
            addCriterion("usedCap not in", values, "usedcap");
            return (Criteria) this;
        }

        public Criteria andUsedcapBetween(Double value1, Double value2) {
            addCriterion("usedCap between", value1, value2, "usedcap");
            return (Criteria) this;
        }

        public Criteria andUsedcapNotBetween(Double value1, Double value2) {
            addCriterion("usedCap not between", value1, value2, "usedcap");
            return (Criteria) this;
        }

        public Criteria andRemaincapIsNull() {
            addCriterion("remainCap is null");
            return (Criteria) this;
        }

        public Criteria andRemaincapIsNotNull() {
            addCriterion("remainCap is not null");
            return (Criteria) this;
        }

        public Criteria andRemaincapEqualTo(Double value) {
            addCriterion("remainCap =", value, "remaincap");
            return (Criteria) this;
        }

        public Criteria andRemaincapNotEqualTo(Double value) {
            addCriterion("remainCap <>", value, "remaincap");
            return (Criteria) this;
        }

        public Criteria andRemaincapGreaterThan(Double value) {
            addCriterion("remainCap >", value, "remaincap");
            return (Criteria) this;
        }

        public Criteria andRemaincapGreaterThanOrEqualTo(Double value) {
            addCriterion("remainCap >=", value, "remaincap");
            return (Criteria) this;
        }

        public Criteria andRemaincapLessThan(Double value) {
            addCriterion("remainCap <", value, "remaincap");
            return (Criteria) this;
        }

        public Criteria andRemaincapLessThanOrEqualTo(Double value) {
            addCriterion("remainCap <=", value, "remaincap");
            return (Criteria) this;
        }

        public Criteria andRemaincapIn(List<Double> values) {
            addCriterion("remainCap in", values, "remaincap");
            return (Criteria) this;
        }

        public Criteria andRemaincapNotIn(List<Double> values) {
            addCriterion("remainCap not in", values, "remaincap");
            return (Criteria) this;
        }

        public Criteria andRemaincapBetween(Double value1, Double value2) {
            addCriterion("remainCap between", value1, value2, "remaincap");
            return (Criteria) this;
        }

        public Criteria andRemaincapNotBetween(Double value1, Double value2) {
            addCriterion("remainCap not between", value1, value2, "remaincap");
            return (Criteria) this;
        }

        public Criteria andLoadratioIsNull() {
            addCriterion("loadRatio is null");
            return (Criteria) this;
        }

        public Criteria andLoadratioIsNotNull() {
            addCriterion("loadRatio is not null");
            return (Criteria) this;
        }

        public Criteria andLoadratioEqualTo(Double value) {
            addCriterion("loadRatio =", value, "loadratio");
            return (Criteria) this;
        }

        public Criteria andLoadratioNotEqualTo(Double value) {
            addCriterion("loadRatio <>", value, "loadratio");
            return (Criteria) this;
        }

        public Criteria andLoadratioGreaterThan(Double value) {
            addCriterion("loadRatio >", value, "loadratio");
            return (Criteria) this;
        }

        public Criteria andLoadratioGreaterThanOrEqualTo(Double value) {
            addCriterion("loadRatio >=", value, "loadratio");
            return (Criteria) this;
        }

        public Criteria andLoadratioLessThan(Double value) {
            addCriterion("loadRatio <", value, "loadratio");
            return (Criteria) this;
        }

        public Criteria andLoadratioLessThanOrEqualTo(Double value) {
            addCriterion("loadRatio <=", value, "loadratio");
            return (Criteria) this;
        }

        public Criteria andLoadratioIn(List<Double> values) {
            addCriterion("loadRatio in", values, "loadratio");
            return (Criteria) this;
        }

        public Criteria andLoadratioNotIn(List<Double> values) {
            addCriterion("loadRatio not in", values, "loadratio");
            return (Criteria) this;
        }

        public Criteria andLoadratioBetween(Double value1, Double value2) {
            addCriterion("loadRatio between", value1, value2, "loadratio");
            return (Criteria) this;
        }

        public Criteria andLoadratioNotBetween(Double value1, Double value2) {
            addCriterion("loadRatio not between", value1, value2, "loadratio");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("areaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("areaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("areaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("areaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("areaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("areaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("areaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("areaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("areaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("areaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaName not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andSystemidIsNull() {
            addCriterion("systemId is null");
            return (Criteria) this;
        }

        public Criteria andSystemidIsNotNull() {
            addCriterion("systemId is not null");
            return (Criteria) this;
        }

        public Criteria andSystemidEqualTo(Integer value) {
            addCriterion("systemId =", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotEqualTo(Integer value) {
            addCriterion("systemId <>", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThan(Integer value) {
            addCriterion("systemId >", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("systemId >=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThan(Integer value) {
            addCriterion("systemId <", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThanOrEqualTo(Integer value) {
            addCriterion("systemId <=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidIn(List<Integer> values) {
            addCriterion("systemId in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotIn(List<Integer> values) {
            addCriterion("systemId not in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidBetween(Integer value1, Integer value2) {
            addCriterion("systemId between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotBetween(Integer value1, Integer value2) {
            addCriterion("systemId not between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemnameIsNull() {
            addCriterion("systemName is null");
            return (Criteria) this;
        }

        public Criteria andSystemnameIsNotNull() {
            addCriterion("systemName is not null");
            return (Criteria) this;
        }

        public Criteria andSystemnameEqualTo(String value) {
            addCriterion("systemName =", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotEqualTo(String value) {
            addCriterion("systemName <>", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameGreaterThan(String value) {
            addCriterion("systemName >", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameGreaterThanOrEqualTo(String value) {
            addCriterion("systemName >=", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLessThan(String value) {
            addCriterion("systemName <", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLessThanOrEqualTo(String value) {
            addCriterion("systemName <=", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLike(String value) {
            addCriterion("systemName like", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotLike(String value) {
            addCriterion("systemName not like", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameIn(List<String> values) {
            addCriterion("systemName in", values, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotIn(List<String> values) {
            addCriterion("systemName not in", values, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameBetween(String value1, String value2) {
            addCriterion("systemName between", value1, value2, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotBetween(String value1, String value2) {
            addCriterion("systemName not between", value1, value2, "systemname");
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