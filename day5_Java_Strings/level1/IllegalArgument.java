import java.util.Scanner;

public class IllegalArgument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        check(text);
        sc.close();
    }

    public static void check(String text) {
        try {
            if (text.length() < 10) {
                throw new IndexOutOfBoundsException("String is too short for substring operation.");
            }
            System.out.println(text.substring(9, text.length()));
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException has been found ");
        }
    }
}
