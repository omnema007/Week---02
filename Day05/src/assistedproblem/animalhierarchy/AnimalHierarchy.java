package assistedproblem.animalhierarchy;

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("puppy", 2);
        Animal cat = new Cat("meow", 1);
        Animal bird = new Bird("sparrow", 3);

        dog.displayDetails();
        dog.makeSound();
        System.out.println();

        cat.displayDetails();
        cat.makeSound();
        System.out.println();

        bird.displayDetails();
        bird.makeSound();
    }
}

