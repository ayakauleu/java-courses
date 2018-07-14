public class Homework2 {
    public static void main(String[] args) {
        int n = 120;
        FibonacciCycle(1000);
        System.out.println("\n");
        FibonacciRecursion(0, 1, 1000);
    }

    private static void FibonacciCycle(int n) {
        int prev = 0; int curr = 1; int temp;
        while (curr < n) {
            System.out.print(curr+" ");
            temp = prev;
            prev = curr;
            curr = curr + temp;
        }
    };

    private static void FibonacciRecursion(int prev, int curr, int n) {
        if (curr >= n) return;
        System.out.print(curr+" ");
        int temp = prev;
        prev = curr;
        curr = curr + temp;
        FibonacciRecursion(prev, curr, n);
    };

}
