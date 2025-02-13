// TestMyRectangle.java
public class TestMyRectangle {
    public static void main(String[] args) {
        // Create two points
        MyPoint p1 = new MyPoint(2, 8);
        MyPoint p2 = new MyPoint(6, 3);

        // Create a rectangle
        MyRectangle rect = new MyRectangle(p1, p2);

        // Print rectangle details
        System.out.println(rect);

        // Modify the points and print again
        rect.setTopLeft(new MyPoint(1, 9));
        rect.setBottomRight(new MyPoint(5, 2));

        System.out.println("After modifying points:");
        System.out.println(rect);
    }
}
