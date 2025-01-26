package problemstatetment.employeemanagementsystem;

//FullTimeEmployee class
class FullTimeEmployee extends Employee implements Department{
    private double fixedSalary;
    private String department;

    //Constructor
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fixed Salary: " + fixedSalary);
        System.out.println(getDepartmentDetails());
        System.out.println("Total Salary: " + calculateSalary());
    }

}
