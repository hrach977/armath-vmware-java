package lessons.lesson1.visbility;

import java.io.File;

class A {
    public int f1;
    protected int f2;
    int f3; //package private; default; package protected
    private int f4;

    public void m1() {

    }

    protected void m2() {

    }

    void m3() {

    }

    private void m4() {

    }

}

class B extends A {
    B() {
        this.f1 = 0; //visible since public
        this.f2 = 0; //visible since extending
        this.f3 = 0; //visible since same package
//        this.f4 = 0  inaccessible since private

        this.m1(); //visible since public
        this.m2(); //visible since extending
        this.m3(); //visible since same package
//        this.m4(); inaccessible since private
    }
}