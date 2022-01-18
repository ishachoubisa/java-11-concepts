package com.learning.decisionmaking;

    public class SwitchingForLoop {
        public static void main(String[] args) {
            int[] values = new int[3];
            values[0] = 1;
            values[1] = Integer.valueOf(3);
            System.out.println(values[1]);
            values[2] = 6;

            for (int i=1; i<values.length;i++){
                System.out.print(values[i]-values[i-1]+", ");
            }
        }
}
