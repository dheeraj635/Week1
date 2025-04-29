import java.util.Scanner;
public class total_purchase_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit price of the item : ");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity of the item : ");
        double quantity = sc.nextDouble();
        double total = price*quantity;
        System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" unit price is INR "+price);
        sc.close();
    }
}
