import java.util.Scanner;

public class UnitConvertor1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextInt();
        Convertor convet = new Convertor();
        double result = convet.yard2ft(distance);
        double result1 = convet.ft2yard(distance);
        double result2 = convet.meters2inches(distance);
        double result3 = convet.inches2meters(distance);
        double result4 = convet.inches2cms(distance);
        System.out.println(distance+"yards to feet is "+result);
        System.out.println(distance+"feet to yards is "+result1);
        System.out.println(distance+"meters to inches is "+result2);
        System.out.println(distance+"inches to meters is "+result3);
        System.out.println(distance+"inches to cms is "+result4);

    }
}
class Convertor{
    public static double yard2ft(double distance){
        return distance*3;
    }
    public static double ft2yard(double distance){
        return distance*0.33333;
    }
    public static double meters2inches(double distance){
        return distance*39.3701;
    }
    public static double inches2meters(double distance){
        return distance*0.0254;
    }
    public static double inches2cms(double distance){
        return distance*2.54;
    }
}
