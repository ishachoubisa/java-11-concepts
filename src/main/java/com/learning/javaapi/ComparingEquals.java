package com.learning.javaapi;

/**
 * In following code one and two both are pointing to two different
 * object that's why one==two prints false.And three is pointing
 * to same object one is pointing to that's why one==three prints
 * true. For == operator to print true both the reference variables
 * must be pointing to same object.
 * Equals method is implemented by String class not by StringBuilder
 * If you call equals() method on two StringBuilder instances
 * ,it will check reference equality. You can call toString method
 * on StringBuilder to get string to check for equality instead.
 * In following code x.equals(z) print true becoz equals method
 * check value of reference variable rather than the reference
 * variable itself.(x and z will get different memory location in
 * string pool becoz although x and z happens to evaluate to same
 * string,one is computed at run time. Since it isn't same at
 * compile-time,a new string object is created).
 */

public class ComparingEquals {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one==two);
        System.out.println(one==three);

        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x.equals(z));
    }
}
