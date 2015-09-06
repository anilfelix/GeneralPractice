package com.anil.practice;

import java.util.Scanner;

/**
 * Created by This1 on 26/08/2015.
 */
public class SwitchPgm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        String input = sc.nextLine();
        int monthNumber = Integer.parseInt(input);
//        int mnt = Integer.parseInt(input);
        System.out.println("======");
//        System.out.println("Entered number is: "+input);

        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("number is below 3");
                break;
            case 5:
            case 6:
            case 8:
                System.out.println("number is 5, 6 8");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }


    }


}
