package Utils;
import Pieces.Bishop;
import Pieces.King;
import Pieces.Knight;
import Pieces.Pawn;
import Pieces.Queen;
import Pieces.Rook;

public class Board {
    public static final int WHITE = 0;
    public static final int BLACK = 1;
    private Piece[][] piece;
    //
    public Board(int rows, int cols) {
        piece = new Piece[rows][cols];
        // set up board bellow
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                // board setup occurs here
                if(j == 1) piece[i][j] = new Pawn(1);
                else if(j == 6 && j > 5) piece[i][j] = new Pawn(0);
            }
        }
        // Rooks
        piece[0][0] = new Rook(1);
        piece[7][0] = new Rook(1);
        piece[0][7] = new Rook(0);
        piece[7][7] = new Rook(0);
        // Knights
        piece[1][0] = new Knight(1);
        piece[6][0] = new Knight(1);
        piece[1][7] = new Knight(0);
        piece[6][7] = new Knight(0);
        // Bishops
        piece[2][0] = new Bishop(1);
        piece[5][0] = new Bishop(1);
        piece[2][7] = new Bishop(0);
        piece[5][7] = new Bishop(0);
        // Queens
        piece[3][0] = new Queen(1);
        piece[3][7] = new Queen(0);
        // Kings
        piece[4][0] = new King(1);
        piece[4][7] = new King(0);
        //
    }
    //
    public Piece[][] getBoard() {
        return piece;
    }
    //
    public Piece getPeice(int row, int col) {
        return piece[row][col];
    }
    //
}
