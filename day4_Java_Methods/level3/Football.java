
import java.util.Scanner;
class Football{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int[] team = new int[11];
   int i=0;
   System.out.println("Enter the height of 11 players in (cm)");
   for(i=0;i<11;i++){
 	team[i]= sc.nextInt();
   }
   smallest(team);
   largest(team);
   func_mean(team);
 }
 public static void smallest(int[] a){
   int i,temp;
   for(i=0;i<11;i++){
 	if(a[i]<a[0]){
   	temp = a[i];
   	a[i] = a[0];
   	a[0] = temp;
 	}
   }
   System.out.println("The smallest in height is "+a[0]);
 }
 public static void largest(int[] a){
   int i ,temp;
   for(i=0;i<11;i++){
 	if(a[i]>a[0]){
   	temp = a[i];
   	a[i] = a[0];
   	a[0] = temp;
 	}
   }
   System.out.println("The largest in height is "+a[0]);
 }
 public static void func_mean(int[] a){
   int i,sum=0;
   for(i=0;i<11;i++){
 	sum=sum+a[i];
   }
   sum = sum/11;
   System.out.println("The mean height of the Football players is "+sum);
 }

}

