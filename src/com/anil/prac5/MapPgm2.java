package com.anil.prac5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPgm2 {

    public static int a;
    private static int b;


    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "A");
        map1.put("b", "B");
        map1.put("c", "C");


        Set<String> key1 = map1.keySet();
        Iterator<String> itr2 = key1.iterator();
        while (itr2.hasNext()) {
            String val = itr2.next();
            System.out.println(map1.get(val));
        }


    }
}
