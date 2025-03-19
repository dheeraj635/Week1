
import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int number3 = sc.nextInt();
        if(number3>number1 && number3>number2){
            System.out.println("Is the first number is largest? No");
            System.out.println("Is the second number is largest? No");
            System.out.println("Is the third number is largest? Yes");            
        }
        else if(number2>number1 && number2>number3){
            System.out.println("Is the first number is largest? No");
            System.out.println("Is the second number is largest? Yes");
            System.out.println("Is the third number is largest? No");
        } 
        else{
            System.out.println("Is the first number is largest? Yes");
            System.out.println("Is the second number is largest? No");
            System.out.println("Is the third number is largest? No");
        }
        sc.close();
    }
}
