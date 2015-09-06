package com.anil.practice;

/**
 * Created by This1 on 27/08/2015.
 */
public class PassByValRef {
    public static void main(String[] args) {
        int val = 10;
        System.out.println("Original Value: " + val);
        passByValue(val);
        System.out.println("From Main Original: " + val);
    }

    static void passByValue(int valM) {
        System.out.println("From Method: " + valM);
        valM++;
        System.out.println("From method after change: " + valM);

    }

}
