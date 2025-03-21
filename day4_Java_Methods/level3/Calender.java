
import java.util.Scanner;

public class Calender {
   static String[] months = {
   	"January", "February", "March", "April", "May", "June",
   	"July", "August", "September", "October", "November", "December"
   };

   static int[] days = {
   	31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
   };

   static boolean isLeapYear(int year) {
   	return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   }

   static int getDaysInMonth(int month, int year) {
   	if (month == 2 && isLeapYear(year)) {
       	return 29;
   	}
   	return days[month - 1];
   }

   static int getFirstDayOfMonth(int month, int year) {
   	int y = year - (14 - month) / 12;
   	int x = y + y / 4 - y / 100 + y / 400;
   	int m = month + 12 * ((14 - month) / 12) - 2;
   	return (1 + x + (31 * m) / 12) % 7;
   }

   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
   	int month = scanner.nextInt();
   	int year = scanner.nextInt();
   	scanner.close();

   	System.out.println("   " + months[month - 1] + " " + year);
   	System.out.println(" S  M  T  W  T  F  S");

   	int firstDay = getFirstDayOfMonth(month, year);
   	int daysInMonth = getDaysInMonth(month, year);

   	for (int i = 0; i < firstDay; i++) {
       	System.out.print("   ");
   	}

   	for (int day = 1; day <= daysInMonth; day++) {
       	System.out.printf("%3d", day);
       	if ((day + firstDay) % 7 == 0) {
           	System.out.println();
       	}
   	}
   	System.out.println();
   }
}

