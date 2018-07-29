package lesson7;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double lenght, double width) {
        this.length = lenght;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    public double getSquare() {
        return length * width;
    }

    public double getDiagonal() {
        return Math.sqrt(length * length + width * width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
