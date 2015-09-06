package com.pract2;

/**
 * Created by This1 on 30/08/2015.
 */


public class RecursionPrintArray {
    public static void main(String[] args) {
        RecTest r1 = new RecTest(5);

        for (int i = 0; i < 5; i++) {
            r1.values[i]= i;
        }

        r1.printArray(5);

    }
}

class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

   void printArray(int i ){
        if(i==0)
            return;
       else
            printArray(i - 1);
       System.out.println(values[i - 1]);
    }
}