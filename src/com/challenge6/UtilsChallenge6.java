package com.challenge6;

import java.util.Scanner;

/**
 * Created by This1 on 03/09/2015.
 */
public class UtilsChallenge6 {
    Scanner sc = new Scanner(System.in);

    void printEvent(EventClass eObj) {
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("Event Type: " + eObj.getEventType());
        System.out.println("No. of Guest: " + eObj.getNoOfGuests());
        double total;
        total = eObj.getNoOfGuests() * eObj.getCostPerGuest();
        System.out.println("Total Expenditure: " + total);
    }

    double calculateTotal(EventClass eObj) {
        double total;
        total = eObj.getNoOfGuests() * eObj.getCostPerGuest();
        System.out.println("Total Expenditure: " + total);
        return total;


    }

    void prompt(String s) {
        System.out.println(s + " : ");
    }

    void enterInfo(EventClass eObj) {


        int i = 0;
        int sel = 0;

        do {

            prompt("1. Wedding");
            prompt("2. BDAY");
            prompt("3. SHOWER");
            prompt("Enter the selection");

            sel = Integer.parseInt(sc.nextLine());

            if (sel == 1) {
                eObj.setEventType("WEDDING");

            } else if (sel == 2) {
                eObj.setEventType("BDAY");

            } else if (sel == 3) {
                eObj.setEventType("SHOWER");

            } else {
                System.out.println("Please try again: ");
            }

        } while (sel < 1 || sel > 3);


        Scanner se = new Scanner(System.in);
        prompt("Enter no of Guests");
        eObj.setNoOfGuests(Integer.parseInt(sc.nextLine()));


        System.out.println("Enter Date: ");
        String dt = sc.nextLine();
        eObj.setDateOfEvent(dt);

    }
}
