// Used for: Problem #3, and Problem #4

class Circle extends Shape implements Scalable {
    
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override 
    public void scale(double factor) {
        radius *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}
