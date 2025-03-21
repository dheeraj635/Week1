import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal : ");
        double Principal=sc.nextDouble();
        System.out.println("Enter the Rate : ");
        double Rate = sc.nextDouble();
        System.out.println("Enter the Time : ");
        double Time = sc.nextDouble();

        double SI = interest(Principal, Rate, Time);

        System.out.println(" The Simple Interest is "+SI+" for principal "+Principal+", Rate of Interest "+Rate+" and Time "+Time);
        sc.close();
    }
    public static double interest(double Principal, double Rate, double Time){
        return (Principal*Rate*Time)/100;
    }
}