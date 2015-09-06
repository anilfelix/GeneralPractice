package com.challenge8;

import java.util.Arrays;

/**
 * Created by This1 on 04/09/2015.
 */
public class ArrayExamples {
    public static void main(String[] args) {
        int[] ages = {42, 12, 1, 33, 3, 5, 22};
        double[] prices = {2.23, 343.3, 32.23, 210.10};
        double total = prices[0] +
                prices[1] +
                prices[2] +
                prices[3];
        boolean[] responses = {true, false, true, false, false};
        boolean[] responses2 = {true, false, true, false, false};
        char vowels[] = {'i', 'e', 'a', 'o', 'u'};
        String[] names = new String[10];

        for (boolean ag : responses) {
            System.out.println("aaa: " + ag);
        }

        System.out.println("Before Sorting" + Arrays.toString(ages));
        Arrays.sort(ages);
        System.out.println("After Sorting" + Arrays.toString(ages));

        //vowels sort
        System.out.println("Before sorting Vowels: " + Arrays.toString(vowels));
        Arrays.sort(vowels);
        System.out.println("After Sorting vowels: " + Arrays.toString(vowels));


        //searching an array
        int key = 312121;
        int keyPosition = Arrays.binarySearch(ages, key);
        System.out.println("the number was found at postion: " + keyPosition);

        //equal method: comparison
        System.out.println();
        if (Arrays.equals(responses, responses2) == true) {
            System.out.println("Arrays are same");

        } else
            System.out.println("Arrays are not same");


        //copying two arrays
        int[] numbers2 = Arrays.copyOf(ages, ages.length);
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);

        int[] numbers3 = Arrays.copyOf(numbers2, numbers2.length);
        System.out.println(Arrays.toString(numbers3));

        int key1 = 5;
        int res = Arrays.binarySearch(numbers3, key1);
        System.out.println(res);
    }
}
