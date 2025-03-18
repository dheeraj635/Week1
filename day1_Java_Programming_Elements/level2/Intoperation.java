import java.util.Scanner;
public class Intoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int number3 = sc.nextInt();
        int operation1 = number1+number2*number3;
        int operation2 = number1*number2+number3;
        int operation3 = number3/number1+number2;
        int operation4 = number1%number2+number3;
        System.out.println("The results of Int Operation are "+operation1+","+operation2+","+operation3+" and "+operation4);
        sc.close();
    }
}
