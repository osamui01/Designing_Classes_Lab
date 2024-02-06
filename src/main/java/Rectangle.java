public class Rectangle {

    private int length;
    private int width;

    public Rectangle (int inputLength, int inputWidth) {
        this.length = inputLength;
        this.width = inputWidth;
    }

    public int area() {
        return this.length * this.width;

    }

    public boolean isSquare() {
        return this.length == this.width;
    }
}

