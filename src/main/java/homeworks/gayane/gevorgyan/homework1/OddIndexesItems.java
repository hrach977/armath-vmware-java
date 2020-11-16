package homeworks.gayane.gevorgyan.homework1;
import java.util.Scanner;

public class OddIndexesItems {

    public static void main(String[]args){
        System.out.println("Print items with odd indexes...");
        System.out.print("Please input the size of the array: ");
        Scanner number = new Scanner(System.in);
        int size = number.nextInt();
        int[] array = new int[size];

        System.out.print("Please input the integers: ");
        for(int i = 0; i < size; ++i){
            array[i] = number.nextInt();
        }
        System.out.print("Odd indexes items: ");
        for(int i = 0; i < array.length; ++i){
            if(i % 2 == 1){
                System.out.print(array[i] + ", ");
            }
        }

    }
}