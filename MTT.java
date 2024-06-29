public class MTT {
    public static void main(String[] args) {
        Thread table9Thread = new Thread(new MultiplicationTableTask(9));
        Thread table11Thread = new Thread(new MultiplicationTableTask(11));
        table9Thread.start();
        table11Thread.start();
        try {
            table9Thread.join();
            table11Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Both tasks are completed.");
    }
}

class MultiplicationTableTask implements Runnable {
    private int number;
    
    public MultiplicationTableTask(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();
    }
}
