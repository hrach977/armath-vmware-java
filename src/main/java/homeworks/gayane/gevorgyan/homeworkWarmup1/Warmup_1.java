package homeworks.gayane.gevorgyan.homeworkWarmup1;

public class Warmup_1 {
    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
        System.out.println(front22("a"));
    }

//    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
//    so "kitten" yields"kikittenki".
//    If the string length is less than 2, use whatever chars are there.
//
//    front22("kitten") → "kikittenki"
//    front22("Ha") → "HaHaHa"
//    front22("abc") → "ababcab"

    static String front22(String str){
        String temp = str.substring(0,2);
        if (str.length() < 2){
            return str + str + str;
        }
        return temp + str + temp;
    }
}
