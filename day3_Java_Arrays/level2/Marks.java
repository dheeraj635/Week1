import java.util.Scanner;

 public class Marks {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter number of students: ");
    	int n = scanner.nextInt();

    	int[] physics = new int[n];
    	int[] chemistry = new int[n];
    	int[] maths = new int[n];
    	double[] percentages = new double[n];
    	char[] grades = new char[n];

    	for (int i = 0; i < n; i++) {
        	System.out.println("Enter marks for student " + (i + 1) + ":");

        	int marks;
        	do {
        	System.out.print("Physics marks: ");
        	marks = scanner.nextInt();
        	if (marks < 0) System.out.println("Invalid! Enter positive marks.");
        	} while (marks < 0);
        	physics[i] = marks;

        	do {
        	System.out.print("Chemistry marks: ");
        	marks = scanner.nextInt();
        	if (marks < 0) System.out.println("Invalid! Enter positive marks.");
        	} while (marks < 0);
        	chemistry[i] = marks;

        	do {
        	System.out.print("Maths marks: ");
        	marks = scanner.nextInt();
        	if (marks < 0) System.out.println("Invalid! Enter positive marks.");
        	} while (marks < 0);
        	maths[i] = marks;

        	int total = physics[i] + chemistry[i] + maths[i];
        	percentages[i] = total / 3.0;

        	if (percentages[i] >= 90) grades[i] = 'A';
        	else if (percentages[i] >= 75) grades[i] = 'B';
        	else if (percentages[i] >= 50) grades[i] = 'C';
        	else grades[i] = 'D';
    	}

    	for (int i = 0; i < n; i++) {
        	System.out.println("Student " + (i + 1) + ": Physics=" + physics[i] + ", Chemistry=" + chemistry[i] + ", Maths=" + maths[i] + ", Percentage=" + percentages[i] + ", Grade=" + grades[i]);
    	}
    }
 }

