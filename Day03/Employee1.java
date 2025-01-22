class Employee {
    private final int id;
    private String name;
    private String designation;
    protected String department;
    private double salary;

    // Static variables
    public static String companyName = "XYZ Company";
    private static int totalEmployees = 0;

    // Constructor
    public Employee(int id, String name, String designation, String department, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.salary = salary;

        totalEmployees++;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated successfully.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // Check if the object is an instance of Employee
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Department: " + department);
            System.out.println("Salary: $" + salary);
        } else {
            System.out.println("This is not an Employee object.");
        }
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int id, String name, String designation, String department, double salary, String teamName) {
        super(id, name, designation, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        if (this instanceof Employee) {
            System.out.println("Manager Details:");
            super.displayEmployeeDetails();
            System.out.println("Team Name: " + teamName);
        }
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Alice", "Developer", "IT", 75000.0);
        Employee employee2 = new Employee(102, "Bob", "Analyst", "Finance", 65000.0);

        // Display employee details
        System.out.println("Employee 1 Details:");
        employee1.displayEmployeeDetails();

        System.out.println("\nEmployee 2 Details:");
        employee2.displayEmployeeDetails();

        employee1.setSalary(80000.0);
        System.out.println("\nUpdated Employee 1 Details:");
        employee1.displayEmployeeDetails();

        Manager manager = new Manager(103, "Charlie", "Team Lead", "HR", 95000.0, "Recruitment");

        System.out.println("\nManager Details:");
        manager.displayManagerDetails();

        manager.setSalary(100000.0);
        System.out.println("\nUpdated Manager Details:");
        manager.displayManagerDetails();

        // Display total employees
        System.out.println("\nCompany Information:");
        Employee.displayTotalEmployees();
    }
}
