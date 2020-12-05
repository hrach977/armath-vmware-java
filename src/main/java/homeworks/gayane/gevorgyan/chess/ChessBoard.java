package homeworks.gayane.gevorgyan.chess;

public class ChessBoard {
    public static void main(String[] args) {
        King king = new King("g",5);
        Piece.Color kingColor = Piece.Color.BLACK;

        System.out.println("Position of piece: " + king.getHorizontalLetter() + king.getVertical()+ ", Color: " + kingColor);
        System.out.println("");

    }


}
