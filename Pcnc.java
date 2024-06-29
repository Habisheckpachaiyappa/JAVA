import java.util.Scanner;

public class Pcnc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int primeCount = 0, compositeCount = 0;
        for (int i : numbers) {
            if (isPrime(i))
                primeCount++;
            else
                compositeCount++;
        }
        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}