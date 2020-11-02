package lessons.lesson0;

public class _8_OtherOperators {

    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is: " + b);

        String name = "James";
        boolean result = name instanceof String;
        System.out.println(result);
        boolean isObject = name instanceof Object;
        System.out.println(isObject);
    }
}
