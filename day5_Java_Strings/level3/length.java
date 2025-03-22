import java.util.Scanner;
public class length {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    int sum = nobuiltin(text);
    int sum1 = text.length();
    if (sum==sum1){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
    }
    public static int nobuiltin(String text){
        int count=0;
        try{ 
            for (int i=0;i<100;i++){
                if ((text.charAt(i)>='a'&&text.charAt(i)<='z')||(text.charAt(i)>='A'&&text.charAt(i)<='Z')){
                    count++;
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception has been found");
        }
        return count;
    }
}
