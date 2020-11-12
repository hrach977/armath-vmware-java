package lessons.lesson1;

interface I {
    void m1();
}

class ConcreteClass implements I {

    @Override
    public void m1() {

    }
}

abstract class A implements I {

    int f1;

    void m2() {

    }

    abstract void m3();

    @Override
    public void m1() {

    }
}

final class B {

}


//class TriesToExtendFinalClass extends B {
//
//}

//Inner classes
class OuterClass {
    private int outerPrivateInt;
    int field1;
    int outerInt;
    void method1() {
    }

    class InnerClass {
        int field1;
        int innerInt;
        void innerMethod() {
            outerPrivateInt = 2;
        }
        void method1() {
            OuterClass.this.field1 = 2;
            innerInt = 3;
            outerInt = 4;
        }
    }

}

enum Date {
    SUNDAY, MONDAY
}

enum Color {
    RED(1, 2, 3),
    GREEN(4, 5, 6),
    BLUE(7, 8, 9);

    int red;
    int green;
    int blue;

    Color(int red, int green, int blue) {
       this.red = red;
       this.green = green;
       this.blue = blue;
    }
}



public class _2_TypesOfClasses {

    public static void main(String[] args) {
//        OuterClass outer = new OuterClass();
//        OuterClass.InnerClass innerClass = outer.new InnerClass();
//        innerClass.field1 = 1;
//        innerClass.method1();
//
//        outer.field1 = 2;
//        outer.method1();
//
//       Color red = Color.RED;
//       red.red = 1;
//
//       Color green = Color.GREEN;
//
//        Color blue = Color.BLUE;
//        Color someOtherColor = Color.BLUE;
        Color red = Color.RED;
        Color anotherRed = Color.RED;

        System.out.println(red.blue);
        anotherRed.blue = 42;
        System.out.println(red.blue);
        System.out.println(red == anotherRed);
    }

}