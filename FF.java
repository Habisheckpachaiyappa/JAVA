public class FF {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        int a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                sum += a;
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println("Sum of even indexed Fibonacci numbers: " + sum);
    }
}