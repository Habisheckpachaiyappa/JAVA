import java.util.Scanner;

public class Bdo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal Number: " + decimal);
        System.out.println("Octal: " + Integer.toOctalString(decimal));
    }
}