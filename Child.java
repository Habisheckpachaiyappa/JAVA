public class Parent {
    public void even() {
        System.out.println("Even numbers from 1 to 20: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void odd() {
        System.out.println("Odd numbers from 1 to 20: ");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void prime() {
        System.out.println("Prime numbers from 1 to 20: ");
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Child extends Parent {
    @Override
    public void even() {
        System.out.println("Even numbers from 1 to 30: ");
        for (int i = 2; i <= 30; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public void odd() {
        System.out.println("Odd numbers from 1 to 30: ");
        for (int i = 1; i <= 30; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public void prime() {
        System.out.println("Prime numbers from 1 to 30: ");
        for (int i = 2; i <= 30; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.even();
        child.odd();
        child.prime();
    }
}