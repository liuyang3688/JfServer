package com.leotech.entity;

public class Material {
    private Integer id;

    private String name;

    private String skincolor;

    private String imgurl;

    private Integer isrepeat;

    private String skinUpSkincolor;

    private String skinUpImgurl;

    private String skinDownSkincolor;

    private String skinDownImgurl;

    private String skinLeftSkincolor;

    private String skinLeftImgurl;

    private String skinRightSkincolor;

    private String skinRightImgurl;

    private String skinForeSkincolor;

    private String skinForeImgurl;

    private String skinBackSkincolor;

    private String skinBackImgurl;

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

    public String getSkincolor() {
        return skincolor;
    }

    public void setSkincolor(String skincolor) {
        this.skincolor = skincolor == null ? null : skincolor.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getIsrepeat() {
        return isrepeat;
    }

    public void setIsrepeat(Integer isrepeat) {
        this.isrepeat = isrepeat;
    }

    public String getSkinUpSkincolor() {
        return skinUpSkincolor;
    }

    public void setSkinUpSkincolor(String skinUpSkincolor) {
        this.skinUpSkincolor = skinUpSkincolor == null ? null : skinUpSkincolor.trim();
    }

    public String getSkinUpImgurl() {
        return skinUpImgurl;
    }

    public void setSkinUpImgurl(String skinUpImgurl) {
        this.skinUpImgurl = skinUpImgurl == null ? null : skinUpImgurl.trim();
    }

    public String getSkinDownSkincolor() {
        return skinDownSkincolor;
    }

    public void setSkinDownSkincolor(String skinDownSkincolor) {
        this.skinDownSkincolor = skinDownSkincolor == null ? null : skinDownSkincolor.trim();
    }

    public String getSkinDownImgurl() {
        return skinDownImgurl;
    }

    public void setSkinDownImgurl(String skinDownImgurl) {
        this.skinDownImgurl = skinDownImgurl == null ? null : skinDownImgurl.trim();
    }

    public String getSkinLeftSkincolor() {
        return skinLeftSkincolor;
    }

    public void setSkinLeftSkincolor(String skinLeftSkincolor) {
        this.skinLeftSkincolor = skinLeftSkincolor == null ? null : skinLeftSkincolor.trim();
    }

    public String getSkinLeftImgurl() {
        return skinLeftImgurl;
    }

    public void setSkinLeftImgurl(String skinLeftImgurl) {
        this.skinLeftImgurl = skinLeftImgurl == null ? null : skinLeftImgurl.trim();
    }

    public String getSkinRightSkincolor() {
        return skinRightSkincolor;
    }

    public void setSkinRightSkincolor(String skinRightSkincolor) {
        this.skinRightSkincolor = skinRightSkincolor == null ? null : skinRightSkincolor.trim();
    }

    public String getSkinRightImgurl() {
        return skinRightImgurl;
    }

    public void setSkinRightImgurl(String skinRightImgurl) {
        this.skinRightImgurl = skinRightImgurl == null ? null : skinRightImgurl.trim();
    }

    public String getSkinForeSkincolor() {
        return skinForeSkincolor;
    }

    public void setSkinForeSkincolor(String skinForeSkincolor) {
        this.skinForeSkincolor = skinForeSkincolor == null ? null : skinForeSkincolor.trim();
    }

    public String getSkinForeImgurl() {
        return skinForeImgurl;
    }

    public void setSkinForeImgurl(String skinForeImgurl) {
        this.skinForeImgurl = skinForeImgurl == null ? null : skinForeImgurl.trim();
    }

    public String getSkinBackSkincolor() {
        return skinBackSkincolor;
    }

    public void setSkinBackSkincolor(String skinBackSkincolor) {
        this.skinBackSkincolor = skinBackSkincolor == null ? null : skinBackSkincolor.trim();
    }

    public String getSkinBackImgurl() {
        return skinBackImgurl;
    }

    public void setSkinBackImgurl(String skinBackImgurl) {
        this.skinBackImgurl = skinBackImgurl == null ? null : skinBackImgurl.trim();
    }
}