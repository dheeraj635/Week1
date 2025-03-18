
import java.util.Scanner;

public class distance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter the city via which you are traveling: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter the destination city: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter the distance from starting city to via city (in miles): ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter the distance from via city to destination city (in miles): ");
        double viaToFinalCity = scanner.nextDouble();
        System.out.print("Enter the time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        System.out.print("Enter the fee: ");
        double fee = scanner.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();
        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;
        System.out.println("Hello " + name + ", your journey details are as follows:");
        System.out.println("From: " + fromCity + " Via: " + viaCity + " To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " miles/hour");
        System.out.println("The results of Int Operations are " + fee + ", " + discountAmount + ", and " + finalFee);
    }
}
