package com.anil.practice;

import java.math.BigDecimal;

/**
 * Created by This1 on 24/08/2015.
 */
public class Pgm3 {
    public static void main(String args[]) {

        double value = 0.012;
        double pSum = value + value + value;
        System.out.println("sum of primitive" + pSum);
        System.out.println("===========");

        String strValue = Double.toString(value);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);


        BigDecimal b = new BigDecimal(value);

        System.out.println("Sum of BigDecimals: " + bSum.toString());


        double res, num = 0.012;
        res = num * 3;
        System.out.println("==========");
        System.out.println("res:   " + res);
        String strNum = Double.toString(num);
        BigDecimal bigNum = new BigDecimal(strNum);
        BigDecimal bSum1 = bigNum.add(bigNum).add(bigNum);
        System.out.println("new num: " + bSum1.toString());


    }
}