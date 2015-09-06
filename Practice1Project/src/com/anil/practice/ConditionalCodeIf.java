package com.anil.practice;

/**
 * Created by This1 on 26/08/2015.
 */
public class ConditionalCodeIf {
    public static void main(String[] args) {

        int monthNumber = 8;
        if (monthNumber >= 1 && monthNumber <= 3) {
            System.out.println("in quarter 1");

        }else if (monthNumber >= 4 && monthNumber <= 6) {
            System.out.println("In quarter 3");
        } else {
            System.out.println("Invalid");
        }
    }
}
