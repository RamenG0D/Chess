package Utils;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

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
    @Override
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
    public void movePiece(int pX, int pY, int x, int y) {
        // x and y both = the selected Piece x and y
        Piece p = board.getPeice(pX, pY);
        if(board.getPeice(pX, pY) == null) return;
        boolean CanMove = false;
        List<int[]> a = getPossibleMoves(pX, pY);
        if(a == null) return;
        for(int[] i : a) {
            System.out.println("x: " + x + " i: " + i[0]);
            if(x == i[0] && y == i[1]) {
                CanMove = true;
            }
        }
        if(CanMove) {
            board.getBoard()[pX][pY] = null;
            board.getBoard()[x][y] = p;
            paintImmediately(getBounds());
        }
    }
    //
    public boolean isPieceHere(int x, int y) {
        return board.getPeice(x, y) != null;
    }
    //
    public List<int[]> getPossibleMoves(int mouseX, int mouseY) {
        Piece p = board.getPeice(mouseX, mouseY);
        List<int[]> moves = new ArrayList<>();
        if(p == null) return null;
        switch(p.getId()) {
            case 0: // Pawn
                int move = 1;
                if(mouseY == 1 || mouseY == 6) move = 2;
                if(p.getColor() == Board.BLACK) {
                    if(board.getPeice(mouseX, mouseY + move) == null /* null meaning no piece here */) {
                        moves.add(new int[] { mouseX, mouseY+move });
                    }
                    if(move == 2 && board.getPeice(mouseX, mouseY + 1) == null) {
                        moves.add(new int[] { mouseX, mouseY+1 });
                    }
                } else { // Pawn is black
                    if(board.getPeice(mouseX, mouseY - move) == null) {
                        moves.add(new int[] { mouseX, mouseY-move });
                    }
                    if(move == 2 && board.getPeice(mouseX, mouseY - 1) == null) {
                        moves.add(new int[] { mouseX, mouseY-1 });
                    }
                }
                return moves;
            case 1: // Rooks
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
                return null;
            }
            return null;
        }
    //
    public void HighlightSpaces(Graphics g, int mouseX, int mouseY) {
        Piece p = board.getPeice(mouseX, mouseY);
        if(p == null) {
            paintImmediately(getBounds());
            return;
        }
        paintImmediately(getBounds());
        g.setColor(new Color(80,80,80,200));
        //
        drawPiecePositions(p, g, mouseX, mouseY);
    }
    //
    public void drawPiecePositions(Piece p, Graphics g, int mouseX, int mouseY) {
        switch(p.getId()) {
            case 0: // Pawn
                int move = 1;
                if(mouseY == 1 || mouseY == 6) move = 2;
                if(p.getColor() == Board.BLACK) {
                    if(!isPieceHere(mouseX, mouseY + move)) g.fillOval((mouseX*64)+9, ((mouseY+move)*64)+9, 45, 45);
                    if(move == 2 && !isPieceHere(mouseX, mouseY + 1)) g.fillOval((mouseX*64)+9, ((mouseY+1)*64)+9, 45, 45);
                } else { // Pawn is black
                    if(!isPieceHere(mouseX, mouseY - move)) g.fillOval((mouseX*64)+9, ((mouseY-move)*64)+9, 45, 45);
                    if(move == 2 && !isPieceHere(mouseX, mouseY - 1)) g.fillOval((mouseX*64)+9, ((mouseY-1)*64)+9, 45, 45);
                }
                break;
            case 1: // Rook
                for (int i = 1; i < board.getBoard().length - 1; i++) {
                    if(mouseY-i >= 0 && !isPieceHere(mouseX, mouseY-i)) g.fillOval((mouseX*64)+9, ((mouseY-i)*64)+9, 45, 45);
                    else if(mouseY+i <= 7 && !isPieceHere(mouseX, mouseY+i)) g.fillOval((mouseX*64)+9, ((mouseY+i)*64)+9, 45, 45);
                    else if(mouseX-i >= 0 && !isPieceHere(mouseX-i, mouseY)) g.fillOval(((mouseX-i)*64)+9, (mouseY*64)+9, 45, 45);
                    else if(mouseX+i <= 7 && !isPieceHere(mouseX+i, mouseY)) g.fillOval(((mouseX+i)*64)+9, (mouseY*64)+9, 45, 45);
                    else break;
                }
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
