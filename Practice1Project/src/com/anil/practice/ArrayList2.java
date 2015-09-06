package com.anil.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by This1 on 27/08/2015.
 */
public class ArrayList2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);

        System.out.println(list.get(0));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
