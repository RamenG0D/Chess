package Pieces;

import java.awt.Image;

import Utils.ImageLoader;
import Utils.Piece;

public class Rook extends Piece {
    //
    public Rook(int color) {
        super(color);
    }
    //
    @Override
    public int getId() {
        return 1;
    }
    //
    @Override
    public Image texture() {
        if(getColor() == 0) /* WHITE */ return new ImageLoader("assets/W_Rook.png").getTexture();
        else /* Black */ return new ImageLoader("assets/B_Rook.png").getTexture();
    }
    //
}
