package com.learning.javaapi;

/**
 * These methods are case sensitive.In this java is doing case
 * sensitive check on the values provided.
 */

public class StartWithEndWith {
    public static void main(String[] args) {
        System.out.println("abc".startsWith("a"));
        System.out.println("abc".startsWith("A"));
        System.out.println("abc".endsWith("c"));
        System.out.println("abc".endsWith("a"));
    }
}
