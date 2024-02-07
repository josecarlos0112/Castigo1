import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número N:");
        int N = scanner.nextInt();

        int[][] tables = generateMultiplicationTables(N);

        for (int i = 0; i < tables.length; i++) {
            System.out.println("Tabla de multiplicar del número " + i + ":");
            for (int j = 0; j < tables[i].length; j++) {
                System.out.println(i + " * " + j + " = " + tables[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generateMultiplicationTables(int N) {
        int[][] tables = new int[N][10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                tables[i][j] = i * j;
            }
        }
        return tables;
    }
}