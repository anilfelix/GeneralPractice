package com.anil.practice;

/**
 * Created by This1 on 25/08/2015.
 */
public class StrinConc {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "World !!";
        String s3 = "hello";
        String s4 = s1 + s2;
        System.out.println(s4);
        System.out.println("=========");

        StringBuilder sb = new StringBuilder("Buddy!!")
                .append("ping is ")
                .append("ping and the")
                .append("over");
        System.out.println(sb);


    }
}
