package lessons.lesson1;

//class ImmutableIntHolder {
//    final IntHolder value;
//
//    public ImmutableIntHolder() {
//        this.value = 1;
//    }
//
//    public IntHolder getValue() {
//        return value;
//    }
//}


public class _6_Immutable {

    public static void main(String[] args) {
//        String someString = "a";
//        someString = "b";

//        StringBuilder;
        String a = "abc" + "bca" + "cde";
        System.out.println(a);

        String b = concat("abc", "asd");
        System.out.println(b);

        String first = "abc";
        String second = "bcd";
        System.out.println(concat(first, second));
    }

    static String concat(String a, String b) {
        return a + b;
    }
}
