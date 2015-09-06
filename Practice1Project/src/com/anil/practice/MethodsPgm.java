package com.anil.practice;

/**
 * Created by This1 on 26/08/2015.
 */
public class MethodsPgm {
    static String[] months = {"January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"};

    public static void main(String[] args) {
        loopIt("Hello");
        loopIt("Second run");
        loopIt("third run");

    }

    static void loopIt(String label) {
        System.out.println(label);
        for (int i = 0; i < label.length(); i++)
            System.out.print("=");
        System.out.println();
        System.out.println("Printed...");
//        for(String st1 : months)
//            System.out.println(st1);
    }
}
