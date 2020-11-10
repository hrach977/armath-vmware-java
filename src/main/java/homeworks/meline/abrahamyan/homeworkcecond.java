package homeworks.meline.abrahamyan;

import java.util.Scanner;

public class homeworkcecond {

    static void correctNumber (int number, int startPoint, int endPoint) {
        while (number < startPoint || number > endPoint ) {
            System.out.print("Number "+ number + " is out of the range [" + startPoint +
                    ", "+endPoint + "]. Please try again: ");
                    Scanner sc = new Scanner(System.in);
                    number = sc.nextInt();
        }
            System.out.print("Number " + number + " belongs to range [" + startPoint +
                    ", " + endPoint + "]");

    }

    public static void main (String[] args) {
        System.out.println("Checking if the given number belongs to the range…");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert lower bound of the range: ");
        int startPoint = sc.nextInt();
        System.out.print("Please insert upper bound of the range: ");
        int endPoint = sc.nextInt();
        System.out.print("Please insert the number: ");
        int number=sc.nextInt();

        correctNumber(number, startPoint, endPoint);

    }

}
