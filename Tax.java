import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();
        double tax = calculateTax(income);
        System.out.println("Taxable Income: " + (income - 250000));
        System.out.println("Tax= " + tax);
    }

    public static double calculateTax(double income) {
        if (income <= 250000) {
            return 0;
        } else if (income <= 500000) {
            return (income - 250000) * 0.1;
        } else if (income <= 1000000) {
            return (income - 500000) * 0.2 + 25000;
        } else {
            return (income - 1000000) * 0.3 + 75000;
        }
    }
}