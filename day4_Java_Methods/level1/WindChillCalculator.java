import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        double temperature = scanner.nextDouble();
        System.out.println("Enter wind speed in miles per hour:");
        double windSpeed = scanner.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is: " + windChill);
    }
}
