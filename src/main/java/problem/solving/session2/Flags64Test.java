package problem.solving.session2;

public class Flags64Test {

    public static void main(String[] args) {
        Flags64 num = new Flags64();

        System.out.println("initial state");
        System.out.println(num);
        System.out.println("get bit at position 4");
        System.out.println(num.get(3));
        System.out.println("set bit at position 4");
        num.set(true, 3);
        System.out.println(num);
        System.out.println("get bit at position 4");
        System.out.println(num.get(3));
        System.out.println("flip bit at position 4");
        num.flip(3);
        System.out.println(num);


    }
}
