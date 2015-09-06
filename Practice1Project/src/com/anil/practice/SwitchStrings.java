package com.anil.practice;

import java.util.Scanner;

/**
 * Created by This1 on 26/08/2015.
 */
public class SwitchStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a String:");
        String input = sc.nextLine();


        switch (input) {
            case "jan":
                System.out.println("jan entered");
                break;
            case "feb":
                System.out.println("Feb entered");
                break;
            default:
                System.out.println("Invalid text");
                break;
        }


    }


}
