package com.anil.practice;

/**
 * Created by This1 on 26/08/2015.
 */
public class ErrorsExcept {
    public static void main(String[] args) {

        String s = null;
        System.out.println(s);

        String welcome = "Welcome Buddy!!";
        char[] chars = welcome.toCharArray();

//        for (int i = 0; i < chars.length ; i++)
//            System.out.println(chars[i]);
        try {
            if (chars.length < 10) {
                throw (new Exception("My custom message"));
            }
            char lastChar = chars[chars.length - 1];
            String str1 = welcome.substring(16);

        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Array IndexException caught");

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index out of bounds exception caught");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println("program executed...");
    }

}
