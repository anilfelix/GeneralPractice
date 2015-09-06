package com.anil.prac2;

/**
 * Created by This1 on 01/09/2015.
 */
public enum BoxEnum {
    RED("Red"),
    BLUE("blue"),
    GREEN("Green");

    String name;

    BoxEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
