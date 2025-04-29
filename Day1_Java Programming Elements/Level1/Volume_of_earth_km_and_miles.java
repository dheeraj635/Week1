public class Volume_of_earth_km_and_miles {
    public static void main(String[] args) {
        double radius = 6378;
        double volume_of_kms = (4.0/3.0*Math.PI*Math.pow(radius, 3));
        double volume_of_miles = volume_of_kms*0.621371*0.621371*0.621371;
        System.out.println("The volume of earth in cubic kilometers is "+volume_of_kms+" and cubic miles is "+volume_of_miles);
    }
    
}
