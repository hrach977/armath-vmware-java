package homeworks.gayane.gevorgyan.homework7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TheDateTest {
    public static void main(String[] args) {
      
        TheDate d1 = new TheDate(21,12,2020);
        TheDate d2 = new TheDate(23,10,2012);

        System.out.println(d1.toString());
        System.out.println("Day: " + d2.getDay() + ", Month: " + d2.getMonth() + ", Year: " + d2.getYear());
        d1.setDate(8,12, 1990);
        System.out.println("Day: " + d1.getDay() + ", Month: " + d1.getMonth() + ", Year: " + d1.getYear());
    }
}

