package homeworks.arusik.apinyan.clases;

interface IDrawable {
    void draw ();
}
abstract class Figure implements IDrawable {
    public void draw() {
        System.out.println("I'm a Figure");
    }
    abstract void defineFigure();
}
 class Circle extends Figure {
    void defineFigure() {
        System.out.println("I'm a Circle");
    }
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

 class Rectangle extends Figure {
    void defineFigure() {
        System.out.println("I'm a Rectangle");
    }
     public void draw(){
         System.out.println("Drawing Rectangle");
     }
}





