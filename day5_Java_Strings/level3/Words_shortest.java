
import java.util.Scanner;

package level2;


public class Words_shortest {

   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
   	System.out.println("Enter the text:");
   	String input = scanner.nextLine();

   	String[] words = splitTextIntoWords(input);
   	String[][] wordLengths = getWordLengths(words);
   	int[] result = findShortestAndLongest(wordLengths);

   	System.out.println("Shortest word: " + wordLengths[result[0]][0]);
   	System.out.println("Longest word: " + wordLengths[result[1]][0]);
   }

   public static String[] splitTextIntoWords(String text) {
   	StringBuilder word = new StringBuilder();
   	int count = 0;
   	for (int i = 0; i < text.length(); i++) {
       	if (text.charAt(i) != ' ') {
               word.append(text.charAt(i));
       	} else if (word.length() > 0) {
           	count++;
           	word.setLength(0);
       	}
   	}
   	if (word.length() > 0) count++;

   	String[] words = new String[count];
   	word.setLength(0);
   	int index = 0;
   	for (int i = 0; i < text.length(); i++) {
       	if (text.charAt(i) != ' ') {
               word.append(text.charAt(i));
       	} else if (word.length() > 0) {
           	words[index++] = word.toString();
           	word.setLength(0);
       	}
   	}
   	if (word.length() > 0) words[index] = word.toString();

   	return words;
   }

   public static int getStringLength(String str) {
   	int length = 0;
   	for (char c : str.toCharArray()) {
       	length++;
   	}
   	return length;
   }

   public static String[][] getWordLengths(String[] words) {
   	String[][] wordLengths = new String[words.length][2];
   	for (int i = 0; i < words.length; i++) {
       	wordLengths[i][0] = words[i];
       	wordLengths[i][1] = String.valueOf(getStringLength(words[i]));
   	}
   	return wordLengths;
   }

   public static int[] findShortestAndLongest(String[][] wordLengths) {
   	int shortestIndex = 0, longestIndex = 0;
   	int shortestLength = Integer.parseInt(wordLengths[0][1]);
   	int longestLength = shortestLength;

   	for (int i = 1; i < wordLengths.length; i++) {
       	int length = Integer.parseInt(wordLengths[i][1]);
       	if (length < shortestLength) {
           	shortestLength = length;
           	shortestIndex = i;
       	}
       	if (length > longestLength) {
           	longestLength = length;
           	longestIndex = i;
       	}
   	}

   	return new int[]{shortestIndex, longestIndex};
   }
}

