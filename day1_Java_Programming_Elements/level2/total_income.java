
import java.util.Scanner;

public class total_income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary of the person : ");
        double salary = sc.nextDouble();
        System.out.println("Enter the bonus of the person : ");
        double bonus = sc.nextDouble();
        double final_amount = salary+bonus;
        System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+final_amount);
        sc.close(); 
    }
}
