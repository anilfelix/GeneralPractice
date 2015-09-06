package com.anil.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by This1 on 29/08/2015.
 */
public class StudentUtil {
    public static List<Student> getStudents() {

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Ashok", 11));
        studentList.add(new Student("anil", 2));
        studentList.add(new Student("Mrunalini", 3));
        studentList.add(new Student("Gautham", 4));
        studentList.add(new Student("aarl", 5));
        studentList.add(new Student("Krupakar", 2));
        studentList.add(new Student("Uma", 1));
        studentList.add(new Student("aMary", 8));

        return studentList;
    }

    public static boolean addStudentCustom(String name, int rollNo, List<Student> nameMethodList) {
        return nameMethodList.add(new Student(name, rollNo));
    }

    public static void printStudent(List<Student> studentList) {
        for (Student x : studentList)
            System.out.println(x.toString());
    }


}
