package com.anil.collections;

/**
 * Created by This1 on 29/08/2015.
 */
public class Student implements Comparable<Student> {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student() {
        name = "";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
        // return  ((Integer) this.rollNo).compareTo((Integer) o.getRollNo());

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student) {
            Student stud1 = (Student) obj;
            if (this.name.equals(stud1.getName())) {

            } else {
                return false;
            }


        } else
            return false;

        return false;
    }
}

