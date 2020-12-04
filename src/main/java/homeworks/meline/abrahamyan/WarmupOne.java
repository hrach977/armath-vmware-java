package homeworks.meline.abrahamyan;

public class WarmupOne {
//    Given a string, take the first 2 chars and return the string with the 2 chars
//    added at both the front and back, so "kitten" yields"kikittenki".
//    If the string length is less than 2, use whatever chars are there.
//    front22("kitten") → "kikittenki"
//    front22("Ha") → "HaHaHa"
//    front22("abc") → "ababcab"


    public String front22(String str) {
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

    public boolean startHi(String str) {
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


    public boolean icyHot(int temp1, int temp2) {

        return ((temp1 > 100 && temp2 < 0) || (temp2 > 100 && temp1 < 0));
    }


//Given 2 int values, return true if either of them is in the range 10..20 inclusive.
//
//
//        in1020(12, 99) → true
//        in1020(21, 12) → true
//        in1020(8, 99) → false

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
//    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
//    Given 3 int values, return true if 1 or more of them are teen.
//
//
//    hasTeen(13, 20, 10) → true
//    hasTeen(20, 19, 10) → true
//    hasTeen(20, 10, 13) → true

    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }
//    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
//    Given 2 int values, return true if one or the other is teen, but not both.
//
//
//    loneTeen(13, 99) → true
//    loneTeen(21, 19) → true
//    loneTeen(13, 13) → false
    public boolean loneTeen(int a, int b){
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

    public String delDel(String str) {
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

    public boolean mixStart(String str) {
        if (str.length()>=3 && str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }


}