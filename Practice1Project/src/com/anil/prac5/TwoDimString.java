package com.anil.prac5;

/**
 * Created by This1 on 30/08/2015.
 */
public class TwoDimString {
    public static void main(String[] args) {
        String[][] states = new String[3][2];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                states[i][j] = Integer.toString(k++);

            }
        }
//
//        for (String x[] : states) {
//            for(String y: x)
//            System.out.print(y);
//            System.out.println();
//        }
        String[] copy1 = new String[3];

        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The first number is: ")
                    .append(states[i][0])
                    .append("is : ")
                    .append(states[i][1]);
            System.out.println(sb);
            copy1[i] = sb.toString();
        }

        System.out.println("from copy1");
        for (String x : copy1) {
            System.out.println(x);
        }

    }
}
