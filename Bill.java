import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter consumer no.: ");
        int consumerNo = scanner.nextInt();
        System.out.print("Enter consumer name: ");
        String consumerName = scanner.next();
        System.out.print("Enter previous month reading: ");
        int prevReading = scanner.nextInt();
        System.out.print("Enter current month reading: ");
        int currReading = scanner.nextInt();
        double billAmount = calculateBillAmount(prevReading, currReading);
        System.out.println("Bill Amount: " + billAmount);
    }

    public static double calculateBillAmount(int prevReading, int currReading) {
        int units = currReading - prevReading;
        if (units <= 100) {
            return units * 1;
        } else if (units <= 200) {
            return 100 * 1 + (units - 100) * 2.5;
        } else if (units <= 500) {
            return 100 * 1 + 100 * 2.5 + (units - 200) * 4;
        } else {
            return 100 * 1 + 100 * 2.5 + 300 * 4 + (units - 500) * 6;
        }
    }
}