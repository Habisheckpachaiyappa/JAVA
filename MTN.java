public class MTN {
    public static void main(String[] args) {
        Thread fibonacciThread = new Thread(new FibonacciTask(10));
        Thread reverseNumberThread = new Thread(new ReverseNumberTask(12345));
        fibonacciThread.start();
        reverseNumberThread.start();
        try {
            fibonacciThread.join();
            reverseNumberThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Both tasks are completed.");
    }
}

class FibonacciTask implements Runnable {
    private int n;
    public FibonacciTask(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
    
    private int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

class ReverseNumberTask implements Runnable {
    private int number;
    
    public ReverseNumberTask(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Reversed number of " + number + " is: " + reverse(number));
    }
    
    private int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
