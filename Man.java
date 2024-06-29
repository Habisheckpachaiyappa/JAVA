import java.util.Arrays;

public class Man {
    public static void main(String[] args) {
        int[] arr = {14, 67, 48, 23, 5, 62};
        int n = 4;

        Arrays.sort(arr);
        System.out.println("Nth largest number: " + arr[arr.length - n]);
    }
}