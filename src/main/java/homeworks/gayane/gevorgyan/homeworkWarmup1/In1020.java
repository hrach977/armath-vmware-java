package homeworks.gayane.gevorgyan.homeworkWarmup1;

public class In1020 {
    public static void main(String[] args) {
        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));
    }

//    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
//
//    in1020(12, 99) → true
//    in1020(21, 12) → true
//    in1020(8, 99) → false

    static boolean in1020(int number1, int number2){
        return ((number1 > 10 && number1 < 20) || (number2 > 10 && number2 < 20));
    }
}
