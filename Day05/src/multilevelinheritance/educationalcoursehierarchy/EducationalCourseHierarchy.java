package multilevelinheritance.educationalcoursehierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Programming", 8);
        course.displayCourseDetails();
        System.out.println();

        OnlineCourse onlineCourse = new OnlineCourse("Python", 12, "Coursera", true);
        onlineCourse.displayCourseDetails();
        System.out.println();

        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 16, "Udemy", false, 400, 20);
        paidOnlineCourse.displayCourseDetails();
    }
}