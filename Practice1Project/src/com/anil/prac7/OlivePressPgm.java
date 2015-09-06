package com.anil.prac7;

import java.util.List;

/**
 * Created by This1 on 31/08/2015.
 */
public class OlivePressPgm {

    static int getOil(List<OliveClass> olives) {
        int totalOil = 0;
        for (OliveClass o : olives){
            System.out.println(o.name);
        totalOil += o.getQuantity();
        }
        return totalOil;
    }
}
