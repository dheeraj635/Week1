
import java.util.Scanner;

public class fizzbuzzarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        String[] array = new String[number];
        int index=0;
        for (int i=0;i<=number-1;i++){
            if (i%3==0 && i%5==0){
                array[index++]="fizzbuzz";
            }
            else if(i%5==0){
                array[index++]="buzz";
            }
            else if(i%3==0){
                array[index++]="fizz";
            }
            else{
                array[index++]=String.valueOf(i);
            }
        }
        for (int i=0;i<=number-1;i++){
            System.out.println(array[i]);
        }
        sc.close(); 
    }
}
