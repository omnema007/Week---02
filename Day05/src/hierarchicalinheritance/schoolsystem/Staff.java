package hierarchicalinheritance.schoolsystem;

// Subclass Staff
class Staff extends Person {
    String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

