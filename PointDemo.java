public class PointDemo {
    public static void main(String[] args) {

        Point p1 = new Point(1.2f, 2.9f);
        System.out.println("Point: " + p1);

        MovablePoint mp1 = new MovablePoint(1.1f, 3.4f, 0.9f, 1.0f);
        System.out.println("Before moving: " + mp1);

        mp1.move();
        System.out.println("After moving: " + mp1);
    }
}
