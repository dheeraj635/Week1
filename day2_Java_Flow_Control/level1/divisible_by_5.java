import java.util.Scanner;

public class divisible_by_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        if(number%5==0){
            System.out.println("Is the number "+number+" divisible by 5? Yes");
        }
        else {
            System.out.println("Is the number "+number+" divisible by 5? No");
        }
        sc.close();
    }
}
