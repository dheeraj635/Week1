import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        for(int i=1;i<number+1;i++){
            if(i%2==0){
                System.out.println(i+" is an even number");
            }
            else{
                System.out.println(i+" is an odd number");
            }
        }
        sc.close();
    }
}
