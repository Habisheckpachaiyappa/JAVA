import java.lang.Math;

public class Multi {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        System.out.println("Sphere:");
        System.out.println("Area: " + sphere.area());
        System.out.println("Volume: " + sphere.volume());
        Cone cone = new Cone(3, 4);
        System.out.println("\nCone:");
        System.out.println("Area: " + cone.area());
        System.out.println("Volume: " + cone.volume());
        Cylinder cylinder = new Cylinder(2, 5);
        System.out.println("\nCylinder:");
        System.out.println("Area: " + cylinder.area());
        System.out.println("Volume: " + cylinder.volume());
    }
}

interface Shape {
    double area();
    double volume();
}
class Sphere implements Shape {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    public double volume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone implements Shape {
    private double radius;
    private double height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double area() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double sideArea = Math.PI * radius * Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return baseArea + sideArea;
    }
    public double volume() {
        return (1/3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}

class Cylinder implements Shape {
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
