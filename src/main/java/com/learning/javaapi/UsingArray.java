package com.learning.javaapi;

/**
 * The second statement throws exception becoz since we have 10
 * elements in our array,this means numbers[0] through numbers[9]
 * are valid.
 * third statement is also throws array out bound exception becoz
 * again 10th element is given value.
 * Finally , the for loop incorrectly uses <= instead of <,
 * which also a way of referring to 10th element
 */

public class UsingArray {
    public static void main(String[] args) {
        int[] numbers= new int[10];
        numbers[10] = 3;
        numbers[numbers.length]=5;
        for(int i=0;i<=numbers.length;i++)
            numbers[i]=i+5;
    }
}
