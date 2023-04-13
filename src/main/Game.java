import Utils.Frame;
import Utils.Panel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game {
    public static final int height = 550;
    public static final int width = 528;
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
                try { panel.HighlightSpaces(panel.getGraphics(), e.getX(), e.getY()); } 
                catch (Exception e1) { e1.printStackTrace(); }
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