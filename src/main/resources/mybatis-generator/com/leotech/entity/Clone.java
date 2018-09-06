package com.leotech.entity;

public class Clone {
    private Integer id;

    private String name;

    private Integer isshow;

    private String refcode;

    private String copyfrom;

    private Double posX;

    private Double posY;

    private Double posZ;

    private Double rotX;

    private Double rotY;

    private Double rotZ;

    private Double sclX;

    private Double sclY;

    private Double sclZ;

    private String parent;

    private Integer isdirty;

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

    public String getRefcode() {
        return refcode;
    }

    public void setRefcode(String refcode) {
        this.refcode = refcode == null ? null : refcode.trim();
    }

    public String getCopyfrom() {
        return copyfrom;
    }

    public void setCopyfrom(String copyfrom) {
        this.copyfrom = copyfrom == null ? null : copyfrom.trim();
    }

    public Double getPosX() {
        return posX;
    }

    public void setPosX(Double posX) {
        this.posX = posX;
    }

    public Double getPosY() {
        return posY;
    }

    public void setPosY(Double posY) {
        this.posY = posY;
    }

    public Double getPosZ() {
        return posZ;
    }

    public void setPosZ(Double posZ) {
        this.posZ = posZ;
    }

    public Double getRotX() {
        return rotX;
    }

    public void setRotX(Double rotX) {
        this.rotX = rotX;
    }

    public Double getRotY() {
        return rotY;
    }

    public void setRotY(Double rotY) {
        this.rotY = rotY;
    }

    public Double getRotZ() {
        return rotZ;
    }

    public void setRotZ(Double rotZ) {
        this.rotZ = rotZ;
    }

    public Double getSclX() {
        return sclX;
    }

    public void setSclX(Double sclX) {
        this.sclX = sclX;
    }

    public Double getSclY() {
        return sclY;
    }

    public void setSclY(Double sclY) {
        this.sclY = sclY;
    }

    public Double getSclZ() {
        return sclZ;
    }

    public void setSclZ(Double sclZ) {
        this.sclZ = sclZ;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public Integer getIsdirty() {
        return isdirty;
    }

    public void setIsdirty(Integer isdirty) {
        this.isdirty = isdirty;
    }
}