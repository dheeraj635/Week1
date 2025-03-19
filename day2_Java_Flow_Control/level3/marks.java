import java.util.Scanner;
class Marks{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter marks of 3 subjects: ");
       int M = sc.nextInt();
       int P = sc.nextInt();
       int C = sc.nextInt();
       int Avg = (M+P+C)/3;
       System.out.println("Average marks: "+Avg);
       if(Avg>=39){
           if(Avg>=40 && Avg<=49){
               if(Avg>=50 && Avg<=59){
                   if(Avg>=60 && Avg<=69){
                       if(Avg>=70 && Avg<=79){
                           if(Avg>=80 && Avg<=100){
                               System.out.println("Grade A");
                           }
                           else{
                               System.out.println("Grade B");
                           }
                       }
                       else{
                           System.out.println("Grade C");
                       }
                   }
                   else{
                       System.out.println("Grade D");
                   }
               }
               else{
                   System.out.println("Grade E");
               }
           }
           else{
               System.out.println("Grade R");
           }
       }
       else{
           System.out.println("Invalid input");
       }
   }
}
