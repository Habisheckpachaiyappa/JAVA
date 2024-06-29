import java.util.Scanner;

public class Nnpn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        int count = 0;
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) {
                    System.out.println(n + "th Prime number is: " + num);
                    break;
                }
            }
            num++;
        }
        num++;
        for (int i = 0; i < n; i++) {
            while (!isPrime(num))
                num++;
            System.out.print(num + " ");
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}