package lesson6;

public class Rectangle {
    private Point lt;
    private Point rb;

    public Rectangle(Point lt, Point rb) {
        this.lt = lt;
        this.rb = rb;
    }

    public double getSquare() {
        return (rb.getX() - lt.getX()) * (lt.getY() - rb.getY());
    }

    public double getDiag() {
        return lt.getDistance(rb);
    }
}
