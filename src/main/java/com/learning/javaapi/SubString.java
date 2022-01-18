package com.learning.javaapi;

/**
 * The method substring() also looks for characters in a string
 * It returns part of the string. The first parameter is the
 * index to start with for the return string. As usual, this is
 * a zero-based index. There is an optional second parameter,
 * which is the end index you want to stop at.It does not
 * include the end index.
 * Method signature:
 * String substring(int beginIndex)
 * String substring(int beginIndex, int endIndex)
 * The substring() method is the trickiest String method on exam
 * The first statement says to take the characters starting with
 * index 3 through the end, which gives us "mals" The second
 * statement does the same thing but it calls indexOf() to get
 * the index.The third statement says to take the character starting
 * with index 3 until,but not including,the character at index 4
 * The fourth statement says to take the character start with
 * index 3 and not include last index 7.
 * The fifth statement print a empty string,since we start and
 * end with the same index.
 * The sixth statement throws exception because indexes cant be
 * backward.
 * The seventh statement throws exception index out of bound.
 * Last but not the least this method returns string starting
 * from the requested index.If an end index is requested it
 * stop right before that index. Otherwise it goes to the end
 * of string.
 */

public class SubString {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.substring(3));
        System.out.println(string.substring(string.indexOf('m')));
        System.out.println(string.substring(3,4));
        System.out.println(string.substring(3,7));

        System.out.println(string.substring(3,3));
        System.out.println(string.substring(3,2));
        System.out.println(string.substring(3,8));
    }
}
