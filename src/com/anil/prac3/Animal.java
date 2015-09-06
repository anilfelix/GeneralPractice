package com.anil.prac3;

/**
 * Created by This1 on 28/08/2015.
 */
public class Animal {
    String name;
    String shout;

    Animal() {

    }

    public Animal(String name, String shout) {
        this.name = name;
        this.shout = shout;
    }

    public void shout() {
        System.out.println(name + " Shouts as : " + shout);
    }
}
