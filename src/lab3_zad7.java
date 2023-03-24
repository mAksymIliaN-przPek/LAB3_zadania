import java.util.Arrays;

public class lab3_zad7 {
    public static void main(String[] args) {
        String[] array1 = {"test", "qwerty", "ytrewq", "asdfgh"};
        String[] array2 = {"test", "qwerty", "ytrewq", "asdfgh"};

        boolean equalArrays = Arrays.equals(array1, array2);

        if (equalArrays) {
            System.out.println("Tablice mają tą samą zawartość.");
        } else {
            System.out.println("Tablice nie mają tej samej zawartości.");
        }
    }
}
