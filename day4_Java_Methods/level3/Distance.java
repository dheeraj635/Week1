import java.util.Scanner;
class Distance{
   public static void main(String[] args){
   	Scanner scanner = new Scanner(System.in);
   	System.out.println("Enter the value of x1");
   	int x1 = scanner.nextInt();
   	System.out.println("Enter the value of y1");
   	int y1 = scanner.nextInt();
   	System.out.println("Enter the value of x2");
   	int x2 = scanner.nextInt();
   	System.out.println("Enter the value of y2");
   	int y2 = scanner.nextInt();
   	scanner.close();
  	 double distance = findDistance(x1, y1, x2, y2);
   	System.out.println("The distance between the two points is: " + distance);
   	double[] equation = findEquation(x1, y1, x2, y2);
   	System.out.println("The equation of the line is: y = " + equation[0] + "x + " + equation[1]);
   }
   public static double findDistance(int x1, int y1, int x2, int y2){
   	return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
   }
   public static double[] findEquation(int x1, int y1, int x2, int y2){
   	double[] equation = new double[2];
   	equation[0] = (y2 - y1) / (x2 - x1);
   	equation[1] = y1 - equation[0] * x1;
   	return equation;
   }
}

