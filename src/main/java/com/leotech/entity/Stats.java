package com.leotech.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stats")
public class Stats {
//    @GeneratedValue(generator="increment")
//    @GenericGenerator(name="increment", strategy = "increment")
//    public int id;
    @Id
    public String name;
    public int totalU;
    public int usedU;
    public int remainU;
    public int maxConsU;
    public double spaceRatio;
    public double totalCap;
    public double usedCap;
    public double remainCap;
    public double loadRatio;
    public int areaId;
    public String areaName;
    public int systemId;
    public String systemName;

}
