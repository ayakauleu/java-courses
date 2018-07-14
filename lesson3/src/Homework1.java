public class Homework1 {
    public static void main(String[] args) {
        System.out.println(DigitSum(123));
    }


    private static int DigitSum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n = n /10;
        }
        return s;
    };
}
