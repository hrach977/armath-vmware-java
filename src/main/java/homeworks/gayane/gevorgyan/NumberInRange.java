package homeworks.gayane.gevorgyan;
//Write a program that checked if number N is in range [n, m]. Keep checking until correct number is inserted.

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        System.out.println("Checking if the given number belongs to the range…");
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert upper bound of the range: ");
        int upperBound = input.nextInt();
        System.out.print("Please insert lower bound of the range:");
        int lowerBound = input.nextInt();
        System.out.println("Please insert the number: ");
        int number = input.nextInt();

        while(number < upperBound || number > lowerBound){
            System.out.print("Number " + number + " is out of the range [" + upperBound + ", " + lowerBound +"]. Please try again:");
            number = input.nextInt();
        }
        System.out.println("Number " + number + " belongs to range ["  + upperBound + ", " + lowerBound + "].");
    }
}
