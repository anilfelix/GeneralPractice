package com.anil.prac5;

/**
 * Created by This1 on 30/08/2015.
 */
public class StringAppend {
    public static void main(String[] args) {
        String[] s1 = new String[10];
        String[] s2 = new String[10];
        int k = 0;
        for (int i = 0; i < s1.length; i++) {
            s1[i] = Integer.toString(k+i);
            s2[i] = Integer.toString(k+10+i);
        }

        System.out.println(s1[0]);

        for (int i = 0; i < s1.length; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(s1[i])
                    .append(" : is : ")
                    .append(s2[i]);
            System.out.println(sb);
        }
    }
}
