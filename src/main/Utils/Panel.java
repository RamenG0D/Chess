package Utils;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private BoardGen background;
    private Board board;
    //
    public Panel() {
        //
        this.setBackground(Color.GRAY);
        background = new BoardGen();
        board = new Board(8,8);
        //
    }
    //
    public void paint(Graphics g) {
        super.paint(g);
        //
        draw(g);
    }
    //
    private void draw_pieces(Graphics g, int row, int col) {
        try {
            g.drawImage(
                board.getPeice(row, col).texture(),
                row*64,
                col*64-28,
                64,
                92,
                null
            );
        } catch(Exception e) { e.printStackTrace(); }
    }
    //
    private void loop_draw(Graphics g) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                try {
                    if(board.getPeice(i, j) != null) draw_pieces(g, i, j);
                } catch (Exception e) { e.printStackTrace(); }
            }
        }
    }
    //
    public void draw(Graphics g) {
        //
        background.draw(g);
        loop_draw(g);
        //
    }
    //
    public void HighlightSpaces(Graphics g, int mouseX, int mouseY) throws Exception {
        int mR = (mouseX / 64); int mC = (mouseY / 64);
        Piece p = board.getPeice(mR, mC);
        if(p == null) {
            paintImmediately(getBounds());
            return;
        }
        paintImmediately(getBounds());
        g.setColor(new Color(80,80,80,200));
        //
        switch(p.getId()) {
            case 0: // Pawn
                int move = 1;
                if(mC == 1 || mC == 6) move = 2;
                if(p.getColor() == Board.WHITE) {
                    if(board.getPeice(mR, mC + move) == null) g.fillOval((mR*64)+9, ((mC+move)*64)+9, 45, 45);
                    if(move == 2 && board.getPeice(mR, mC + 1) == null) g.fillOval((mR*64)+9, ((mC+1)*64)+9, 45, 45);
                } else { // Pawn is black
                    if(board.getPeice(mR, mC - move) == null) g.fillOval((mR*64)+9, ((mC-move)*64)+9, 45, 45);
                    if(move == 2 && board.getPeice(mR, mC - 1) == null) g.fillOval((mR*64)+9, ((mC-1)*64)+9, 45, 45);
                }
                break;
            case 1: //s
                break;
            case 2: //
                break;
            case 3: // Pawn
                break;
            case 4: // Pawn
                break;
            case 5: // Pawn
                break;
            default:
                break;
        }
    }
}
