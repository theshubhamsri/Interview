package ControlFlow.Switch;

public class Switch {
    public static void main(String[] args) {
//        Few things we need to take care:
//        1. Two Cases can not have the same value.
//        2. Switch expression data type and case values/constant data type should be same.
//        3. Case value should be either LITERAL or CONSTANT.
//        4. All use case need not to be handled
//        5. Nested switch statement possible
//        6. Supported data types:
//        - 4 Primitive types: int, short, byte, char
//        Wrapper Types of above primitive data types i.e. Integer, Short, Byte, Character.
//                Enum
//                - String
//        7. Return is not possible within Switch case.

        int value=1;
        switch (2+1-2){
//                case value:            This is not allowed here it can be any of the 3 mentioned above
//                System.out.println("Some code here");
            default:
                System.out.println("Default code here");
        }
    }
}
