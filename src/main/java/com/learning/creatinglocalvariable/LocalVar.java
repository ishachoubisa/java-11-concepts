package com.learning.creatinglocalvariable;

public class LocalVar {
    public void findAnswer(boolean check){
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if(check){
            onlyOneBranch = 1;
            answer = 1;
        }else{
            answer = 2;
        }
        System.out.println(answer);
//        System.out.println(onlyOneBranch);
    }
}
//The answer variable is initialized in both branches of if
// statement, so compiler is perfectly happy. It knows that
// regardless of whether check is true or false, the value
// answer will be set to something before it is used. The
// otherAnswer variable is initialized but never used, but the
//compiler is equally happy.Remember compiler is concerned if
//you try to use uninitialized local variables;it doesn't mind
//the ones you never use.
//The onlyOneBranch variable is initialized only if check happens
//to be true. The compiler knows there is possibility of check to
//be false,resulting in uninitialized code and gives compiler error