
import java.util.Scanner;

public class smallest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int number3 = sc.nextInt();
        if(number1<number2){
            if(number1<number3){
                System.out.println("Is the first number is smallest? Yes");
            }
        }
        else{
            System.out.println("Is the first number is smallest? No");
        } 
    }
}
