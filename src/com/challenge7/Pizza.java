package com.challenge7;

/**
 * Created by This1 on 03/09/2015.
 */
public class Pizza {

    static final double PizzaCostR = 100.0;
    static final double PizzaCostS = 150.0;
    String size;//M,S,L,EL
    String typeOfPizza;//Regular , Sicilian
    int topings;
    double costOfPizza;
    String customerName;
    int toppingsCost = 100;


    @Override
    public String toString() {
        return "Pizza{" +
                ", customerName='" + customerName + '\'' +
                ", typeOfPizza='" + typeOfPizza + '\'' +
                "size='" + size + '\'' +
                ", topings=" + topings +
                ", costOfPizza=" + costOfPizza +
                '}';
    }

    public int getTopings() {
        return topings;
    }

    public void setTopings(int topings) {
        this.topings = topings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }


    public double getCostOfPizza() {
        return costOfPizza;
    }

    public void setCostOfPizza(double costOfPizza) {
        this.costOfPizza = costOfPizza;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
