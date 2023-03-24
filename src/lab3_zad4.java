import java.util.Scanner;

public class lab3_zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < words.length; i++) {
            System.out.print("Podaj słowo nr " + (i+1) + ": ");
            words[i] = scanner.nextLine();
        }


        for (int i = words.length-1; i >= 0; i--) {
            String reversedWord = reverseString(words[i]);
            System.out.println(reversedWord);
        }
    }
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}