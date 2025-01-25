package assistedproblem.employeemanagementsystem;

class Manager extends Employee {

    int teamSize;
    public  Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager id: " + id);
        System.out.println("Manager salary: " + salary);
        System.out.println("Team size: " + teamSize);
    }

}
