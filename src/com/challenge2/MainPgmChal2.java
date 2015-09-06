package com.challenge2;

/**
 * Created by This1 on 02/09/2015.
 */
public class MainPgmChal2 {
    public static void main(String[] args) {
        //Execute this class
        //   basicQuestions();
        //Program to ask few questions and make calculations.
        ChallengeLes2 obj1 = new ChallengeLes2();
        UtilitiesPgm ut1 = new UtilitiesPgm();
        ut1.basicQuestions(obj1);
        ut1.makeCalculations(obj1);

        // I understood the requirement as write a method to ask questions and another method to make calculations.
        // They both can be combined.

    }
}
