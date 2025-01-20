public class Course {
    String courseName;
    int duration; 
    double fee;
    static String instituteName = "TIT-M"; 

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method 
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class method 
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        
        Course course1 = new Course("Java Programming", 10, 500.0);
        Course course2 = new Course("Web Development", 12, 600.0);

        // Display course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();

        // Update the institute name
        System.out.println("\nAfter Updating Institute Name: ");
        Course.updateInstituteName("TIT-E");

        // Display course details again after institute name update
        System.out.println("\nCourse 1 Details After Update:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details After Update:");
        course2.displayCourseDetails();
    }
}
