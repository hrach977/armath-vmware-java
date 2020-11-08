package homeworks.Gayane_Gevorgyan;

import java.util.Scanner;

public class RectangleArea{
    public static void main(String[] args) {
        System.out.println("Calculating area of the rectangle…");
        System.out.print("Please input the side of rectangle: ");
        Scanner number = new Scanner(System.in);
        double area = 0.0;

        while (number.hasNext()){
            double side =  number.nextDouble();
            if (side >= 0){
                area = side * side;
                System.out.println("Area of rectangle with side " + side +" is: " + area);
                break;
            }
            System.out.println("Side should not be a negative number!");
        }
    }

}