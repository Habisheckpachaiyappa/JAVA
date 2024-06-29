public class Mfn {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        System.out.println("Number of factors: " + count);
    }
}