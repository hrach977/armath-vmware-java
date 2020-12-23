//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package homeworks.meline.abrahamyan;

import java.io.PrintStream;



    public double getArea() {
        return this.side1 * this.side2;
    }

    public double getPerimeter() {
        return 2.0 * (this.side1 + this.side2);
    }

    public String toString() {
        return "rectangle {side1 = " + this.side1 + ", side2 = " + this.side2 + ", color = '" + this.color + "'\n}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Rectangle)) {
            return false;
        } else {
            Rectangle temp = (Rectangle)o;
            return temp.getColor.equals(this.color) && temp.getSide1 == this.side1 && temp.side1 == this.side1;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.4D, 5.0D);
        Rectangle rectangle3 = new Rectangle(2.5D, 6.0D, "green");
        Rectangle rectangle4 = new Rectangle();
        PrintStream var10000 = System.out;
        double var10001 = rectangle1.getSide1();
        var10000.println("rectangle1 side1 = " + var10001 + ", side1 = " + rectangle1.getSide2() + ", color = " + rectangle1.getColor() + ",  Area = " + rectangle1.getArea() + ", Perimeter = " + rectangle1.getPerimeter());
        var10000 = System.out;
        var10001 = rectangle2.getSide1();
        var10000.println("rectangle2 side1 = " + var10001 + ", side1 = " + rectangle2.getSide2() + ", color = " + rectangle2.getColor() + ",  Area = " + rectangle2.getArea() + ", Perimeter = " + rectangle2.getPerimeter());
        var10000 = System.out;
        var10001 = rectangle1.getSide1();
        var10000.println("rectangle1 side1 = " + var10001 + ", side1 = " + rectangle1.getSide2() + ", color = " + rectangle1.getColor() + ",  Area = " + rectangle1.getArea() + ", Perimeter = " + rectangle1.getPerimeter());
        rectangle2.setColor("blue");
        var10000 = System.out;
        var10001 = rectangle2.getSide1();
        var10000.println("rectangle2 side1 = " + var10001 + ", side1 = " + rectangle2.getSide2() + ", color = " + rectangle2.getColor() + ",  Area = " + rectangle2.getArea() + ", Perimeter = " + rectangle2.getPerimeter());
        rectangle1.setColor("black");
        var10000 = System.out;
        var10001 = rectangle1.getSide1();
        var10000.println("rectangle1 side1 = " + var10001 + ", side1 = " + rectangle1.getSide2() + ", color = " + rectangle1.getColor() + ",  Area = " + rectangle1.getArea() + ", Perimeter = " + rectangle1.getPerimeter());
        System.out.println("-----------------------------------------");
        System.out.println(rectangle1.toString());
        boolean areEqual = rectangle1.equals(rectangle2);
        System.out.println("rectangle1 equals to rectangle2: " + areEqual);
        areEqual = rectangle1.equals(rectangle4);
        System.out.println("rectangle1 equals to rectangle4: " + areEqual);
        areEqual = rectangle2.equals(rectangle2);
        System.out.println("rectangle2 equals to rectangle5: " + areEqual);
    }
}
