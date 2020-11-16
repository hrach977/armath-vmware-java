package problem.solving.session2;

import java.util.Scanner;

public class Problems {


    public static void main(String[] args) {
        //version1();
        //version2();
        //version3();


    }

    // input number. If the number is out of [100.000, 999.999] boundary print error message.
    // Keep inserting the number till there is a number from the range
    public static void version1() {
        Scanner input = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            int numberFromUser = input.nextInt();
            if (numberFromUser>=100_000 && numberFromUser<=999_999) {
                System.out.println(numberFromUser);
                flag = false;
            } else {
                System.out.println("incorrect number, please try again");
            }
        }
    }

    public static void version2() {
        Scanner input = new Scanner(System.in);
        int numberFromUser = input.nextInt();

        while (numberFromUser<100_000 || numberFromUser>999_999) {
            System.out.println("incorrect number, please try again");
            numberFromUser = input.nextInt();
        }
        System.out.println(numberFromUser);
    }

    public static void version3() {
        Scanner input = new Scanner(System.in);

        while (true) {
            int numberFromUser = input.nextInt();
            if (numberFromUser>=100_000 && numberFromUser<=999_999) {
                System.out.println(numberFromUser);
                break;
            } else {
                System.out.println("incorrect number, please try again");
            }
        }
    }
}
