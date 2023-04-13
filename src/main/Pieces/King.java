package Pieces;

import java.awt.Image;

import Utils.ImageLoader;
import Utils.Piece;

public class King extends Piece {
    //
    public King(int color) {
        super(color);
        //
    }
    //
    @Override
    public Image texture() {
        if(getColor() == 0) /* WHITE */ return new ImageLoader("assets/W_King.png").getTexture();
        else /* Black */ return new ImageLoader("assets/B_King.png").getTexture();
    }
    //
    @Override
    public int getId() {
        return 8;
    }
    //
}
