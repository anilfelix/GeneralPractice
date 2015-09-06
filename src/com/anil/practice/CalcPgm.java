package com.anil.practice;

import java.util.Scanner;

/**
 * Created by This1 on 26/08/2015.
 */
public class CalcPgm {
    public static void main(String[] args) {
        int num1;
        int num2;
        int res;

        Scanner scNum1 = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        String s1 = scNum1.nextLine();
        System.out.println();

        System.out.print("2nd Number: ");
        String s2 = scNum1.nextLine();
        System.out.println();

        res = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println("The result is : " + res);
    }
}
