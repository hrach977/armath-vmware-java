package homeworks.gayane.gevorgyan.chess;

import java.util.Scanner;

public class Position{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input new position for piece:  " );

        String newHorizontalLetter = input.nextLine();
        int newVerticalNumber = input.nextInt();

        int[][] positionForCheck = new int[8][8];
        int positionOfPieceForCheck;
        int newHorizontalNumber= 0;

            switch (newHorizontalLetter){
                case "a":
                    newHorizontalNumber = 1;
                    break;
                case "b":
                    newHorizontalNumber = 2;
                    break;
                case "c":
                    newHorizontalNumber = 3;
                    break;
                case "d":
                    newHorizontalNumber = 4;
                    break;
                case "e":
                    newHorizontalNumber = 5;
                    break;
                case "f":
                    newHorizontalNumber = 6;
                    break;
                case "g":
                    newHorizontalNumber = 7;
                    break;
                case "h":
                    newHorizontalNumber = 8;
                    break;
                default:
                    System.out.println("Please input letter in range A-H");
            }

            if (newVerticalNumber >= 1 && newVerticalNumber <= 8){
                positionOfPieceForCheck = positionForCheck[newHorizontalNumber][newVerticalNumber];
            }
            else{
                System.out.println("Please input number in range 1-8");
            }
        System.out.println("Position for check:  " + newHorizontalLetter+newVerticalNumber);
    }

}