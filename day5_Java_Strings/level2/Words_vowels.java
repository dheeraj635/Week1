
import java.util.Scanner;

package level2;


public class Words_vowels {

   public static String checkCharacter(char ch) {
   	ch = Character.toLowerCase(ch);
   	if (ch >= 'a' && ch <= 'z') {
       	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
           	return "Vowel";
       	} else {
           	return "Consonant";
       	}
   	}
   	return "Not a Letter";
   }

   public static int[] countVowelsAndConsonants(String str) {
   	int vowels = 0, consonants = 0;
   	for (int i = 0; i < str.length(); i++) {
       	String result = checkCharacter(str.charAt(i));
       	if (result.equals("Vowel")) {
           	vowels++;
       	} else if (result.equals("Consonant")) {
           	consonants++;
       	}
       }
   	return new int[]{vowels, consonants};
   }

   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
   	String input = scanner.nextLine();
   	int[] counts = countVowelsAndConsonants(input);
   	System.out.println("Vowels: " + counts[0]);
   	System.out.println("Consonants: " + counts[1]);
   }
}

