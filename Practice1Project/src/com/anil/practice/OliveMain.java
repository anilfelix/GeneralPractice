package com.anil.practice;

import com.anil.practice.utilities.OliveName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by This1 on 28/08/2015.
 */
public class OliveMain {
    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();


        olives.add(new Olive(OliveName.ANIL, 0x000000, 3));


        OlivePressClass press = new OlivePressClass();
//        press.getOil(olives);/
        int res = press.getOil(olives);
        System.out.println("the oil is: " + res);
    }
}
