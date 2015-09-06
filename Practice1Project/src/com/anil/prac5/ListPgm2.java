package com.anil.prac5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by This1 on 30/08/2015.
 */
public class ListPgm2 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (Integer x : intList)
            System.out.println(x);

        Iterator<Integer> itr1 = intList.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}
