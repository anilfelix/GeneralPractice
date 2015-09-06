package com.anil.practice;

/**
 * Created by This1 on 25/08/2015.
 */
public class StrPgm1 {
    public static void main(String[] args) {
        String s1 = "this is string 1 ";
        System.out.println(s1);

        String s2 = new String("this is string 2");
        System.out.println(s2);

        String s3 = "Shirt Size";
        String s4 = ": M";
        String s5 = s3 + s4 + " of bro " + "1234";
        System.out.println(s5);

        char[] c1 = {'H', 'e', 'l', 'l', 'o'};
        String sc1 = new String(c1);
        System.out.println(sc1);

        char[] c2 = sc1.toCharArray();
        for (char x : c2)
            System.out.print(x);


    }

}





