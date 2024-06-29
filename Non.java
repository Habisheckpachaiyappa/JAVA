public class Non {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        int i = 1;
        while (true) {
            if (i % 2 != 0) {
                count++;
                System.out.print(i + " ");
                if (count == n)
                    break;
            }
            i++;
        }
    }
}