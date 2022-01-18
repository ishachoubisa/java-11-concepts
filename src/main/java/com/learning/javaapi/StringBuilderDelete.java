package com.learning.javaapi;

/**
 * The delete method is reverse of insert() method.It removes
 * characters from sequence and return a reference to current
 * StringBuilder. In the second statement we delete the
 * character starting with index 1 and ending right before
 * index 3.
 * Output:
 * adef
 * In fifth statement delete method is more flexible
 * than some others when it comes to array indexes. If you
 * specify a second parameter that is past the end of StringBuilder
 * ,Java will just assume you meant the end. That means the fifth
 * statement is legal.
 * Output:
 * a
 */

public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1,3);
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("abcdef");
        sb1.delete(1,100);
        System.out.println(sb1);
    }
}
