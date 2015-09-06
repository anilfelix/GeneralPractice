package com.anil.practice;

import java.util.List;

/**
 * Created by This1 on 28/08/2015.
 */
public class OlivePressClass {
    public int getOil(List<Olive> olives) {

        int result = 0;
        for (Olive o : olives) {
            System.out.println(o.getName());
            result += o.getOil();

        }
        return result;
    }
}
