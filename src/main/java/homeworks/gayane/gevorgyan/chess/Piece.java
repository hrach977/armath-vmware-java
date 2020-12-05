package homeworks.gayane.gevorgyan.chess;
import java.util.Scanner;

public class Piece {

    enum Color {
        WHITE, BLACK
    }
    private String horizontalLetter;
    private int horizontalNumber;
    private int vertical;
    private int[][] position = new int[8][8];
    private int positionOfPiece;

    public Piece(String horizontalLetter, int vertical){

        switch (horizontalLetter){
            case "a":
                horizontalLetter = this.horizontalLetter;
                horizontalNumber = 1;
                break;
            case "b":
                horizontalLetter = this.horizontalLetter;
                horizontalNumber = 2;
                break;
            case "c":
                horizontalLetter = this.horizontalLetter;
                horizontalNumber = 3;
                break;
            case "d":
                horizontalLetter = this.horizontalLetter;
                horizontalNumber = 4;
                break;
            case "e":
                horizontalLetter = this.horizontalLetter;
                horizontalNumber = 5;
                break;
            case "f":
                horizontalLetter = this.horizontalLetter;
                horizontalNumber = 6;
                break;
            case "g":
                horizontalLetter = this.horizontalLetter;
                horizontalNumber = 7;
                break;
            case "h":
                horizontalLetter = this.horizontalLetter;
                horizontalNumber = 8;
                break;
            default:
                System.out.println("Please input letter in range A-H");
        }

        if (vertical >= 1 && vertical <= 8){
            vertical = vertical;
            positionOfPiece = position[horizontalNumber][vertical];
        }
        else{
            System.out.println("Please input number in range 1-8");
        }
    }

    public String getHorizontalLetter(){
        return horizontalLetter;
    }

    public int getVertical() {
        return vertical;
    }

    public int getHorizontalNumber() {
        return horizontalNumber;
    }

    public int getPositionOfPiece() {
        return positionOfPiece;
    }



}
