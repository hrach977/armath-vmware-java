package homeworks.arusik.apinyan;
import java.util.Scanner;
public class CircumferenceOfCircle {

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
    public static void main(String[] args) {
        //radiusOfCircle();
        areaOfRectangle();
    }
}