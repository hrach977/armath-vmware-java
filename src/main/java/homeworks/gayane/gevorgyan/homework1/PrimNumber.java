package homeworks.gayane.gevorgyan.homework1;

import java.util.Scanner;

public class PrimNumber {
    public static void main(String[] args) {
        System.out.println("Checking if the given number is a prime number…");
        Scanner num = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = num.nextInt();
        int div = 2;
        boolean isPrimeNumber = true;

        if (number <= 1) {
            System.out.println("No...");
        } else {

            while (div <= number / 2 && number >= 2) {
                if (number % div == 0) {
                    isPrimeNumber = false;
                    System.out.println("No...");
                    break;
                } else {
                    ++div;
                }

            }
            if (isPrimeNumber) {
                System.out.println("Yes!");
            }

        }
    }
}