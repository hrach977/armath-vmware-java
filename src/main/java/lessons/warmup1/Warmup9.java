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
//        Circle c1 = new Circle();
//        Circle c2 = new Circle(2, "blue");
//        System.out.println("c1 radius = " + c1.getRadius() + " c1 color = " + c1.getColor() + " c1 area = " + c1.getArea() + " c1 Circumference" + c1.getCircumference());
//        System.out.println("c2 radius = " + c2.getRadius() + " c2 color = " + c2.getColor() + " c2 area = " + c2.getArea() + " c2 Circumference" + c2.getCircumference());
//        c1.setColor(c2.getColor());
//        c1.setRadius(c2.getRadius());
//        System.out.println("c1 radius = " + c1.getRadius() + " c1 color = " + c1.getColor() + " c1 area = " + c1.getArea() + " c1 Circumference" + c1.getCircumference());Rectangle r1 = new Rectangle();

    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(4.0, 5.0);
    Rectangle r3 = new Rectangle();
    r3.setLength(10.0);
    r3.setWidth(7.0);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
    }
}

class Rectangle {
    double width;
    double length;

    Rectangle(){
        width = 1.0;
        length = 2.0;
    }

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

     double getLength() {
        return length;
    }

     double getWidth() {
        return width;
    }

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getArea(){
        return width * length;
    }
    double getPerimeter(){
        return 2 * ( width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", Area = " + getArea() +
                "' Perimeter = " + getPerimeter() +
                '}';
    }
}


