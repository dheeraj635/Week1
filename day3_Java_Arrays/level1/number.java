import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        for (int i=0;i<5;i++){
            number[i] = sc.nextInt();
        }
        for (int i=0;i<5;i++){
            if(number[i]>0){
                if(number[i]%2==0){
                    System.out.println(number[i]+" is positive number and even number");
                }
                else{
                    System.out.println(number[i]+" is a positive number and odd number");
                }
            }
            else if (number[i]<0){
                System.out.println(number[i]+" is a negative number");
            }
            else{
                System.out.println(number[i]+" is zero");
            }
            if (number[0]==number[4]){
                System.out.println("The First and last numbers are same");
            }
            else{
                System.out.println("The first and last numbers are not same");
            }
        }
    }
}
