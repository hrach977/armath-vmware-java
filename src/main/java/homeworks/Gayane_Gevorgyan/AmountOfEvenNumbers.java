package homeworks.Gayane_Gevorgyan;

import java.util.Scanner;

class AmountOfEvenNumbers{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Print amount of even numbers in that array");
        System.out.print("Please input the size of the array: ");
        int size = number.nextInt();
        int array[] = new int[size];
        int amount = 0;

        System.out.print("Please input the integers: ");
        for(int i = 0; i < size; ++i){
            array[i] = number.nextInt();
        }

        for(int i = 0; i < array.length; ++i) {
            if (array[i] % 2 == 0) {
               ++amount;
            }
        }
        System.out.println("Amount of even nambers: " + amount);

    }
}