package com.ch7.geometry.geometry;

/**
 * Created by This1 on 03/09/2015.
 */
public class Square extends Shape {
    double len;

    Square() {
        super("Square");
    }

    Square(int len) {
        super.name = "Square";
        this.len = len;
    }

    @Override
    public double calculateArea() {
        System.out.println("Area of Square is: " + len * len);
        return len * len;
    }

}
