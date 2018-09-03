package com.leotech.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="event")
public class Event {
    @Id
    @NotNull
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy="increment")
    public int id;
    public String name;
    public int isShow;
    public String type;
    public String match_func;
    public String deal_func;
}
