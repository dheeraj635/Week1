
import java.util.ArrayList;

public class NumberChecker1 {

   public static int[] findFactors(int number) {
   	ArrayList<Integer> factors = new ArrayList<>();
   	for (int i = 1; i <= number; i++) {
       	if (number % i == 0) {
           	factors.add(i);
       	}
   	}
   	int[] result = new int[factors.size()];
   	for (int i = 0; i < factors.size(); i++) {
       	result[i] = factors.get(i);
   	}
   	return result;
   }

   public static int findGreatestFactor(int number) {
   	int[] factors = findFactors(number);
   	return factors[factors.length - 2];
   }

   public static int sumOfFactors(int number) {
   	int[] factors = findFactors(number);
   	int sum = 0;
   	for (int factor : factors) {
       	sum += factor;
   	}
   	return sum;
   }

   public static int productOfFactors(int number) {
   	int[] factors = findFactors(number);
   	int product = 1;
   	for (int factor : factors) {
       	product *= factor;
   	}
   	return product;
   }

   public static double productOfCubeOfFactors(int number) {
   	int[] factors = findFactors(number);
   	double product = 1;
   	for (int factor : factors) {
       	product *= Math.pow(factor, 3);
   	}
   	return product;
   }

   public static boolean isPerfectNumber(int number) {
   	int[] factors = findFactors(number);
   	int sum = 0;
   	for (int i = 0; i < factors.length - 1; i++) {
       	sum += factors[i];
   	}
   	return sum == number;
   }

   public static boolean isAbundantNumber(int number) {
   	int[] factors = findFactors(number);
   	int sum = 0;
   	for (int i = 0; i < factors.length - 1; i++) {
       	sum += factors[i];
   	}
   	return sum > number;
   }

   public static boolean isDeficientNumber(int number) {
   	int[] factors = findFactors(number);
   	int sum = 0;
   	for (int i = 0; i < factors.length - 1; i++) {
       	sum += factors[i];
   	}
   	return sum < number;
   }

   public static boolean isStrongNumber(int number) {
   	int temp = number;
   	int sum = 0;
   	while (temp > 0) {
       	int digit = temp % 10;
       	sum += factorial(digit);
       	temp /= 10;
   	}
   	return sum == number;
   }

   private static int factorial(int num) {
   	int fact = 1;
   	for (int i = 1; i <= num; i++) {
       	fact *= i;
   	}
   	return fact;
   }

   public static void main(String[] args) {
   	int number = 28;

   	int[] factors = findFactors(number);
   	System.out.print("Factors: ");
   	for (int factor : factors) {
       	System.out.print(factor + " ");
   	}
   	System.out.println();

   	System.out.println("Greatest Factor: " + findGreatestFactor(number));
   	System.out.println("Sum of Factors: " + sumOfFactors(number));
   	System.out.println("Product of Factors: " + productOfFactors(number));
   	System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(number));
   	System.out.println("Is Perfect Number: " + isPerfectNumber(number));
   	System.out.println("Is Abundant Number: " + isAbundantNumber(number));
   	System.out.println("Is Deficient Number: " + isDeficientNumber(number));
   	System.out.println("Is Strong Number: " + isStrongNumber(number));
   }
}

