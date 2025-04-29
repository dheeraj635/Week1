
import java.util.Scanner;

public class sum_of_natural_numbers_using_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = (number*(number+1))/2;
        int sum1 = 0;
        while(number>0){
            sum1 = sum1+number;
            number--;
        }
        if (sum==sum1){
            System.out.println("Sum of natural number using while loop and the formulae are same");
        }
        else{
            System.out.println("Sum of natural number using while loop and the formulae are not same");
        }
    }
}
