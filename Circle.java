// Circle SUBCLASS
// declare sublcass and initilize double
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override // area equation
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override // perimter equation
    public double perimeter() {
        return 2 * radius * Math.PI;
    }

    @Override // Return
    public String toString() {
        return "Perimeter of circle: " + perimeter() + ", Area of circle: " + area();
    }
}