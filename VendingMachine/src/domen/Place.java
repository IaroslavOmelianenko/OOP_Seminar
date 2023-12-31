package domen;

public class Place {
    private int row;
    private int col;
    private boolean empty;

    public Place(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean setEmpty(boolean empty) {
        boolean result = this.empty;
        this.empty = empty;
        return result;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}