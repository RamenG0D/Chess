package Pieces;

import java.awt.Image;

import Utils.ImageLoader;
import Utils.Piece;

public class Knight extends Piece {
    //
    public Knight(int color) {
        super(color);
    }
    //
    @Override
    public int getId() {
        return 2;
    }
    //
    @Override
    public Image texture() {
        if(getColor() == 0) /* WHITE */ return new ImageLoader("assets/W_Knight.png").getTexture().getScaledInstance(64, 128, 0);
        else /* Black */ return new ImageLoader("assets/B_Knight.png").getTexture().getScaledInstance(64, 128, 0);
    }
    //
}
