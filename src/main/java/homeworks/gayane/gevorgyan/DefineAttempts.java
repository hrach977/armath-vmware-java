package homeworks.gayane.gevorgyan;
// Write a program that checked if number N is in range [n, m].
// Keep checking until correct number is inserted. Define maximum number of attempts.

import java.util.Scanner;

public class DefineAttempts {
    public static void main(String[] args) {
        System.out.println("Checking if the given number belongs to the range…");
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert upper bound of the range: ");
        int upperBound = input.nextInt();
        System.out.print("Please insert lower bound of the range: ");
        int lowerBound = input.nextInt();
        System.out.print("Please insert the number: ");
        int number = input.nextInt();
        int attemp = 0;

        while(number < upperBound || number > lowerBound){
            ++attemp;
            if (attemp < 3) {
                System.out.print("Number " + number + " is out of the range [" + upperBound + ", " + lowerBound + "]. Please try again:");
                number = input.nextInt();
            }
            else {
                System.out.println("Number " + number + " is out of the range [" + upperBound + ", " + lowerBound + "].  You are about to reach");
                System.out.println("WARN: Maximum number of attempts is 4. Program will terminate if next value is invalid!");
                System.out.println("Please try again: " + number);
                break;
            }

        }
        System.out.println("Number " + number + " belongs to range ["  + upperBound + ", " + lowerBound + "].");
    }
}
