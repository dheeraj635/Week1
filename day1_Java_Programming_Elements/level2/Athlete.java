
import java.util.Scanner;

class Athlete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        System.out.println("Enter distance you want to run : ");
        int distance = sc.nextInt();
        int perimeter = side1 + side2 + side3;
        int rounds = distance / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete " + distance + "km");
    }
}
