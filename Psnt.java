import java.util.Scanner;

public class Psnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.next();
        System.out.println("Enter a character to be searched:");
        char c = scanner.next().charAt(0);
        int index = findCharacter(str, c);
        if (index!= -1) {
            System.out.println(c + " is found in string at index: " + index);
        } else {
            System.out.println(c + " is not found in string");
        }
    }

    public static int findCharacter(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}