package lesson5;

public class Homework1 {
    public static void main(String[] args) {
        String st = "7753577";
        System.out.println(isPalindrome(st));
        System.out.println(isPalindromeDirect(st));
    }

    private static boolean isPalindrome(String st) {
        return st.equals(new StringBuilder(st).reverse().toString());
    }

    private static boolean isPalindromeDirect(String st) {
        boolean res = true;
        int n = st.length();
        for (int i=0; i<n/2; i++) {
            if (st.charAt(i) != st.charAt(n-1-i)) {
                res = false;
            }
        }
        return res;
    }
}
