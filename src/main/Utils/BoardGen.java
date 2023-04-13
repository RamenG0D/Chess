<<<<<<< HEAD
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
=======
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
>>>>>>> cdd2b77 (Large update)
