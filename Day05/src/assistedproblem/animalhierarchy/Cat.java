package assistedproblem.animalhierarchy;

class Cat extends Animal{
    //Constructor
    public Cat(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println("Assisted_Problems.Cat meow...");
    }
}
