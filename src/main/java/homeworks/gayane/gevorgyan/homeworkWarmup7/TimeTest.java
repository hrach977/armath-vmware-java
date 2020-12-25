package homeworks.gayane.gevorgyan.homeworkWarmup7;

public class TimeTest {
    public static void main(String[] args) {
        TheTime t1 = new TheTime(22, 30, 11);

        System.out.println(t1.toString());
        System.out.println(t1.nextSecond());
        System.out.println("Hour: " + t1.getHour() + " Minute: " + t1.getMinute() + " Second: " + t1.getSecond()+ " PreviousSecond: " + t1.previousSecond());
    }
}
