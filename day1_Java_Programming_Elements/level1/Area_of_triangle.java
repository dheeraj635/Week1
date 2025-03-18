import java.util.Scanner;
public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle : ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle : ");
        double height = sc.nextDouble();
        double area_inches = 0.5*base*height;
        double area_cms = area_inches*6.4156;
        System.out.println("The area of triangle in inches is "+area_inches+" and in centimeters is "+area_cms);
        sc.close();
    }
}
