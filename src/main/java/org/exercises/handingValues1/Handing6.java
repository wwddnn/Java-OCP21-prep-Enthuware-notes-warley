package org.exercises.handingValues1;

public class Handing6 {
    //calculate bitwise: multiply for -1 and sum with -1.
    //example: ~8 is 8*(-1) = -8. Then -8+(-1) then -9 is the result.
    static void main() {
        int x = 2;
        int y = ~x;//LINE 2
        int z = x ^ y;// LINE 3
        boolean flag = x < y & x > z++;// LINE 4
        if(flag) {
            flag = x > y && x > --z;// LINE 6
        }
        if(z>-1){  //LINE 8
            // --z;
        } else z++;
        System.out.println((flag+" "+z));//LINE 11
    }
    //~ (called tilde) is bitwise negation operator. It works only on integral types. It returns a new number where each bit is the opposite (inverted) of the bit in the given integral value. For example:
    //int x = 2;   //bit pattern of 2 is : 00000000 00000000 00000000 00000010
    //int y = ~x; //bit pattern of ~2 is : 11111111 11111111 11111111 11111101, which is same as -3.
    //System.out.println(x+", "+y); //prints 2, -3
    //Observe that the bits of the number produced by doing ~x are opposite of the bits in the original int value. The original variable x is unchanged. The trick to find out the result of applying the ~ operator is to just multiply the input with -1 and subtract 1. For example, ~8 will be 8*-1 - 1 i.e. -9. Similarly, ~-9 will be -9*-1 - 1 i.e. 8.  If you want to know more, just read about 2's complement method of representing negative integers.   ^ is bitwise xor operator that performs an "xor" (aka exclusive or, in which, the result is 1 only if exactly one of the two operands is 1).  For example:
    //int x = 2;   //bit pattern of 2 is : 00000000 00000000 00000000 00000010
    //int y = ~x; //bit pattern of ~2 is : 11111111 11111111 11111111 11111101, which is same as -3.
    //int z = x ^ y;  //bit pattern is   : 11111111 11111111 11111111 11111111, which is same as -1.
    //
    //System.out.println(z); //prints -1
    // Note that you will not need to work out bit patterns for large values. However, for the purpose of the exam, you need to know that x ^ ~x will always be -1.
}
