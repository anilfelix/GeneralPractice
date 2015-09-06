package com.anil.practice;

/**
 * Created by This1 on 27/08/2015.
 */
public class PassByStr {


    static void passByValue(String[] valM) {
        System.out.println("From Method: " + valM[0]);
        valM[0] = "ping";
        System.out.println("From method after change: " + valM[0]);

    }

    public static void main(String[] args) {
        String[] val = {"Hell", "world"};
        System.out.println("Original Value: " + val[0]);
        passByValue(val);
        System.out.println("From Main Original: " + val[0]);
    }

}