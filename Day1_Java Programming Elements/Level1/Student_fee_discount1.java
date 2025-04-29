import java.util.Scanner;
public class Student_fee_discount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student fees : ");
        double fee = sc.nextDouble();
        System.out.println("Enter the student discount :");
        double discount_percent = sc.nextDouble();
        double discount = (fee * discount_percent) / 100;
        double final_fee = fee - discount;
        System.out.println("The discount is INR " + discount + " and final discounted fee is INR " + final_fee);
        sc.close();
    }

}
