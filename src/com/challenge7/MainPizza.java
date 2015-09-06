package com.challenge7;

import java.util.Scanner;

/**
 * Created by This1 on 03/09/2015.
 */
public class MainPizza {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        MainPizza mPizObj = new MainPizza();
        Pizza pizObj = new Pizza();

        mPizObj.info(pizObj);
        mPizObj.printAll(pizObj);

    }

    void printAll(Pizza pObj) {
        System.out.println();
        System.out.println("The Print Statement");
        System.out.println("-------------------");
        System.out.println(pObj);
        double total = pObj.getTopings() * pObj.toppingsCost + getPizzaCost(pObj);
        System.out.println("Total Pizza cost is: " + total);


    }

    double getPizzaCost(Pizza pobj) {
        double res;

        if (pobj.getTypeOfPizza() == "Regular") {
            return pobj.PizzaCostR;
        } else if (pobj.getTypeOfPizza() == "Sicilian") {
            return pobj.PizzaCostS;
        } else {
            return 0;

        }
    }

    void info(Pizza pizaObj) {
        acceptName(pizaObj);
        acceptPizzaType(pizaObj);
        acceptSizeOfPizza(pizaObj);
        acceptNoOfToppings(pizaObj);

    }

    void acceptNoOfToppings(Pizza pObj) {
        System.out.println("Enter Number of Toppings: ");
        int i;
        do {
            i = 1;
            int topings = sc.nextInt();
            if (pObj.getTypeOfPizza() == "Regular") {
                if (topings < 5) {
                    pObj.setTopings(topings);
                    i = 0;
                } else {
                    System.out.println("Please re enter correct no. of toppings");
                    continue;
                }
            }
            if (pObj.getTypeOfPizza() == "Sicilian") {
                if (topings < 3) {
                    pObj.setTopings(topings);
                    i = 0;
                } else {
                    System.out.println("Please re enter correct no. of toppings");
                    continue;
                }
            }

        } while (i != 0);

    }

    void acceptSizeOfPizza(Pizza pObj) {
        int i;
        do {
            System.out.println("1. Small");
            System.out.println("2. Medeum");
            System.out.println("3. Large");
            System.out.println("4. Extra Large");
            i = sc.nextInt();
            if (i == 1) {
                pObj.setSize("Small");
            } else if (i == 2) {
                pObj.setSize("Medium");
            } else if (i == 3) {
                pObj.setSize("Large");
            } else if (i == 4) {
                pObj.setSize("Extra Large");
            } else {
                System.out.println("Please Re Enter the Size: ");
            }
        } while (i < 1 || i > 5);
    }

    void acceptName(Pizza pizObj) {
        System.out.print("Enter Name: ");
        pizObj.setCustomerName(sc.nextLine());
    }

    void acceptPizzaType(Pizza pizObj) {
        int i;
        do {
            System.out.println("1. Regular");
            System.out.println("2. Sicilian");
            System.out.println("Select type of Pizza: ");
            i = sc.nextInt();
            if (i == 1) {
                pizObj.setTypeOfPizza("Regular");
            } else if (i == 2) {
                pizObj.setTypeOfPizza("Sicilian");
            } else {
                System.out.println("Please Re Enter the Type of Pizza: ");
            }
        } while (i < 1 || i > 2);
    }


}//class
