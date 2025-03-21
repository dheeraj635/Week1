
public class Number_four {

    public static void main(String[] args) {
        int number = 7;
 
        System.out.println("Is " + number + " a prime number? " + NumberChecker.isPrime(number));
        System.out.println("Is " + number + " a neon number? " + NumberChecker.isNeon(number));
        System.out.println("Is " + number + " a spy number? " + NumberChecker.isSpy(number));
        System.out.println("Is " + number + " an automorphic number? " + NumberChecker.isAutomorphic(number));
        System.out.println("Is " + number + " a buzz number? " + NumberChecker.isBuzz(number));
    }
 }
 
 class NumberChecker {
 
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
 
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }
 
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }
 
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }
 
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
 }
 
 