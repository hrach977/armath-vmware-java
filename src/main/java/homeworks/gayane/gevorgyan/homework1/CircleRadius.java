package homeworks.gayane.gevorgyan.homework1;

import java.util.Scanner;
import java.lang.Math;

public class CircleRadius{

    public static double CircleRadius(){
        System.out.println("Calculating radius of the circle having its area…");
        System.out.print("Please input the area: ");
        Scanner number = new Scanner(System.in);
        double pi = 3.14;
        double radius = 0.0;

        while(number.hasNext()){
            double area = number.nextDouble();
             if (area >= 0){
                 radius = Math.sqrt(area/pi);
                 System.out.println("Radius of the circle with area = " + area + " is: " + radius);
                 break;
             }
            System.out.println("Area should not be a negative number!");
        }
        return radius;
    }
    public static void main(String[] args) {
        CircleRadius();

    }
}