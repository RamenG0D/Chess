package Pieces;

import java.awt.Image;

import Utils.ImageLoader;
import Utils.Piece;

public class Bishop extends Piece {
    //
    public Bishop(int color) {
        super(color);
    }
    //
    @Override
    public int getId() {
        return 3;
    }
    //
    @Override
    public Image texture() {
        if(getColor() == 0) /* WHITE */ return new ImageLoader("assets/W_Bishop.png").getTexture().getScaledInstance(64, 128, 0);
        else /* Black */ return new ImageLoader("assets/B_Bishop.png").getTexture().getScaledInstance(64, 128, 0);
    }
    //
}
