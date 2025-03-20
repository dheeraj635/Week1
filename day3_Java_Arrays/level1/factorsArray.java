import java.util.Scanner;

public class factorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int index=0;
        int[] factor = new int[number];
        for (int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(factor[index++]=i);
            }
        }
        sc.close();
    }
}
