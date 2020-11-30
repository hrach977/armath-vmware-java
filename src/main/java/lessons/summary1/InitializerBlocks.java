package lessons.summary1;

class SomeClass {
    {
        System.out.println("I execute every time");
    }

    static {
        System.out.println("I execute just once");
    }
}

public class InitializerBlocks {

    public static void main(String[] args) {
        SomeClass one = new SomeClass();
        SomeClass two = new SomeClass();
        SomeClass three = new SomeClass();
    }

}
