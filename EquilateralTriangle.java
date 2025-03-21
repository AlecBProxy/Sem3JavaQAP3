// Used for: Problem #3, and Problem #4

class EquilateralTriangle extends Triangle  {
    
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public String toString() {
        return super.toString() + "[Equilateral]";
    }
}
