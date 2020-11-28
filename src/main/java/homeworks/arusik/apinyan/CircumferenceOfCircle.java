package homeworks.arusik.apinyan;

import java.util.Locale;
import java.util.Scanner;
public class CircumferenceOfCircle {
//=============================================================================
    public static double circumferenceOfCircle() {
        System.out.println("Circumference of the circle");
        System.out.print("Input radius: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        final double pi = 3.14;
        double circumference = 0.0;
        while (scanner.hasNext()) {
            double radius = scanner.nextDouble();
            if (radius < 0) {
                System.out.println("Radius should not be a negative number!");
            } else {
                circumference = 2 * pi * radius;
                System.out.println("Circumference of the circle with radius  " + radius + " is " + circumference);
                break;
            }
        }
        return circumference;
    }
//=======================================================================
    public static double radiusOfCircle() {
        System.out.println("Radius of the circle");
        System.out.println("Input area:");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        final double pi = 3.14;
        double radius = 0;
        while (scanner.hasNext()){
            double area = scanner.nextDouble();
            if (area < 0){
                System.out.println("Area should not be a negative number!");
            } else {
                radius = Math.sqrt(area / pi);
                System.out.println("Radius of the circle with area  " + area + " is " + radius);
                break;
            }
        }
        return radius;
    }
 //=============================================================================
    public static double areaOfRectangle() {
        System.out.println("Area of the rectangle");
        System.out.println("Input side:");
        Scanner scanner = new Scanner(System.in);
        double area = 0;
        double side = 0;
        while (scanner.hasNext()) {
            if (side < 0) {
                System.out.println("Area should not be a negative number!");
            } else {
                side = scanner.nextDouble();
                area = side * side;
                System.out.println("Area of the rectangle with side" + side + "side = " + area);
                break;
            }
        }
        return area;

    }
//=================================================================================
    public static void swapNum1Num2(){
        System.out.println("Input the num1:");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        System.out.println("Input the num2:");
        double num2 = scanner.nextDouble();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1 + " num2 = " + num2);
    }
 //=========================================================================
public static void sumOfDigits(){
        System.out.println("Input the int number >= 0 :");
        int sum = 0;
        int mod;
        Scanner scanner = new Scanner(System.in);
        int Num = scanner.nextInt();
        int num = Num;
        while (Num > 0) {
            mod = Num % 10;
            Num = (Num - mod)/10;
            sum = sum + mod;
        }

        System.out.println("Summation of digits of  " + num + " is = " + sum);

}
//======================================================
//6.	Write a program that prints all odd numbers in the array of integers.
public static void printOddNumbers() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Print odd numbers");
    System.out.print("Input the size of array: ");
    final int count = scanner.nextInt();

    int[] sequence = new int[count];
    int index = 0;
    while (index < count && scanner.hasNext()) {
        sequence[index] = scanner.nextInt();
        index++;
    }
    int counter = 0;
    for (int i = 0; i < sequence.length; ++i) {
        System.out.print(sequence[i] + " ");
        if (sequence[i] % 2 != 0) {
            counter++;
        }
    }
    System.out.println();
    if (counter == 0){
        System.out.println("There are no odd numbers in the array!");
        return;
    } else {
        int[] sequence2 = new int[counter];
        int j = 0;
        for (int i = 0; i < sequence.length; ++i) {
            if (sequence[i] % 2 != 0) {
                sequence2[j] = sequence[i];
                j++;
            }
        }

        System.out.println("Odd numbers are: ");
        for (int i = 0; i < counter; ++i) {
            System.out.print(sequence2[i] + " ");
        }
    }
    }




    public static void main(String[] args) {
        //circumferenceOfCircle();
        radiusOfCircle();
        //areaOfRectangle();
        //swapNum1Num2();
        //sumOfDigits();
            //printOddNumbers();
    }
}