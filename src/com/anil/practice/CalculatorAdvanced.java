package com.anil.practice;

import java.util.Scanner;

/**
 * Created by This1 on 27/08/2015.
 */
public class CalculatorAdvanced {
    public static void main(String[] args) {
        double num1;
        Double num2;
        String input;
        double res;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter 1st Number: ");
            input = sc.nextLine();
            num1 = Double.parseDouble(input);

            System.out.print("Enter 2nd Number");
            input = sc.nextLine();
            num2 = Double.parseDouble(input);

            System.out.print("Select the Operation: + - / % : ");
            input = sc.nextLine();
            String operator = input;
            if (operator != "%" || operator != "+") {
                throw (new Exception("Invalid Operator selected"));
            }
            res = doOperation(operator, num1, num2);
            System.out.println(res);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Number Entry");
//            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("program ended" +
                "");
    }

    static double doOperation(String var1, double num1, double num2) {
        double res;
        switch (var1) {
            case "+":
                res = num1 + num2;
                return res;
//            break;
            case "/":
                res = num1 / num2;
                return res;
//                break;
            case "*":
                res = num1 * num2;
                return res;
            case "%":
                res = num1 / num2;
                return res;
            default:

                return 0;


        }

    }
}
