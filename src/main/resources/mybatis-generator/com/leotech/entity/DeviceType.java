package com.leotech.entity;

public class DeviceType {
    private Integer id;

    private String name;

    private String tpl;

    private Integer ethrowcount;

    private Integer ethcolcount;

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

    public String getTpl() {
        return tpl;
    }

    public void setTpl(String tpl) {
        this.tpl = tpl == null ? null : tpl.trim();
    }

    public Integer getEthrowcount() {
        return ethrowcount;
    }

    public void setEthrowcount(Integer ethrowcount) {
        this.ethrowcount = ethrowcount;
    }

    public Integer getEthcolcount() {
        return ethcolcount;
    }

    public void setEthcolcount(Integer ethcolcount) {
        this.ethcolcount = ethcolcount;
    }
}