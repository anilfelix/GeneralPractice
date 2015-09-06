package com.challenge8;

import com.anil.prac2.Box;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by This1 on 04/09/2015.
 */
public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Box> boxAList = new ArrayList<>();
        int i = 0;
        String s1 = "y";
        String s2 = "y";
        Scanner sc = new Scanner(System.in);

        do {
            Box b1 = new Box();
            System.out.println("Enter Length: ");
            int val = sc.nextInt();
            b1.setLength(val);

            System.out.println("Enter Height: ");
            val = sc.nextInt();
            b1.setHeight(val);

            System.out.println("Enter Width: ");
            val = sc.nextInt();
            b1.setBreadth(val);

            boxAList.add(b1);


            System.out.println("Do you want to continue: (y)");
            s1 = sc.next();
//            s1 = sc.nextLine();
//            sc.nextInt();


        } while (s1.equals(s2));

        for (Box bb : boxAList)
            System.out.println(bb.toString());

    }
}
