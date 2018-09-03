package com.leotech.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="label")
public class Label {
    @Id
    @NotNull
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy="increment")
    public int id;
    public String name;
    public int isShow;
    public double length;
    public double width;
    public double height;
    public double pos_x;
    public double pos_y;
    public double pos_z;
    public double rot_x;
    public double rot_y;
    public double rot_z;
    public double scl_x;
    public double scl_y;
    public double scl_z;
    public String fillColor;
    public String pic;
    public String parent;
}