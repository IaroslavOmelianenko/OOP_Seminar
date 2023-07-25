package LSP;

public class Square extends Shape {

    public Square(int side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}
