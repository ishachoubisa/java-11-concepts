package com.learning.operators;

public class PostIncrement {
    public static void main(String[] args) {
        int pig = (short)4;
        pig = pig++;
        //System.out.println(pig);
        long goat = (int)2;
        goat -= 1.0;
        System.out.println(pig+" - "+goat);
    }
}
