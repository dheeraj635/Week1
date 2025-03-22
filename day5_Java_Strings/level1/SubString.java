import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
       
        int end = text.length();
        int start = 2;
        StringBuilder sub = new StringBuilder();
        sub=compare(text,start,end);
        String sub1 = text.substring(2);
        if (sub.toString().equals(sub1)) {
            System.out.println(true);
        }
        //return 0 ;
    }
    public static StringBuilder compare(String text, int start,int end){
        StringBuilder str1 = new StringBuilder();
        for (int i = start; i<end;i++){
            str1.append(text.charAt(i));
        }
        return str1;
    }
}
