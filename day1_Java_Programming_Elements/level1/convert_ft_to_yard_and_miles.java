import java.util.Scanner;
public class convert_ft_to_yard_and_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in feets : ");
        double feet = sc.nextDouble();
        double yard = feet*0.3333;
        double miles = feet*0.0001893;
        System.out.println("The distance in feets is "+feet+" while in yards is "+yard+" and in miles is "+miles);
        sc.close();
    }
}
