package com.anil.practice;

/**
 * Created by This1 on 25/08/2015.
 */
public class StringCmp {
    public static void main(String[] args) {
        String st1 = "hello ";
        String st2 = "world";
        String st3 = st1 + st2;
        String st4 = "Hello world";

        if (st3 == st4)
            System.out.println("matching strings");
        else
            System.out.println("not matching strings");

        if (st3.equalsIgnoreCase((st4)))
            System.out.println("matching ....");
        else
            System.out.println("Not matching");
    }
}

