package com.challenge2;

import java.util.Scanner;

/**
 * Created by This1 on 01/09/2015.
 */
public class UtilitiesPgm {

    Scanner sc = new Scanner(System.in);


    String askQuestion(String prompt) {
        System.out.print(prompt);
        String text1 = sc.nextLine();
        return text1;

    }

    int askQuestionInt(String prompt) {
        System.out.print(prompt);
        int text1 = sc.nextInt();
        return text1;
    }

    double askQuestionDoub(String prompt) {
        System.out.print(prompt);
        double text1 = sc.nextDouble();
        return text1;
    }

    void basicQuestions(ChallengeLes2 obj) {

        try {
            String s1 = "Basic Questions Regarding Student Info and the Expenses";
            System.out.println(s1);
            for (int i = 0; i < s1.length(); i++) {
                System.out.print('-');
            }

            UtilitiesPgm utilObj = new UtilitiesPgm();
            System.out.println();

            obj.setDorCom(utilObj.askQuestion("D or C: "));

            obj.setName(utilObj.askQuestion("Name: "));
            obj.setYear(askQuestionInt("Year: "));
            obj.setCostOfSupplies(utilObj.askQuestionDoub("Cost of study supplies for entire course: "));
            obj.setCreditHours(utilObj.askQuestionInt("Number of Credit Hours For Course: "));
            obj.setCostPerHour(utilObj.askQuestionDoub("Cost per Hour: "));
            // obj.setDorCom((utilObj.askQuestion("Dorm(D)or Commuting(C): ")));


        } catch (Exception e) {
            System.out.println("please enter correct input.." + e.getMessage());
        }

    }

    void makeCalculations(ChallengeLes2 ob) {
        Scanner sc = new Scanner(System.in);

        try {
            if (ob.dorCom.equals("D")) {

                ob.setDuration(askQuestionInt("What is the Duration to stay in Months: "));
                ob.setWeeklyExpenses(askQuestionDoub("What are the Weekly Expenses: "));
                ob.setCostOfRoom(askQuestionDoub("what is the cost of room per Month: "));

                ob.setTotalAmt(ob.costOfSupplies + (ob.creditHours * ob.costPerHour) + (ob.weeklyExpenses * (ob.duration * 30.0 / 7)) + (ob.costOfRoom * ob.duration));
                System.out.println("The Total Amount is : " + ob.totalAmt);
                System.out.println("MTV Enjoy!!");


            } else if (ob.dorCom.equals("com")) {

                ob.setTotalAmt(ob.costOfSupplies + (ob.creditHours * ob.costPerHour));
                System.out.println("The Total Amount is : " + ob.totalAmt);
                System.out.println("MTV Enjoy!!");


            } else {
                System.out.println("Invalid Dorm or Commuting Entry");
                System.out.println("Exiting..Exited");
            }
        } catch (Exception e) {
            System.out.println("Incorrect Data entered.. program exiting" + e.getMessage());
        }
        sc.close();
    }


}
