package com.pract2;

/**
 * Created by This1 on 02/09/2015.
 */
public class EmpMain {
    public static void main(String[] args) {
        EmpBean e1 = new EmpBean("Anil", 22);
        EmpBean e2 = new EmpBean("Ashok", 22);

        System.out.println(e1.compareTo(e2));
    }
}
