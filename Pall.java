import java.util.Scanner;

public class Pall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1 for string, 2 for number): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter the string: ");
            String str = scanner.next();
            if (isPalindrome(str))
System.out.println("Palindrome");
            else
                System.out.println("Not palindrome");
        } else if (choice == 2) {
            System.out.print("Enter the number: ");
            int num = scanner.nextInt();
            if (isPalindrome(num))
                System.out.println("Palindrome");
            else
                System.out.println("Not palindrome");
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int rev = 0;
        int original = num;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return original == rev;
    }
}