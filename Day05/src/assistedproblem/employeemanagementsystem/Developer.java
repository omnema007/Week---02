package assistedproblem.employeemanagementsystem;

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        System.out.println("Developer Name: " + name);
        System.out.println("Developer id: " + id);
        System.out.println("ADeveloper salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
