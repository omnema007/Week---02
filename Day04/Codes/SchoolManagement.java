import java.util.ArrayList;

//School class
class School {
    public String schoolName;
    public ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

//Student class
class Student {
    public String studentName;
   public ArrayList<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void showCourse() {
        for (Course c : courses) {
            System.out.println("student " + this.studentName + " is enrolled in " + c.courseName);
        }
    }
}

class Course {
    public String courseName;
   public ArrayList<Student> courseStudent;

    public Course(String courseName) {
        this.courseName = courseName;
        this.courseStudent = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.courseStudent.add(student);
    }
    public void displayStudents() {
        for (Student st : courseStudent) {
            System.out.println("Student " + st.studentName + " is enrolled for " + this.courseName);
        }
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        School school1 = new School("ABC Public School");
        School school2 = new School("Modern School");

        Student student1 = new Student("Abhishek");
        Student student2 = new Student("Deepak");
        Student student3 = new Student("Harsh");

        Course c1 = new Course("Maths");
        Course c2 = new Course("JAVA");
        Course c3 = new Course("Python");

        school1.addStudent(student1);
        school1.addStudent(student2);
        school2.addStudent(student3);

        student1.addCourse(c1);
        student2.addCourse(c2);
        student3.addCourse(c3);

        student1.showCourse();
        student2.showCourse();
        student3.showCourse();

        c1.displayStudents();
        c2.displayStudents();
        c3.displayStudents();
    }
}