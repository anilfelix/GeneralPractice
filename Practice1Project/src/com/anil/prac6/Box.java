package com.anil.prac6;

/**
 * Created by This1 on 31/08/2015.
 */
public  class Box {
    double len;
    String col;

    Box(double l, String c) {
        len = l;
        col = c;
    }

    @Override
    public String toString() {
        String s = len + " " + col;
        return s;
    }
}

