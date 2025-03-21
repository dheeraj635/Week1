
import java.util.Scanner;

public class handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of Students : ");
        int n = sc.nextInt();
        double result = max(n);
        System.out.println("Maximum number of handshakes are "+result);
    }
    public static double max(int n){
        return (n*(n-1))/2;
    }
}
