package problemstatetment.hospitalpatientmanagement;

//Subclass InPatient
public class InPatient extends Patient implements MedicalRecord {
    private double roomChargePerDay;
    private int daysAdmitted;
    private String medicalHistory;

    // Constructor
    public InPatient(String patientId, String name, int age, double roomChargePerDay, int daysAdmitted) {
        super(patientId, name, age);
        this.roomChargePerDay = roomChargePerDay;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        return roomChargePerDay * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        System.out.println(medicalHistory.isEmpty() ? "No records found." : medicalHistory);
    }
}


