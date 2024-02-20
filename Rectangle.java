// Rectangle SUBCLASS
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override // Area Equation
    public double area() {
        return length * width;
    }

    @Override // Perimeter Equation
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override // Output
    public String toString() {
        return "Area of rectanlge: " + area() + ", Perimeter of rectangle: " + perimeter();
    }

}