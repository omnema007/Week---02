package problemstatetment.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee(001, "Ravi", 3000, 2000);
        f1.assignDepartment("CSE");

        PartTimeEmployee p1 = new PartTimeEmployee(002, "Amit", 1000, 20, 50);
        p1.assignDepartment("CE");

        System.out.println("Full Time Employee Details:");
        f1.displayDetails();
//        System.out.println("Total Salary: " + f1.calculateSalary());
        System.out.println();

        System.out.println("Part Time Employee Details:");
        p1.displayDetails();
//        System.out.println("Total Salary: " + p1.calculateSalary());
    }
}
