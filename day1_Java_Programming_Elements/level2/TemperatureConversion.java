import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius : ");
        double celsius = sc.nextDouble();
        double Fahrenhit = (celsius*9/5)+32;
        System.out.println("The "+celsius+" celsius is "+Fahrenhit+" farhrenhit");
        sc.close();
    }
}
