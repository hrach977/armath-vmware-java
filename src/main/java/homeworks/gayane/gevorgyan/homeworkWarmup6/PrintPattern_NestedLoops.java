package homeworks.gayane.gevorgyan.homeworkWarmup6;

public class PrintPattern_NestedLoops {
    public static void printPattern(int size){

        for (int i = 0; i <= size /2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            for (int k = i; k < size - i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
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
        printPattern(11);
    }

        }


