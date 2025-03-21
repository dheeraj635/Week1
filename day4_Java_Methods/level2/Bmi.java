import java.util.Scanner;

public class Bmi {
   public static void main(String[] args) {
   	double[][] data = new double[10][3];
   	String[] statuses = new String[10];
   	Scanner scanner = new Scanner(System.in);

   	for (int i = 0; i < 10; i++) {
       	System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
       	data[i][0] = scanner.nextDouble();
       	System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
       	data[i][1] = scanner.nextDouble();
   	}

   	calculateBMI(data);
   	statuses = determineStatus(data);

   	for (int i = 0; i < 10; i++) {
       	System.out.println("Person " + (i + 1) + ": Height = " + data[i][1] + " cm, Weight = " + data[i][0] + " kg, BMI = " + data[i][2] + ", Status = " + statuses[i]);
   	}
   }

   public static void calculateBMI(double[][] data) {
       for (int i = 0; i < data.length; i++) {
       	double heightInMeters = data[i][1] / 100;
       	data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
   	}
   }

   public static String[] determineStatus(double[][] data) {
   	String[] statuses = new String[data.length];
   	for (int i = 0; i < data.length; i++) {
       	double bmi = data[i][2];
       	if (bmi < 18.5) {
           	statuses[i] = "Underweight";
       	} else if (bmi >= 18.5 && bmi < 24.9) {
           	statuses[i] = "Normal weight";
       	} else if (bmi >= 25 && bmi < 29.9) {
           	statuses[i] = "Overweight";
       	} else {
           	statuses[i] = "Obesity";
       	}
   	}
   	return statuses;
   }
}

