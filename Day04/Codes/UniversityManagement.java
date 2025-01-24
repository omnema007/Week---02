import java.util.ArrayList;

//University class
class University {
    public String universityName;
    public ArrayList<Department1> departments;

    //Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        Department1 department = new Department1(departmentName);
        this.departments.add(department);
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + this.universityName);
        this.departments.clear();
    }

    public void showDepartments() {
        for (Department1 d : departments) {
            System.out.println("Department: " + d.departmentName + " in " + this.universityName);
        }
    }
}

//Department class
class Department1 {
    public String departmentName;

    public Department1(String departmentName) {
        this.departmentName = departmentName;
    }
}

//Faculty class
class Faculty {
    public String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void showFaculty() {
        System.out.println("Faculty: " + this.facultyName);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {

        University university = new University("TIT");

        // Composition
        university.addDepartment("CSE");
        university.addDepartment("ME");
        university.addDepartment("EC");

        // Aggregation
        Faculty faculty1 = new Faculty("Mohan");
        Faculty faculty2 = new Faculty("Ambar");
        Faculty faculty3 = new Faculty("Deepak");


        System.out.println("University Departments");
        university.showDepartments();


        System.out.println("Faculty Members");
        faculty1.showFaculty();
        faculty2.showFaculty();
        faculty3.showFaculty();

        // Deleting the university
        System.out.println("Deleting University");
        university.deleteUniversity();

        System.out.println("Departments after deleting the University:");
        university.showDepartments();


        System.out.println("Faculty members still exist:");
        faculty1.showFaculty();
        faculty2.showFaculty();
        faculty3.showFaculty();
    }
}
