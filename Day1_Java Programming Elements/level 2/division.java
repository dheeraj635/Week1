import java.util.Scanner;
public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();
        int Quotient = number1 / number2;
        int Remainder = number1 % number2;
        System.out.println("The Quotient is: " + Quotient+" and the Remainder is: "+Remainder+" of two number "+number1+" and "+number2);
        sc.close();
    }    
}
