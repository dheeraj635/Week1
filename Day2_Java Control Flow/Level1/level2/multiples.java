import java.util.Scanner;

public class multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        if(number>0 && number<100){
            for (int i=100;i>0;i--){
                if(i%number==0){
                    System.out.println(i);
                }
            }
        }
    }
}
