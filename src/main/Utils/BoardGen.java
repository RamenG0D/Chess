package Utils;

import java.awt.Color;
import java.awt.Graphics;

public class BoardGen {
    //
    public BoardGen(Graphics g) {
        //
        for(int i = 0; i < 8; i++) { // current row
            if(i % 2 == 0) { // is even
                g.setColor(Color.BLACK); // color black
            } else { // else is odd
                g.setColor(Color.WHITE); // color white
            }
            for(int j = 0; j < 8; j++) { // current col
                //
                g.fillRect(i*32, j*32, 32, 32);
                //
            }
        }
        //
    }
    //
}
