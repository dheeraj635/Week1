
import java.util.Scanner;

public class CharFrequencyNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        sc.close();

        String[] result = findCharacterFrequency(text);
        System.out.println("Character | Frequency");
        for (String row : result) {
            System.out.println(row);
        }
    }

    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int uniqueCount = 0;
        for (int f : freq) {
            if (f > 0) uniqueCount++;
        }

        String[] charFreq = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (freq[i] > 0) {
                charFreq[index++] = "    " + chars[i] + "     |     " + freq[i];
            }
        }

        return charFreq;
    }
}

