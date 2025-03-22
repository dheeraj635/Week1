import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String input = sc.nextLine();

        String uppercaseString = convertToUpper(input);
        String uppercaseString1 = input.toUpperCase();
        if (uppercaseString.equals(uppercaseString1)){
            System.out.println(true);
        }
    }

    public static String convertToUpper(String str) {
        char[] chars = str.toCharArray();  
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {  
                chars[i] = (char) (chars[i] - 32);  
            }
        }

        return new String(chars);  
    }
}
