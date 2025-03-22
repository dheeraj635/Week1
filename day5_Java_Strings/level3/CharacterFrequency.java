import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        sc.close();

        String[][] result = findCharacterFrequency(text);
        System.out.println("Character | Frequency");
        for (String[] row : result) {
            if (row != null) {
                System.out.println("    " + row[0] + "     |     " + row[1]);
            }
        }
    }

    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < findLength(text); i++) {
            freq[text.charAt(i)]++;
        }

        String[][] charFreq = new String[findLength(text)][2];
        int index = 0;

        for (int i = 0; i < findLength(text); i++) {
            char current = text.charAt(i);
            if (freq[current] != 0) {
                charFreq[index][0] = String.valueOf(current);
                charFreq[index][1] = String.valueOf(freq[current]);
                freq[current] = 0;
                index++;
            }
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
