package com.anil.practice;

import java.util.Arrays;

/**
 * Created by This1 on 27/08/2015.
 */
public class SimpleArrays {
    public static void main(String[] args) {

        System.out.println("Array of primitives");
        int[] ints = {9, 6, 3};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++)
            System.out.println(ints[i]);


        System.out.println("Array of Strings");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings);
        for(String color : strings)
            System.out.println(color);

        System.out.println("Setting an initial size");
        int[] sized = new int[5];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i*100;
        }

        System.out.println("Copying an Array");
        int[] copied = new int[5];
        System.arraycopy(sized, 0, copied, 0, 5);
        for(int x: copied)
            System.out.println(x);



        for(int value : sized)
            System.out.println(value);

    }
}
