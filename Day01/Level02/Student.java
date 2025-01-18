
class Student {
    
String name;
int rollNumber;
double marks;

    
public Student(String name, int rollNumber, double marks) {
this.name = name;
this.rollNumber = rollNumber;
this.marks = marks;
}

// Method to calculate the grade based on marks
public String calculateGrade() {
if (marks >= 90) {
return "A";
} else if (marks >= 80) {
return "B";
} else if (marks >= 70) {
return "C";
} else if (marks >= 60) {
return "D";
} else {
return "F";
}
}


public void displayDetails() {
String grade = calculateGrade(); 
System.out.println("Student Details:");
System.out.println("Name: " + name);
System.out.println("Roll Number: " + rollNumber);
System.out.println("Marks: " + marks);
System.out.println("Grade: " + grade);
}

public static void main(String[] args) {
        
Student student1 = new Student("John", 101, 92.5);
Student student2 = new Student("Amar", 102, 76.3);

// Display details of each student
student1.displayDetails();
System.out.println(); 
student2.displayDetails();
}
}
