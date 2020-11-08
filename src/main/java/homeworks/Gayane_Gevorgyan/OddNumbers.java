package homeworks.Gayane_Gevorgyan;

import java.util.Scanner;

class OddNumbers{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Printing all odd integers from the given array of integers…");
        System.out.print("Please input the size of the array: ");
        int size = number.nextInt();
        int array[] = new int[size];

        System.out.print("Please input the integers: ");
        for(int i = 0; i < size; ++i){
            array[i] = number.nextInt();
        }
        int count = 0;
        System.out.print("Writing input into array with size " + size + ": [");

        for(int i = 0; i < array.length; ++i){
            System.out.print(array[i] +", ");
            if(array[i]%2 == 1){
                ++count;
            }
        }
        System.out.print("]" + "\n");
        int oddArray[] = new int[count];
        int k = 0;

        System.out.print("Sub array of odd numbers is: [");

        for(int j = 0; j < array.length; ++j){
            if (array[j]%2 == 1){
                oddArray[k] = array[j];
                ++k;
            }
        }
        for(int j =0; j < count; ++j){
            System.out.print(oddArray[j] + ", ");
        }
        System.out.print("]");

    }
}