package Utils;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private BoardGen board;
    //
    public Panel() {
        //
        this.setBackground(Color.GRAY);
        board = new BoardGen(getGraphics());
        //
    }
    //
    public void paint(Graphics g) {
        super.paint(g);
        //
        draw(g);
    }
    //
    public void draw(Graphics g) {
        //
        board.draw(g);
        //
    }
}
