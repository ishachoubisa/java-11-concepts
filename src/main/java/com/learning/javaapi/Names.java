package com.learning.javaapi;

/**
 * This array points to null.The code never instantiated array,
 * so it is just a reference variable to null.
 * The second one is an array becoz it has brackets. It is an
 * array of type String since that is the type mentioned in
 * declaration. It has two elements becoz length is 2.Each of
 * those two slots currently is null but has the potential to
 * point to a String object.
 */

public class Names {
    String names[];
    String names1[] = new String[2];
}
