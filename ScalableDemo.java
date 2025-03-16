public class ScalableDemo {

    public static void scaleAll(Scalable[] shapes, double factor) {
        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        for (Scalable shape : shapes) {
            shape.scale(factor);
        }

        System.out.println("\nAfter Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void main(String[] args) {
        Scalable[] shapes = {
            new Circle(5),
            new Ellipse(4, 2),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(4)
        };

        scaleAll(shapes, 2.0); 
    }
}
