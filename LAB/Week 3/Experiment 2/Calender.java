import java.util.Scanner;
public class Calender {
    static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            } else
                return true;
        }
        return false;
    }

    static int daysInMonth(int month, boolean leapOrNot) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return (leapOrNot) ? 29 : 28;
    }

    static int daysInYear(int year) {
        return isLeap(year) ? 366 : 365;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input as DD MM YYYY(04 08 2021) ");
        String s = sc.nextLine();
        int d = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        int y = Integer.parseInt(s.substring(6));
        int start_year = 1970;
        int days = 0;
        while (start_year != y) {
            days += daysInYear(start_year);
            start_year++;
        }
        boolean leapOrNot = isLeap(start_year);
        int start_month = 1;
        while (start_month != m) {
            days += daysInMonth(start_month, leapOrNot);
            start_month++;
        }
        days += d;
        System.out.println("Total  number of days from  since 1 January 1970: " + days);

    }
}
