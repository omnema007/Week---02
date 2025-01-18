class MobilePhone {
  
String brand;
String model;
double price;

    
public MobilePhone(String brand, String model, double price) {
this.brand = brand;
this.model = model;
this.price = price;
}

// Method to display mobile phone details
public void displayDetails() {
System.out.println("Mobile Phone Details:");
System.out.println("Brand: " + brand);
System.out.println("Model: " + model);
System.out.println("Price: $" + price);
}

    
public static void main(String[] args) {
        
MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 999.99);
MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 1099.99);

// Display details of each phone
phone1.displayDetails();

phone2.displayDetails();
}
}
