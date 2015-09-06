package com.anil.practice;

/**
 * Created by This1 on 27/08/2015.
 */
public class PassByArr {


    static void passByValue(int[] valM) {
        System.out.println("From Method: " + valM[0]);
        valM[0]++;
        System.out.println("From method after change: " + valM[0]);

    }


    static int[] copyArray(int[] arr1) {
        int temp[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i];

        }
        return temp;
    }
    public static void main(String[] args) {
        int[] val = {1,2,3};
        int[] val2 = val;
        int[] val3 = val.clone();
        int[] val4= new int[val.length];
        System.arraycopy(val,0,val4,0,val.length);

        System.out.println("Original Value: " + val[0]);
        passByValue(val4);
        System.out.println("From Main Original: " + val[0]);

    }

}