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
//===================================================
//Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//
//startOz("ozymandias") → "oz"
//startOz("bzoo") → "z"
//startOz("oxx") → "o"

    static String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;

    }
    //========================================================
    //Given three int values, a b c, return the largest.
    //
    //
    //intMax(1, 2, 3) → 3
    //intMax(1, 3, 2) → 3
    //intMax(3, 2, 1) → 3
    static int intMax(int a, int b, int c) {
        int max;
        if (a > b && a > c){
            max = a;
        } else if(b > c){
            max = b;
        } else {
            max = c;
        }
        return max;
    }
    //=================================================
    //Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
    //
    //
    //close10(8, 13) → 8
    //close10(13, 8) → 8
    //close10(13, 7) → 0

    static int close10(int a, int b) {
        if(Math.abs(a - 10) == Math.abs(b - 10)){
            return 0;
        } else if(Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        }else {
            return b;
        }
    }
    //==============================================
    //Given 2 int values, return true if they are both in the range 30..40 inclusive,
    // or they are both in the range 40..50 inclusive.
    //
    //
    //in3050(30, 31) → true
    //in3050(30, 41) → false
    //in3050(40, 50) → true
    static boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40 && b >= 30 && b <= 40 ) || (a >= 40 && a <= 50 && b >= 40 && b <= 50 )) ? true : false;


    }
    //================================================
    //Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    //  or return 0 if neither is in that range.
    //
    //
    //max1020(11, 19) → 19
    //max1020(19, 11) → 19
    //max1020(11, 9) → 11
    static int max1020(int a, int b) {
        int res;
        if (b > a){
            res = a;
            a = b;
            b = res;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
    //========================================
    //Return true if the given string contains between 1 and 3 'e' chars.
    //
    //
    //stringE("Hello") → true
    //stringE("Heelle") → true
    //stringE("Heelele") → false
    static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'e')
                count ++;
        }
        return(count >= 1 && count <= 3);
    }
    //==========================================
    //
}








