import java.util.Scanner;
public class convert_weight_to_pound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in pounds : ");
        double pounds = sc.nextDouble();
        double kilo = pounds/2.2;
        System.out.println("The weight of the person in pound is "+pounds+" and in kg is "+kilo);
        sc.close();
    }
}
