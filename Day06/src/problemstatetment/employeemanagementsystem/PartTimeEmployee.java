package problemstatetment.employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department{
    private double hourlyRate;
    private int hoursWorked;
    private  String department;

    //Constructor
    public PartTimeEmployee(int employeeId, String name, double baseSalary, double hourlyRate, int hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hourlyRate * hoursWorked);
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
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println(getDepartmentDetails());
        System.out.println("Total Salary: " + calculateSalary());
    }
}
