import java.util.Scanner;

 public class bmi_twoD {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter the number of persons: ");
    	int number = scanner.nextInt();

    	double[][] personData = new double[number][3];
    	String[] weightStatus = new String[number];

    	for (int i = 0; i < number; i++) {
        	System.out.println("Person " + (i + 1) + ":");
        	do {
            	System.out.print("Enter weight (kg): ");
            	personData[i][0] = scanner.nextDouble();
        	} while (personData[i][0] <= 0);

        	do {
            	System.out.print("Enter height (m): ");
            	personData[i][1] = scanner.nextDouble();
        	} while (personData[i][1] <= 0);

        	personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

        	if (personData[i][2] < 18.5) {
            	weightStatus[i] = "Underweight";
        	} else if (personData[i][2] < 24.9) {
            	weightStatus[i] = "Normal weight";
        	} else if (personData[i][2] < 29.9) {
            	weightStatus[i] = "Overweight";
        	} else {
            	weightStatus[i] = "Obesity";
        	}
    	}

    	System.out.println("Height\tWeight\tBMI\t\tStatus");
    	for (int i = 0; i < number; i++) {
        	System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
    	}

    	scanner.close();
    }
 }

