package com.anil.prac5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by This1 on 30/08/2015.
 */
public class MapPgm {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        Abc.methb();
        System.out.println(Abc.a);

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        System.out.println(map);
        System.out.println(map.get(2));

        Set<Integer> keys = map.keySet();
        Iterator<Integer> it1 = keys.iterator();
        while (it1.hasNext()) {
            Integer sa = it1.next();
            System.out.println("inside loop: "+map.get(sa));
        }

    }
}
