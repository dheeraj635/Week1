import java.util.Scanner;
public class perimeter_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square : ");
        double side = sc.nextDouble();
        double perimeter = 4*side;
        System.out.println("The length of side is "+side+" whose perimeter is "+perimeter);
        sc.close();
    }
}
