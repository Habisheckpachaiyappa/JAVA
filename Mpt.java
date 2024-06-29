public class Mpt {
    public static void main(String[] args) {
        int n = 27;
        if (isPowerOfThree(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isPowerOfThree(int n) {
        if (n < 1)
            return false;
        while (n % 3 == 0)
            n /= 3;
        return n == 1;
    }
}