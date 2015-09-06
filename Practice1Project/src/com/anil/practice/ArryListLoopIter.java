package com.anil.practice;

import javax.print.DocFlavor;
import java.util.*;

/**
 * Created by This1 on 27/08/2015.
 */
public class ArryListLoopIter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("=====================");
        System.out.println("Array list Iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        System.out.println("=====================");
        System.out.println("For Each list Iterator");
        System.out.println("=====================");
        for(String s : list)
                System.out.println(s);



        System.out.println("=====================");
        System.out.println("java 8 list Iterator");
        System.out.println("=====================");
        list.forEach(System.out::println);

        System.out.println("=====================");
        System.out.println("Hash map list Iterator");
        System.out.println("=====================");

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        System.out.println(map);

        System.out.println("============");
        System.out.println("");
        Set<String> keys = map.keySet();
        Iterator<String> iterator1 = keys.iterator();
        while (iterator1.hasNext()) {
            String key = iterator1.next();
            System.out.println("key: " + key + " val is: " + map.get(key));
        }

        System.out.println("==========");
        System.out.println("for each hashmap");
        System.out.println("==========");
        for (String key : keys) {
            System.out.println("key: "+key+" val is: "+map.get(key));
        }
    }



}
