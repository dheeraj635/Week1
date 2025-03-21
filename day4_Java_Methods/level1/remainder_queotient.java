import java.util.Scanner;

public class remainder_queotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = remainderandqueotient(n1, n2); 
    }
    public static int remainderandqueotient(int  n1, int n2){
        System.out.println("The quotient of "+n1+" and "+n2+" is "+n1/n2);
        System.out.println("The remainder of "+n1+" and "+n2+" is "+n1%n2);
        return 0;
    }
}