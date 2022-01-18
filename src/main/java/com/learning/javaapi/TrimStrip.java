package com.learning.javaapi;

public class TrimStrip {
    public static void main(String[] args) {
        System.out.println("abc".strip());
        System.out.println("\t   a b c\n".strip());

        String text = " abc\t ";
        System.out.println(text.trim().length());
        System.out.println(text.strip().length());
        System.out.println(text.stripLeading().length());
        System.out.println(text.stripTrailing().length());
    }
}
