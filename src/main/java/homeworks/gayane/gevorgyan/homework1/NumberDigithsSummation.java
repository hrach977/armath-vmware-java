package homeworks.gayane.gevorgyan.homework1;

import java.util.Scanner;

class NumberDigitsSummation{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = number.nextInt();
        int sum = 0;
        while(num > 0){
            int k = num%10;
            sum += k;
            num = num/10;
        }
        System.out.println("Summation of digits of the input number: " +  sum);
    }
}