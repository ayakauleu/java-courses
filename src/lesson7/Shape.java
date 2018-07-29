package lesson7;

public abstract class Shape implements Perimeter{
    abstract double getSquare();
    int compareSquare(Shape shape) {
        return Double.valueOf(this.getSquare()).compareTo(shape.getSquare());
    }
}
