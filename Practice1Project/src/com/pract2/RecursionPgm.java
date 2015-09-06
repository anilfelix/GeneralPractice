package com.pract2;

/**
 * Created by This1 on 30/08/2015.
 */

class Factorial {
    int fact(int n) {
        System.out.println("fact called");
        int result;
        if (n == 1) {
            System.out.println("inside if:"+n);
            return 1;
     /*   } else {
            System.out.println("ins res:");
            result = fact(n-1)*n;
            System.out.println("inside result: "+result);
        }
        System.out.println("near return");
        return result;*/
        } else
        return fact(n-1)*n;
        //System.out.println("result returned");
    }
}

public class RecursionPgm {
    public static void main(String[] args) {
     Factorial fact1 = new Factorial();
        int res = fact1.fact(5);
        System.out.println(res);

    }
}
