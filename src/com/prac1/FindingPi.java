package com.prac1;

/**
 * Created by This1 on 02/09/2015.
 */
public class FindingPi {
    public static void main(String[] args) {
        System.out.println(getPi(10000));
        System.out.println(getPi(100000));
        System.out.println(getPi(1000000));
        System.out.println(getPi(10000000));
        System.out.println(getPi(1000000000));
        System.out.println("Program executed");
    }

    static double getPi(int numPoints) {
        int inCircle = 0;

        for (int i = 0; i < numPoints; i++) {
            double randX = (Math.random() * 2) - 1;
            double randY = (Math.random() * 2) - 1;
            double dist = Math.sqrt(randX * randX + randY * randY);
            if (dist < 1) {
                inCircle++;
            }

        }
        return 4.0 * inCircle / numPoints;


    }

}
