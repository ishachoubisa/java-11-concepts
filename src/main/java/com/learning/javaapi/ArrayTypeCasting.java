package com.learning.javaapi;

/**
 * strings is an array of type String.objects=strings does not
 * required a cast becoz Object are boarder than String.
 * againStrings is required casting because we are moving to
 * more specific type.againStrings[0] = new StringBuilder() will
 * not compile because String allows only String objects
 * ,String and StringBuilder both are different types.
 *
 * objects[0]= new StringBuilder() is fine from point of view of
 * compiler.A StringBuilder object can clearly go in an Object[].
 * The problem is that we don't actually have an Object[]. We have
 * an String[] referred to from an Object[] variable,At run time
 * code throws an exception.
 */

public class ArrayTypeCasting {
    public static void main(String[] args) {
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
       // againStrings[0] = new StringBuilder();
        objects[0] = new StringBuilder();
    }
}
