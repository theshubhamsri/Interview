package Operators;

public class BitWise {
//    Bitwise Shift Operators:
//            >>: its signed right shift
//    it fills the most significant bit with the sign of the
//    number:
//    example 11000110 its >>
//            11100011 (add 1 in MSB, i.e. MSB of the original number)
//            01000110 its >>
//            00100011 (add 0 in MSB, MSB of the original number)  >>>: its Unsigned right shift it fills the most significant bit with the 0:
//    example 11000110 its >>>
//            01100011
//            01000110 its >>>
//            00100011

    //There is no unsigned left shift in JAVA because << and <<< are equal
    public static void main(String[] args) {
        int a=4;
        //left shift
        System.out.println(a<<1);
        System.out.println(a<<2);
        //right shift
        System.out.println(a>>1); System.out.println(a>>2);
    }


}
