package lessons.lesson0.binary;

public class BinaryUtil {

    public static void main(String[] args) {
//        System.out.println(showBitsOf(42));


        System.out.println(Integer.toBinaryString(42));
        System.out.println(showBitsOf(42));
    }

    private static String showBitsOf(int number) {
        int bitMask = (1 << 31);
//        int a = 1;
//        int mask =  a<<31;

        //1000 0000 0000 0000 0000 0000 0000 0000
        StringBuilder sb = new StringBuilder();

//          0000 0000 0000 0000 0000 0000 0010 1010
//        //0000 0000 0000 0000 0000 0000 0000 0000
//        ------------------------------------------
//           0 000 0000 0000 0000 0000 0000 0000 0000

        int count = 1;
        while (bitMask != 0) {
            if ( (number & bitMask) == 0 ) {
                sb.append('0');
            } else {
                sb.append('1');
            }
            if (count > 0 && count % 4 == 0) {
                sb.append(' ');
            }
            count++;
            bitMask = bitMask >>> 1;
        }

        return sb.toString();
    }

    private static String showBitsOf(long number) {
        int bitMask = (1 << 63);
//        int a = 1;
//        int mask =  a<<31;

        //1000 0000 0000 0000 0000 0000 0000 0000
        StringBuilder sb = new StringBuilder();

//          0000 0000 0000 0000 0000 0000 0010 1010
//        //0000 0000 0000 0000 0000 0000 0000 0000
//        ------------------------------------------
//           0 000 0000 0000 0000 0000 0000 0000 0000

        int count = 1;
        while (bitMask != 0) {
            if ( (number & bitMask) == 0 ) {
                sb.append('0');
            } else {
                sb.append('1');
            }
            if (count > 0 && count % 4 == 0) {
                sb.append(' ');
            }
            count++;
            bitMask = bitMask >>> 1;
        }

        return sb.toString();
    }
}
