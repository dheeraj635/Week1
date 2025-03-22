import java.util.Scanner;

public class UniqueCharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        sc.close();

        String[][] result = findCharacterFrequency(text);
        System.out.println("Character | Frequency");
        for (String[] row : result) {
            System.out.println("    " + row[0] + "     |     " + row[1]);
        }
    }

    public static char[] uniqueCharacters(String text) {
        int length = findLength(text);
        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (tempUnique[j] == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                tempUnique[uniqueCount++] = current;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUnique[i];
        }

        return uniqueChars;
    }

    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < findLength(text); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] charFreq = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            charFreq[i][0] = String.valueOf(uniqueChars[i]);
            charFreq[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return charFreq;
    }

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return count;
    }
}
