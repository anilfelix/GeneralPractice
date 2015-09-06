package com.ch7.geometry.geometry;

/**
 * Created by This1 on 03/09/2015.
 */
public abstract class Shape {
    String name;
    double area;

    Shape() {
    }

    Shape(String name) {
        this.name = name;
    }

    Shape(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public abstract double calculateArea();

}
