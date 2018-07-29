package lesson7;

public class Program {
    public static void main(String[] args) {
        Shape[] shapes = {new Square(5),
                new Triangle90(3, 4, 5),
                new Circle(1),
                new Rectangle(2, 5)
        };

        for (Shape shape : shapes) {
            System.out.printf("%s is %b rectangle and %b triangle   ", shape, ShapeUtils.isRectangle(shape), ShapeUtils.isTriangle(shape));
            System.out.printf("Square is %f and perimeter is %f\n", shape.getSquare(), shape.getPerimeter());
        }
    }
}
