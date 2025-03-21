import java.util.Scanner;

public class checknumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = check(number);
        if (result == 1){
            System.out.println(number+" is a positive");
        }
        else if (result==-1){
            System.out.println(number+" is a negative");
        }else{
            System.out.println("It is zero");
        }
        
    }
    public static int check(int number){
        if (number>0){
            return 1;
        }else if (number<0){
            return -1;
        }else{
            return 0;
        }
    }
}
