// Base class: Student
class Student {
    public int rollNumber; 
    protected String name; 
    private double CGPA; 

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 4.0) {
            this.CGPA = CGPA;
        } 
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudentn
class PostgraduateStudent extends Student {
    private String researchTopic; 

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA); 
        this.researchTopic = researchTopic;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name: " + name); 
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("CGPA: " + getCGPA()); 
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        
        Student student = new Student(101, "Alice", 3.8);
        System.out.println("Student Details:");
        student.displayDetails();

        student.setCGPA(3.9);
        System.out.println("\nUpdated Student Details:");
        student.displayDetails();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 3.7, "Artificial Intelligence");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
    }
}
