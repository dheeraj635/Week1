import java.util.Arrays;
import java.util.Scanner;

public class StringSplitComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        sc.close();

        // Using built-in split() method
        String[] builtInWords = text.split(" ");

        // Using custom split method
        String[] customWords = splitText(text);

        // Comparing the results
        boolean isSame = compareArrays(builtInWords, customWords);

        // Display results
        System.out.println("Built-in split result: " + Arrays.toString(builtInWords));
        System.out.println("Custom split result: " + Arrays.toString(customWords));
        System.out.println("Comparison result: " + isSame);
    }

    // Method to find the length of the string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Length found
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 1; // At least one word exists

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' && index < spaceIndexes.length) {
                spaceIndexes[index++] = i;
            }
        }

        // Extract words using space indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start, length); // Last word

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
