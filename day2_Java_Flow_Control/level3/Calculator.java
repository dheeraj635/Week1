import java.util.Scanner;

 public class Calculator {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter the first number: ");
    	double first = scanner.nextDouble();

    	System.out.print("Enter the second number: ");
    	double second = scanner.nextDouble();

    	System.out.print("Enter the operator (+, -, *, /): ");
    	String op = scanner.next();

    	double result = 0;
    	boolean valid = true;

    	switch (op) {
        	case "+":
            	result = first + second;
            	break;
        	case "-":
            	result = first - second;
            	break;
        	case "*":
            	result = first * second;
            	break;
        	case "/":
            	if (second != 0) {
                	result = first / second;
            	} else {
                	System.out.println("Division by zero is not allowed.");
                	valid = false;
            	}
            	break;
        	default:
            	System.out.println("Invalid Operator");
            	valid = false;
    	}

    	if (valid) {
        	System.out.println("The result is: " + result);
    	}
    }
 }

