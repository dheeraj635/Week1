
import java.util.Scanner;

public class Split_words_one {
   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
   	System.out.println("Enter a text:");
   	String input = scanner.nextLine();

   	String[] customSplitWords = splitWords(input);
   	String[] builtInSplitWords = input.split(" ");

   	boolean areEqual = compareArrays(customSplitWords, builtInSplitWords);

   	System.out.println("Custom Split Words:");
   	for (String word : customSplitWords) {
       	System.out.println(word);
   	}

	   System.out.println("Built-in Split Words:");
   	for (String word : builtInSplitWords) {
       	System.out.println(word);
   	}

   	System.out.println("Are both methods producing the same result? " + areEqual);
   }

   public static int getStringLength(String str) {
   	int length = 0;
   	for (char c : str.toCharArray()) {
       	length++;
   	}
   	return length;
   }

   public static String[] splitWords(String text) {
   	int length = getStringLength(text);
   	int wordCount = 1;

   	for (int i = 0; i < length; i++) {
       	if (text.charAt(i) == ' ') {
           	wordCount++;
       	}
   	}

   	int[] spaceIndexes = new int[wordCount - 1];
   	int index = 0;

   	for (int i = 0; i < length; i++) {
       	if (text.charAt(i) == ' ') {
           	spaceIndexes[index++] = i;
       	}
   	}

   	String[] words = new String[wordCount];
   	int start = 0;

   	for (int i = 0; i < spaceIndexes.length; i++) {
       	words[i] = text.substring(start, spaceIndexes[i]);
       	start = spaceIndexes[i] + 1;
   	}

   	words[wordCount - 1] = text.substring(start);
   	return words;
   }

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

