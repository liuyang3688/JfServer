package com.leotech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="device")
public class Device {
    @Id
    @NotNull
    public int id;
    public String code;
    public String name;
    public int typeId;
    public String typeName;
    public String cabinet;
    public String user;
    public String pass;
    public String person;
    public String record;
    public double capacity;
    public String memo;
    public String modelNo;
    public String cpu;
    public String memory;
    public String disk;
    public String barcode;
}
