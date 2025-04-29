
import java.util.Scanner;

public class natural_numbers_using_for_loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = (number*(number+1))/2;
        int sum1 = 0;
        for(int i=number;i>0;i--){
            sum1=sum1+i;
        }
        if (sum==sum1){
            System.out.println("Sum of natural number using while loop and the formulae are same");
        }
        else{
            System.out.println("Sum of natural number using while loop and the formulae are not same");
        }
    }
}