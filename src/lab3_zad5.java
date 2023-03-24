import java.util.Scanner;

public class lab3_zad5 {
    public static void main(String[] args) {
        int[] tablica = new int[8];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tablica.length; i++) {
            System.out.print("Podaj liczbę nr " + (i+1) + ": ");
            tablica[i] = scanner.nextInt();
        }

        for (int i = 0; i < tablica.length - 1; i++) {
            int indeksNajmniejszego = i;
            for (int j = i + 1; j < tablica.length; j++) {
                if (tablica[j] < tablica[indeksNajmniejszego]) {
                    indeksNajmniejszego = j;
                }
            }
            int temp = tablica[indeksNajmniejszego];
            tablica[indeksNajmniejszego] = tablica[i];
            tablica[i] = temp;
        }

        System.out.print("Posortowana tablica: ");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }
    }
}
