
import java.util.Random;

public class Matrix {

   public static int[][] createRandomMatrix(int rows, int cols) {
   	Random random = new Random();
   	int[][] matrix = new int[rows][cols];
   	for (int i = 0; i < rows; i++)
       	for (int j = 0; j < cols; j++)
           	matrix[i][j] = random.nextInt(10);
   	return matrix;
   }

   public static int[][] addMatrices(int[][] a, int[][] b) {
   	int rows = a.length, cols = a[0].length;
   	int[][] result = new int[rows][cols];
   	for (int i = 0; i < rows; i++) {
       	for (int j = 0; j < cols; j++) {
           	result[i][j] = a[i][j] + b[i][j];
       	}
   	}
   	return result;
   }

   public static int[][] subtractMatrices(int[][] a, int[][] b) {
   	int rows = a.length, cols = a[0].length;
   	int[][] result = new int[rows][cols];
   	for (int i = 0; i < rows; i++) {
       	for (int j = 0; j < cols; j++) {
           	result[i][j] = a[i][j] - b[i][j];
       	}
   	}
   	return result;
   }

   public static int[][] multiplyMatrices(int[][] a, int[][] b) {
   	int rows = a.length, cols = b[0].length, common = a[0].length;
   	int[][] result = new int[rows][cols];
   	for (int i = 0; i < rows; i++) {
       	for (int j = 0; j < cols; j++) {
           	for (int k = 0; k < common; k++) {
               	result[i][j] += a[i][k] * b[k][j];
           	}
       	}
   	}
   	return result;
   }

   public static int[][] transposeMatrix(int[][] matrix) {
   	int rows = matrix.length, cols = matrix[0].length;
   	int[][] result = new int[cols][rows];
   	for (int i = 0; i < rows; i++) {
       	for (int j = 0; j < cols; j++) {
           	result[j][i] = matrix[i][j];
       	}
   	}
   	return result;
   }

   public static int determinant2x2(int[][] matrix) {
   	return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
   }

   public static int determinant3x3(int[][] matrix) {
   	return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
        	- matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
        	+ matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
   }

   public static double[][] inverse2x2(int[][] matrix) {
   	int det = determinant2x2(matrix);
   	if (det == 0) return null;
   	double[][] inverse = new double[2][2];
   	inverse[0][0] = matrix[1][1] / (double) det;
   	inverse[0][1] = -matrix[0][1] / (double) det;
   	inverse[1][0] = -matrix[1][0] / (double) det;
   	inverse[1][1] = matrix[0][0] / (double) det;
   	return inverse;
   }

   public static double[][] inverse3x3(int[][] matrix) {
   	int det = determinant3x3(matrix);
   	if (det == 0) return null;
   	double[][] inverse = new double[3][3];
   	for (int i = 0; i < 3; i++) {
       	for (int j = 0; j < 3; j++) {
           	int[][] minor = new int[2][2];
           	for (int k = 0, x = 0; k < 3; k++) {
               	if (k == i) continue;
               	for (int l = 0, y = 0; l < 3; l++) {
                   	if (l == j) continue;
                   	minor[x][y++] = matrix[k][l];
               	}
               	x++;
           	}
           	inverse[j][i] = (i + j) % 2 == 0 ? determinant2x2(minor) : -determinant2x2(minor);
           	inverse[j][i] /= det;
       	}
   	}
   	return inverse;
   }

   public static void displayMatrix(int[][] matrix) {
   	for (int[] row : matrix) {
       	for (int val : row) {
           	System.out.print(val + " ");
       	}
       	System.out.println();
   	}
   }

   public static void displayMatrix(double[][] matrix) {
   	for (double[] row : matrix) {
       	for (double val : row) {
           	System.out.printf("%.2f ", val);
       	}
       	System.out.println();
   	}
   }

   public static void main(String[] args) {
   	int[][] matrix1 = createRandomMatrix(3, 3);
   	int[][] matrix2 = createRandomMatrix(3, 3);

   	System.out.println("Matrix 1:");
   	displayMatrix(matrix1);

  	 System.out.println("Matrix 2:");
   	displayMatrix(matrix2);

   	System.out.println("Addition:");
   	displayMatrix(addMatrices(matrix1, matrix2));

   	System.out.println("Subtraction:");
       displayMatrix(subtractMatrices(matrix1, matrix2));

   	System.out.println("Multiplication:");
       displayMatrix(multiplyMatrices(matrix1, matrix2));

   	System.out.println("Transpose of Matrix 1:");
       displayMatrix(transposeMatrix(matrix1));

   	System.out.println("Determinant of Matrix 1:");
       System.out.println(determinant3x3(matrix1));

   	System.out.println("Inverse of Matrix 1:");
   	double[][] inverse = inverse3x3(matrix1);
   	if (inverse != null) {
    	   displayMatrix(inverse);
   	} else {
       	System.out.println("Matrix 1 is not invertible.");
   	}
   }
}

