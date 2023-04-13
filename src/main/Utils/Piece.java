package Utils;

import java.awt.Image;

//
public abstract class Piece implements ChessPiece {
    private int color;
    //
    public abstract Image texture();
    //
    public Piece(int color) {
        //
        this.color = color;
        //
    }
    //
    @Override
    public int getColor() {
        return color;
    }
    //
}
