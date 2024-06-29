import java.util.Scanner;

public class Fsn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper range: ");
        int upper = scanner.nextInt();
        int[][] array = new int[upper - lower + 1][2];
        int index = 0;
        for (int i = lower; i <= upper; i++) {
            array[index][0] = i;
            array[index][1] = i * i;
            index++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("(" + array[i][0] + ", " + array[i][1] + ")");
        }
    }
}