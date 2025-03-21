public class TrigonometricFunctions {

    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent using Math functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Store results in an array
        double[] results = {sine, cosine, tangent};
        return results;
    }

    public static void main(String[] args) {
        TrigonometricFunctions trig = new TrigonometricFunctions();
        double angle = 45.0;  // Example angle in degrees

        double[] results = trig.calculateTrigonometricFunctions(angle);

        System.out.println("Sine of " + angle + " degrees: " + results[0]);
        System.out.println("Cosine of " + angle + " degrees: " + results[1]);
        System.out.println("Tangent of " + angle + " degrees: " + results[2]);
    }
}



