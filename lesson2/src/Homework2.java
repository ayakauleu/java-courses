import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        int a = 2; int b = 3; int c = 3; int d = 4; int e = 5; int f = 4;

        System.out.println(isCovering(a, b, c, d, e, f));
    }

    private static boolean isCovering(int a, int b, int c, int d, int e, int f) {
        return (
             (a+c<=e && b<=f && d<=f) ||
             (a+d<=e && b<=f && c<=f) ||
             (b+c<=e && a<=f && d<=f) ||
             (a+d<=e && b<=f && c<=f) ||

                     (a+c<=f && b<=e && d<=e) ||
                     (a+d<=f && b<=e && c<=e) ||
                     (b+c<=f && a<=e && d<=e) ||
                     (a+d<=f && b<=e && c<=e)
        ) ;
    }
}
