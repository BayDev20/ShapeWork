// Triangle SUBCLASS
// Declare Sublass, initialize doubles
public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override // Forumla for area whne given 3 sides
    public double area() {
        double HalfA = (sideA + sideB + sideC) / 2
        return Math.sqrt(HalfA * (HalfA - sideA) * (HalfA - sideB) * (HalfA - sideC));
    }

    @Override // Perimter Formula
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override // Return
    public String toString() {
        return "Area of triangle: " + area() + ", Perimeter of triangle: " + perimeter();
    }
}