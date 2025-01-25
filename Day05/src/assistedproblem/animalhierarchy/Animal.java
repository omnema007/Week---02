package assistedproblem.animalhierarchy;

//Animal class
class Animal {
    String name;
    int age;

    //Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Assisted_Problems.Animal makes sound...");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


