import java.util.Arrays;

public class Mmnm {
    public static void main(String[] args) {
        int[] arr = {14, 16, 87, 36, 25, 89, 34};
        int m = 1, n = 3;
        Arrays.sort(arr);
        int max = arr[arr.length - m];
        int min = arr[n - 1];
        System.out.println("Mth Maximum Number = " + max);
        System.out.println("Nth Minimum Number = " + min);
        System.out.println("Sum = " + (max + min));
        System.out.println("Difference = " + (max - min));
    }
}