package com.learning.decisionmaking;

    /**
     * the first switch statement does not compile because its missing
     * parentheses around switch variable.
     * second one does not compile becoz missing curly braces around
     * switch body.
     * third one does not compile becoz missing case keyword before
     * 2: label. Each case statement require keyword case,followed by
     * a value and a colon(:).
     * fourth one does not compile becoz 1 || 2 uses short-circuit
     * boolean operator, which can not be applied to numeric value.A
     * single bitwise operator(|) would have allowed code to compile
     * but result might be different, match value of month would be
     * bitwise result of 1|2 i.e. 3 and would not match 1 or 2.
     * last one compiles because this statement is perfectly valid
     * a switch statement is not required to contain any case statement
     */
    public class SwitchStatement {
        public static void main(String[] args) {
            int month = 5;
//        switch month {//does not compile
//            case 1: System.out.println("January");
//        }
//        switch (month)//does not compile
//        case 1: System.out.println("January");
//
//        switch (month) {
//            case 1: 2:System.out.println("January");//does not compile
//        }
//        switch (month) {
//            case 1 || 2: System.out.println("January");//does not compile
//        }
            switch (month) {
            }
        }
    }

