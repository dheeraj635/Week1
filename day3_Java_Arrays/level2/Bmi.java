import java.util.Scanner;

 public class Bmi {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter the number of persons: ");
    	int n = scanner.nextInt();

    	double[] heights = new double[n];
    	double[] weights = new double[n];
    	double[] bmis = new double[n];
    	String[] statuses = new String[n];

    	for (int i = 0; i < n; i++) {
        	System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
        	heights[i] = scanner.nextDouble();
        	System.out.print("Enter weight (in kilograms) for person " + (i + 1) + ": ");
        	weights[i] = scanner.nextDouble();
    	}

    	for (int i = 0; i < n; i++) {
        	bmis[i] = weights[i] / (heights[i] * heights[i]);
        	if (bmis[i] < 18.5) {
            	statuses[i] = "Underweight";
        	} else if (bmis[i] < 24.9) {
            	statuses[i] = "Normal weight";
        	} else if (bmis[i] < 29.9) {
            	statuses[i] = "Overweight";
        	} else {
            	statuses[i] = "Obese";
        	}
    	}

    	System.out.println("Height\tWeight\tBMI\t\tStatus");
    	for (int i = 0; i < n; i++) {
        	System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", heights[i], weights[i], bmis[i], statuses[i]);
    	}

    	scanner.close();
    }
 }

