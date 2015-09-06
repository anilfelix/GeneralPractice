package com.anil.practice;

import com.anil.practice.utilities.MathHelper;

import java.util.Scanner;

/**
 * Created by This1 on 28/08/2015.
 */
public class CustClassCalculator {
    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * /): ");

        double result = 0;

        try {
            switch (op) {
                case "+":
                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.subValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }
        } catch (NumberFormatException e) {
            System.out.println("invalid number");

        }

        System.out.println("Result is: " + result);

    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}

