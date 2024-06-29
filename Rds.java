import java.util.Arrays;
import java.util.Scanner;

public class Rds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numberof elements in array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] nonDuplicate = removeDuplicates(arr);
        System.out.println("Non-duplicate items: " + Arrays.toString(nonDuplicate));
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] nonDuplicate = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                nonDuplicate[index++] = arr[i];
            }
        }
        return Arrays.copyOf(nonDuplicate, index);
    }
}