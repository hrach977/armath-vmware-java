package homeworks.arusik.apinyan;


public class WarmUp {
    public static void main(String[] args) {
        /*System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));*/
//==============================================================
        /*System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));*/
//===============================================================

        /*System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1, 120));
        System.out.println(icyHot(2, 120));*/
//============================================================
        /*System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));*/
//===========================================

        /*System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));*/
        //====================================================
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }

    static String front22(String str) {
        String front;
        if (str.length() < 2) {
            front = str;
        } else {
            front = str.substring(0, 2);
        }

        return front + str + front;
    }
    //=================================================
    /*Given a string, return true if the string starts with "hi" and false otherwise.


    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false
*/
    static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        } else {
            return (str.startsWith("hi"));
        }
    }

    //=========================================================
    //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    //
    //
    //icyHot(120, -1) → true
    //icyHot(-1, 120) → true
    //icyHot(2, 120) → false
    static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100));
    }
    //===========================================================================
    //Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    //
    //
    //in1020(12, 99) → true
    //in1020(21, 12) → true
    //in1020(8, 99) → false
    static boolean in1020(int a, int b) {
        if (a < 10 || a > 20) {
            if (b < 10 || b > 20) {
                return false;
            }
        } return true;
    }
    //===========================================================================

    //We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    // Given 3 int values, return true if 1 or more of them are teen.
    //
    //
    //hasTeen(13, 20, 10) → true
    //hasTeen(20, 19, 10) → true
    //hasTeen(20, 10, 13) → true

    static boolean hasTeen(int a, int b, int c) {
        if (a < 13 || a > 19) {
            if (b < 13 || b > 19) {
                if (c < 13 || c > 19) {
                    return false;
                }
            }
        } return true;
    }
    //============================================================
    //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
    //
    //
    //loneTeen(13, 99) → true
    //loneTeen(21, 19) → true
    //loneTeen(13, 13) → false
    static boolean loneTeen(int a, int b) {
        return(((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) && !((a >= 13 && a <= 19) && (b >= 13 && b <= 19)));


    }

    //=============================================================
    //Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
    //
    //
    //delDel("adelbc") → "abc"
    //delDel("adelHello") → "aHello"
    //delDel("adedbc") → "adedbc"
    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {

            return str.charAt(0) + str.substring(4);
        }

        return str;
    }
    //=================================================================
    //Return true if the given string begins with "mix",
    // except the 'm' can be anything, so "pix", "9ix" .. all count.
    //
    //
    //mixStart("mix snacks") → true
    //mixStart("pix snacks") → true
    //mixStart("piz snacks") → false

    static boolean mixStart(String str) {
        return (str.length() >= 3 && (str.substring(1, 3).equals("ix")));
    }

}








