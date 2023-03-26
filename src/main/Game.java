import javax.swing.JPanel;

import Utils.Frame;
import Utils.Panel;

public class Game {
    public static final int width = 800;
    public static final int height = 600;
    private Frame frame;
    //
    public Game() {
        Panel panel = new Panel();
        //
        frame = new Frame("Chess", width, height);
        frame.add(panel);
        //
    }
    //
    public static void main(String[] args) {
        //
        new Game();
        //
    }
    //
}