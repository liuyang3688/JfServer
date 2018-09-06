package com.leotech.entity;

public class Stats {
    private String name;

    private Integer totalu;

    private Integer usedu;

    private Integer remainu;

    private Double spaceratio;

    private Integer maxconsu;

    private Double totalcap;

    private Double usedcap;

    private Double remaincap;

    private Double loadratio;

    private Integer areaid;

    private String areaname;

    private Integer systemid;

    private String systemname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTotalu() {
        return totalu;
    }

    public void setTotalu(Integer totalu) {
        this.totalu = totalu;
    }

    public Integer getUsedu() {
        return usedu;
    }

    public void setUsedu(Integer usedu) {
        this.usedu = usedu;
    }

    public Integer getRemainu() {
        return remainu;
    }

    public void setRemainu(Integer remainu) {
        this.remainu = remainu;
    }

    public Double getSpaceratio() {
        return spaceratio;
    }

    public void setSpaceratio(Double spaceratio) {
        this.spaceratio = spaceratio;
    }

    public Integer getMaxconsu() {
        return maxconsu;
    }

    public void setMaxconsu(Integer maxconsu) {
        this.maxconsu = maxconsu;
    }

    public Double getTotalcap() {
        return totalcap;
    }

    public void setTotalcap(Double totalcap) {
        this.totalcap = totalcap;
    }

    public Double getUsedcap() {
        return usedcap;
    }

    public void setUsedcap(Double usedcap) {
        this.usedcap = usedcap;
    }

    public Double getRemaincap() {
        return remaincap;
    }

    public void setRemaincap(Double remaincap) {
        this.remaincap = remaincap;
    }

    public Double getLoadratio() {
        return loadratio;
    }

    public void setLoadratio(Double loadratio) {
        this.loadratio = loadratio;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Integer getSystemid() {
        return systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname == null ? null : systemname.trim();
    }
}