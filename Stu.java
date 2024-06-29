import java.util.Scanner;

public class Stu {
    private String name;
    private int registerNumber;
    private int python, cProgramming, mathematics, physics, chemistry;

    public Student(String name, int registerNumber, int python, int cProgramming, int mathematics, int physics, int chemistry) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.python = python;
        this.cProgramming = cProgramming;
        this.mathematics = mathematics;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public void calculateTotalAndAverage() {
        int total = python + cProgramming + mathematics + physics + chemistry;
        double average = total / 5.0;

        System.out.println("Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Marks in Python: " + python);
        System.out.println("Marks in C Programming: " + cProgramming);
        System.out.println("Marks in Mathematics: " + mathematics);
        System.out.println("Marks in Physics: " + physics);
        System.out.println("Marks in Chemistry: " + chemistry);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student's register number: ");
        int registerNumber = scanner.nextInt();

        System.out.print("Enter the marks in Python: ");
        int python = scanner.nextInt();

        System.out.print("Enter the marks in C Programming: ");
        int cProgramming = scanner.nextInt();

        System.out.print("Enter the marks in Mathematics: ");
        int mathematics = scanner.nextInt();

        System.out.print("Enter the marks in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter the marks in Chemistry: ");
        int chemistry = scanner.nextInt();

        Student student = new Student(name, registerNumber, python, cProgramming, mathematics, physics, chemistry);
        student.calculateTotalAndAverage();
    }
}