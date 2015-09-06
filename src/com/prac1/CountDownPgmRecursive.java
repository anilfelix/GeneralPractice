package com.prac1;

/**
 * Created by This1 on 02/09/2015.
 */
public class CountDownPgmRecursive {
    public static void main(String[] args) {
        CountDownMethod(10);
    }

    static void CountDownMethod(int num) {
        int i = 0;
        if (num == 0) {
            return;
        } else {
            System.out.println(num + " ...");
            CountDownMethod(--num);

        }
        if (num == 0) {
            System.out.println("Blasted offf");
        }

    }

}
