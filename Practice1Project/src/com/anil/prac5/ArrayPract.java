package com.anil.prac5;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by This1 on 30/08/2015.
 */
public class ArrayPract
{
    public static void main(String[] args) {
        int[] ints = {1, 5, 3};

        Arrays.sort(ints);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        //String arrays
        System.out.println("Array of strings");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings);
        for (String x : strings) {
            System.out.println(x);
        }

        //Setting an intial value

        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 100;
        }
        for (int x : sized) {
            System.out.println(x);
        }


    //copying an array;
        int[] sized2 = new int[10];
        System.arraycopy(sized, 0, sized2, 0, 10);
        for (int x : sized2) {
            System.out.println("new var: " +x);
        }



    }
}
