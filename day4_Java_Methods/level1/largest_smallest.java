import java.util.Scanner;
public class largest_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int result = largestandsmallest(n1, n2, n3);
    }
    public static int largestandsmallest (int n1, int n2, int n3){
       
        if (n1>n2 && n1>n3){
            System.out.println(n1+" is the largest number");
        }else if (n2>n1 && n1>n3){
            System.out.println(n2+" is the largest number");
        }
        else{
            System.out.println(n3+" is the largest number");
        }
        if (n1<n2 && n1<n3){
            System.out.println(n1+" is the smallest number");
        }else if (n2<n3 && n2<n1){
            System.out.println(n2+" is the smallest number");
        }else {
            System.out.println(n3+" is the smallest number");
        }
        return 0;
    }
}
