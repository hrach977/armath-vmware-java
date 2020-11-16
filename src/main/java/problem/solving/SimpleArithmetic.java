package problem.solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArithmetic {

    // write a program that will calculate the area of the circle
    // input is radius of the circle
    // output is the area of the circle
    public static double areaOfCircle() {
        System.out.println("Area of the circle");
        System.out.print("Input radius: ");
        Scanner scanner = new Scanner(System.in);

        final double pi = 3.14;
        double area = 0;
        while (scanner.hasNext()) {
            double radius = scanner.nextDouble();
            if (radius <= 0) {
                System.out.println("Incorrect radius. Please input correct value...");
            } else {
                area = pi * radius * radius;
                System.out.println("Area is " + area);
                break;
            }
        }
        return area;
    }

    // write a program that swaps two numbers
    // input is num1 = x and num2 = y
    // output should be num1 = y and num2 = x
    // try to solve this without using additional memory
    public static void swapTwoIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Swap tow integers");
        System.out.print("Input first integer: ");
        int firstInt = scanner.nextInt();
        System.out.print("Input second integer: ");
        int secondInt = scanner.nextInt();

        System.out.print("firstInt = " + firstInt + "\n" + "secondInt = " + secondInt + "\n");

        int temp = firstInt;
        firstInt = secondInt;
        secondInt = temp;

        System.out.print("firstInt = " + firstInt + "\n" + "secondInt = " + secondInt + "\n");

        System.out.print("firstInt = " + (firstInt + secondInt - firstInt)  + "\n" + "secondInt = " + (firstInt + secondInt - secondInt) + "\n");

    }

    // input integers array from standard input
    // insert integers into int[] array
    // print
    // print even numbers from int[] array
    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print even numbers");
        System.out.print("Input the size of array: ");
        final int count = scanner.nextInt();

        int[] sequence = new int[count];
        int index = 0;
        while (index < count) {
            sequence[index] = scanner.nextInt();
            index++;
        }

//        for (int i = 0; i < count; ++i) {
//            sequence[i] = scanner.nextInt();
//        }

        int counter = 0;

        for (int i = 0; i < sequence.length; ++i) {
            System.out.print(sequence[i] + " ");
            if (sequence[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println();

        int[] sequence2 = new int[counter];
        int j = 0;
        for (int i = 0; i < sequence.length; ++i) {
            if (sequence[i] % 2 == 0) {
                sequence2[j] = sequence[i];
                j++;
            }
        }

        System.out.println("Even numbers are: ");
        for (int i = 0; i < counter; ++i) {
            System.out.print(sequence2[i] + " ");
        }
    }

    public static void main(String[] args) {
        //swapTwoIntegers();
        printEvenNumbers();
//        int a = 10;
//        int b = ++a;
//        System.out.println("a " + a); // 11
//        System.out.println("b " + b); // 11
//
//        int c = b++;
//        System.out.println("c " + c); // 11
//        System.out.println("b " + b); // 12

    }

//    public static double areaOfCircle(double radius) {
//        final double pi = 3.14;
//        return pi * radius * radius;
//    }
//
//    public static void main (String[] args) {
//
//        System.out.println("Area of the circle");
//        System.out.print("Input radius: ");
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            double radius = scanner.nextDouble();
//            if (radius <= 0) {
//                System.out.println("Incorrect radius. Please input correct value...");
//            } else {
//                System.out.println("Area is " + areaOfCircle(radius));
//                break;
//            }
//        }
//    }
}
