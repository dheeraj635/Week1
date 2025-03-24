public class Substring_Occurrences {
    public static int countSubstringOccurrences(String str, String subStr) {
        if (str == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move index forward to avoid overlapping
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "hellohellohello";
        String subStr = "hello";

        int occurrences = countSubstringOccurrences(str, subStr);
        System.out.println("The substring \"" + subStr + "\" occurs " + occurrences + " times in the string.");
    }
}
