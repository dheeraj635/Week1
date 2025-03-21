
public class Otp {
    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOtp();
        }
        System.out.println(areOtpsUnique(otps));
    }
 
    public static String generateOtp() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return String.valueOf(otp);
    }
 
    public static boolean areOtpsUnique(String[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i].equals(otps[j])) {
                    return false;
                }
            }
        }
        return true;
    }
 }
 
 