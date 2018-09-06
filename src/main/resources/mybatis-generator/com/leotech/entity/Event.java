package com.leotech.entity;

public class Event {
    private Integer id;

    private String name;

    private Integer isshow;

    private String type;

    private String matchFunc;

    private String dealFunc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getMatchFunc() {
        return matchFunc;
    }

    public void setMatchFunc(String matchFunc) {
        this.matchFunc = matchFunc == null ? null : matchFunc.trim();
    }

    public String getDealFunc() {
        return dealFunc;
    }

    public void setDealFunc(String dealFunc) {
        this.dealFunc = dealFunc == null ? null : dealFunc.trim();
    }
}