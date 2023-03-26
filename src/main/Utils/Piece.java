package Utils;
//
public abstract class Piece implements ChessPiece {
    private int row;
    private int col;
    private int type;
    //
    @Override
    public int getType() {
        return type;
    }
    //
    public Piece(int row, int col, int id) {
        //
        this.row = row;
        this.col = col;
        this.type = id;
        //
    }
    @Override
    public int getY() {
        return col;
    }
    @Override
    public int getX() {
        return row;
    }
    @Override
    public void setX(int row) {
        this.row = row;
    }
    @Override
    public void setY(int col) {
        this.col = col;
    }
    //
}
