package com.learning.javaapi;

/**
 * The contains() method looks for matches in the string. It
 * isn't particular as startswith() and endswith()-- the match
 * can be anywhere in string.
 * Method Signature:
 * boolean contains(CharSequence charSeq)
 * Again we have a case sensitive search in string. The contains()
 * method is a convenience method so you don't have to write
 * str.indexOf(otherString) != -1.
 */
public class Contains {
    public static void main(String[] args) {
        System.out.println("abc".contains("b"));
        System.out.println("abc".contains("B"));
    }
}
