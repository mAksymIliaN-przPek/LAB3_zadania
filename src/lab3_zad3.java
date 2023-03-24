public class lab3_zad3 {
    public static void main(String[] args) {
        String[] words = {"makaron", "bocian", "przecinarka", "śliwka", "góra"};

        System.out.println("Słowa napisane małymi literami:");
        for (String word1 : words) {
            System.out.print(word1 + " ");
        }

        System.out.println("\nSłowa napisane dużymi literami:");
        for (String word2 : words) {
            System.out.print(word2.toUpperCase() + " ");
        }
    }
}