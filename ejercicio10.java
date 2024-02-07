import java.util.Random;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        generateAndPrintSymmetricMatrix();
    }

    public static void generateAndPrintSymmetricMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de la matriz:");
        int dimension = scanner.nextInt();

        int[][] matrix = new int[dimension][dimension];
        Random random = new Random();

        // Fill the matrix such that it is symmetric
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int randomNum = random.nextInt(100);  // Generate random numbers between 0 and 99
                matrix[i][j] = randomNum;
                matrix[j][i] = randomNum;
            }
        }

        // Print the matrix
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}