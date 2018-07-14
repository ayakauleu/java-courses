public class Homework3 {

    public static void main(String[] args) {
        double a = 1; double b = 6; double c = 9;

        double d = discriminant(a, b, c);
        String s = "";
        if (isPositive(d)) {
             s = "x1 = " + (-b-Math.sqrt(d))/(2*a)
                    + ", x2 = " + (-b+Math.sqrt(d))/(2*a);
        } else
            if (isZero(d)) {
                s = "x = " + -b/(2*a);
            } else {
                s = "Discriminant is negative, there are no real roots in the equation";
            }

        System.out.println(s);
    }


    private static boolean isPositive(double d) {
        if (d > 0) return true;
        else return false;
    };

    private static boolean isZero(double d) {
        if (d == 0) return true;
        else return false;
    };

    private static double discriminant(double a, double b, double c) {
        return b*b-4*a*c;
    }


}
