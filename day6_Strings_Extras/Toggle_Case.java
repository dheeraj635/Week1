public class Toggle_Case {
    public static void main(String[] args) {
        String input = "Hello World!"; // Example input
        String toggled = toggleCase(input);
        System.out.println("Original String: " + input);
        System.out.println("Toggled String: " + toggled);
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Keep non-alphabetic characters unchanged
            }
        }
        return result.toString();
    }
}
