public class MLT {
    public static void main(String[] args) {
        Grade student = new Grade("Alice", 20, "S123456", 'A');
        student.displayGradeInfo();
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    private String studentID;
    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }
    public void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Student ID: " + studentID);
    }
}

class Grade extends Student {
    private char grade;
    public Grade(String name, int age, String studentID, char grade) {
        super(name, age, studentID);
        this.grade = grade;
    }
    public void displayGradeInfo() {
        displayStudentInfo();
        System.out.println("Grade: " + grade);
    }
}

