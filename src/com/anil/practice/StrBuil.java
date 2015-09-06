package com.anil.practice;

import java.util.Scanner;

/**
 * Created by This1 on 25/08/2015.
 */
public class StrBuil {
    public static void main(String[] args) {
      /*  System.out.print("Enter a value: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);*/

        Scanner scanner = new Scanner(System.in);
        String input;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + " ");
        }
        System.out.println(sb.toString());
    }
}
