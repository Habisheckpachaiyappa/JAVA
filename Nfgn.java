import java.util.Scanner;

public class Nfgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int num = scanner.nextInt();
        System.out.print("N: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        System.out.println("Number of factors = " + count);
        int factor = 1;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factor = i;
                n--;
                if (n == 0)
                    break;
            }
        }
        System.out.println(n + "th factor of " + num + " = " + factor);
    }
}