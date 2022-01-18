package com.learning.decisionmaking;

    public class InfiniteLoop {
        public static void main(String[] args) {
            int height = 1;
            L1:while(height++<10){
                System.out.println("height "+ height);
                long humidity = 12;
                System.out.println("humidity "+ humidity);
                L2: do{
                    if(humidity-- % 12 == 0)  continue L2;
                    System.out.println("humidity "+ humidity);
                    int temperature = 30;
                    L3: for( ; ; ){
                        temperature++;
                        if(temperature>50) continue L2;
                        System.out.println("temperature "+ temperature);
                    }
                }while (humidity>4);
                System.out.println("humidity "+ humidity);
            }
        }
    }

