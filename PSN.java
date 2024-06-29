import java.lang.Math;

public class PSN {
    public static void main(String[] args) {
        int n = 6561;
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            System.out.println("Square Root: " + sqrt + ", -" + sqrt);
        } else {
            System.out.println("Not a perfect square");
        }
    }
}