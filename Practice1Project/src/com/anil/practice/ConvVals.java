package com.anil.practice;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.text.NumberFormat;

/**
 * Created by This1 on 25/08/2015.
 */
public class ConvVals {
    public static void main(String[] args) {
        int intValue = 2345;
        String st1 = Integer.toString(intValue);
        System.out.println(st1);

        boolean bool = true;
        String st2 = Boolean.toString(bool);
        System.out.println(st2);

        long longvalue = 10_00_000;

        NumberFormat f1 = NumberFormat.getNumberInstance();

        String sf1 = f1.format(longvalue);
        System.out.println(sf1);

    }
}
