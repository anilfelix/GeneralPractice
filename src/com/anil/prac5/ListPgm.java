package com.anil.prac5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by This1 on 30/08/2015.
 */
public class ListPgm {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        final int a = 10;
//        a=11;

        for (int i = 0; i < 5; i++) {
            intList.add(i, i + 5);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(intList.get(i));
            ;
        }


        for (int x : intList)
            System.out.println(x);

        int pos = intList.indexOf(7);
        System.out.println("position is: " + pos);

        Iterator<Integer> it1 = intList.iterator();
        while (it1.hasNext()) {
        }


    }
}
