package com.leotech.entity;

public class Cable {
    private Integer id;

    private String name;

    private String fmcode;

    private String fmdevice;

    private String tocode;

    private String todevice;

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

    public String getFmcode() {
        return fmcode;
    }

    public void setFmcode(String fmcode) {
        this.fmcode = fmcode == null ? null : fmcode.trim();
    }

    public String getFmdevice() {
        return fmdevice;
    }

    public void setFmdevice(String fmdevice) {
        this.fmdevice = fmdevice == null ? null : fmdevice.trim();
    }

    public String getTocode() {
        return tocode;
    }

    public void setTocode(String tocode) {
        this.tocode = tocode == null ? null : tocode.trim();
    }

    public String getTodevice() {
        return todevice;
    }

    public void setTodevice(String todevice) {
        this.todevice = todevice == null ? null : todevice.trim();
    }
}