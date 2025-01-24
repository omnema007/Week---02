import java.util.ArrayList;

//Employee class
class Employee {
     private String name;

    //Constructor
    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
    }
}

class Department {
     private String deptName;
    ArrayList<Employee> employees;

    //Constructor
    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name) {
        employees.add(new Employee(name));
    }

    public void displayEmployees() {
        System.out.println("Department: " + deptName);
        for(Employee emp : employees) {
            emp.display();
        }
    }
}

//Company class
class Company {
    private String compName;
    ArrayList<Department> departments;

    //Constructor
    public Company(String compName) {
        this.compName = compName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void displayDetails() {
        System.out.println("Company: " + compName);
        for (Department dept: departments) {
            dept.displayEmployees();
        }
    }
}
public class CompanyAndDepartment {
    public static void main(String[] args) {
        //Create company object
        Company company = new Company("XYZ Company");

        company.addDepartment("Recruitment");
        company.addDepartment("HR");

        Department recruit = company.departments.get(0);
        Department hr = company.departments.get(1);

        recruit.addEmployee("Ravi");
        recruit.addEmployee("Suresh");
        hr.addEmployee("Bob");

        company.displayDetails();

        company = null;
        System.out.println("Company deleted...");
    }
}