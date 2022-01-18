package com.learning.javaapi;

/**
 * This class will check equality.
 *
 * The first two statement check reference equality.t1==t3
 * prints true becoz both reference variables are pointing to
 * same object.t1==t2 is false becoz both object reference
 * different.
 * t1.equals(t2) is false because tiger does not implements
 * equals().
 * In last statement there is a compile time error becoz two
 * references are pointing to completely two different type.
 */
public class Tiger {
    String name;
    public static void main(String[] args) {
      Tiger t1 = new Tiger();
      Tiger t2 = new Tiger();
      Tiger t3 = t1;
        System.out.println(t1==t3);
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));

        String string = "a";
        StringBuilder builder = new StringBuilder("a");
       // System.out.println(string==builder);

    }

}
