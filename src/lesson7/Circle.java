package lesson7;

public class Circle extends Shape {
    private double radius;

    @Override
    double getSquare() {
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
