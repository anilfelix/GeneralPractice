package com.anil.practice;

import java.util.Scanner;

/**
 * Created by This1 on 27/08/2015.
 */
public class CalcAdvSolution {
    public static void main(String[] args) {
        //accept values numbers
        //accept operator
        //based on the operator perform operation

        double num1;
        double num2;
        double res = 0;


        String s1 = getInput("Enter First Number: ");
        System.out.println(s1);
        String s2 = getInput("Enter Second Number: ");
        System.out.println(s2);
        String s3 = getInput(("Enter Operator: "));

        try {
            res = doOperation(s3, s1, s2);
            System.out.println("the result is: " + res);
        } catch (NumberFormatException e) {
            System.out.println("invalid number");

        }


    }

    static double doOperation(String oper, String s1, String s2) {
        double num1, num2, res = 0;
        num1 = Double.parseDouble(s1);
        num2 = Double.parseDouble(s2);

        switch (oper) {

            case "+":
                res = addValues(num1, num2);
                return res;
            case "-":
                res = subValues(num1, num2);
                return res;
            default:
                return res;

        }

    }

    static double addValues(double n1, double n2) {
        return  n1 + n2;
    }

    static double subValues(double n1, double n2) {
        return n1 - n2;
    }

    static String getInput(String string) {
        System.out.print(string);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
