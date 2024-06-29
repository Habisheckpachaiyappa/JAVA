public class Ab {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        int value;
        try {
            value = array[index];
            System.out.println("The value at index " + index + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds for the array.");
        }
    }
}
