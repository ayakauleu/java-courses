import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (dd mm yyyy): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(NextDay(day, month, year));
    }

    private static boolean isLeap(int year) {
        boolean res = false;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            res = true;
        }
        return res;
    }

    private static boolean isDateValid(int day, int month, int year) {
        if (month < 1 || month > 12) return false;

        int ml = MonthLength(month, isLeap(year));
        if (day < 1 || day > ml) return false;

        return true;
    }

    private static int MonthLength(int month, boolean leap) {
        int res;
        switch (month) {
            case 2:
                res = leap ? 29 : 28;
                break;
            case 3:
            case 4:
            case 6:
            case 9:
            case 11:
                res = 30;
                break;
            default:
                res = 31;
        }
        return res;
    }

    private static String NextDay(int day, int month, int year) {
        if (!isDateValid(day, month, year)) return "Date is invalid";

        int ml = MonthLength(month, isLeap(year));
        if (day != ml) {
            day++;
        } else {
            day = 1;
            if (month == 12) {
                month = 1; year++;
            } else {
                month++;
            }
        }
        return day + "." + month + "." + year;
    }

}
