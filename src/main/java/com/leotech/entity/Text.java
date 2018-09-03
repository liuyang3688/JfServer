package com.leotech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="text")
public class Text {
    @Id
    @NotNull
    public int id;
    public String name;
    public int isShow;
    public String font;
    public String color;
    public String text;
    public String labelIds;
    public double offX;
    public double offY;
}
