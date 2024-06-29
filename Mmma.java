import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Mmma {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};
        System.out.println("Array of elements = " + Arrays.toString(array));
        
        double mean = calculateMean(array);
        System.out.println("Mean = " + mean);
        
        int median = calculateMedian(array);
        System.out.println("Median = " + median);
        
        int mode = calculateMode(array);
        System.out.println("Mode = " + mode);
    }

    public static double calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static int calculateMedian(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 == 0) {
            return (array[n / 2 - 1] + array[n / 2]) / 2;
        } else {
            return array[n / 2];
        }
    }

    public static int calculateMode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        int mode = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }
}