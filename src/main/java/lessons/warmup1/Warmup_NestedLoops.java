package lessons.warmup1;

public class Warmup_NestedLoops {
    /*
        # # # # # # # # # # #
          # # # # # # # # #
            # # # # # # #
             # # # # #
               # # #
                 #
                (a)
    */

    // assume that size is an odd number
    public static void printPatternA(int size) {
        for (int i = 0; i <= size / 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < size - i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPatternA(11);
    }
}
