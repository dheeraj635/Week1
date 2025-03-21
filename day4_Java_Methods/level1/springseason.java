
import java.util.Scanner;

public class springseason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        boolean result = weather(month, day);
        System.out.println(result);
    }
    public static  boolean  weather(int month, int day){
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            return true;
        } 
        else {
            return false;
        }
    }
}
