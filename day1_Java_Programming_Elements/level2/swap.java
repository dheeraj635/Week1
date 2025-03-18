import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = sc.nextInt();
        int number3;
        number3=number1;
        number1=number2;
        number2=number3;
        System.out.println("The swapped numbers are "+number1+" and "+number2);
        sc.close();
    }
}
