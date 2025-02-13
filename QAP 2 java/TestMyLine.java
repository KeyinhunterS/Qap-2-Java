// TestMyLine.java
public class TestMyLine {
    public static void main(String[] args) {
        // Creating two points
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Creating MyLine objects
        MyLine line1 = new MyLine(p1, p2);
        MyLine line2 = new MyLine(2, 3, 5, 7);

        // Testing getters
        System.out.println("Line 1: " + line1);
        System.out.println("Line 2: " + line2);

        // Testing length and gradient
        System.out.println("Line 1 Length: " + line1.getLength());
        System.out.println("Line 1 Gradient (radians): " + line1.getGradient());

        // Testing setters
        line1.setBeginXY(0, 0);
        line1.setEndXY(3, 4);
        System.out.println("Updated Line 1: " + line1);
        System.out.println("Updated Line 1 Length: " + line1.getLength());
    }
}
