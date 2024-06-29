import java.util.Scanner;

public class Rspj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the symbol:");
        char symbol = scanner.next().charAt(0);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();
        printRectanglePattern(symbol, rows, cols);
    }

    public static void printRectanglePattern(char symbol, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}