package homeworks.gayane.gevorgyan;

import java.util.Scanner;

public class PrimNumber{
    public static void main(String[] args) {
        System.out.println("Checking if the given number is a prime number…");
        Scanner num = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int number = num.nextInt();
        int div = 2;
        boolean k = false;

        while (div <= number / 2 && number > 1) {
            if (number % div == 0) {
                k = true;
                System.out.println("No...");
                break;
            }
            else{
                ++div;
            }
        }
        if(!k){
            System.out.println("Yes!");
        }
    }
}