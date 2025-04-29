
import java.util.Scanner;

public class add_until_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number= sc.nextDouble();
        double sum=0.0;
        while(number!=0){
            sum=sum+number;
            double number1 = sc.nextDouble();
            number=number1;
        }
        System.out.println(sum);
        sc.close();
    }
}
