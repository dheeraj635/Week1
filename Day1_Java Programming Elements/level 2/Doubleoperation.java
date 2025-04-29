import java.util.Scanner;
public class Doubleoperation {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double number1 = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double number2 = sc.nextDouble();
        System.out.println("Enter the third number : ");
        double number3 = sc.nextDouble();
        double operation1 = number1+number2*number3;
        double operation2 = number1*number2+number3;
        double operation3 = number3/number1+number2;
        double operation4 = number1%number2+number3;
        System.out.println("The results of double Operation are "+operation1+","+operation2+","+operation3+" and "+operation4);
        sc.close();
    }
}
