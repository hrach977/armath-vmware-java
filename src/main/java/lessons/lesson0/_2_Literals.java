package lessons.lesson0;

import java.math.BigDecimal;

public class _2_Literals {

    //primitive             -> pass by value (physically copied)
    //object/referency type -> pass by reference

//    int a = 1;
//    int b = a;

    boolean result = false; //true
    //bit: 0/1
    byte b = 100;
    short s = 10000;

    int i = 100000;      //32-bit
    long l = 10000000L;  //64-bit

    int decVal = 26;
    //0-9, A-F
    int hexVal = 0x1a;
    int binVal = 0b11010;

    float f1 = 121.0F;

    double d1 = 123;
    double d2 = 123.4;
    double d3 = 1.234e2;

    char c1 = 'C';
    char c2 = '\u0108';

    String s1 = "some string literal";

    int[] a1 = new int[42];

    int[][] a2 = {
            {1, 2, 3},
            {4, 5, 6}
    };


    public static void main(String[] args) {
        for (int a = 1; a<= 42; a++ ) {
            System.out.println(a);
        }
    }




    //0-9

    //123 = 10^0 * 3 + 10^1 * 2 + 10^2 * 1 = 3 + 20 + 100
}
