// Used for: Problem #3

public class ShapeDemo {
    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(9.0);
        shapes[1] = new Ellipse(3.0, 1.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle(9.0);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
