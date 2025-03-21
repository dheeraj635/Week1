
public class Number_checker {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
 
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
 
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
 
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
 
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }
 
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
 
    public static void main(String[] args) {
        int number = 21;
 
        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        int sumOfSquares = sumOfSquaresOfDigits(digits);
        boolean isHarshad = isHarshadNumber(number, digits);
        int[][] frequency = digitFrequency(number);
 
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println("Digit Frequency:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1]);
            }
        }
    }
 }
 
 