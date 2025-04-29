import java.util.Scanner;

public class highest_factor_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        for (int i = number-1;i>0;i--){
            if (number%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
