package lessons.lesson1;

public class _7_WrapperTypesExample {

    //int, double, boolean etc.
//    Integer, Double, Boolean

    public static void main(String[] args) {
        int a = 1;
        Integer b = 1;

        Integer first = Integer.valueOf(42);
        Integer second = Integer.valueOf(42);

        System.out.println("eqaulity by value: " + first.equals(second));
        System.out.println("eqaulity by reference: " + (first == second));

    }
}

