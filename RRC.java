class FibonacciRunnable implements Runnable {
    private int n;

    public FibonacciRunnable(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }
}

public class RRC {
    public static void main(String[] args) {
        int n = 5;
        Thread thread = new Thread(new FibonacciRunnable(n));
        thread.start();
    }
}