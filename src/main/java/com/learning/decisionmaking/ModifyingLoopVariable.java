package com.learning.decisionmaking;

public class ModifyingLoopVariable {
    public static void main(String[] args) {
        for(int i = 0;i<10;i++){
            i=0;
        System.out.println(i);
        }
        for(int j=1;j<10;j++) {
            j--;
            System.out.println(j);
        }
        for(int k=0;k<10;) {
            k++;
            System.out.println(k);
        }
    }
}
