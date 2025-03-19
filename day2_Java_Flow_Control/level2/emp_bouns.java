import java.util.Scanner;

public class emp_bouns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary of the employee : ");
        double salary = sc.nextDouble();
        System.out.println("Enter the year of experience : ");
        double experience = sc.nextDouble();
        if (experience >5){
            double bouns = (salary*5)/100;
            System.out.println("The bouns amount of the employee is "+bouns);
        }
        else{
            System.out.println("You have less than 5 year of experience");
        }
        sc.close();
    }
}
