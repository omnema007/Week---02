class Item {
    
int itemCode;
String itemName;
double price;

    
public Item(int itemCode, String itemName, double price) {
this.itemCode = itemCode;
this.itemName = itemName;
this.price = price;
}

// Method to display item details
public void displayDetails() {
System.out.println("Item Details:");
System.out.println("Item Code: " + itemCode);
System.out.println("Item Name: " + itemName);
System.out.println("Price: $" + price);
}

// Method to calculate the total cost 
public double calculateTotalCost(int quantity) {
return price * quantity;
}

    
public static void main(String[] args) {
  
Item item = new Item(101, "Laptop", 850.75);

// Display item details
item.displayDetails();

int quantity = 3; 
double totalCost = item.calculateTotalCost(quantity);
System.out.println("Total Cost for " + quantity + " units: $" + totalCost);
}
}
