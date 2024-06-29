class Customer {
    private int accountNo;
    private String accName;
    private int balance;

    public Customer(int accountNo, String accName, int balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful. Balance: " + balance);
        notifyAll(); // notify waiting threads
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }
}

class BankThread extends Thread {
    private Customer customer;
    private int amount;

    public BankThread(Customer customer, int amount) {
        this.customer = customer;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (amount > 0) {
            customer.deposit(amount);
        } else {
            customer.withdraw(-amount);
        }
    }
}

public class Cus {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", 10000);
        BankThread depositThread = new BankThread(customer, 3000);
        BankThread withdrawThread = new BankThread(customer, -12000);
        depositThread.start();
        withdrawThread.start();
    }
}