import java.util.Scanner;

public class UnitConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextInt();
        Convertor convet = new Convertor();
        double result = convet.km2miles(distance);
        double result1 = convet.miles2km(distance);
        double result2 = convet.meters2ft(distance);
        double result3 = convet.ft2meters(distance);
        System.out.println(distance+"kms to miles is "+result);
        System.out.println(distance+"miles to kms is "+result1);
        System.out.println(distance+" meters to feets is "+result2);
        System.out.println(distance+"feets to meters is "+result3);

    }
}
class Convertor{
    public static double km2miles(double distance){
        return distance*0.621371;
    }
    public static double miles2km(double distance){
        return distance*1.60934;
    }
    public static double meters2ft(double distance){
        return distance*3.28084;
    }
    public static double ft2meters(double distance){
        return distance*0.3048;
    }
}
