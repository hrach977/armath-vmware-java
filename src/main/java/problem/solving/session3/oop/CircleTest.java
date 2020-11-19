package problem.solving.session3.oop;

import java.security.spec.RSAOtherPrimeInfo;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.4);
        Circle circle3 = new Circle(2.5, "green");
        Circle circle4 = new Circle();
        Circle circle5 = circle2;

        System.out.println("circle1 " + circle1.getRadius() + " " + circle1.getColor() + " " + circle1.getArea() + " " + circle1.getCircumference());
        System.out.println("circle2 " + circle2.getRadius() + " " + circle2.getColor() + " " + circle2.getArea() + " " + circle2.getCircumference());
        System.out.println("circle3 " + circle3.getRadius() + " " + circle3.getColor() + " " + circle3.getArea() + " " + circle3.getCircumference());

        circle2.setColor("blue");

        System.out.println("circle2 " + circle2.getRadius() + " " + circle2.getColor() + " " + circle2.getArea() + " " + circle2.getCircumference());

        circle2.setColor("black");
        System.out.println("circle2 " + circle2.getRadius() + " " + circle2.getColor() + " " + circle2.getArea() + " " + circle2.getCircumference());

        System.out.println("-----------------------------------------");
        //problem.solving.session3.oop.Circle@1540e19d
        System.out.println(circle1.toString());

        boolean areEqual = circle1.equals(circle2);
        System.out.println("Circle1 equals to circle2: " + areEqual);
        areEqual = circle1.equals(circle4);
        System.out.println("Circle1 equals to circle4: " + areEqual);
        areEqual = circle2.equals(circle5);
        System.out.println("Circle2 equals to circle5: " + areEqual);
    }
}
