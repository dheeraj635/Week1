import java.util.Scanner;

 public class Marks_twoD {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter the number of students: ");
    	int students = scanner.nextInt();
    	int[][] marks = new int[students][3];
    	double[] percentages = new double[students];
    	char[] grades = new char[students];

    	for (int i = 0; i < students; i++) {
        	System.out.println("Enter marks for Student " + (i + 1) + ":");
        	System.out.print("Physics: ");
        	marks[i][0] = scanner.nextInt();
        	System.out.print("Chemistry: ");
        	marks[i][1] = scanner.nextInt();
        	System.out.print("Maths: ");
        	marks[i][2] = scanner.nextInt();
    	}

    	for (int i = 0; i < students; i++) {
        	int total = marks[i][0] + marks[i][1] + marks[i][2];
        	percentages[i] = total / 3.0;

        	if (percentages[i] >= 90) {
            	grades[i] = 'A';
        	} else if (percentages[i] >= 80) {
            	grades[i] = 'B';
        	} else if (percentages[i] >= 70) {
            	grades[i] = 'C';
        	} else if (percentages[i] >= 60) {
            	grades[i] = 'D';
        	} else {
            	grades[i] = 'F';
        	}
    	}

    	for (int i = 0; i < students; i++) {
        	System.out.println("Student " + (i + 1) + ": Percentage = " + percentages[i] + "%, Grade = " + grades[i]);
    	}

    	scanner.close();
    }
 }

