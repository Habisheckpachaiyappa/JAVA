public class DBZ {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result;

        try {
            result = numerator / denominator;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
