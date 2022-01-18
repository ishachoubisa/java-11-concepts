package com.learning.javaapi;

import java.util.Arrays;

/**
 * The output of this code is 10 100 9 becoz String sorts in
 * alphabetic order and 1 sort before 9.(Numbers sort before
 * letter,and uppercase sorts before lowercase).
 */

public class Sorting {
    public static void main(String[] args) {
        String[] strings = {"10","9","100"};
        Arrays.sort(strings);
        for(String string:strings)
            System.out.println(string + " ");
    }
}
