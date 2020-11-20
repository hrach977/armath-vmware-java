package homeworks.gayane.gevorgyan.homework3;

abstract class Figure {
    abstract void defineFigure();

}
    interface IDrawable{
        void draw();
//            System.out.println("Drawing Circle…");
//            System.out.println("Drawing Rectangle...");
        }
class Circle extends Figure {

    @Override
    void defineFigure() {
        System.out.println("I am a Circle…");
    }
}
class Rectangle extends Figure {

    @Override
    void defineFigure() {
        System.out.println("“I am a Rectangle…");
    }
}