package Pieces;

import java.awt.Image;

import Utils.ImageLoader;
import Utils.Piece;

public class Pawn extends Piece { // pawn Id is 0
    //
    public Pawn(int color) {
        super(color);
        //
    }
    //
    @Override
    public Image texture() {
        if(getColor() == 0) /* WHITE */ return new ImageLoader("assets/W_Pawn.png").getTexture();
        else return new ImageLoader("assets/B_Pawn.png").getTexture();
    }
    //
    @Override
    public int getId() { // Pawn ID
        return 0;
    }
    //
}
