import java.util.Scanner;

public class lab3_zad6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] liczby = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj " + (i+1) + ". liczbę: ");
            liczby[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int silnia = 1;
            for (int j = 2; j <= liczby[i]; j++) {
                silnia *= j;
            }
            System.out.println("Silnia z liczby " + liczby[i] + " wynosi: " + silnia);
        }
    }
}
