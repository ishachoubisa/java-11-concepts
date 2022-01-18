package com.learning.javaapi;

/**
 * The method indexOf() looks at the characters in string and
 * finds the first index that matches the desired value.
 * indexOf can work with individual character or whole String
 * as input.It can also start with requested position. Remember
 * that a char can be passed to an int parameter type. On the
 * exam you'll only see a char passed to the parameter named ch.
 * Method signature:
 * int indexOf(int ch)
 * int indexOf(int ch,int fromIndex)
 * int indexOf(String str)
 * int indexOf(String str, int fromIndex)
 * Since index begin with 0,the first statement 'a' in below matches at
 * that position. The second statement looks for more
 * specific string,so it matches later.In the last statement
 * no match is found because it start looking after the match
 * occurred. It doesnt throw exception like charAT method
 * if no match is found. It returns -1 if no match is found.
 */

public class IndexOf {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.indexOf('a'));
        System.out.println(string.indexOf("al"));
        System.out.println(string.indexOf('a',4));
        System.out.println(string.indexOf("al",5));
    }
}
