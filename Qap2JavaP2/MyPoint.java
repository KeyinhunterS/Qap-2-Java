// MyPoint.java
public class MyPoint {
    private int x, y;

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setter methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Override toString() for easy printing
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
