package com.learning.ReadingandWriting;

  //Its possible to read and write instance variable directly
//from caller.The caller in this case is main() method
//which could be in same class or another class
//reading means getting a variable and writing means setting
public class Swan {
    int numberEggs;//instance variable
    public static void main(String[] args) {
           Swan mother = new Swan();
           mother.numberEggs=1;//set variable
        System.out.println(mother.numberEggs);//read variable
    }
}
