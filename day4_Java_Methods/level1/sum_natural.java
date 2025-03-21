
import java.util.Scanner;

public class sum_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum1 = 0;
        int result = add(number, sum1);
        System.out.println("Sum of "+number+" natural number is "+result);

    }
    public static int add(int number, int sum1){
        for (int i=1;i<=number;i++){
            sum1=sum1+i;
        }
        return sum1;
    }
}
