package assistedproblem.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager m1 = new Manager("Sumit", 101, 80000, 4);
        Developer d1 = new Developer("Amit", 001, 35000, "Java");
        Intern i1 = new Intern("Mohan", 01, 20000, "Python");

        m1.displayDetails();
        System.out.println();

        d1.displayDetails();
        System.out.println();

        i1.displayDetails();
        System.out.println();

    }
}

