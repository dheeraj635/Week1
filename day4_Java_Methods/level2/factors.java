
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        square_product_of_factors(number);
        sc.close();
    }
    public static int square_product_of_factors(int number){
        int index=0;
       
        for (int i=1;i<=number;i++){
            if(number%i==0){
                index++;
            }
        }
        int[] factor = new int[index];
        for (int i=1;i<=number;i++){
            if(number%i==0){
                factor[index-1]=i;
                index--;
            }
        }
        int sum1=0;
        int sum=0;
        int product=1;
        for (int i=0;i<factor.length;i++){
            sum1=sum1+factor[i];
            product=product*factor[i];
            sum=sum+(factor[i]*factor[i]);
        }
        System.out.println("Sum of the "+number+" factors is "+sum1);
        System.out.println("Sum of square of the "+number+" factors is "+sum);
        System.out.println("Product of the "+number+" factors is "+product);
        return 0;
    }
}
