// Main
public class ShapeArray {
    public static voin main(String[] args) {
        Circle cirle = new Circle(4);
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(5, 8);

        
        // Create array
        Shape[] shapeArray = {circle, triangle, rectangle};

        // Loop and print
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}