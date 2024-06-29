class ArmstrongThread extends Thread {
    public void run() {
        System.out.println("Armstrong numbers from 1 to 100: ");
        for (int i = 1; i <= 100; i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += Math.pow(digit, 3);
                num /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}

class FibonacciThread extends Thread {
    public void run() {
        System.out.println("Fibonacci series up to 10: ");
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < 10; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}

public class PAin {
    public static void main(String[] args) {
        ArmstrongThread armstrongThread = new ArmstrongThread();
        FibonacciThread fibonacciThread = new FibonacciThread();

        armstrongThread.start();
        try {
            armstrongThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fibonacciThread.start();
    }
}