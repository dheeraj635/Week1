import java.util.Scanner;
public class Convert_kilometers_to_miles1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometers : ");
        double km = sc.nextDouble();
        double miles = km/1.6;
        System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
        sc.close();
    }
}
