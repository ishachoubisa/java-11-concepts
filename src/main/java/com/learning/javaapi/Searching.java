package com.learning.javaapi;

import java.util.Arrays;

/**
 * Java also provide a convenient way to search,but only if array
 * is sorted.
 * numbers is a sorted array.Second statement search the index of
 * 2 i.e.index 0.Third look for index of 4 i.e. 1.
 * Fourth statement search for index of 1 which not available
 * so to preserve the sorted order it can come at index 0.Since
 * 0 already means something for array indexes, Java needs to
 * subtract 1 to give us answer -1.Although in fifth statement
 * 3 in not in the array,it would need to be inserted at element
 * 1 to preserve sorted order. We negate and subtract 1 for
 * consistency,getting -1-1 as -2.
 * Finally statement sixth wants to tell us 9 should be inserted
 * at index 4.We again negate and subtract 1,getting -4-1 as -5.
 */

public class Searching {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers,2));
        System.out.println(Arrays.binarySearch(numbers,4));
        System.out.println(Arrays.binarySearch(numbers,1));
        System.out.println(Arrays.binarySearch(numbers,3));
        System.out.println(Arrays.binarySearch(numbers,9));
    }
}
