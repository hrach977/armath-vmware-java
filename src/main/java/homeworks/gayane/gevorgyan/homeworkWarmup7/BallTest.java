package homeworks.gayane.gevorgyan.homeworkWarmup7;

public class BallTest {
    public static void main(String[] args) {
        Ball ball1 = new Ball(20, 15, 5, 3, 2);
        ball1.setxDelta(1.2f);
        ball1.setyDelta(2.0f);

        System.out.println(ball1.toString());

        System.out.println("ball1  " + "x= "+ ball1.getX() + ", y= " + ball1.getY() + ", radius= " + ball1.getRadius());
        ball1.move();

    }
}
