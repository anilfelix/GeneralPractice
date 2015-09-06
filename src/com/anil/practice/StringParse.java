package com.anil.practice;

/**
 * Created by This1 on 25/08/2015.
 */
public class StringParse {
    public static void main(String[] args) {
//        String s1 = "Anil is helllo";
//        System.out.println("Length of String:" + s1.length());

//        int positino = s1.indexOf("i");
//        System.out.println(positino);

//        String sub = s1.substring(14);
//        System.out.println("Substring is: "+s1);

        String s2 = "Welcome! hello people  ";
        int len1 = s2.length();
        System.out.println(len1);

        String s3 = s2.trim();
        System.out.println("s3 len: " + s3.length());
        System.out.println(s3);

        System.out.println(s3.charAt(3));
    }
}
