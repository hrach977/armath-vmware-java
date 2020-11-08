package homeworks.Gayane_Gevorgyan;

import java.util.Scanner;

class NumberDigitsSummation{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = number.nextInt();
        int sum = 0;
        while(){
            int k = num%10;
            sum += k;
            num = (num - k)/10;
        }
        System.out.println("Summation of digits of the input number: " +  sum);
    }
}