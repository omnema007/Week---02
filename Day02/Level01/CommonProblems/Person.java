public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {
        
        Person person1 = new Person("Alice", 30);
        System.out.println("Original Person:");
        person1.displayDetails();

        // Create a copy of person1 using the copy constructor
        Person person2 = new Person(person1);
        System.out.println("\nCloned Person:");
        person2.displayDetails();

        
    }
}
