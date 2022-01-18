package com.learning.javaapi;

/**
 * Since index starts counting with 0. charAt(7) is a problem.
 * It asks for the "eighth" character in the sequence but
 * there are only 7 character present. when something goes wrong
 * java doesnt know how to deal with,it throws an exception.
 * Here it throws java.lang.StringIndexOutOfBoundsException
 */
public class CharAt {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(6));
        System.out.println(string.charAt(7));
    }
}
