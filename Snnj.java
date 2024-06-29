import java.util.Scanner;

public class Snnj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " digit numbers:");
        int num = scanner.nextInt();
        int sum = findSum(num);
        System.out.println("Sum: " + sum);
    }

    public static int findSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum >= 10) {
            sum = findSum(sum);
        }
        return sum;
    }
}