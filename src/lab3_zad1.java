import java.util.Random;

public class lab3_zad1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        generateNumbers(numbers);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = 0;
        for (int number : numbers) {
            average += number;
        }
        average /= numbers.length;

        System.out.println("Liczby w tablicy:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nSuma elementów: " + sum+"\n");
        System.out.println("Średnia elementów: " + average);
    }

    public static void generateNumbers(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
    }
}
