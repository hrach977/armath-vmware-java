package homeworks.Yeghishe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        boolean t = true;
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number:");
        int number = input.nextInt();
        List<Integer> list_odd = new ArrayList<>();
        List<Integer> list_even = new ArrayList<>();
        while (number != 0) {
            k = number;
            number = number % 10;
            if (number % 2 == 0) {
                list_even.add(number);
            } else {
                list_odd.add(number);

            }
            number = k / 10;
        }
        if (!list_even.isEmpty()) {
            System.out.println("Even digits of the number are:" + list_even);
        }
        if (!list_even.isEmpty()) {
            System.out.print("Odd digits of the number are:" + list_odd);
        }
    }
}
