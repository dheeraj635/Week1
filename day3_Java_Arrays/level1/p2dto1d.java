
import java.util.Scanner;

public class p2dto1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] two_d = new int[row][column];
        int index = 0;
        int[] one_d = new int[row*column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                two_d[i][j]= sc.nextInt();
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                one_d[index++]=two_d[i][j];
            }
        }
        System.out.println("2D Array : ");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(two_d[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("2D to 1D : ");
        for (int i=0;i<(row*column);i++){
            System.out.print(one_d[i]+" ");
        }
    }
}
