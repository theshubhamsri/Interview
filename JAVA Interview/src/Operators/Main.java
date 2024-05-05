package Operators;

public class Main {
    public static void main(String[] args) {

//        How does BITWISE NOT works?
//        int a = 4
//        0100 (remember its not equal to 100 as int is a signed as it represent both positive and negative value and in Java there is nothing like unsinged integer like in C++)
//        0100 -> ~0100 = 1011
//        Now what is 1011?
//                1*2^-3+0*2^2 + 1*2^1+1*2^0 = -8+0+2+1 = -5
//        which is equivalent to -(N+1) = -(4+1) = -5
//        How can we confirm if -5 is 1011?
//                5 = 0101-
//                        To get the -5, we know that we have to find its 2nd Complement
//        0101 => 1st Complement = 1010
//        2nd Complement = 1010 + 1 = 1011
        int a=4;
        System.out.println(~a);
    }
}
