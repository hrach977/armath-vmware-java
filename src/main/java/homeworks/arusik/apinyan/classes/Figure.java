package homeworks.arusik.apinyan.classes;

interface IDrawable {
    void draw ();
}

interface IIsDrawable {
    boolean isDrawable();
}

abstract class Figure implements IIsDrawable{
//    public void draw() {
//        System.out.println("I'm a Figure");
//    }
    @Override
    public boolean isDrawable() {
        System.out.println("True");
        return true;
    }
    abstract void defineFigure();
}
 class Circle extends Figure implements IDrawable{
    @Override
    void defineFigure() {
        System.out.println("I'm a Circle");
    }

     @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }

}

 class Rectangle extends Figure implements IDrawable {
     @Override
     void defineFigure() {
        System.out.println("I'm a Rectangle");
    }
     @Override
     public void draw(){
         System.out.println("Drawing Rectangle");
     }


     public static void main(String[] args) {
        Figure f = new Circle();
        f.defineFigure();
        f.isDrawable();
        //f.draw();
         Circle c = new Circle();
         c.defineFigure();
         c.draw();
         c.isDrawable();
     }
}






