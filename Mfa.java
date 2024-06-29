import java.util.HashMap;
import java.util.Map;

public class Mfa {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i : arr) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " frequency: " + entry.getValue());
        }
    }
}