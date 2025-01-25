package hierarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ravi", 35, "Mathematics");
        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();

        Student student = new Student("Amit", 16, "10th Grade");
        student.displayDetails();
        student.displayRole();
        System.out.println();

        Staff staff = new Staff("Sumit", 40, "CSE");
        staff.displayDetails();
        staff.displayRole();
    }
}
