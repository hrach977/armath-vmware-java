package lessons.lesson1;

interface CanDrive {
//    static int f1 = 1;
    void accelerate();
}

interface HasName {
    void sayMyName();
}

class SportsCar implements CanDrive, HasName {

    @Override
    public void accelerate() {
        System.out.println("SportsCar is accelerating");
    }


    @Override
    public void sayMyName() {
        System.out.println("I am a sports car");
    }
}

class Bus implements CanDrive, HasName {

    @Override
    public void accelerate() {
        System.out.println("Bus is accelerating");
    }

    @Override
    public void sayMyName() {
        System.out.println("I am a bus");
    }
}

abstract class Person implements HasName {
    String name; //visibility - package private/protected default visibility
    int age;
    double someDouble;

    public void sayMyName() {
        System.out.println("My name is " + name);
    }

    abstract void sayMyAge();
}

class Student extends Person {

    @Override
    void sayMyAge() {
        System.out.println("I am " + age + " years old student");
    }

}

class Doctor extends Person {

    @Override
    void sayMyAge() {
        System.out.println("I am " + age + " years old doctor");
    }

    @Override
    public void sayMyName() {
        System.out.println("My name is doctor " + name);
    }
}



public class _3_ClassesPlayground {

    public static void main(String[] args) {
        Person student = new Student();
        student.name = "Valod";
        student.age = 25;
        student.sayMyName();
        student.sayMyAge();

        HasName student2 = new Student();
//        student2.name
//        student2.sayMyAge();


        Person doctor = new Doctor();
        doctor.name= "Volodya Sergeeich";
        doctor.age = 53;
        doctor.sayMyName();
        doctor.sayMyAge();

//        SportsCar car1 = new SportsCar();
//        car1.accelerate();
//        car1.sayMyName();
//
//        CanDrive car2 = new SportsCar();
//        car2.accelerate();
//        //car2.sayMyName();
//
//        HasName car3 = new SportsCar();
//        car3.sayMyName();
////        car3.accelerate();  not visible from interface type
//
//        Bus bus1 = new Bus();
//        bus1.accelerate();
//        bus1.sayMyName();
//
//        CanDrive bus2 = new Bus();
//        bus2.accelerate();
////        bus2.sayMyName();
//
//        HasName bus3 = new Bus();
//        bus3.sayMyName();
////        bus3.accelerate();  not visible from interface type

    }
}
