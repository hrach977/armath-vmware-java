package lessons.lesson1;


import java.math.BigDecimal;
import java.util.Objects;

class IntHolder {
    int a;

    IntHolder(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntHolder intHolder = (IntHolder) o;
        return a == intHolder.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof IntHolder) {
//            IntHolder other = (IntHolder) obj;
//            return this.a == other.a;
//        }
//        return false;
//    }
}

public class _5_ObjectPlayground {

    public static void main(String[] args) {

        IntHolder first = new IntHolder(1);
        IntHolder second = new IntHolder(1);
        IntHolder third = first;

        System.out.println("equality by reference: " + (first == second));
        System.out.println("equality by reference: " + (first == third));
        System.out.println("equality by value: " + (first.equals(second)));
        System.out.println("equality by value: " + (first.equals(third)));


//        BigDecimal
        calculateSum(1, 2);
        calculateSum(1, 2, 3);
        calculateSum(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    static int calculateSum(int... a) {
        return 1;
    }

//    int sum(int a1, int a2) {
//
//    }
//
//    int sum(int a1, int a2, int a3) {
//
//    }
//
//    int sum(int a1, int a2, int a3, int a3, int a3, int a3, int a3, int a3, int a3, int a3, int a3) {
//
//    }


}
