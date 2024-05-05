package ControlFlow.Switch;

public class CaseNYield {
    public static void main(String[] args) {
        //From JAVA 14 Onward we can return from switch statement which was not possible earlier
        //        There are 2 ways to do it:
        //        1. Using "case N ->" Label.
        //        2. Using "yield" statement.
        //-----------Conditions needs to be fulfilled-------------------
        //        1. All possible use cases need to be handled for the expression.
        //        2. Using this "->" we can not have block of statements. If we want block of statements and then return the value,
        //        we need to use "yield".

        String day = "";
        int val = 1;
        String outputVal = switch (val){
            case 1 -> "One";
            case 2 -> "Two";
            default -> "None";
        };
        System.out.println(outputVal);


        // Use of yield
        String dayYield = "";
        int valYield = 1;
        String outputValYield = switch (valYield){
            case 1 -> {
        //some code logic here
                yield "One";
            }
            case 2 -> {
        //some code logic here
                yield "Two";
            }
            default -> "None";
        };
        System.out.println(outputValYield);
    }
}
