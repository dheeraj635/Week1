
import java.util.Scanner;

public class factorial_while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int i = number;
        int fact = 1;
        if (i > 0) {
            while (i != 0) {
                fact = fact * i;
                i--;
            }
            System.out.println("Factorial of the " + number + " is " + fact);
        }
    }
}
