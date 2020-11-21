package homeworks.gayane.gevorgyan.homework4;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.5f, 5.4f );
        Rectangle rectangle3 = new Rectangle(2.0f, 3.5f, "blue");

        System.out.println("rectangle1: " +  "color = " + rectangle1.getColor() + "  area = " + rectangle1.getArea() + " perimeter = "+ rectangle1.getPerimeter());
        System.out.println("rectangle2: " +  "color = " + rectangle2.getColor() + "  area = " + rectangle2.getArea() + " perimeter = "+ rectangle2.getPerimeter());
        System.out.println("rectangle3 : " +  "color =  " + rectangle3.getColor() + "  area = " + rectangle3.getArea() + " perimeter = "+ rectangle3.getPerimeter());
    }
}
