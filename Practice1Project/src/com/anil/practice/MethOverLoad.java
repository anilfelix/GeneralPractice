package com.anil.practice;

import java.util.Scanner;

/**
 * Created by This1 on 26/08/2015.
 */
public class MethOverLoad {
    public static void main(String[] args) {
        String s1 = getInput("Enter 1st Number: ");
        String s2 = getInput("Enter 2nd Number: ");
        String s3 = getInput("Enter 3nd Number: ");

        System.out.println(addValues(s1, s2));
        System.out.println(addValues(s1, s2, s3));
        System.out.println(addValues("1","2","3","4","5"));
    }


    static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    static double addValues(String s1, String s2) {
        double res = Double.parseDouble(s1) + Double.parseDouble(s2);
        return res;

    }

    static double addValues(String s1, String s2, String s3) {
        double res = Double.parseDouble(s1) + Double.parseDouble(s2) + Double.parseDouble(s3);
        return res;
    }

        static double addValues(String... values) {
            double res = 0;
            for (String x : values) {
                res += Double.parseDouble(x);
            }
            return res;
        }


//
//    static String getInput(String prompt) {
//        System.out.print(prompt);
//        Scanner sc1 = new Scanner(System.in);
//        return sc1.nextLine();
}


