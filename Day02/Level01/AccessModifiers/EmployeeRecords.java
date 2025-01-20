class Employee {
    public int employeeID; 
    protected String department; 
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated successfully.");
        } 
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String teamName; 

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary); 
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); 
        System.out.println("Department: " + department); 
        System.out.println("Team Name: " + teamName);
        System.out.println("Salary: $" + getSalary());
    }
}


public class EmployeeRecords {
    public static void main(String[] args) {
       
        Employee employee = new Employee(101, "IT", 75000.0);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();

       
        employee.setSalary(80000.0);
        System.out.println("\nUpdated Employee Details:");
        employee.displayEmployeeDetails();

       
        Manager manager = new Manager(102, "HR", 95000.0, "Recruitment");
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();

        manager.setSalary(100000.0);
        System.out.println("\nUpdated Manager Details:");
        manager.displayManagerDetails();
    }
}
