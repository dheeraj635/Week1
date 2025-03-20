import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        float[] heights = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            ages[i] = scanner.nextInt();
            System.out.println("Enter height (in cm) of " + names[i] + ":");
            heights[i] = scanner.nextFloat();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("The youngest friend is " + names[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex]);
    }
}
