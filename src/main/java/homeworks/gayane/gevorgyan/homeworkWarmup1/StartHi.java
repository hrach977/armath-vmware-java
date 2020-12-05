package homeworks.gayane.gevorgyan.homeworkWarmup1;
import java.lang.String;

public class StartHi {

    public static void main(String[] args) {

        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }

//    Given a string, return true if the string starts with "hi" and false otherwise.
//
//    startHi("hi there") → true
//    startHi("hi") → true
//    startHi("hello hi") → false

    static boolean startHi(String str){
        return str.substring(0,2).equals("hi");
    }
}
