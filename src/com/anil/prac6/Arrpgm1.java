package com.anil.prac6;

import java.util.Arrays;

/**
 * Created by This1 on 31/08/2015.
 */
public class Arrpgm1 {
    public static void main(String[] args) {
        int[] ar1 = {1, 5, 3};
        Arrays.sort(ar1);
        for (int x : ar1)
            System.out.println(x);

        //String array
        String[] s1 = {"R", "B", "A"};
        Arrays.sort(s1);
        for (String s : s1)
            System.out.println(s);


//copying an array
        String[] s2 = new String[s1.length];
        System.arraycopy(s1, 0, s2, 0, s1.length);

        for (String sa : s2)
            System.out.println(sa);

        StringBuilder sb = new StringBuilder();
    }
}
