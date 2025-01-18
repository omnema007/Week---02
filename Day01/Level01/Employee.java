class Employee {
    
String name;
int id;
double salary;

// Constructor to initialize Employee details
public Employee(String name, int id, double salary) {
this.name = name;
this.id = id;
this.salary = salary;
}

// Method to display Employee details
public void displayDetails() {
System.out.println("Employee Details:");
System.out.println("Name: " + name);
System.out.println("ID: " + id);
System.out.println("Salary: $" + salary);
}

    
public static void main(String[] args) {

Employee e = new Employee("John", 101, 55000);


e.displayDetails();
}
}
