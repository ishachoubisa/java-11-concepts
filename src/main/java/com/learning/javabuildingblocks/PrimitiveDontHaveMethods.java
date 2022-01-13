package com.learning.javabuildingblocks;

public class PrimitiveDontHaveMethods{

public static void main(String... args){
   
   String reference = "hello";
   int len = reference.length();//Good, as reference have methods
 //  int bad = len.length();//dnt compile as primitive types dnt have methods
   System.out.println("Length of String is "+len);
}
}

