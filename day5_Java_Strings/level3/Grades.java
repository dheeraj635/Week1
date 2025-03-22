
import java.util.Random;

package level2;


public class Grades {
   public static void main(String[] args) {
   	int[][] scores = generateScores(5);
   	double[][] results = calculateResults(scores);
   	char[] grades = calculateGrades(results);
   	displayScorecard(scores, results, grades);
   }

   public static int[][] generateScores(int students) {
   	Random random = new Random();
   	int[][] scores = new int[students][3];
   	for (int i = 0; i < students; i++) {
       	for (int j = 0; j < 3; j++) {
           	scores[i][j] = random.nextInt(41) + 60;
       	}
   	}
   	return scores;
   }

   public static double[][] calculateResults(int[][] scores) {
   	double[][] results = new double[scores.length][3];
  	 for (int i = 0; i < scores.length; i++) {
       	int total = scores[i][0] + scores[i][1] + scores[i][2];
       	double average = total / 3.0;
       	double percentage = (total / 300.0) * 100;
       	results[i][0] = total;
       	results[i][1] = Math.round(average * 100.0) / 100.0;
       	results[i][2] = Math.round(percentage * 100.0) / 100.0;
   	}
   	return results;
   }

   public static char[] calculateGrades(double[][] results) {
   	char[] grades = new char[results.length];
   	for (int i = 0; i < results.length; i++) {
       	double percentage = results[i][2];
       	if (percentage >= 90) grades[i] = 'A';
       	else if (percentage >= 80) grades[i] = 'B';
       	else if (percentage >= 70) grades[i] = 'C';
       	else if (percentage >= 60) grades[i] = 'D';
       	else grades[i] = 'F';
   	}
   	return grades;
   }

   public static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
   	System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Grade");
   	for (int i = 0; i < scores.length; i++) {
       	System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10c%n",
           	i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], grades[i]);
   	}
   }
}

