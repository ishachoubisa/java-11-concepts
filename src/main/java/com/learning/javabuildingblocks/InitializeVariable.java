package com.learning.javabuildingblocks;

public class InitializeVariable {

private static String exampleClassVariable; // Not required to initialize as given default
                                            // value as soon it is declared 
                                            //it has the keyword static and it shared among all
                                            //instances of class

public int exampleInstanceVariable; //Not required to initialize as given default
                                    //value as soon it is declared

public static void main(String args[]){

int x = 5;
int y;
//int z = x+y; //DOES NOT COMPILE
               //Local variables need to be initialized before use

}
}
