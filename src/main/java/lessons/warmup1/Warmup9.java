package lessons.warmup1;

import java.sql.SQLOutput;
import java.util.concurrent.Callable;

class Circle {
    double radius;
    String color ;

    Circle() {
        radius = 1.0;
        color = "red";
    };
    Circle(double radius, String color){

        this.radius = radius;
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }

    double getArea() {
        return Math.PI*radius*radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getCircumference(){
        return 2*Math.PI*radius;
    }
}


public class Warmup9 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2, "blue");
        System.out.println("c1 radius = " + c1.getRadius() + " c1 color = " + c1.getColor() + " c1 area = " + c1.getArea() + " c1 Circumference" + c1.getCircumference());
        System.out.println("c2 radius = " + c2.getRadius() + " c2 color = " + c2.getColor() + " c2 area = " + c2.getArea() + " c2 Circumference" + c2.getCircumference());
        c1.setColor(c2.getColor());
        c1.setRadius(c2.getRadius());
        System.out.println("c1 radius = " + c1.getRadius() + " c1 color = " + c1.getColor() + " c1 area = " + c1.getArea() + " c1 Circumference" + c1.getCircumference());
    }
}
