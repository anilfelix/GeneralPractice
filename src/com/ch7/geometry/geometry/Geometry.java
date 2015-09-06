package com.ch7.geometry.geometry;

/**
 * Created by This1 on 03/09/2015.
 */
public class Geometry {
    public static void main(String[] args) {
        Shape s1 = new Square(22);
        s1.calculateArea();
        System.out.println(s1.name);

    }
}
