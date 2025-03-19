
import java.util.Scanner;

public class countdown_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int count = sc.nextInt();
        while (count >= 0) {
            System.out.println(count);
            count--;
        }
    }
}
