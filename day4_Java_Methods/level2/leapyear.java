import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        CheckLeapYear cly = new CheckLeapYear();
        cly.check(year);
    }
}
class CheckLeapYear {
    public static int check(int year) { 
        if (year<=1582){
            System.out.println("Enter the year which is greater than 1582");
        }
        else if ((year%4==0 && year%100!=0) || year%400 == 0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
        return 0;
    }
}
