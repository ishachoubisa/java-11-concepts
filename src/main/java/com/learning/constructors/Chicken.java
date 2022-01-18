package com.learning.constructors;
//Purpose of constructor is to initialize fields
//another way to initialize fields is to do so directly
//on line on which they are declare
//here both approaches are shown
public class Chicken {
    int numEggs = 12;//initialize directly on line where declare
    String name;
    public Chicken(){
        name = "Duke";//initialize in constructor
    }
}
