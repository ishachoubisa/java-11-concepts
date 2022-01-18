package com.learning.javaapi;

/**
 * Remember that Strings are immutable and literals are pooled.
 * JVM created only one literal in memory. x and y both points
 * to same location in memory; therefore,statement outputs true.
 *
 * In the following code x1==z prints false becoz we dont have
 * two of same string literal.Although x1 and z happen to evaluate
 * to same string, one is computed at run time. Since it isn't
 * the same at compile-time,a new string object is created
 *
 * singleString==oneLine and singleString==concat both prints
 * false. Concatenation is just like calling a method and results
 * in a new String.
 *
 * a==b is false becoz a will get memory in string pool and b says
 * "No,JVM, I really don't want you to use string pool.Please create
 * a new object for me even though it is less efficient."
 *
 * c==d is true as First we tell Java to use string pool normally
 * for c.Then for d,we tell java to create new object using
 * constructor but to intern it and use string pool anyway. since
 * both variables point to same reference in string pool, we can
 * use == operator.
 *
 * first is a compile time constant automatically gets placed
 * in string pool as "rat1".second is a more complicated
 * expression that is also a compile-time constant. Therefore
 * first and second both share same string pool reference.This
 * makes first==second and first==second.intern() prints true.
 * third having a string constructor. This means we no longer
 * have a compile time constant, and third does not point to a
 * reference in string pool.So first==third prints false. first
 * ==third.intern() prints true becoz third is getting memory
 * in string pool this time.
 */

public class StringPool {
    public static void main(String[] args) {
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x==y);

        String x1 = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x1==z);

        String singleString = "hello world";
        String oneLine = "hello " + "world";
        String concat = " hello";
        concat += "world";
        System.out.println(singleString==oneLine);
        System.out.println(singleString==concat);

        String a = "Hello World";
        String b = new String("Hello World");
        System.out.println(a==b);

        String c ="Hello World";
        String d = new String("Hello World").intern();
        System.out.println(c==d);

        String first = "rat" + 1;
        String second = "r"+"a"+"t"+"1";
        String third = "r"+"a"+"t"+new String("1");
        System.out.println(first==second);
        System.out.println(first==second.intern());
        System.out.println(first==third);
        System.out.println(first==third.intern());
    }
}
