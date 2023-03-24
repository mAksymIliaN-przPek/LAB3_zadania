public class lab3_zad2 {
    public static void main(String[] args) {
        int[] tablica1 = {7, 45, 28, 799, 33, 321};
        int[] tablica2 = {9696, 79, 89, 376, 12};

        System.out.println("Tablica z parzystą ilością elementów:");
        for (int i = 0; i < tablica1.length; i += 2) {
            System.out.print(tablica1[i] + " ");
        }

        System.out.println("\nTablica z nieparzystą ilością elementów:");
        for (int i = 0; i < tablica2.length; i += 2) {
            System.out.print(tablica2[i] + " ");
        }
    }
}