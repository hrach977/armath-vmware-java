package homeworks.meline.abrahamyan;

public class rectangle {
    private double side1;
    private double side2;
    private String color;

    public rectangle() {
        side1 = 1.0;
        side2 = 2.0;
        color = "red";
    }

    public rectangle(double x, double y) {
        side1 = x;
        side2 = y;
        color = "red";
    }

    public rectangle(double x, double y, String c) {
        side1 = x;
        side2 = y;
        color = c;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side1) {
        this.side2 = side2;
    }

    public String getColor() {
        return color;
    }

    public void setColor( String color ) {
        if (!color.equals("black")) {
            this.color = color;
        }
    }

    public double getArea() {
        return side1 * side2;
    }

    public double getPerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public String toString() {
        return "rectangle" + "{" +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", color = '" + color + "'\n" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof homeworks.meline.abrahamyan.rectangle) {
            homeworks.meline.abrahamyan.rectangle temp = (homeworks.meline.abrahamyan.rectangle) o;
            return temp.color.equals(this.color) && temp.side1 == this.side1 &&
                    temp.side1 == this.side1;
        }
        return false;
    }


    public static void main(String[] args) {
        homeworks.meline.abrahamyan.rectangle rectangle1 = new homeworks.meline.abrahamyan.rectangle();
        homeworks.meline.abrahamyan.rectangle rectangle2 = new homeworks.meline.abrahamyan.rectangle(2.4, 5);
        homeworks.meline.abrahamyan.rectangle rectangle3 = new homeworks.meline.abrahamyan.rectangle(2.5, 6,"green");
        homeworks.meline.abrahamyan.rectangle rectangle4 = new homeworks.meline.abrahamyan.rectangle();
        homeworks.meline.abrahamyan.rectangle rectangle5  = rectangle2;

        System.out.println("rectangle1 " + "side1 = " + rectangle1.getSide1() + ", " + "side1 = " + rectangle1.getSide2() + ", " +  "color = " + rectangle1.getColor() + ",  " + "Area = " + rectangle1.getArea() + ", " + "Perimeter = " + rectangle1.getPerimeter());
        System.out.println("rectangle2 " + "side1 = " + rectangle2.getSide1() + ", " + "side1 = " + rectangle2.getSide2() + ", " +  "color = " + rectangle2.getColor() + ",  " + "Area = " + rectangle2.getArea() + ", " + "Perimeter = " + rectangle2.getPerimeter());
        System.out.println("rectangle1 " + "side1 = " + rectangle1.getSide1() + ", " + "side1 = " + rectangle1.getSide2() + ", " +  "color = " + rectangle1.getColor() + ",  " + "Area = " + rectangle1.getArea() + ", " + "Perimeter = " + rectangle1.getPerimeter());
        rectangle2.setColor("blue");

        System.out.println("rectangle2 " + "side1 = " + rectangle2.getSide1() + ", " + "side1 = " + rectangle2.getSide2() + ", " +  "color = " + rectangle2.getColor() + ",  " + "Area = " + rectangle2.getArea() + ", " + "Perimeter = " + rectangle2.getPerimeter());
        rectangle1.setColor("black");
        System.out.println("rectangle1 " + "side1 = " + rectangle1.getSide1() + ", " + "side1 = " + rectangle1.getSide2() + ", " +  "color = " + rectangle1.getColor() + ",  " + "Area = " + rectangle1.getArea() + ", " + "Perimeter = " + rectangle1.getPerimeter());
        System.out.println("-----------------------------------------");
        //problem.solving.session3.oop.Circle@1540e19d
        System.out.println(rectangle1.toString());

        boolean areEqual = rectangle1.equals(rectangle2);
        System.out.println("rectangle1 equals to rectangle2: " + areEqual);
        areEqual = rectangle1.equals(rectangle4);
        System.out.println("rectangle1 equals to rectangle4: " + areEqual);
        areEqual = rectangle2.equals(rectangle5);
        System.out.println("rectangle2 equals to rectangle5: " + areEqual);
    }
}

