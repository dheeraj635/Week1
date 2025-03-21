
import java.util.Scanner;

public class Amar {
   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);

   	int[] ages = new int[3];
   	int[] heights = new int[3];

   	System.out.println("Enter ages of Amar, Akbar, and Anthony:");
   	for (int i = 0; i < 3; i++) {
       	ages[i] = scanner.nextInt();
   	}

   	System.out.println("Enter heights of Amar, Akbar, and Anthony:");
   	for (int i = 0; i < 3; i++) {
       	heights[i] = scanner.nextInt();
   	}

   	int youngestIndex = findYoungest(ages);
   	int tallestIndex = findTallest(heights);

   	System.out.println("Youngest: " + getName(youngestIndex));
   	System.out.println("Tallest: " + getName(tallestIndex));
   }

   public static int findYoungest(int[] ages) {
   	int minIndex = 0;
   	for (int i = 1; i < ages.length; i++) {
       	if (ages[i] < ages[minIndex]) {
           	minIndex = i;
       	}
   	}
   	return minIndex;
   }

   public static int findTallest(int[] heights) {
   	int maxIndex = 0;
   	for (int i = 1; i < heights.length; i++) {
       	if (heights[i] > heights[maxIndex]) {
           	maxIndex = i;
       	}
   	}
   	return maxIndex;
   }

   public static String getName(int index) {
   	switch (index) {
       	case 0: return "Amar";
       	case 1: return "Akbar";
       	case 2: return "Anthony";
       	default: return "";
   	}
   }
}

