package multilevelinheritance.educationalcoursehierarchy;

// Subclass PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalPrice() {
        return fee - (fee * discount / 100);
    }

    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}
