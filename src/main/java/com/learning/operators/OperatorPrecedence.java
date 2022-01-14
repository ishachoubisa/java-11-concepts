package com.learning.operators;

public class OperatorPrecedence{

public static void main(String args[]){

int lion = 3;
int tiger = ++lion * 5 / lion--;
System.out.println("lion is" +lion);
System.out.println("tiger is" +tiger);
}
} 

