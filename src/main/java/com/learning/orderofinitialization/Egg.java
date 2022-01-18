package com.learning.orderofinitialization;

public class Egg {
    public Egg(){
        number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }
    private int number = 3;
    {
        number = 4;
    }
}
//Output: 5
//We start with main() method and on line 9 will call the constructor
// of Egg. Java creates a new object. First it initialize number
// to 3 on line 12 and then on line 14 initializer block initialize
// number to 4. All fields and initializers have run. Java returns
// to constructor. Line 5 changes the value of number to 5 and at
// this point constructor is done. Execution goes back to line 10

