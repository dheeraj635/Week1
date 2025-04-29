import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal : ");
        double Principal=sc.nextDouble();
        System.out.println("Enter the Rate : ");
        double Rate = sc.nextDouble();
        System.out.println("Enter the Time : ");
        double Time = sc.nextDouble();
        double SI= (Principal*Rate*Time)/100;
        System.out.println(" The Simple Interest is "+SI+" for principal "+Principal+", Rate of Interest "+Rate+" and Time "+Time);
        sc.close();
    }
    
}
