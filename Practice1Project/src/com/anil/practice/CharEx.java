package com.anil.practice;

/**
 * Created by This1 on 25/08/2015.
 */
public class CharEx {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'n';
        char c3 = '$';
        char c4 = '\u0024';

        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println(Character.toUpperCase(c1));
        System.out.println(Character.toUpperCase(c2));
    }
}
