import java.util.ArrayList;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> multiples = getMultiplesOfFive(1, 100);
        int sum = sumArray(multiples);

        System.out.println("Los múltiplos de 5 entre 1 y 100 son: " + multiples);
        System.out.println("La suma de todos los múltiplos de 5 entre 1 y 100 es: " + sum);
    }

    public static ArrayList<Integer> getMultiplesOfFive(int begin, int end) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiples.add(i);
            }
        }
        return multiples;
    }

    public static int sumArray(ArrayList<Integer> array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}