import java.util.Scanner;
public class countdown_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countdown number : ");
        int count = sc.nextInt();
        for(int i=count;i>0;i--){
            System.out.println(i);
        }
        sc.close();
    }    
}
