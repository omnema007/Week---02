package hybridinheritance.restaurantmanagement;

class Chef extends Person implements Worker {
    String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println(name + " is preparing dishes, specializing in " + specialty + ".");
    }
}
