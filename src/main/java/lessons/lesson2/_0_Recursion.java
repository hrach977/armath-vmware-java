package lessons.lesson2;

public class _0_Recursion {

    static int depth = 0;
    static boolean showRecursion = true;

    public static void main(String[] args) {
//        System.out.println(factWithDepth(1000));
        System.out.println(factTailRecursiveOptimizedToLoop(5));
    }


    //0! = 1
    //n = 1 * 2 * ... * n
    // 5 = 1 * 2 * 3 *4 * 5 = 120

    // 5! = 5 * 4! = 5 * 4 * 3!
    static int factorial(int n) {
        //base case
        if (n <= 1) {
            return 1;
        } else { //not reached to base case yet
            return  n * factorial(n - 1);
        }
    }

    static int factWithDepth(int n) {
        if (showRecursion) {
            for (int i=0; i<depth; i++) {
                System.out.print('\t');
            }
            System.out.println(">> factorial(" + n + ")");
        }

        int result;

        //base case
        if (n <= 1) {
            result = 1;
        } else {
            depth++;
            result = n * factWithDepth(n-1);
            depth--;
        }

        if (showRecursion) {
            for (int i=0; i<depth; i++) {
                System.out.print('\t');
            }
            System.out.println("<< " + result);
        }

        return result;
    }

    static int factTailRecursion(int number, int multiplier) {
        if (number<=1) {
            return multiplier;
        } else {
            int m = number * multiplier;
            int n = number-1;
            return factTailRecursion(n, m);
        }
    }

    public static long factTail(long n, long acc) {
        if (n == 1) return acc;
        return factTail(n - 1, n * acc);
    }

    static int factTailRecursionDepth(int n, int m) {
        if (showRecursion) {
            for (int i=0; i<depth; i++) {
                System.out.print('\t');
            }
            System.out.println(">> factorial(" + n + ", " + m + ")");
        }

        int result;
        if (n<=1) {
            result = m;
        } else {
            depth++;
            result = factTailRecursionDepth(n-1, n*m);
            depth--;
        }

        if (showRecursion) {
            for (int i=0; i<depth; i++) {
                System.out.print('\t');
            }
            System.out.println("<< " + result);
        }
        return result;
    }

    static int factTailRecursiveOptimizedToLoop(int number) {
        int multiplier = 1;
        for (int i = number; i > 0; i--) {
            multiplier = multiplier * i;
        }
        return multiplier;
    }


}
