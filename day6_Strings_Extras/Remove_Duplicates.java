import java.util.LinkedHashSet;

public class Remove_Duplicates {
    public static String removeDuplicates(String input) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (set.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + output);
    }
}
