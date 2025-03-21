
import java.util.Scanner;

public class natural_number_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Check check = new Check();
        int result1 = check.formula(number);
        int result2 = check.recursive(number);
        if (result1 == result2){
            System.out.println("Both the methods are correct");
        }
        else{
            System.out.println("Both the methods are incorrect");
        }
}
}
class Check{
    public int formula(int number){
        return (number*(number+1))/2;
    }   
    public  int recursive(int number){
        if (number==0){
            return 0;
        }
        return number+recursive(number-1);
    }    
}
