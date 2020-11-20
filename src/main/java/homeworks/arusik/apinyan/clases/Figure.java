package homeworks.arusik.apinyan.clases;

interface IDrawable {
    void Draw ();
}
abstract class Figure implements homeworks.arusik.apinyan.clases.IDrawable {
    void defineFigure() {

    }
}
abstract class Circle implements homeworks.arusik.apinyan.clases.IDrawable {
    void defineFigure() {
        System.out.println("I'm a Circle");
    }
}

abstract class Rectangle implements homeworks.arusik.apinyan.clases.IDrawable {
    void defineFigure() {
        System.out.println("I'm a Rectangle");
    }
}

