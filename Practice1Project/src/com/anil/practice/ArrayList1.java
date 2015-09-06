package com.anil.practice;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by This1 on 27/08/2015.
 */
public class ArrayList1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add(0, "hello");
        list.add(1, "ping");
        list.add(2, "wow");
        list.add(3, "hooo");
        System.out.println(list);
     list.add("Alaska");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));

        int pos = list.indexOf("hooo");
        System.out.println(pos);
    }
}
