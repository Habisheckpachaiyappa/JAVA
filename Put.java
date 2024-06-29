class PrimeRunnable implements Runnable {
    private int n;

    public PrimeRunnable(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is not Prime");
    }
}

public class Put {
    public static void main(String[] args) {
        intn = 5;
        Thread thread = new Thread(new PrimeRunnable(n));
        thread.start();
    }
}