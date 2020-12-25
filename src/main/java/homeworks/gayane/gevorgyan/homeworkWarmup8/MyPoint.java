package homeworks.gayane.gevorgyan.homeworkWarmup8;

import java.util.Arrays;

public class MyPoint {
    private int x;
    private int y;
    int[] xy;

    public MyPoint(){
       x = 0;
       y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int[] getXy() {
        return xy;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +
        "," + y +
        ")";
    }
    public double distance(int x, int y){
        int xNew = this.x - x;
        int yNew = this.y - y;
        return Math.sqrt(xNew * xNew + yNew * yNew);
    }
    public double distance(MyPoint another){
        int xNew = this.x - another.x;
        int yNew = this.y - another.y;
        return Math.sqrt(xNew * xNew + yNew * yNew);
    }
}
