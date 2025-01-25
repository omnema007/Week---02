package hierarchicalinheritance.schoolsystem;

// Subclass Teacher
class Teacher extends Person {
    String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

