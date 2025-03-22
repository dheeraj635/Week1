
import java.util.Scanner;
import java.util.Random;

package level2;


public class Voter {

   public static int[] generateAges(int n) {
   	Random random = new Random();
   	int[] ages = new int[n];
   	for (int i = 0; i < n; i++) {
       	ages[i] = random.nextInt(90) + 10;
   	}
   	return ages;
   }

   public static String[][] checkVotingEligibility(int[] ages) {
   	String[][] result = new String[ages.length][2];
   	for (int i = 0; i < ages.length; i++) {
       	result[i][0] = String.valueOf(ages[i]);
       	if (ages[i] < 0) {
           	result[i][1] = "false";
       	} else {
           	result[i][1] = ages[i] >= 18 ? "true" : "false";
       	}
   	}
   	return result;
   }

   public static void displayResult(String[][] data) {
   	System.out.println("Age\tCan Vote");
   	for (String[] row : data) {
       	System.out.println(row[0] + "\t" + row[1]);
   	}
   }

   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
   	System.out.print("Enter the number of students: ");
   	int n = scanner.nextInt();
   	int[] ages = generateAges(n);
   	String[][] result = checkVotingEligibility(ages);
   	displayResult(result);
   	scanner.close();
   }
}

