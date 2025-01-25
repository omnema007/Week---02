package hybridinheritance.restaurantmanagement;

class Waiter extends Person implements Worker {
    int tablesAssigned;

    // Constructor
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println(name + " is serving customers at " + tablesAssigned + " tables.");
    }
}
