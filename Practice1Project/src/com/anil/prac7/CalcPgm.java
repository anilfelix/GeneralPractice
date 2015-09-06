package com.anil.prac7;

import com.anil.practice.utilities.MathHelper;

import java.util.Scanner;

import static com.anil.practice.utilities.MathHelper.addValues;

/**
 * Created by This1 on 31/08/2015.
 */
public class CalcPgm {
    public static void main(String[] args) {

        CalcPgm calc1 = new CalcPgm();
        calc1.Calculate();


    }

    protected void Calculate() {
        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("Enter  an numeric value: ");
        String s2 = helper.getInput(("Enter second Number: "));
        String operator = helper.getInput("Enter the operator");
        double result = 0;
        try {
            switch (operator) {
                case "+":
                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.subValues(s1, s2);
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println("Number formatting exception: " + e.getMessage());
        }
    }

    class InputHelper {


        private String getInput(String prompt) {
            System.out.print(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }

    }


}
