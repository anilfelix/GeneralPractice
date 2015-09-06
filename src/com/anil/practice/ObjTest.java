package com.anil.practice;

/**
 * Created by This1 on 25/08/2015.
 */
public class ObjTest {

    public String var1;

    public static void main(String[] args) {
        ObjTest ob1 = new ObjTest();
        ob1.var1 = "hello world";
        String st1 = new String("ping");
        System.out.println(st1);

        ob1.display();
    }

    public void display() {
        System.out.println(var1);
        System.out.println("this is from the method");
    }

}
