package assistedproblem.animalhierarchy;

class Bird extends Animal{
    //Constructor
    public Bird(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println("Birds makes sound");
    }
}

