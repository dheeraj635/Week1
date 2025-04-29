import java.util.Scanner;
public class basic_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number1 : ");
        float number1 = sc.nextFloat();
        System.out.println("Enter your number2 : ");
        float number2 = sc.nextFloat();
        float add = number1+number2;
        float sub = number1-number2;
        float mult = number1*number2;
        float div = number1/number2;
        System.out.println("The addition, subtraction, multiplication and division values of 2 numbers "+number1+" and "+number2+" is "+add+" "+ sub+" "+ mult+" and "+div);
        sc.close();
    }
}
