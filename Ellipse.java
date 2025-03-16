// Used for: Problem #3, and Problem #4

class Ellipse extends Shape implements Scalable{
    private double a, b; 

    public Ellipse(double x, double y) {
        super("Ellipse");

        // The following code ensures that our "a" value is the larger axis

        this.a = Math.max(x, y);

        this.b = Math.min(x, y);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * ((a * a + b * b) / 2 - ((a - b) * (a - b)) / 2);
    }

    @Override 
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major Axis: " + a + ", Minor Axis: " + b;
    }
}
