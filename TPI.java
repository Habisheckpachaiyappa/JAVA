import java.util.Arrays;

public class TPI {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 5, 6, 7};
        int[] common = commonElements(arr1, arr2);
        System.out.println(Arrays.toString(common));
    }

    public static int[] commonElements(int[] arr1, int[] arr2) {
        int[] common = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    common[index++] = arr1[i];
                    break;
                }
            }
        }
        return Arrays.copyOf(common, index);
    }
}