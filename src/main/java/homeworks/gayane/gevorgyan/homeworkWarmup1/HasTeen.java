package homeworks.gayane.gevorgyan.homeworkWarmup1;

public class HasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));

    }
//    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
//    Given 3 int values, return true if 1 or more of them are teen.
//
//    hasTeen(13, 20, 10) → true
//    hasTeen(20, 19, 10) → true
//    hasTeen(20, 10, 13) → true

    static boolean hasTeen(int num1, int num2, int num3){
        return ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19));

    }
}
