import java.util.Scanner;

public class Rvr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.next();
        String reversedWord = reverseWord(word);
        System.out.println("Reverse String: " + reversedWord);
    }

    public static String reverseWord(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }
}