package homeworks.meline.abrahamyan;

interface IDrawable {
    void draw();
}


abstract class Figure implements IDrawable {

    @Override
    public void draw() {
        System.out.println("I am a...");
    }
    abstract void defineFigure();
}

class Circle extends Figure {
    @Override
    void defineFigure() {
        System.out.println("I am a Circle");
    }

    @Override
    public void draw(){
        System.out.println("Drawing Circle…");
    }
}

class Rectangle extends Figure {
    @Override
    void defineFigure() {
        System.out.println("I am a Rectangle");
    }

    @Override
    public void draw(){
        System.out.println("Drawing Rectangle…");
    }
}

public class homeworkthird {


    public static void main(String[] args) {
        Figure k = new Circle();
        k.defineFigure();
        k.draw();
        Figure m = new Rectangle();
        m.defineFigure();
        m.draw();

    }
}



