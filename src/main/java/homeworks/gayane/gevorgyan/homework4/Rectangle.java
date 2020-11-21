package homeworks.gayane.gevorgyan.homework4;

public class Rectangle {

    private float length;
    private float width;
    private String color;

    public Rectangle(){
        length =  1.0f;
        width = 1.0f;
        color = "red";
    }
    public Rectangle(float l, float w){
        length = l;
        width = w;
        color = "red";
    }
    public  Rectangle(float l, float w, String c){
        length = l;
        width = w;
        color = c;
    }

    public float getLength(){
        return length;
    }

    public void setLength(float length){
        this.length = length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }

    public String getColor(){
        return  color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public float getArea(){
        return length * width;
    }
    public float getPerimeter(){
       return  2*(length + width);
    }
}
