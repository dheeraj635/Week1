import java.util.Scanner;

public class UnitConverter2 {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nUnit Converter Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Pounds to Kilograms");
            System.out.println("4. Kilograms to Pounds");
            System.out.println("5. Gallons to Liters");
            System.out.println("6. Liters to Gallons");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter the value to convert: ");
            double value = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = convertFahrenheitToCelsius(value);
                    System.out.println(value + " °F = " + result + " °C");
                    break;
                case 2:
                    result = convertCelsiusToFahrenheit(value);
                    System.out.println(value + " °C = " + result + " °F");
                    break;
                case 3:
                    result = convertPoundsToKilograms(value);
                    System.out.println(value + " pounds = " + result + " kilograms");
                    break;
                case 4:
                    result = convertKilogramsToPounds(value);
                    System.out.println(value + " kilograms = " + result + " pounds");
                    break;
                case 5:
                    result = convertGallonsToLiters(value);
                    System.out.println(value + " gallons = " + result + " liters");
                    break;
                case 6:
                    result = convertLitersToGallons(value);
                    System.out.println(value + " liters = " + result + " gallons");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
