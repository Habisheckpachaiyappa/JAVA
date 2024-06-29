import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pslt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upper = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            if (isPerfectSquare(i) && sumOfDigits(i) < 10)
                list.add(i);
        }
        System.out.println(list);
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num!= 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}