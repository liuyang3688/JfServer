package com.leotech.entity;

public class Mesh {
    private Integer id;

    private String name;

    private String type;

    private Integer isshow;

    private Double length;

    private Double width;

    private Double height;

    private Double posX;

    private Double posY;

    private Double posZ;

    private Double rotX;

    private Double rotY;

    private Double rotZ;

    private Double sclX;

    private Double sclY;

    private Double sclZ;

    private Integer transparent;

    private Double opacity;

    private Integer material;

    private String parent;

    private String opcode;

    private Byte isdirty;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
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

    public Integer getTransparent() {
        return transparent;
    }

    public void setTransparent(Integer transparent) {
        this.transparent = transparent;
    }

    public Double getOpacity() {
        return opacity;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    public Integer getMaterial() {
        return material;
    }

    public void setMaterial(Integer material) {
        this.material = material;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public String getOpcode() {
        return opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode == null ? null : opcode.trim();
    }

    public Byte getIsdirty() {
        return isdirty;
    }

    public void setIsdirty(Byte isdirty) {
        this.isdirty = isdirty;
    }
}