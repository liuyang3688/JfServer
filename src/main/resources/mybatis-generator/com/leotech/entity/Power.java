package com.leotech.entity;

public class Power {
    private Integer id;

    private String name;

    private Integer isshow;

    private Integer type;

    private String from;

    private String fromdevice;

    private String to;

    private String todevice;

    private Double radius;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getFromdevice() {
        return fromdevice;
    }

    public void setFromdevice(String fromdevice) {
        this.fromdevice = fromdevice == null ? null : fromdevice.trim();
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    public String getTodevice() {
        return todevice;
    }

    public void setTodevice(String todevice) {
        this.todevice = todevice == null ? null : todevice.trim();
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}