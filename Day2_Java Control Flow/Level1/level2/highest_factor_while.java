import java.util.Scanner;
public class highest_factor_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int i=number-1;
        while (i>0){
            if (number%i==0){
                System.out.println(i);
                break;
            }
            i--;
        }
    }
}
