package com.anil.prac7;

/**
 * Created by This1 on 31/08/2015.
 */
public class OliveClass {


    public static final String NN = "Anil";
    OliveEnum name;
    int quantity;

    OliveClass(OliveEnum n1, int q1) {
        name = n1;
        quantity = q1;
    }

    public OliveEnum getName() {
        return name;
    }

    public void setName(OliveEnum name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
