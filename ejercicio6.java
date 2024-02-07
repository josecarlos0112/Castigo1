import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número N:");
        int N = scanner.nextInt();

        ArrayList<Integer> primes = getPrimes(N);

        System.out.println("Los primeros " + N + " números primos son: " + primes);
    }

    public static ArrayList<Integer> getPrimes(int N) {
        ArrayList<Integer> primes = new ArrayList<>();
        int number = 2;
        while (primes.size() < N) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }
        return primes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}