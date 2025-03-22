
package level2;

import java.util.Scanner;

public class TextSplitter {
   public static int[] get_index(String s) {
   	int count = 0;
   	for (int i = 0; i < s.length(); i++) {
       	if (s.charAt(i) == ' ') {
           	count++;
       	}
   	}

   	int[] index = new int[count + 1];
   	int j = 0;
   	for (int i = 0; i < s.length(); i++) {
       	if (s.charAt(i) == ' ') {
           	index[j++] = i;
       	}
   	}
   	index[j] = s.length(); // Add last index for extracting last word

   	return index;
   }

   public static String[] get_words(String s, int[] index) {
   	String[] words = new String[index.length];
   	int start = 0;
   	for (int i = 0; i < index.length; i++) {
       	words[i] = s.substring(start, index[i]);
       	start = index[i] + 1;
   	}
   	return words;
   }

   public static void main(String[] args) {
   	Scanner sc = new Scanner(System.in);
   	System.out.print("Enter text: ");
   	String s = sc.nextLine().trim();
   	sc.close();

   	int[] spaceIndexes = get_index(s);
   	String[] words = get_words(s, spaceIndexes);

   	System.out.println("Words extracted:");
   	for (String word : words) {
       	System.out.println(word);
   	}
   }
}

