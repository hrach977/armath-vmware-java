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

    public static void main(String[] args) {
        circumferenceOfCircle();
    }
}