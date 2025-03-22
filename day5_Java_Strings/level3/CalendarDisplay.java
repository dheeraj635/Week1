import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.close();

        displayCalendar(month, year);
    }

    public static void displayCalendar(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) days[1] = 29;

        System.out.println("\n  " + months[month - 1] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);

        for (int i = 0; i < firstDay; i++) System.out.print("    ");

        for (int day = 1; day <= days[month - 1]; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1, y = year, m = month;
        y -= (14 - m) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        m += 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m) / 12) % 7;
    }
}
