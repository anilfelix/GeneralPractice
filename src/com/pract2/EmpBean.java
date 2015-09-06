package com.pract2;

/**
 * Created by This1 on 02/09/2015.
 */
public class EmpBean implements Comparable {
    String name;
    int salary;

    public EmpBean(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public int compareTo(Object o) {
        EmpBean emp = (EmpBean) o;
        if (this.salary == emp.salary) {
            return 0;
        } else if (this.salary > emp.salary) {
            return 1;
        } else
            return -1;

    }
}
