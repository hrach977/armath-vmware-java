package homeworks.Gayane_Gevorgyan;

import java.util.Scanner;

class SumOfEvenNumbers{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Print sum of even numbers in that array");
        System.out.print("Please input the size of the array: ");
        int size = number.nextInt();
        int array[] = new int[size];
        int sum = 0;

        System.out.print("Please input the integers: ");
        for(int i = 0; i < size; ++i){
            array[i] = number.nextInt();
        }

        System.out.print("Writing input into array with size " + size + ": [");

        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + ", ");
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("]");
        System.out.println("Sum of even nambers: " + sum);

    }
}