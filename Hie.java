import java.lang.Math;
public class Hie {
    public static void main(String[] args) {
        Shape sphere = new Sphere(5); 
        System.out.println("Sphere:");
        System.out.println("Area: " + sphere.area());
        System.out.println("Volume: " + sphere.volume());
        Shape cone = new Cone(3, 4); 
        System.out.println("\nCone:");
        System.out.println("Area: " + cone.area());
        System.out.println("Volume: " + cone.volume());
        Shape cylinder = new Cylinder(2, 5);
        System.out.println("\nCylinder:");
        System.out.println("Area: " + cylinder.area());
        System.out.println("Volume: " + cylinder.volume());
    }
}
class Shape {
    protected double radius;
    protected double height;
    public Shape(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double area() {
        return 0.0; 
    }
    public double volume() {
        return 0.0; 
    }
}

class Sphere extends Shape {
    public Sphere(double radius) {
        super(radius, 0); 
    }
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    public double volume() {
        return (4/3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone extends Shape {
    public Cone(double radius, double height) {
        super(radius, height);
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

class Cylinder extends Shape {
    public Cylinder(double radius, double height) {
        super(radius, height);
    }
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}


