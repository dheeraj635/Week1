public class student_fee_discount {
    public static void main(String[] args) {
        double fee=125000;
        double discount_percent = 10;
        double discount = (fee*discount_percent)/100;
        double final_fee = fee-discount;
        System.out.println("The discount is INR "+discount+" and final discounted fee is INR "+final_fee);
    }
    
}
