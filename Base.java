public class Base {
    public void area(int a) {
        System.out.println("Area of a square with side length " + a + ": " + a * a);
    }
}

public class Derived extends Base {
    @Override
    public void area(int a, int b) {
        System.out.println("Area of a rectangle with length " + a + " and width " + b + ": " + a * b);
    }

    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.area(5);
        derived.area(5, 10);
    }
}