import java.util.Scanner;

public class chocolate_distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of chocolates : ");
        int numberOfchocolates = sc.nextInt();
        System.out.println("Enter no of children : ");
        int numberOfChildren = sc.nextInt();
        int chocolate_per_person = numberOfchocolates/numberOfChildren;
        int remaining_chocolates = numberOfchocolates%numberOfChildren;
        System.out.println("The number of chocolates each child gets is "+chocolate_per_person+" and the number of remaining chocolates are "+remaining_chocolates);
        sc.close();
    }
}
