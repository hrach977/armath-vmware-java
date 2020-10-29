package lessons.lesson0;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    boolean canDrink() { //package private
        return age > 18;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Driver extends Person implements ICanDrive {

    Driver(String name, int age) {
        super(name, age);
    }

    @Override
    public void drive(String car) {

    }

}

interface ICanDrive {
    void drive(String car);
}

class Student extends Person {
    public Student(String name, int age) {
       super(name, age);
    }
}






class SomeClass {
    // instance. static(class)
    int instanceField;     //0
     static int classField = 10; //0

}

public class _1_Class {
    public static void main(String[] args) {
        Person bob = new Person("bob", 20);
        Driver john = new Driver("john", 20);

        System.out.println(bob); //lessons.lesson0.Person@16b98e56

        List<Person> persons = new ArrayList<>();

        persons.add(new Driver("joe", 17));
        persons.add(new Student("pam", 19));
        persons.add(new Person("jill", 20));

        Person a = new Person("a", 1);

        Person b = a;



//        for (Person person : persons) {
//            System.out.println(person.name + " can drink? " + person.canDrink());
//        }





//        Person ani = new Person("Ani", 30);
//        System.out.println("ani's name: " + ani.name);
//        System.out.println("ani's age: " + ani.age);
//        SomeClass obj1 = new SomeClass();
//        SomeClass obj2 = new SomeClass();
//        SomeClass obj3 = new SomeClass();
        //instance field
//        obj1.instanceField = 1;
//        obj2.instanceField = 2;
//        obj3.instanceField = 3;
        //class field
//        obj1.classField = 1;
//        obj2.classField = 2;
//        obj3.classField = 3;
//        System.out.println("instance field");
//        System.out.println("obj1.instanceField: " + obj1.instanceField);
//        System.out.println("obj2.instanceField: " + obj2.instanceField);
//        System.out.println("obj3.instanceField: " + obj3.instanceField);
//        System.out.println("class field");
//        System.out.println("obj1.classField: " + obj1.classField);
//        System.out.println("obj2.classField: " + obj2.classField);
//        System.out.println("obj3.classField: " + obj3.classField);
    }
}
