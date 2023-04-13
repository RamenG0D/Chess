package Utils;

import java.awt.Color;
import java.awt.Graphics;

public class BoardGen {
    //
    public void draw(Graphics g) {
        //
        for(int i = 0; i < 8; i++) { // current col
            for(int j = 0; j < 8; j++) { // current row
                if(i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) g.setColor(Color.BLACK); // color black
                else g.setColor(Color.WHITE); // color white
                //
                g.fillRect(i*64, j*64, 64, 64);
                //
            }
        }
        //
    }
    //
}
