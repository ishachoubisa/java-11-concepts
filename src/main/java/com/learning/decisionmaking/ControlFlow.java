package com.learning.decisionmaking;

    /**
     * The first thing you notice is break statement at each end of
     * case and default section. It terminate switch statement and
     * return flow control to enclosing statement. If you leave out
     * the break statement,flow will continue to next proceeding case
     * or default block.
     * Another thing you notice is that default block is not the end
     * of switch statement. There is no requirement that the case or
     * default statement be in a particular order,unless you are
     * going to have pathways that reach multiple section of switch
     * block in a single execution.
     * To illustrate both of preceding point, consider the following
     * variation:
     * See the next whole code looks a lot like previous one. Notice
     * that we use var for switch variable, which is allowed becoz it
     * resolves to an int by compiler. Next, two of the break
     * statement have been removed and the order have been changed.
     * The means that for the given value of dayOfWeek, 5, the code
     * will jump to the default block and executes all proceeding case
     * statement until it finds break statement or finishes the switch
     * statement.
     * output: Weekday
     *         Saturday
     * The order of default and case statement is important now since
     * placing default statement at the end of switch statement would
     * cause only one word to be output.
     * What if value of dayOfWeek was 6 in this example? Would the
     * default block still be executed? The output of this example
     * with dayOfWeek set to 6 would be as follow:
     * output: Saturday
     * Even though the default block is before case block, only case
     * block will be executed. If you recall the definition of default
     * block, it is branched to only if there is no matching case
     * value for switch statement, regardless of its position within
     * the switch statement.
     * Finally, if the value of dayOfWeek was 0, all three statement
     * will be output.
     * output: Sunday
     *         Weekday
     *         Saturday
     * Notice that in this last example the default block will execute
     * becoz there is no break statement preceding case block. the
     * default block will not execute if there is matching case value
     * within switch statement,it will execute default statement if
     * it encounter it after case statement for which there is no
     * terminating break statement.
     */

    public class ControlFlow {
        public static void main(String[] args) {
            int dayOfWeek = 5;
            switch(dayOfWeek){
                default:
                    System.out.println("Weekday");
                    break;
                case 0:
                    System.out.println("Sunday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
            }
//        var dayOfWeek = 5;
//        switch(dayOfWeek){
//            case 0:
//                System.out.println("Sunday");
//            default:
//                System.out.println("Weekday");
//            case 6:
//                System.out.println("Saturday");
//                break;
//        }
        }
    }

