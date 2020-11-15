package homeworks.gayane.gevorgyan;

//Write a program that prints odd and even digits of the number.

import java.util.Scanner;

public class OddAndEvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = input.nextInt();
        int num = number;
        int countDigit = 0;

        while(num > 0) {
            int digit = num % 10;
            ++countDigit;
            num = (num- digit) / 10;
        }
        int[] arrDigit = new int[countDigit];
        int even = 0;
        int odd = 0;
            for (int i = 0; i< countDigit; ++i){
                arrDigit[i] = number % 10;
                number = (number - arrDigit[i]) / 10;
            }
            System.out.print("Even digits of the number are: [");
            for(int i = countDigit-1; i >=0;  --i) {
                if (arrDigit[i] % 2 == 0) {
                    System.out.print(arrDigit[i] + ",");
                    ++even;
                }
            }
        System.out.println("]");
            if(even == 0) {
                System.out.println("Even digits of the number are: There are no even digits");
            }
        System.out.print("Odd digits of the number are: [");
        for(int i = countDigit-1; i >= 0;  --i) {
            if (arrDigit[i] % 2 == 1) {
                System.out.print(arrDigit[i] + ",");
                ++odd;
            }
        }
        System.out.println("]");
        if(odd == 0) {
            System.out.println("Odd digits of the number are: There are no even digits");
        }
    }
}
