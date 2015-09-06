package com.challenge6;

/**
 * Created by This1 on 03/09/2015.
 */
public class MainChallenge6 {
    public static void main(String[] args) {
        EventClass e12 = new EventClass("BDAY", "22/04/14", 20);
        EventClass e1 = new EventClass();
        UtilsChallenge6 ut1 = new UtilsChallenge6();
        ut1.enterInfo(e1);
        ut1.printEvent(e1);

    }
}
