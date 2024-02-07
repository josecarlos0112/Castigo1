import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de los vectores:");
        int dimension = scanner.nextInt();

        ArrayList<Integer> vector1 = getVector(dimension);
        ArrayList<Integer> vector2 = getVector(dimension);

        int dotProduct = calculateDotProduct(vector1, vector2);

        System.out.println("El producto escalar de los vectores es: " + dotProduct);
    }

    public static ArrayList<Integer> getVector(int dimension) {
        ArrayList<Integer> vector = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dimension; i++) {
            System.out.println("Introduce el elemento " + (i + 1) + " del vector:");
            vector.add(scanner.nextInt());
        }
        return vector;
    }

    public static int calculateDotProduct(ArrayList<Integer> vector1, ArrayList<Integer> vector2) {
        int dotProduct = 0;
        for (int i = 0; i < vector1.size(); i++) {
            dotProduct += vector1.get(i) * vector2.get(i);
        }
        return dotProduct;
    }
}