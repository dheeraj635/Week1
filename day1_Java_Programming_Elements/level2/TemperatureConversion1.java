
import java.util.Scanner;

public class TemperatureConversion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Farhrenhit : ");
        double Farhrenhit = sc.nextDouble();
        double celsius = (Farhrenhit-32)*5/9;
        System.out.println("The "+Farhrenhit+" farhrenhit is "+celsius+" celsius");
        sc.close();
    }
}
