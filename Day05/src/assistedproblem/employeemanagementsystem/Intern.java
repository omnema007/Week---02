package assistedproblem.employeemanagementsystem;

class Intern extends Employee {
    String domain;

    public Intern(String name, int id, double salary, String domain) {
        super(name, id, salary);
        this.domain = domain;
    }

    public void displayDetails() {
        System.out.println("Intern Name: " + name);
        System.out.println("Intern id: " + id);
        System.out.println("Intern salary: " + salary);
        System.out.println("Domain: " + domain);
    }
}

