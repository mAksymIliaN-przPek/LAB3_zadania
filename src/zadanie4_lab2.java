import java.util.Scanner;

public class zadanie4_lab2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Wprowadz liczby");
            System.out.println("2. Oblicz sume elementow tablicy");
            System.out.println("3. Oblicz iloczyn elementow tablicy");
            System.out.println("4. Wyznacz wartosc srednia");
            System.out.println("5. Wyznacz wartosc minimalna");
            System.out.println("6. Wyznacz wartosc maksymalna");
            System.out.println("0. Wyjdz");
            System.out.print("Wybierz opcje: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Wprowadz 10 liczb:");
                    for (int i = 0; i < 10; i++) {
                        array[i] = scanner.nextDouble();
                    }
                    break;
                case 2:
                    double sum = 0;
                    for (double number : array) {
                        sum += number;
                    }
                    System.out.println("Suma elementow tablicy: " + sum);
                    break;
                case 3:
                    double product = 1;
                    for (double number : array) {
                        product *= number;
                    }
                    System.out.println("Iloczyn elementow tablicy: " + product);
                    break;
                case 4:
                    double average = 0;
                    for (double number : array) {
                        average += number;
                    }
                    average /= array.length;
                    System.out.println("Wartosc srednia: " + average);
                    break;
                case 5:
                    double min = array[0];
                    for (int i = 1; i < array.length; i++) {
                        if (array[i] < min) {
                            min = array[i];
                        }
                    }
                    System.out.println("Wartosc minimalna: " + min);
                    break;
                case 6:
                    double max = array[0];
                    for (int i = 1; i < array.length; i++) {
                        if (array[i] > max) {
                            max = array[i];
                        }
                    }
                    System.out.println("Wartosc maksymalna: " + max);
                    break;
                case 0:
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Niepoprawny wybor");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}

