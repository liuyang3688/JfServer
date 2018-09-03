package com.leotech.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="material")
public class Material {
    @Id
    @NotNull
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy="increment")
    public int id;
    public String name;
    public String skinColor;
    public String imgurl;
    public int isRepeat;
    public String skin_up_skinColor;
    public String skin_up_imgUrl;
    public String skin_down_skinColor;
    public String skin_down_imgUrl;
    public String skin_left_skinColor;
    public String skin_left_imgUrl;
    public String skin_right_skinColor;
    public String skin_right_imgUrl;
    public String skin_fore_skinColor;
    public String skin_fore_imgUrl;
    public String skin_back_skinColor;
    public String skin_back_imgUrl;
}
