package lessons.lesson1;

import java.lang.annotation.*;

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

    static class StaticNestedClass {
        int f2;
    }

    //very bad practice
    void localInnerClass() {
        class LocalInnerClass {

        }
        LocalInnerClass someInstance = new LocalInnerClass();
    }

    void anonInnerClass() {
        I instanceOfI = new I() {

            @Override
            public void m1() {
                System.out.println("my custom implementation");
            }

        };

        A instanceOfA = new A() {

            @Override
            public void m1() {

            }

            @Override
            void m2() {

            }

            @Override
            void m3() {

            }

            void m3(int a) {

            }
        };
    }


}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Metadata {
    String author();
    String version();
}

@Metadata(
        author = "Hrach",
        version = "0.1"
)
class AnnotatedType {

    @Metadata(
            author = "Hrach",
            version = "0.1"
    )
    void m1() {

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
//        Color red = Color.RED;
//        Color anotherRed = Color.RED;
//
//        System.out.println(red.blue);
//        anotherRed.blue = 42;
//        System.out.println(red.blue);
//        System.out.println(red == anotherRed);

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.f2 = 5;
        System.out.println(staticNestedClass.f2);



    }

}