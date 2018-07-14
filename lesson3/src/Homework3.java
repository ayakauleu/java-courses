import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity of days: ");
        int n = sc.nextInt();
        System.out.print("Now enter the whole collection: ");
        int m = 0; int max = 0; int sum = 0; int tot = 0;
        for (int i=0; i<n; i++) {
            m = sc.nextInt();
            if (m > max) max = m;
            tot += m;
        }
        System.out.printf("Among %d days there was %d precipitation amount with the %d maximum and %f average", n, tot, max, (float) tot/n);
    }
}
