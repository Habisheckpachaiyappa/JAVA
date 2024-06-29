public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.even();
        child.odd();
        child.prime();
    }
}
class Parent {
    void even() {
        System.out.println("Even numbers in Parent class:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    void odd() {
        System.out.println("Odd numbers in Parent class:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2!= 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    void prime() {
        System.out.println("Prime numbers in Parent class:");
        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    boolean isPrime(int num) {
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

class Child extends Parent {
    void even() {
        System.out.println("Even numbers in Child class:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    void odd() {
        System.out.println("Odd numbers in Child class:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2!= 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    void prime() {
        System.out.println("Prime numbers in Child class:");
        for (int i = 1; i <= 30; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

