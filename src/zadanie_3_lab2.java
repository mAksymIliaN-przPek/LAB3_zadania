import java.util.Scanner;

public class zadanie_3_lab2 {

    public static void main(String[] args) {
        double[] tablica = new double[10];
        Scanner scanner = new Scanner(System.in);
        int wybor;

        System.out.println("Podaj 10 liczb:");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = scanner.nextDouble();
        }

        // menu
        do {
            System.out.println("Wybierz funkcjonalność:");
            System.out.println("1. Wyświetlanie tablicy od pierwszego do ostatniego indeksu");
            System.out.println("2. Wyświetlanie tablicy od ostatniego do pierwszego indeksu");
            System.out.println("3. Wyświetlanie elementów o nieparzystych indeksach");
            System.out.println("4. Wyświetlanie elementów o parzystych indeksach");
            System.out.println("0. Wyjście");
            wybor = scanner.nextInt();
            if (wybor == 1) {
                System.out.println("Tablica od pierwszego do ostatniego indeksu:");
                for (int i = 0; i < tablica.length; i++) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();
            } else if (wybor == 2) {
                System.out.println("Tablica od ostatniego do pierwszego indeksu:");
                for (int i = tablica.length - 1; i >= 0; i--) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();
            } else if (wybor == 3) {
                System.out.println("Elementy o nieparzystych indeksach:");
                for (int i = 1; i < tablica.length; i += 2) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();
            } else if (wybor == 4) {
                System.out.println("Elementy o parzystych indeksach:");
                for (int i = 0; i < tablica.length; i += 2) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();
            } else if (wybor != 0) {
                System.out.println("Nieprawidłowy wybór.");
            }
        } while (wybor != 0);
    }
}
