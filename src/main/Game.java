import Utils.Frame;
import Utils.Panel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game {
    public static final int height = 550;
    public static final int width = 528;
    private int LastClickX, LastClickY;
    private Panel panel;
    private Frame frame;
    //
    public Game() {
        panel = new Panel();
        frame = new Frame("Chess", width, height);
        frame.setResizable(false);
        frame.add(panel);
        //
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x, y; x = e.getX() / 64; y = e.getY() / 64;
                if(panel.isPieceHere(x, y)) panel.HighlightSpaces(panel.getGraphics(), x, y);
                else panel.paintImmediately(panel.getBounds());
                panel.movePiece(LastClickX, LastClickY, x, y);
                LastClickX = x; LastClickY = y;
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
        });
    }
    //
    public static void main(String[] args) {
        //
        new Game();
        //
    }
    //
}