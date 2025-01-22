class Patient {
    private final int patientID;
    private String name;
    private int age;
    private String ailment;
    private static int totalPatients = 0;
    public static String hospitalName = "City Hospital";

    // Constructor
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;

        totalPatients++;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital Name: " + hospitalName);
        } else {
            System.out.println("Invalid object. Not an instance of Patient.");
        }
    }

    // Static method to get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient.hospitalName = "City Hospital";

        Patient patient1 = new Patient(01,"Alice", 30, "Fever");
        Patient patient2 = new Patient(02,"Bob", 45, "Diabetes");

        System.out.println("\nPatient 1 Details:");
        patient1.displayDetails();

        System.out.println("\nPatient 2 Details:");
        patient2.displayDetails();

        // Display total patients
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());


    }
}
