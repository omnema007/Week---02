public class Circle {
    // Attribute
    double radius;

    public Circle() {
        this(1.0); 
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    public void displayCircleDetails() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + calculateArea());
    }

    public static void main(String[] args) {
       
        Circle defaultConstructor = new Circle();
        defaultConstructor.displayCircleDetails();

        Circle customConstructor = new Circle(5.0);
        customConstructor.displayCircleDetails();
}
}