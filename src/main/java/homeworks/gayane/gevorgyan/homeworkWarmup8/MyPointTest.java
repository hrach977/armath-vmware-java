package homeworks.gayane.gevorgyan.homeworkWarmup8;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(2,2);
        int [] xy = new int[2];
        xy[0] = p2.getX();
        xy[1] = p2.getY();
        System.out.println("x= " + p2.getX() + ", y= " + p2.getY());
        System.out.println(p2.toString());
        p2.setXY(5, 4);
        System.out.println(p2.toString());
        p2.distance(10, 10);
        System.out.println("distance  " + p2.distance(10,10));

    }
}
