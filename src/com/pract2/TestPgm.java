package com.pract2;

import java.util.Scanner;

/**
 * Created by This1 on 01/09/2015.
 */
public class TestPgm {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        String age = sc.nextLine();
        int age1 = Integer.parseInt(age);

        System.out.println("The name is : " + name);
        System.out.println("The age is : " + age1);

    }
}
