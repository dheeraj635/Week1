import java.util.Scanner;

public class UpperToLower {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Uppercase string: ");
        String input = sc.nextLine();

        String lowercaseString = convertTolower(input);
        String lowercaseString1 = input.toLowerCase();
        if (lowercaseString.equals(lowercaseString1)){
            System.out.println(true);
        }
    }

    public static String convertTolower(String str) {
        char[] chars = str.toCharArray();  
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {  
                chars[i] = (char) (chars[i] + 32);  
            }
        }

        return new String(chars);  
    }
}
