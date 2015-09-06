package com.anil.practice;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by This1 on 25/08/2015.
 */
public class IntFormStr {
    public static void main(String[] args) {

        Locale locale = new Locale("da", "DK");

        double doubleValue = 1_234_435.22;
        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println(numF.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println(curF.format(doubleValue));

        double db1 = 100_234_234.3243;
        NumberFormat nf1 = NumberFormat.getNumberInstance();
        System.out.println("formatted.." + nf1.format(db1));

    }
}

