import java.util.Scanner;

class Student {
    protected String name;
    protected int rollNo;
    protected int python, cProgramming, mathematics, physics, chemistry, professionalEthics;

    public Student(String name, int rollNo, int python, int cProgramming, int mathematics, int physics, int chemistry, int professionalEthics) {
        this.name = name;
        this.rollNo = rollNo;
        this.python = python;
        this.cProgramming = cProgramming;
        this.mathematics = mathematics;
        this.physics = physics;
        this.chemistry = chemistry;
        this.professionalEthics = professionalEthics;
    }

    public void calculateGrade() {
        int total = python + cProgramming + mathematics + physics + chemistry + professionalEthics;
        double aggregate = total / 6.0;

        System.out.println("Total: " + total);
        System.out.println("Aggregate: " + aggregate);

        if (aggregate > 75) {
            System.out.println("Class: DISTINCTION");
        } else if (aggregate >= 60 && aggregate <= 75) {
            System.out.println("Class: FIRST DIVISION");
        } else if (aggregate >= 50 && aggregate <= 60) {
            System.out.println("Class: SECOND DIVISION");
        } else if (aggregate >= 40 && aggregate <= 50) {
            System.out.println("Class: THIRD DIVISION");
        } else {
            System.out.println("Class: FAIL");
        }
    }
}

public class SG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student's roll number: ");
        int rollNo = scanner.nextInt();

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

        System.out.print("Enter the marks in Professional Ethics: ");
        int professionalEthics = scanner.nextInt();

        Student student = new Student(name, rollNo, python, cProgramming, mathematics, physics, chemistry, professionalEthics);
        student.calculateGrade();
    }
}