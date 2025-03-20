import java.util.Scanner;

public class heights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11];
        double sum=0;
        for  (int i=1;i<=11;i++){
            height[i-1] = sc.nextDouble();
        }
        for (int i =1;i<=11;i++){
            sum=sum+height[i-1];
        }
        System.out.println("The mean height of the football team is "+sum);
        sc.close();
    }
}
