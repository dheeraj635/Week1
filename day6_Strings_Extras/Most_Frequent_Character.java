import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Most_Frequent_Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        char mostFrequentChar = '\0';
        int maxCount = 0;
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                continue;
            }
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            if (charCountMap.get(c) > maxCount) {
                maxCount = charCountMap.get(c);
                mostFrequentChar = c;
            }
        }

        if (mostFrequentChar != '\0') {
            System.out.println("Most frequent character: " + mostFrequentChar);
            System.out.println("Frequency: " + maxCount);
        } else {
            System.out.println("No characters found.");
        }

        scanner.close();
    }
}
