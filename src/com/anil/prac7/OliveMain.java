package com.anil.prac7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by This1 on 31/08/2015.
 */
public class OliveMain {
    public static void main(String[] args) {
        List<OliveClass> oliveList = new ArrayList<>();

        oliveList.add(new OliveClass(OliveEnum.ASHOK, 33));
        oliveList.add(new OliveClass(OliveEnum.ASHOK, 44));
        int res = OlivePressPgm.getOil(oliveList);
        System.out.println("totl : " + res);


    }


}
