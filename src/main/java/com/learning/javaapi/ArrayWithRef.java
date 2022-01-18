package com.learning.javaapi;

import java.util.Arrays;

/**
 * You can choose any Java type to be type of array. This include
 * classes you create yourself.Let's take look at a build-in type
 * with String:
 * We can call an equals() becoz an array is an object.It returns
 * true becoz of reference equality. The equals() method on an
 * arrays does not look at the elements of array. Remember it
 * will work even on an int[] too.int is a primitive;int[] is an
 * object.
 * The second print statement is even more interesting. You will
 * get different numbers and letters each time you run it since
 * this is a reference.
 * The third print statement will prints array nicely.Java 5 has
 * provided this method that prints array nicely
 * The array does not allocate space for the String objects.
 * Instead,it allocates space for a reference to where the
 * object are really stored.
 */

public class ArrayWithRef {
    public static void main(String[] args) {
        String [] bugs = {"cricket","beetle","ladybug"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println(bugs.toString());
        System.out.println(Arrays.toString(bugs));
    }
}
