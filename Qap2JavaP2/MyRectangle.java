// MyRectangle.java
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getter methods
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Setter methods
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Calculate width of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Calculate height of the rectangle
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // Calculate area
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Calculate perimeter
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Override toString() for easy printing
    @Override
    public String toString() {
        return "Rectangle [TopLeft=" + topLeft + ", BottomRight=" + bottomRight +
                ", Width=" + getWidth() + ", Height=" + getHeight() +
                ", Area=" + getArea() + ", Perimeter=" + getPerimeter() + "]";
    }
}
