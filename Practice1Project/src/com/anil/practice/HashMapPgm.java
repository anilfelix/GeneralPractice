package com.anil.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by This1 on 27/08/2015.
 */
public class HashMapPgm {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ddd", "1");
        map.put("aaa", "2");
        map.put("bbb", "3");
        System.out.println(map);

        map.put("ccc", "4");
        System.out.println(map);

        String cap = map.get("aaa");
        System.out.println(cap);

    }

}
