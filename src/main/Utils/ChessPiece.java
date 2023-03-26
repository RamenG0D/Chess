package Utils;
//
public interface ChessPiece {
    //
    public boolean MovePiece(int x, int y);
    public void setX(int row);
    public void setY(int col);
    //
    public int getType();
    public int getX();
    public int getY();
    //
}
