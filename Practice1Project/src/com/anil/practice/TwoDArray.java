package com.anil.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by This1 on 27/08/2015.
 */
public class TwoDArray {
    public static void main(String[] args) {
        String[][] states = new String[3][2];
        states[0][0] = "a";
        states[0][1] = "1";
        states[1][0] = "b";
        states[1][1] = "2";
        states[2][0] = "c";
        states[2][1] = "3";
        int[] ab = {3, 23, 1};
        Arrays.sort(ab);
        for(int x: ab)
            System.out.println(x);

        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The letter is: ")
                    .append(states[i][0])
                    .append("; The number is: ")
                    .append(states[i][1]);
            System.out.println(sb);


        }

    }
}
