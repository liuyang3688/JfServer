package com.leotech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cabinet")
public class Cabinet {
    @Id
    @NotNull
    public int id;
    public String code;
    public String name;
    public int station;
    public String person;
    public String memo;
    public String capacity;
    public int areaId;
    public int systemId;
}
