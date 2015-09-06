package com.anil.practice;

/**
 * Created by This1 on 27/08/2015.
 */
public class PassByString {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println("In Main before method call : " + s1);
        passByString(s1);
        System.out.println("after call: " + s1);
    }

    static void passByString(String a) {
        a = "Anil";
//        System.out.println();
    }
}
