package com.leotech.entity;

public class GenText {
    private Integer id;

    private String name;

    private Integer isshow;

    private String font;

    private String color;

    private String text;

    private String labelids;

    private Double offx;

    private Double offy;

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

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font == null ? null : font.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getLabelids() {
        return labelids;
    }

    public void setLabelids(String labelids) {
        this.labelids = labelids == null ? null : labelids.trim();
    }

    public Double getOffx() {
        return offx;
    }

    public void setOffx(Double offx) {
        this.offx = offx;
    }

    public Double getOffy() {
        return offy;
    }

    public void setOffy(Double offy) {
        this.offy = offy;
    }
}