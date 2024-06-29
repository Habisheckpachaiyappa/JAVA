public class Cab {
    public static void main(String[] args) {
        int a = 12, b = 19;
        for (int i = a; i <= b; i++) {
            if (!isPrime(i))
                System.out.print(i + " ");
        }
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