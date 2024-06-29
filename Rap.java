import java.util.Scanner;

public class Rap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        while (!isPalindrome(num)) {
            int reverse = reverseNumber(num);
            num += reverse;
            System.out.println(num);
        }
        System.out.println("Palindrome: " + num);
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num!= 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int num) {
        int reverse = reverseNumber(num);
        return num == reverse;
    }
}