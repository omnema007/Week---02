class Student {
    private final int rollNumber;
    protected String name;
    private double CGPA;

    // Static variables
    public static String universityName = "XYZ University";
    private static int totalStudents = 0;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;

        totalStudents++;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (this instanceof Student && CGPA >= 0.0 && CGPA <= 4.0) {
            this.CGPA = CGPA;
            System.out.println("CGPA updated successfully for " + name);
        } else {
            System.out.println("Invalid operation. Object is not a Student or CGPA is out of range.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + CGPA);
        } else {
            System.out.println("Invalid object. Not an instance of Student.");
        }
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }
    public void displayPostgraduateDetails() {
        if (this instanceof Student) {
            System.out.println("Postgraduate Student Details:");
            super.displayDetails();
            System.out.println("Research Topic: " + researchTopic);
        } else {
            System.out.println("Invalid object. Not an instance of Student.");
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to " + Student.universityName);

        Student student1 = new Student(101, "Alice", 3.8);
        Student student2 = new Student(102, "Bob", 3.5);

        System.out.println("\nStudent 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();

        student1.setCGPA(3.9);

        System.out.println("\nUpdated Student 1 Details:");
        student1.displayDetails();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 3.7, "AI");

        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();

        // Display total students
        System.out.println("\nUniversity Information:");
        Student.displayTotalStudents();
    }
}
