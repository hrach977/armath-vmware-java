package homeworks.meline.abrahamyan;

public class WarmupOne {
//    Given a string, take the first 2 chars and return the string with the 2 chars
//    added at both the front and back, so "kitten" yields"kikittenki".
//    If the string length is less than 2, use whatever chars are there.
//    front22("kitten") → "kikittenki"
//    front22("Ha") → "HaHaHa"
//    front22("abc") → "ababcab"


    public static String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        String st = str.substring(0, 2);
        return st + str + st;
    }


//    Given a string, return true if the string starts with "hi" and false otherwise.
//
//
//    startHi("hi there") → true
//    startHi("hi") → true
//    startHi("hello hi") → false

    public static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        return (str.substring(0, 2).equals("hi"));
    }


//    Given two temperatures, return true if one is less than
//    0 and the other is greater than 100.
//
//
//    icyHot(120, -1) → true
//    icyHot(-1, 120) → true
//    icyHot(2, 120) → false


    public static boolean icyHot(int temp1, int temp2) {

        return ((temp1 > 100 && temp2 < 0) || (temp2 > 100 && temp1 < 0));
    }


//Given 2 int values, return true if either of them is in the range 10..20 inclusive.
//
//
//        in1020(12, 99) → true
//        in1020(21, 12) → true
//        in1020(8, 99) → false

    public static boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
//    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
//    Given 3 int values, return true if 1 or more of them are teen.
//
//
//    hasTeen(13, 20, 10) → true
//    hasTeen(20, 19, 10) → true
//    hasTeen(20, 10, 13) → true

    public static boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }
//    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
//    Given 2 int values, return true if one or the other is teen, but not both.
//
//
//    loneTeen(13, 99) → true
//    loneTeen(21, 19) → true
//    loneTeen(13, 13) → false
    public static boolean loneTeen(int a, int b){
        boolean abool = (a>=13 && a<=19);
        boolean bbool = (b>=13 && b<=19);
        return (abool && !bbool) || (!abool && bbool);
    }

//    Given a string, if the string "del" appears starting at index 1, return a string where
//    that "del" has been deleted. Otherwise, return the string unchanged.
//
//         delDel("adelbc") → "abc"
//         delDel("adelHello") → "aHello"
//         delDel("adedbc") → "adedbc"

    public static String delDel(String str) {
        if ((str.length()>=4) && str.substring(1,4).equals("del")) {
            return str.substring(0,1)+str.substring(4,str.length());
        }
        return str;
    }


//    Return true if the given string begins with "mix", except the 'm' can be anything,
//    so "pix", "9ix" .. all count.
//
//
//    mixStart("mix snacks") → true
//    mixStart("pix snacks") → true
//    mixStart("piz snacks") → false

    public static boolean mixStart(String str) {
        if (str.length()>=3 && str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }
//    Given a string, return a string made of the first 2 chars (if present),
//    however include first char only if it is 'o' and include the second only if
//    it is 'z', so "ozymandias" yields "oz".
//
//
//    startOz("ozymandias") → "oz"
//    startOz("bzoo") → "z"
//    startOz("oxx") → "o"

    public static String startOz(String str) {
        String st = "";
        if (str.length() >= 1 && str.charAt(0)=='o') {
            st = st + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1)=='z') {
            st = st + str.charAt(1);
        }

        return st;
    }

//    Given three int values, a b c, return the largest.
//
//
//    intMax(1, 2, 3) → 3
//    intMax(1, 3, 2) → 3
//    intMax(3, 2, 1) → 3

    public static int intMax(int a, int b, int c) {
        int max;
        if (a > b && a > c){
            max = a;
        }
        if (a > b && a > c){
            max = a;
        } else if (b > c && b > a){
            max = b;
        } else {
            max = c;
        }
        return max;
    }


//    Given 2 int values, return whichever value is nearest to the value 10,
//    or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
//
//
//    close10(8, 13) → 8
//    close10(13, 8) → 8
//    close10(13, 7) → 0

    public static int close10(int a, int b) {
        if (Math.abs(a-10) < Math.abs(b-10)) {
            return a;
        }
        if (Math.abs(a-10) > Math.abs(b-10)) {
            return b;
        }
        return 0;
    }

//    Given 2 int values, return true if they are both in the range 30..40 inclusive,
//    or they are both in the range 40..50 inclusive.
//
//
//    in3050(30, 31) → true
//    in3050(30, 41) → false
//    in3050(40, 50) → true

    public static boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40 && b >= 30 && b <= 40)) {
            return true;
        }
        if ((a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
            return true;
        }
        return false;
    }


//    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
//    or return 0 if neither is in that range.
//
//
//    max1020(11, 19) → 19
//    max1020(19, 11) → 19
//    max1020(11, 9) → 11

    public static int max1020(int a, int b) {
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20){
            if (a > b){
                return a;
            } else {
                return b;
            }
        }
        if (a >= 10 && a <= 20 && (b < 10 || b > 20)){
            return a;
        }
        if (b >= 10 && b <= 20 && (a < 10 || a > 20)){
            return b;
        }
        return 0;
    }


//    Return true if the given string contains between 1 and 3 'e' chars.
//
//
//    stringE("Hello") → true
//    stringE("Heelle") → true
//    stringE("Heelele") → false
  public static boolean stringE(String str) {
    int count = 0;
    if (str.length()>=1) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='e'){
                count++;
            }
        }
        if (count >= 1 && count <= 3){
            return true;
        }
    }
    return false;
}

//    Given two non-negative int values, return true if they have the same last digit,
//    such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
//
//
//    lastDigit(7, 17) → true
//    lastDigit(6, 17) → false
//    lastDigit(3, 113) → true

    public static boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

//    Given a string, return a new string where the last 3 chars are now in upper case.
//    If the string has less than 3 chars, uppercase whatever is there.
//    Note that str.toUpperCase() returns the uppercase version of a string.
//
//
//    endUp("Hello") → "HeLLO"
//    endUp("hi there") → "hi thERE"
//    endUp("hi") → "HI"

    public static String endUp(String str) {
        if (str.length() > 3) {
            String st = str.substring(str.length()-3,str.length());
            str = str.substring(0,str.length()-3);
            return str + st.toUpperCase();
        }
        return str.toUpperCase();
    }


//    Given a non-empty string and an int N, return the string made starting with char 0,
//    and then every Nth char of the string. So if N is 3,
//    use char 0, 3, 6, ... and so on. N is 1 or more.
//
//
//    everyNth("Miracle", 2) → "Mrce"
//    everyNth("abcdefg", 2) → "aceg"
//    everyNth("abcdefg", 3) → "adg"

    public static String everyNth(String str, int n) {
        String st = "";
        for (int i = 0; i < str.length(); i += n){
            st += str.charAt(i);
        }
        return st;
    }
}