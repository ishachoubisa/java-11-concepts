package com.learning.orderofinitialization;
public class Chick {
    private String name = "Fluffy";
    {
        System.out.println("setting field");
    }
    public Chick(){
        name = "Tiny";
        System.out.println("setting constructor");
    }
    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
//Output: setting field
//        setting constructor
//        Tiny
//We start with main() method because that's where Java starts
//execution. On line 12,we call constructor of Chick. Java
//creates a new object. First it initializes the name to Fluffy
//on line 3. Next it executes the println() statement in the
//instance initializer on line 5. Once all the fields and instance
//initializers have run,Java returns to the constructor. Line 8
//changes the value of name to "Tiny",and line 9 prints another
// statement. At this point constructor is done and then
// execution goes back to the println() statement on line 13.
