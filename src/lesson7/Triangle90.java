package lesson7;

public class Triangle90 extends Triangle {
    public Triangle90(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    @Override
    double getSquare() {
        return getSide1() * getSide2() / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle with an angle of 90";
    }
}
