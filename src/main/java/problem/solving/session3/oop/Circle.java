package problem.solving.session3.oop;

import java.util.Objects;

public class Circle {

    private final double PI = 3.14;

    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle (double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() { return color; }

    public void setColor (String color) {
        if (!color.equals("black")) {
            this.color = color;
        }
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Circle) {
            Circle temp = (Circle) o;
            return temp.color.equals(this.color) && temp.radius == this.radius;
        }
        return false;
    }

}
