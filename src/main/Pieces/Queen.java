package Pieces;

import java.awt.Image;

import Utils.ImageLoader;
import Utils.Piece;

public class Queen extends Piece {
    //
    public Queen(int color) {
        super(color);
    }
    //
    @Override
    public int getId() {
        return 4;
    }
    //
    @Override
    public Image texture() {
        if(getColor() == 0) /* WHITE */ return new ImageLoader("assets/W_Queen.png").getTexture().getScaledInstance(64, 128, 0);
        else /* Black */ return new ImageLoader("assets/B_Queen.png").getTexture().getScaledInstance(64, 128, 0);
    }
    //
}
