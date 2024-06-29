import java.util.Scanner;

public class Vgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a statement:");
        String statement = scanner.nextLine();
        int vowelCount = countVowels(statement);
        System.out.println("Number of vowels = " + vowelCount);
    }

    public static int countVowels(String statement) {
        int count = 0;
        for (int i = 0; i < statement.length(); i++) {
            char c = statement.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        return count;
    }
}