package com.pract2;

/**
 * Created by This1 on 02/09/2015.
 */
public class Recur2 {
    public static void main(String[] args) {
        System.out.println("sum is: " + counterMethod(3));
    }

    static int counterMethod(int i) {
        int sum = 0;
        if (i == 1)
            return 1;

        else
            sum = i + counterMethod(i - 1);
        return sum;
    }
}
