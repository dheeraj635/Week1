
import java.util.Scanner;
class NumberChecker{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int number = sc.nextInt();
   int count = digit_count(number);
   duck_number(number);
   armstrong_number(number);
   min_value(number);
   max_value(number);
 }
 public static int digit_count(int number) {
   int count = 0;
   while(number > 0) {
 	number = number / 10;
 	count++;
   }
   System.out.println("The number of digits in the number is " + count);
   return count;
 }
 public static void duck_number(int number){
   int temp = number;
   int flag = 0;
   while(number>0){
 	if(number%10==0){
   	flag = 1;
   	break;
 	}
 	number = number/10;

   }
   if(flag==1){
 	System.out.println("The number is a Duck number");
   }
   else{
 	System.out.println("The number is not a Duck number");
   }
 }
 public static void armstrong_number(int number){
   int temp = number;
   int sum = 0;
   while(number>0){
 	int rem = number%10;
 	sum = sum + rem*rem*rem;
 	number = number/10;
   }
   if(sum==temp){
 	System.out.println("The number is an Armstrong number");
   }
   else{
 	System.out.println("The number is not an Armstrong number");
   }
 }
 public static void min_value(int number){
   int min = number%10;
   while(number>0){
 	int rem = number%10;
 	if(rem<min){
   	min = rem;
 	}
 	number = number/10;
   }
   System.out.println("The smallest digit in the number is "+min);
 }
 public static void max_value(int number){
   int max = number%10;
   while(number>0){
 	int rem = number%10;
 	if(rem>max){
   	max = rem;
 	}
 	number = number/10;
   }
   System.out.println("The largest digit in the number is "+max);
 }
}
