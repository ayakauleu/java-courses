package lesson5;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(toArabic("MCMLXXXVI"));
    }

    private static int toArabic(String rome) {
        int arabsum = 0;
        int arabcurr;
        int arabnext = 0;
        for (int i=rome.length()-1; i>=0; i--) {
            arabcurr = sub(rome.charAt(i));
            if (arabcurr >= arabnext) {
                arabsum += arabcurr;
            } else {
                arabsum -= arabcurr;
            }
            arabnext = arabcurr;
        }
        return arabsum;
    }

    private static int sub(Character romechar) {
        int res;
        switch (romechar) {
            case 'M' :
                res = 1000;
                break;
            case 'D' :
                res = 500;
                break;
            case 'C' :
                res = 100;
                break;
            case 'L' :
                res = 50;
                break;
            case 'X' :
                res = 10;
                break;
            case 'V' :
                res = 5;
                break;
            case 'I' :
                res = 1;
                break;
            default :
                res = 0;
                break;
        }
        return res;
    }
}
