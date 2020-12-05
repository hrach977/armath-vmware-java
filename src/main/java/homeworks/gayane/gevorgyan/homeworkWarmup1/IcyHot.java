package homeworks.gayane.gevorgyan.homeworkWarmup1;

public class IcyHot {
    public static void main(String[] args) {
        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1, 120));
        System.out.println(icyHot(2, 120));

    }
//    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
//
//    icyHot(120, -1) → true
//    icyHot(-1, 120) → true
//    icyHot(2, 120) → false

    static boolean icyHot(int temper1, int temper2){
        return ((temper1 < 0 && temper2 > 100) || (temper1 >100 && temper2 < 0));

    }
}
