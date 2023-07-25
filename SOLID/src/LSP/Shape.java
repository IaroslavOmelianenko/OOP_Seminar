package LSP;

/***
 * parent class for rectangles and squares
 */
public abstract class Shape {

    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract int area();
}
