import java.util.Arrays;
import java.util.Scanner;

public class substringarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] sub=compare(text);
        char[] sub1 = text.toCharArray();
        if (Arrays.equals(sub1, sub)) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

}
    public static char[] compare(String text){
        char[] str1 = new char[text.length()];
        for (int i = 0; i<text.length();i++){
            str1[i] = text.charAt(i);
        }
        return str1;
    }
}
