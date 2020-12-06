package homeworks.gayane.gevorgyan.homeworkWarmup1;

public class LoneTeen {
    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));

    }

//    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
//    Given 2 int values, return true if one or the other is teen, but not both.
//
//    loneTeen(13, 99) → true
//    loneTeen(21, 19) → true
//    loneTeen(13, 13) → false
    static boolean loneTeen(int num1, int num2){
       return ((num1 >= 13 && num1 <= 19) && !(num2 >= 13 && num2 <= 19)) || (!(num1 >= 13 && num1 <= 19) && (num2 >= 13 && num2 <= 19));
    }
}
