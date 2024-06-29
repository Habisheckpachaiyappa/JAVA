public class PTM {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(binomialCoeff(i - 1, j - 1) + " ");
            }
            System.out.println();
        }
    }

    public static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}