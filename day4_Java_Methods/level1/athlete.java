
import java.util.Scanner;

public class athlete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        
        double result = park(s1, s2, s3);
        System.out.println(result+" is need to complete");
    }
    public static double park(int s1, int s2, int s3){
        return 5000.0/(s1+s2+s3);
    }
}
