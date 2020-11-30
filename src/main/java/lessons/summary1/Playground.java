package lessons.summary1;


class A {

}

class B extends A {

}

class C extends B {

}


public class Playground {

    static void incrementNum(int num) {
        num+=5;
    }


    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//        C c = new C();
//        boolean isC = c instanceof C;
//        System.out.println(isC);
//        boolean isB = c instanceof B;
//        System.out.println(isB);

//        int param = 40;
//        incrementNum(param);
//        System.out.println(param);
        Number param = new Number(40);
        incrementTheNumber(param);
        System.out.println(param.val);
    }

    static void incrementTheNumber(Number number) {
        number = new Number(80);
        number.incrementVal();
    }
}

class Number {
    int val;

    Number(int val) {
        this.val = val;
    }

    void incrementVal() {
        val+=5;
    }
}
