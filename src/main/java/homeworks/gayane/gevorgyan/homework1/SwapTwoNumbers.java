package homeworks.gayane.gevorgyan.homework1;

import java.util.Scanner;

class SwapTwoNumbers{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Input is number 1: ");
        int number_1 = number.nextInt();
        System.out.print("Input is number 2: ");
        int number_2 = number.nextInt();
        System.out.println("Number 1 = " + number_1 + ",  " + "Number 2 = " + number_2);
        System.out.println("Number 1 = " + (number_1 + number_2 - number_1) + ",  " + "Number 2 = " + (number_1 + number_2 - number_2));
    }
}