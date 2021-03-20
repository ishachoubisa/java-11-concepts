package com.learning.specialpackage;

import java.lang.System;
import java.lang.*;
import java.util.Random;
import java.util.*;
/** This class demonstrate the concept of default package
 *  i.e java.lang is a default package imported in all classes
 *  The above imports on line 3,4 and 6 are redundant.
 */
public class RedundantImport {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
