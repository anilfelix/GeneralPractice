package com.challenge8;

/**
 * Created by This1 on 04/09/2015.
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int num[][] = {{4, 3, 2},
                {32, 231, 12},
                {23, 134, 131},
                {114, 563, 211}
        };

        for (int x[] : num) {
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");

            }
            System.out.println();
        }

    }
}
