package lessons.lesson0;

public class _5_BinaryOperators {

    public static void main(String[] args) {
        int a = 60; //   0011 1100
        int b = 13; //   0000 1101

        System.out.println(Integer.toBinaryString(60));
        System.out.println(Integer.toBinaryString(13));

        int c = 0; // 0000 0000
        System.out.println("****");
        c = a & b;
        System.out.println(Integer.toBinaryString(60));
        System.out.println(Integer.toBinaryString(13));
        System.out.println("a & b = " + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("****");
        c = a | b;
        System.out.println(Integer.toBinaryString(60));
        System.out.println(Integer.toBinaryString(13));
        System.out.println("a | b = " + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("****");
        c = a ^ b;
        System.out.println(Integer.toBinaryString(60));
        System.out.println(Integer.toBinaryString(13));
        System.out.println("a ^ b = " + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("****");
        c = ~a;
        System.out.println(Integer.toBinaryString(60));
        System.out.println("~a = " + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("****");
        c = a << 2;
        System.out.println(Integer.toBinaryString(60));
        System.out.println("a << 2 = " + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("****");
        c = a >> 2;
        System.out.println(Integer.toBinaryString(60));
        System.out.println("a >> 2 = " + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("****");
        c = a >>> 2;
        System.out.println(Integer.toBinaryString(60));
        System.out.println("a >>> 2 = " + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("****");
        c = b >>> 2;
        System.out.println(Integer.toBinaryString(13));
        System.out.println("b >>> 2 = " + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("****");
        c = b >> 2;
        System.out.println(Integer.toBinaryString(13));
        System.out.println("b >> 2 = " + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("****");
        int z = -10;
        c = z >> 2;
        System.out.println(Integer.toBinaryString(-10));
        System.out.println("z >> 2 = " + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("****");
        System.out.println(Integer.toBinaryString(-10));
        c = z >>> 2;
        System.out.println("z >>> 2 = " + c);
        System.out.println(Integer.toBinaryString(c));




    }
}
