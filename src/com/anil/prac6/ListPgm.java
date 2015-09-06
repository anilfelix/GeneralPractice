package com.anil.prac6;

import java.util.*;

/**
 * Created by This1 on 31/08/2015.
 */
public class ListPgm {
    public static void main(String[] args) {
        List<Box> lsList1 = new ArrayList<>();
        lsList1.add(new Box(22, "red"));
        lsList1.add(new Box(33, "black"));
        lsList1.add(new Box(63, "yello"));
        lsList1.add(new RedBox());


        System.out.println(lsList1.get(0));
        Map<String, Box> map1 = new HashMap<>();
        map1.put("bb", new Box(22, "from map"));
        map1.put("red", new Box(32, "from red map"));
        map1.put("blue", new Box(62, "from blue map"));

        System.out.println(map1.get("red"));

        for (Box b1 : lsList1)
            System.out.println("for loop: " + b1.toString());


        Iterator<Box> it1 = lsList1.iterator();
        while (it1.hasNext()) {
            System.out.println("from iterator: " + it1.next());
        }

        Set<String> key1 = map1.keySet();
        Iterator<String> it2 = key1.iterator();
        while (it2.hasNext()) {
            System.out.println(map1.get(it2.next()));
        }


    }
}
