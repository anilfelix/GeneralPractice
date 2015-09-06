package com.anil.practice;

/**
 * Created by This1 on 26/08/2015.
 */
public class StringLoopCode {
    public static void main(String[] args) {
        String[] months = {"January",
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
//        for(int i = 0; i < months.length; i++)
//            System.out.println(months[i]);
//
//        for(int i = months.length - 1; i >= 0; i--)
//            System.out.println(months[i]);

//        for(String st1 : months)
//            System.out.println(st1);
        int i = 0;
//        while (i < months.length) {
//            System.out.println(months[i]);
//            i++;
//        }

        do {
            System.out.println(months[i]);
            i++;
        } while (i < months.length);

    }
}
