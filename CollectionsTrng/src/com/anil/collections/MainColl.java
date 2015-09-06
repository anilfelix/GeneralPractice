package com.anil.collections;

import java.util.Collections;
import java.util.List;

/**
 * Created by This1 on 29/08/2015.
 */
public class MainColl {
    public static void main(String[] args) {

        List<Student> myStudentList = StudentUtil.getStudents();
        StudentUtil.addStudentCustom("hola", 22, myStudentList);

        // StudentUtil.printStudent(myStudentList);

        Collections.sort(myStudentList);
        StudentUtil.printStudent(myStudentList);
        System.out.println("=================");

        System.out.println(myStudentList.get(0));


    }
}
