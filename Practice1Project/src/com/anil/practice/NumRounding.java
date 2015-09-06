package com.anil.practice;

import java.math.BigDecimal;

/**
 * Created by This1 on 25/08/2015.
 */
public class NumRounding {
    public static void main(String[] args) {
        double d = 123.321;
        System.out.println(d);
        BigDecimal bd = new BigDecimal(d);

        System.out.println("big decimal"+bd.doubleValue());

        BigDecimal res ;
        res = bd.multiply(BigDecimal.valueOf(3));
        System.out.println(res);
        System.out.println(res.doubleValue());
    }


}
