
import java.util.Random;

public class Emp_sal {
   public static void main(String[] args) {
   	int[][] employeeData = generateEmployeeData(10);
   	double[][] updatedData = calculateBonusAndNewSalary(employeeData);
   	displaySummary(employeeData, updatedData);
   }

   public static int[][] generateEmployeeData(int numEmployees) {
   	Random random = new Random();
   	int[][] data = new int[numEmployees][2];
   	for (int i = 0; i < numEmployees; i++) {
       	data[i][0] = 10000 + random.nextInt(90000);
       	data[i][1] = random.nextInt(11);
   	}
   	return data;
   }

   public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
   	double[][] updatedData = new double[employeeData.length][2];
   	for (int i = 0; i < employeeData.length; i++) {
       	int salary = employeeData[i][0];
       	int yearsOfService = employeeData[i][1];
       	double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
       	double bonus = salary * bonusPercentage;
       	updatedData[i][0] = salary + bonus;
       	updatedData[i][1] = bonus;
   	}
   	return updatedData;
   }

   public static void displaySummary(int[][] employeeData, double[][] updatedData) {
   	double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
   	System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Emp ID", "Old Salary", "Years of Service", "New Salary", "Bonus");
   	for (int i = 0; i < employeeData.length; i++) {
       	int oldSalary = employeeData[i][0];
       	int yearsOfService = employeeData[i][1];
       	double newSalary = updatedData[i][0];
       	double bonus = updatedData[i][1];
       	totalOldSalary += oldSalary;
       	totalNewSalary += newSalary;
       	totalBonus += bonus;
       	System.out.printf("%-10d %-15d %-15d %-15.2f %-15.2f\n", i + 1, oldSalary, yearsOfService, newSalary, bonus);
   	}
   	System.out.println("---------------------------------------------------------------");
   	System.out.printf("%-25s %-15.2f\n", "Total Old Salary:", totalOldSalary);
   	System.out.printf("%-25s %-15.2f\n", "Total New Salary:", totalNewSalary);
   	System.out.printf("%-25s %-15.2f\n", "Total Bonus Amount:", totalBonus);
   }
}

