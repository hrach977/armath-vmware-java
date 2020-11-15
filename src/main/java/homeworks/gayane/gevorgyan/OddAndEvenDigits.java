package homeworks.gayane.gevorgyan;

//Write a program that prints odd and even digits of the number.

import java.util.Scanner;

public class OddAndEvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = input.nextInt();

        while(number > 0){
            int digit = number%10;
            if (digit % 2 == 0){

            }

            number = (number - digit)/10;
        }
        System.out.println();
    }
}
