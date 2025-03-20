
import java.util.Scanner;

public class sum_positive_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int[] number = new int[10];
        int sum = 0;
        for (int i=0;i<10;i++){
            number[i]=sc.nextInt();
        }
        for (int i=0;i<10;i++){
            if (number[i]>0){
                System.out.println(number[i]);
                sum=sum+number[i];
            }
            else{
                break;
            }
        }
        System.out.println("The sum of numbers are "+sum);
    }
}