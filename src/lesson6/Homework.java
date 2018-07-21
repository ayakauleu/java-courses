package lesson6;

public class Homework {
    public static void main(String[] args) {
        Point onePoint = new Point(1, 2);
        Point anotherPoint = new Point(2, 1);
        System.out.printf("Distance between these poins is %f\n", onePoint.getDistance(anotherPoint));

        Rectangle bar = new Rectangle(onePoint, anotherPoint);
        System.out.printf("Square is %f and diagonal is %f long", bar.getSquare(), bar.getDiag());
    }

}
