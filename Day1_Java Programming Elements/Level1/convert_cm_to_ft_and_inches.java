import java.util.Scanner;
public class convert_cm_to_ft_and_inches{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you height in centimeters : ");
        double cms = sc.nextDouble();
        double feet = cms*0.0328084;
        double inches = cms*0.393701;
        System.out.println("Your Height in cms "+cms+" while in feet is "+feet+" and inches is "+inches);
        sc.close();
    }
}