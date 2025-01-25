package assistedproblem.animalhierarchy;

class Dog extends Animal{
    //Constructor
    public Dog (String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println("Assisted_Problems.Dog barks...");
    }
}
