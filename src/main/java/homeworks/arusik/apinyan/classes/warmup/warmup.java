package homeworks.arusik.apinyan.classes.warmup;

public class warmup {
    public static void main(String[] args) {
        /*System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));*/



    }

    // Given a string, take the first 2 chars and return the string
    // with the 2 chars added at both the front and back,
    // so "kitten" yields"kikittenki".
    // If the string length is less than 2, use whatever chars are there.


    static String front22(String str) {
        String front;
        if (str.length() < 2){
            front = str;
        } else {
            front = str.substring(0,2);
        }
        return front + str + front;
    }

// result will be
// front22("kitten") → "kikittenki"
//front22("Ha") → "HaHaHa"
//front22("abc") → "ababcab"
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Given a string, return true if the string starts with "hi" and false otherwise.


// startHi("hi there") → true
//startHi("hi") → true
//startHi("hello hi") → false


//    static  boolean startHi(String str) {
//        String start;
//        if (str.length() > 2 || str.length() == 2){
//            start = str.substring(0,2);
//            if (start == "hi") {
//                return true;
//            } return false;
//        }  return false;
//
//
//        }
//    }




}
