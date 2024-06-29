import java.util.Scanner;

public class Apn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0;
        double positiveSum = 0, negativeSum = 0;
        while (true) {
            System.out.print("Enter the number: ");
            int num = scanner.nextInt();
            if (num == -1)
                break;
            if (num > 0) {
                positiveCount++;
                positiveSum += num;
            } else {
                negativeCount++;
                negativeSum += num;
            }
        }
        System.out.println("The average of negative numbers is: " + (negativeSum / negativeCount));
        System.out.println("The average of positive numbers is: " + (positiveSum / positiveCount));
    }
}