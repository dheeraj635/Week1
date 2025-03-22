import java.util.Scanner;
public class samestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean result = CharAt(s1,s2);
        System.out.println(result);
    }
    public static boolean CharAt(String s1, String s2){
        if (s1.equals(s2)){
            return true;
        }
        return false;
    }
}