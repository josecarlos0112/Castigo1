import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getNumbers();

        double average = calculateAverage(numbers);
        int min = calculateMin(numbers);
        int max = calculateMax(numbers);

        System.out.println("Media: " + average);
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
    }

    public static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Introduce un número entero (0 para terminar):");
            number = scanner.nextInt();
            if (number != 0) {
                numbers.add(number);
            }
        } while (number != 0);
        return numbers;
    }

    public static double calculateAverage(ArrayList<Integer> numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public static int calculateMin(ArrayList<Integer> numbers) {
        int min = numbers.getFirst();
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int calculateMax(ArrayList<Integer> numbers) {
        int max = numbers.getFirst();
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}