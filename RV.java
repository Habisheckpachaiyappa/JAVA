import java.util.Scanner;

public class RV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = removeVowels(input);
        System.out.println("The string without vowels is: " + output);
    }

    public static String removeVowels(String str) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}