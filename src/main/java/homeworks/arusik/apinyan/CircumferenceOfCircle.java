package homeworks.arusik.apinyan;
import java.util.Scanner;
public class CircumferenceOfCircle {
//=============================================================================
    public static double circumferenceOfCircle() {
        System.out.println("Circumference of the circle");
        System.out.print("Input radius: ");
        Scanner scanner = new Scanner(System.in);

        final double pi = 3.14;
        double circumference = 0;
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

    public static void main(String[] args) {
        //circumferenceOfCircle();
        //radiusOfCircle();
        //areaOfRectangle();
        //swapNum1Num2();
        sumOfDigits();
    }
}