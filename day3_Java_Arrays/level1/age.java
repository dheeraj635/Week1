import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age1=new int[10];
        for (int i=0;i<10;i++){
            age1[i]= sc.nextInt(); 
        }
        for (int i=0;i<10;i++){
            if (age1[i]>=18){
                System.out.println("The student with the age "+age1[i]+" can vote");
            }
            else{
                System.out.println("The student with the age "+age1[i]+" cannot vote");
            }
        }
        sc.close();
    }
}
