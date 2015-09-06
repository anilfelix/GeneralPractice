package com.prac1;

/**
 * Created by This1 on 01/09/2015.
 */
public class Pgm1 {
    public static void main(String[] args) {

        BeanBox b1 = new BeanBox(33, "Blue");
        BeanBox b2 = new BeanBox(43, "Red");
        System.out.println(b1.colour);
        ChgColor(b1);
        System.out.println(b1.colour);

        BeanBox b3;
//        BeanBox b4 = b3;

    }

    static void ChgColor(BeanBox bb) {
        bb.colour = "Ping";
    }

}
