package com.anil.practice;

import com.anil.practice.utilities.OliveName;


/**
 * Created by This1 on 28/08/2015.
 */
public class Olive {
//
//    public static final String KALAMATA = "kalamata";
//    public static final String LIGURIAN = "ligurian";

    private  OliveName name;
    private long color = 0x2E084;
    private int oil = 3;



    public Olive(){

    }

    public Olive(OliveName name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }
}
